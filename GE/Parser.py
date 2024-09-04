import pandas as pd
import numpy as np
import os
import re
import sys


# In[2]:
# El primer parámetro identifica el fichero con los modelos
# El segundo parametro tiene dos posibles usuos, si recive como segundo parametro un fichero txt, sustituirá los nombres por los del ficheros, si recive un csv, usará los nombres de las columnas
# El separador de la lista solo en caso de txt
def rename(var,cols):
    idx = int(var.group(1))  # Extraer el número 'n' de la cadena
    if idx >= 0 and idx < len(cols):
        return cols[idx]
    else:
        return var.group(0)  # Devolver la cadena original si el índice está fuera de rango


def read_txt(ruta,separador):

    with open(ruta, 'r') as archivo:
        return archivo.read().split(separador)
        
ruta_modelos = sys.argv[1]
ruta_data = sys.argv[2]
separador = sys.argv[3] if len(sys.argv) == 4 else ','
if not (os.path.exists(ruta_modelos) and os.path.exists(ruta_data)):
    print("Al menos una de las rutas de archivo especificadas no existe.")
    sys.exit(1)
with open(ruta_modelos) as f:
    #with open(str(cluster_num)+".csv_models.csv") as f:
    lines = f.readlines()
    columnas=lines[3]
    lines=lines[4:]                
    soluciones = pd.DataFrame([x.replace('\n','').split(';') for x in lines], columns=columnas.replace('\n','').split(';'))
if ruta_data.lower().endswith('.csv'):
    names=pd.read_csv(ruta_data,sep=";").columns.tolist()

elif ruta_data.lower().endswith('.txt'):
    names=read_txt(ruta_data,separador)
    print(names)
else:
    raise ValueError("El segundo parámetro debe ser un archivo txt o csv.")
    sys.exit(1)
Model_parse=[]
for i in range(len(soluciones)):
    s=(soluciones.iloc[i]['Model'])
    Model_parse.append(re.sub(r'getVariable\((\d+),\w+\)', lambda m: rename(m, names), s))
soluciones['Model_parse'] = Model_parse

soluciones.to_csv(ruta_modelos+'_parsed.csv', index=False)

