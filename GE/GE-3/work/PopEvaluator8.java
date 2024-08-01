public class PopEvaluator8 extends algorithm.AbstractPopEvaluator {

	public double evaluate(int idxExpr, int k) {
		double result = 0.0;

		double t = 0.0;

		if(idxExpr<50&& idxExpr>=0){
			result=evaluate1(idxExpr, k);
		}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate1(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 0:
					result = getVariable(2,k)/getVariable(8,k)-getVariable(6,k)-getVariable(6,k)-getVariable(2,k)-getVariable(4,k)/getVariable(1,k)*getVariable(6,k)-getVariable(6,k)/getVariable(7,k)*getVariable(3,k)-getVariable(2,k)/getVariable(4,k)+92*Math.pow(10,-2)*getVariable(1,k)+74*Math.pow(10,+9)/77*Math.pow(10,-4)*74*Math.pow(10,+9)-50*Math.pow(10,-2)+98*Math.pow(10,-8)*95*Math.pow(10,+9)/41*Math.pow(10,-1)/getVariable(7,k)*getVariable(2,k);
					break;
				case 1:
					result = 31*Math.pow(10,+1)*98*Math.pow(10,+5)*60*Math.pow(10,+5)+94*Math.pow(10,+1)+getVariable(4,k)*getVariable(2,k)/getVariable(8,k)/getVariable(4,k)-getVariable(7,k)+95*Math.pow(10,+5)*95*Math.pow(10,-8)/getVariable(1,k)*getVariable(2,k)/getVariable(8,k)/getVariable(8,k)-28*Math.pow(10,-3)*getVariable(1,k)-getVariable(6,k)-getVariable(7,k)-getVariable(6,k)+getVariable(2,k)*33*Math.pow(10,+1)/41*Math.pow(10,-1)+getVariable(7,k)/getVariable(3,k)*getVariable(1,k)/getVariable(3,k)-getVariable(7,k)/getVariable(1,k)/getVariable(9,k)*getVariable(9,k)*getVariable(6,k)-getVariable(3,k)+8*Math.pow(10,+9)-getVariable(6,k)/getVariable(3,k)-getVariable(2,k)/getVariable(1,k)+51*Math.pow(10,-3)*getVariable(6,k)+getVariable(1,k)/getVariable(9,k)+getVariable(7,k)*16*Math.pow(10,-3)+60*Math.pow(10,-1)+getVariable(2,k)/getVariable(6,k)-getVariable(8,k)/getVariable(2,k)/82*Math.pow(10,-3)/getVariable(9,k)+21*Math.pow(10,+1)-getVariable(6,k)/getVariable(3,k)-getVariable(4,k)/getVariable(9,k)-getVariable(8,k)-getVariable(6,k)/getVariable(3,k)-getVariable(8,k);
					break;
				case 2:
					result = getVariable(2,k)*getVariable(2,k)+getVariable(2,k)-getVariable(4,k)/getVariable(7,k)*4*Math.pow(10,+6)-10*Math.pow(10,+9)/getVariable(7,k)/getVariable(8,k)/getVariable(6,k)+getVariable(2,k)*getVariable(2,k)+getVariable(2,k)-99*Math.pow(10,+5)/getVariable(3,k)-getVariable(2,k)/1*Math.pow(10,+4)*getVariable(2,k)/getVariable(6,k)+getVariable(2,k)-getVariable(5,k)*getVariable(1,k)/getVariable(4,k)*65*Math.pow(10,+2)+getVariable(7,k)*getVariable(8,k)/99*Math.pow(10,+6)+getVariable(2,k)*getVariable(2,k)*getVariable(2,k)/getVariable(5,k)-99*Math.pow(10,+8)/getVariable(7,k)/getVariable(6,k)+getVariable(2,k)*getVariable(2,k)*getVariable(2,k)/getVariable(5,k)+getVariable(2,k)*getVariable(2,k)+getVariable(5,k)/getVariable(9,k)/9*Math.pow(10,+6)+31*Math.pow(10,+6)/getVariable(1,k)+getVariable(2,k);
					break;
				case 3:
					result = 91*Math.pow(10,+8)*97*Math.pow(10,+4)+50*Math.pow(10,-4)/getVariable(6,k)*35*Math.pow(10,+5)-getVariable(7,k)/94*Math.pow(10,+2)-getVariable(7,k)*getVariable(8,k)*98*Math.pow(10,-2)+getVariable(2,k)+getVariable(2,k)+getVariable(5,k)+getVariable(1,k)*getVariable(6,k)/getVariable(2,k)/getVariable(2,k)*getVariable(6,k)*getVariable(8,k)-getVariable(8,k)-getVariable(2,k)/getVariable(8,k)/getVariable(9,k)-getVariable(6,k)+getVariable(8,k)/getVariable(3,k)*getVariable(6,k)*getVariable(6,k)/getVariable(5,k)/60*Math.pow(10,+2)-getVariable(8,k)*getVariable(2,k)/5*Math.pow(10,-1)-99*Math.pow(10,-3)*getVariable(1,k)+51*Math.pow(10,-5)/getVariable(6,k)*getVariable(1,k)/getVariable(5,k)*53*Math.pow(10,+5)-getVariable(8,k)-getVariable(2,k)/getVariable(5,k)/getVariable(5,k)*getVariable(2,k)-getVariable(3,k)/getVariable(9,k);
					break;
				case 4:
					result = 99*Math.pow(10,-4)*getVariable(1,k)-getVariable(7,k)*getVariable(8,k)/getVariable(1,k)/79*Math.pow(10,+6)/11*Math.pow(10,-2)-getVariable(6,k)/getVariable(9,k)-getVariable(9,k)/27*Math.pow(10,+1)*4*Math.pow(10,-1)-getVariable(6,k)+getVariable(7,k)/getVariable(5,k)+getVariable(5,k)*getVariable(1,k)/getVariable(2,k)/getVariable(8,k)-70*Math.pow(10,+9)+getVariable(7,k)/getVariable(5,k)-getVariable(6,k)/getVariable(9,k)-getVariable(7,k)-getVariable(6,k)+getVariable(6,k)*getVariable(6,k)/getVariable(9,k)*getVariable(9,k)/getVariable(2,k)+getVariable(2,k)-14*Math.pow(10,-2)*getVariable(2,k)+getVariable(7,k)/getVariable(3,k)*getVariable(6,k)/getVariable(3,k)*getVariable(8,k)*getVariable(6,k)/getVariable(2,k)/getVariable(2,k)*getVariable(6,k)-getVariable(2,k)/getVariable(3,k)/getVariable(7,k)*getVariable(2,k);
					break;
				case 5:
					result = 32*Math.pow(10,-9)-61*Math.pow(10,-1)-getVariable(2,k)/getVariable(6,k)+getVariable(5,k)-21*Math.pow(10,+9)+getVariable(9,k)-16*Math.pow(10,+3)/getVariable(7,k)*61*Math.pow(10,-4)/getVariable(8,k)-getVariable(5,k)-getVariable(9,k)-73*Math.pow(10,-2)*getVariable(1,k)/getVariable(7,k)-getVariable(8,k)/getVariable(5,k)+getVariable(7,k)/getVariable(2,k)/getVariable(9,k)-getVariable(6,k)/getVariable(3,k)/8*Math.pow(10,+2)/getVariable(7,k);
					break;
				case 6:
					result = getVariable(6,k)-getVariable(2,k)+getVariable(3,k)*getVariable(8,k)-getVariable(8,k)+getVariable(7,k)+getVariable(7,k)/getVariable(1,k)*getVariable(6,k)-getVariable(8,k)-getVariable(2,k)/getVariable(6,k)*getVariable(3,k)/getVariable(1,k)*getVariable(3,k)+getVariable(2,k)/getVariable(4,k)+getVariable(3,k)-getVariable(6,k)*getVariable(6,k)/getVariable(2,k)/getVariable(2,k)*getVariable(6,k)-getVariable(8,k)*getVariable(8,k)+getVariable(2,k)/getVariable(9,k)+getVariable(2,k)/getVariable(3,k)*getVariable(8,k)+1*Math.pow(10,-3)*getVariable(6,k)/62*Math.pow(10,+2)*getVariable(1,k)/getVariable(3,k)*getVariable(5,k)/getVariable(8,k)-getVariable(5,k)/getVariable(6,k)*getVariable(5,k)/getVariable(8,k)/getVariable(8,k)/getVariable(6,k)/getVariable(6,k)*getVariable(7,k)/getVariable(8,k)*getVariable(7,k)+getVariable(2,k)/getVariable(3,k)-99*Math.pow(10,-5)*getVariable(7,k)*getVariable(6,k)+89*Math.pow(10,+9)-getVariable(9,k)/getVariable(4,k)+getVariable(7,k)*getVariable(8,k)/getVariable(6,k)*getVariable(9,k)/getVariable(4,k)*getVariable(5,k)*getVariable(8,k)/getVariable(4,k);
					break;
				case 7:
					result = getVariable(5,k)-getVariable(6,k)-getVariable(2,k)/getVariable(4,k)+74*Math.pow(10,-2)*getVariable(2,k)-getVariable(8,k)*getVariable(4,k)+getVariable(4,k)-36*Math.pow(10,-3)+99*Math.pow(10,+2)/getVariable(7,k)-getVariable(2,k)/getVariable(4,k)-22*Math.pow(10,+9)/3*Math.pow(10,+6)+getVariable(8,k)*getVariable(8,k)*getVariable(6,k)/getVariable(3,k)*getVariable(8,k)*getVariable(6,k)/getVariable(2,k)-getVariable(2,k)/7*Math.pow(10,-1)+getVariable(6,k)/getVariable(3,k)-6*Math.pow(10,-3)*getVariable(6,k)-getVariable(8,k)*getVariable(8,k)+getVariable(3,k)/getVariable(6,k)-92*Math.pow(10,-4)-getVariable(8,k)-getVariable(5,k)*getVariable(5,k)/9*Math.pow(10,-4)*85*Math.pow(10,+3)/getVariable(1,k)/getVariable(1,k)*getVariable(8,k)/getVariable(8,k)*getVariable(6,k);
					break;
				case 8:
					result = getVariable(8,k)*getVariable(4,k)+getVariable(6,k)-getVariable(4,k)+64*Math.pow(10,+3)/getVariable(4,k)*getVariable(7,k)*34*Math.pow(10,-5)+79*Math.pow(10,+9)-getVariable(2,k)/getVariable(8,k)*getVariable(2,k)/12*Math.pow(10,-8)/getVariable(6,k)*31*Math.pow(10,+9)/getVariable(6,k)+getVariable(7,k)-getVariable(1,k)+getVariable(7,k);
					break;
				case 9:
					result = getVariable(2,k)/getVariable(1,k)-getVariable(8,k)-getVariable(3,k)*getVariable(8,k)-getVariable(7,k)+getVariable(3,k)*getVariable(2,k)/getVariable(7,k)-getVariable(6,k)/getVariable(1,k)/56*Math.pow(10,+8)*70*Math.pow(10,-8)*getVariable(3,k)-getVariable(8,k)*getVariable(8,k)*getVariable(8,k)+getVariable(3,k)+getVariable(4,k)-getVariable(6,k)-getVariable(5,k)*getVariable(5,k)/getVariable(1,k)-getVariable(8,k)*getVariable(9,k)/getVariable(3,k)*getVariable(9,k)/getVariable(3,k)+getVariable(1,k)/getVariable(3,k)/getVariable(3,k)*getVariable(1,k)*getVariable(8,k);
					break;
				case 10:
					result = 77*Math.pow(10,+9)+99*Math.pow(10,+6)/13*Math.pow(10,-5)/getVariable(1,k)/7*Math.pow(10,+6)+getVariable(2,k)*getVariable(9,k)*85*Math.pow(10,-4)*55*Math.pow(10,+1)+getVariable(1,k)*getVariable(1,k)+getVariable(2,k)/getVariable(9,k)*1*Math.pow(10,+4)+getVariable(1,k)*getVariable(1,k)-99*Math.pow(10,+4)/getVariable(7,k)*getVariable(4,k)+getVariable(5,k)-getVariable(7,k)/getVariable(3,k)*getVariable(6,k)*getVariable(6,k)-44*Math.pow(10,+9)*88*Math.pow(10,-9)/getVariable(7,k)*83*Math.pow(10,-3)*getVariable(2,k)*getVariable(2,k)+getVariable(2,k)/getVariable(1,k)*getVariable(2,k)*getVariable(2,k)+71*Math.pow(10,+2)*getVariable(7,k)+getVariable(5,k)-getVariable(6,k)*getVariable(5,k)*getVariable(4,k)-78*Math.pow(10,+5)/getVariable(6,k)*2*Math.pow(10,+1)+getVariable(5,k)+93*Math.pow(10,+2)*getVariable(4,k)-73*Math.pow(10,+2)*getVariable(2,k)/getVariable(8,k)+getVariable(5,k)-getVariable(6,k)*getVariable(7,k)*getVariable(6,k)/getVariable(5,k)-66*Math.pow(10,+4)*getVariable(1,k)/getVariable(7,k)+getVariable(6,k)/getVariable(8,k)*75*Math.pow(10,-3)*getVariable(2,k)*getVariable(2,k)/getVariable(8,k)/getVariable(8,k)-getVariable(6,k)*getVariable(6,k)*getVariable(8,k)*getVariable(8,k)/getVariable(5,k)*getVariable(6,k)-getVariable(6,k);
					break;
				case 11:
					result = getVariable(2,k)/getVariable(6,k)/60*Math.pow(10,+2)-getVariable(8,k)/getVariable(2,k)*getVariable(7,k)+getVariable(5,k)/getVariable(6,k)/getVariable(8,k)*getVariable(4,k)/getVariable(7,k)*70*Math.pow(10,+1)/getVariable(7,k)-71*Math.pow(10,+9)+getVariable(1,k)/48*Math.pow(10,-1)-getVariable(8,k)+getVariable(8,k)+getVariable(6,k)*84*Math.pow(10,-1)/getVariable(4,k)/getVariable(3,k);
					break;
				case 12:
					result = 25*Math.pow(10,-2)+getVariable(5,k)/getVariable(8,k)-25*Math.pow(10,-3)-getVariable(7,k)+62*Math.pow(10,-2)*getVariable(2,k)*getVariable(4,k)/getVariable(6,k)+99*Math.pow(10,-3)/getVariable(4,k)*getVariable(7,k)*getVariable(7,k)+getVariable(2,k)/getVariable(5,k)+79*Math.pow(10,+6)*78*Math.pow(10,+6)+getVariable(8,k)/getVariable(3,k)*getVariable(6,k)+getVariable(2,k)/getVariable(5,k);
					break;
				case 13:
					result = 44*Math.pow(10,+8)*77*Math.pow(10,+6)+97*Math.pow(10,+9)-41*Math.pow(10,+6)-getVariable(7,k)*getVariable(7,k)*getVariable(8,k)*18*Math.pow(10,-3)*getVariable(4,k)-getVariable(9,k)-getVariable(7,k)*getVariable(7,k)-getVariable(9,k)-getVariable(2,k)*getVariable(2,k)/getVariable(8,k)-getVariable(6,k)*14*Math.pow(10,+3)*getVariable(2,k)/getVariable(2,k)/getVariable(4,k)-getVariable(5,k)*getVariable(4,k)*getVariable(7,k)/getVariable(9,k)-getVariable(9,k)+getVariable(1,k)*getVariable(1,k)+getVariable(1,k)*getVariable(1,k)+getVariable(2,k)/getVariable(8,k)*28*Math.pow(10,+4)*12*Math.pow(10,-2)/getVariable(6,k);
					break;
				case 14:
					result = 38*Math.pow(10,+1)+getVariable(2,k)+getVariable(4,k)*20*Math.pow(10,-2)/48*Math.pow(10,+5)/getVariable(8,k)/getVariable(6,k)-getVariable(6,k)-getVariable(7,k)/66*Math.pow(10,+2)-getVariable(4,k)/71*Math.pow(10,+2)-69*Math.pow(10,+9)*48*Math.pow(10,+4)+getVariable(5,k)+getVariable(2,k)/getVariable(6,k);
					break;
				case 15:
					result = 25*Math.pow(10,+6)*getVariable(8,k)-62*Math.pow(10,+5)*25*Math.pow(10,+2)/getVariable(6,k)-getVariable(6,k)*getVariable(7,k)*getVariable(6,k)/getVariable(3,k)*getVariable(6,k)+getVariable(8,k)*getVariable(7,k)*34*Math.pow(10,+5)/getVariable(1,k)*getVariable(7,k)/getVariable(6,k)/45*Math.pow(10,+2)+99*Math.pow(10,+8)/getVariable(2,k)-99*Math.pow(10,+6)/getVariable(5,k)-getVariable(1,k)/getVariable(1,k)/18*Math.pow(10,+1)*getVariable(4,k)/27*Math.pow(10,+9)/getVariable(7,k)*56*Math.pow(10,-1)+15*Math.pow(10,+9)/getVariable(1,k)/getVariable(9,k)-getVariable(5,k)/getVariable(3,k)*99*Math.pow(10,+3)*getVariable(6,k)+getVariable(9,k)/6*Math.pow(10,+6)+getVariable(7,k)*getVariable(2,k)/61*Math.pow(10,+5)/getVariable(1,k)*getVariable(7,k)-getVariable(2,k)*getVariable(2,k)/getVariable(4,k)*32*Math.pow(10,+3)+99*Math.pow(10,+4)*getVariable(7,k)/getVariable(6,k)+getVariable(6,k)*95*Math.pow(10,+8)/getVariable(9,k)/getVariable(9,k)/getVariable(8,k)*getVariable(5,k)/11*Math.pow(10,-3)+getVariable(1,k)*getVariable(1,k)*getVariable(1,k)+getVariable(2,k)*getVariable(2,k)*getVariable(9,k)*getVariable(2,k)/getVariable(1,k);
					break;
				case 16:
					result = 50*Math.pow(10,+9)*99*Math.pow(10,+5)+42*Math.pow(10,+2)*getVariable(8,k)-17*Math.pow(10,+5)/getVariable(6,k)+getVariable(9,k)/getVariable(1,k)-1*Math.pow(10,-3)+getVariable(7,k)/getVariable(4,k)/81*Math.pow(10,+5)/getVariable(1,k)/48*Math.pow(10,+2)/15*Math.pow(10,+3)-getVariable(9,k)+getVariable(3,k)-getVariable(6,k)-getVariable(2,k)/getVariable(7,k)*getVariable(9,k)+getVariable(3,k)-getVariable(2,k)*2*Math.pow(10,+1)*getVariable(2,k)/getVariable(7,k)+getVariable(7,k)+getVariable(7,k)-79*Math.pow(10,+1)/8*Math.pow(10,+3)/getVariable(7,k)+getVariable(7,k)*getVariable(4,k)+getVariable(1,k)/getVariable(8,k)+getVariable(7,k)+getVariable(2,k)+getVariable(2,k)+getVariable(7,k)-getVariable(8,k)/getVariable(3,k)*getVariable(6,k)*getVariable(6,k)*getVariable(6,k)/getVariable(5,k)-13*Math.pow(10,-1)*getVariable(9,k)-getVariable(5,k)/getVariable(8,k)*getVariable(5,k)+49*Math.pow(10,+5)-getVariable(5,k)/getVariable(8,k);
					break;
				case 17:
					result = getVariable(2,k)/getVariable(5,k)+getVariable(2,k)*getVariable(4,k)/getVariable(8,k)/getVariable(7,k)*getVariable(8,k)+65*Math.pow(10,+1)/getVariable(8,k)/65*Math.pow(10,+1)-98*Math.pow(10,+9)-getVariable(6,k)-65*Math.pow(10,+2)/9*Math.pow(10,+9)/19*Math.pow(10,-5)*getVariable(3,k)*getVariable(4,k)*52*Math.pow(10,-9)+getVariable(2,k)/getVariable(5,k)*getVariable(8,k)+1*Math.pow(10,+4)*getVariable(1,k)/getVariable(6,k)/getVariable(7,k);
					break;
				case 18:
					result = getVariable(2,k)/getVariable(6,k)-14*Math.pow(10,-2)*getVariable(8,k)*getVariable(8,k)+84*Math.pow(10,+6)/80*Math.pow(10,+8)+getVariable(6,k)/getVariable(7,k)+getVariable(5,k)/getVariable(6,k)+getVariable(4,k)/getVariable(7,k)/22*Math.pow(10,+1)+getVariable(7,k)-getVariable(2,k)/52*Math.pow(10,-1)-84*Math.pow(10,+3)-getVariable(7,k)+7*Math.pow(10,-4)*getVariable(9,k)/getVariable(8,k)+getVariable(6,k)/getVariable(3,k)/getVariable(3,k)+getVariable(8,k)/getVariable(6,k);
					break;
				case 19:
					result = 22*Math.pow(10,+3)*72*Math.pow(10,+9)-getVariable(8,k)*getVariable(2,k)-1*Math.pow(10,-9)+44*Math.pow(10,+3)/getVariable(7,k)+getVariable(7,k)+getVariable(4,k)/80*Math.pow(10,+2)-getVariable(2,k)/getVariable(5,k)-getVariable(2,k)/getVariable(8,k)*99*Math.pow(10,-1)/getVariable(8,k)/getVariable(5,k)/getVariable(8,k)-92*Math.pow(10,+9)-getVariable(2,k)-getVariable(8,k)-getVariable(6,k)+getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/getVariable(5,k)-getVariable(7,k)/getVariable(1,k)*getVariable(7,k)+getVariable(2,k)/getVariable(6,k)*getVariable(2,k)-getVariable(2,k)/getVariable(5,k)+getVariable(7,k)-getVariable(2,k)/getVariable(9,k)/getVariable(8,k)/getVariable(9,k)*getVariable(4,k)-getVariable(8,k)+getVariable(7,k)-getVariable(5,k)/6*Math.pow(10,+3)/getVariable(1,k)+getVariable(8,k)*getVariable(8,k)*getVariable(6,k)/getVariable(3,k)*43*Math.pow(10,-1)-getVariable(8,k)-getVariable(2,k)/getVariable(5,k);
					break;
				case 20:
					result = 40*Math.pow(10,+9)*8*Math.pow(10,+9)-44*Math.pow(10,+8)/getVariable(6,k)/getVariable(7,k)*getVariable(4,k)+getVariable(8,k)*52*Math.pow(10,+5)-getVariable(2,k)*getVariable(2,k)+getVariable(7,k)*42*Math.pow(10,+1)/getVariable(2,k)*19*Math.pow(10,+3)+88*Math.pow(10,+6)*getVariable(2,k)*10*Math.pow(10,+6)/65*Math.pow(10,+2)/29*Math.pow(10,-8)/getVariable(2,k)*getVariable(4,k)*getVariable(4,k)/getVariable(1,k);
					break;
				case 21:
					result = 11*Math.pow(10,-8)/getVariable(6,k)*46*Math.pow(10,+9)*getVariable(2,k)/getVariable(2,k)/getVariable(8,k)-getVariable(7,k)+21*Math.pow(10,-2)*getVariable(2,k)+67*Math.pow(10,-1)*getVariable(8,k)/42*Math.pow(10,+2)-getVariable(9,k)/2*Math.pow(10,-1)+getVariable(7,k)*getVariable(1,k)*getVariable(7,k)/61*Math.pow(10,-3)-getVariable(6,k)/getVariable(4,k)*getVariable(2,k)/getVariable(1,k)-99*Math.pow(10,-1)/getVariable(1,k)*getVariable(6,k)-getVariable(6,k)/getVariable(9,k)-getVariable(8,k)/47*Math.pow(10,+1)*getVariable(5,k);
					break;
				case 22:
					result = getVariable(6,k)+getVariable(4,k)+15*Math.pow(10,+5)*85*Math.pow(10,+8)+getVariable(3,k)-getVariable(2,k)/getVariable(8,k)+getVariable(7,k)*getVariable(6,k)/getVariable(1,k)+getVariable(2,k)+99*Math.pow(10,-2)*getVariable(7,k)-getVariable(4,k)*getVariable(2,k)/getVariable(6,k)+getVariable(3,k)-getVariable(3,k)/getVariable(1,k)*getVariable(3,k)/getVariable(7,k)*getVariable(2,k)*getVariable(2,k)/getVariable(7,k)-getVariable(5,k)/getVariable(8,k)*getVariable(7,k)/getVariable(6,k)-42*Math.pow(10,-3)*getVariable(9,k)+getVariable(4,k)-getVariable(6,k)*getVariable(6,k)*getVariable(4,k)*getVariable(8,k)/3*Math.pow(10,-8)*getVariable(6,k)*getVariable(6,k)+getVariable(8,k)*getVariable(9,k)/46*Math.pow(10,-3)*getVariable(3,k)/getVariable(2,k)*getVariable(9,k)*getVariable(3,k)+getVariable(5,k)/getVariable(1,k)*getVariable(2,k)*getVariable(3,k)/getVariable(8,k)/getVariable(1,k)-getVariable(8,k)+getVariable(6,k)/getVariable(9,k)-getVariable(8,k)+getVariable(8,k)*getVariable(6,k)/getVariable(2,k);
					break;
				case 23:
					result = 4*Math.pow(10,-4)+getVariable(2,k)/getVariable(8,k)-getVariable(6,k)-getVariable(3,k)+getVariable(4,k)/getVariable(6,k)*58*Math.pow(10,-5)/91*Math.pow(10,+5)*63*Math.pow(10,+1)*getVariable(3,k)/getVariable(7,k)*getVariable(2,k)/getVariable(7,k)-getVariable(7,k)-getVariable(3,k)+99*Math.pow(10,-3)*getVariable(1,k)-getVariable(3,k)-getVariable(6,k)+getVariable(1,k)-99*Math.pow(10,-1)*getVariable(8,k)-getVariable(4,k)-61*Math.pow(10,+8)/87*Math.pow(10,+8)-getVariable(8,k)+getVariable(5,k)+getVariable(8,k)/getVariable(7,k)/96*Math.pow(10,+5)-getVariable(7,k)/getVariable(9,k)-36*Math.pow(10,-2)/96*Math.pow(10,+4)+getVariable(1,k)/getVariable(4,k);
					break;
				case 24:
					result = 99*Math.pow(10,+1)*getVariable(4,k)*getVariable(7,k)/getVariable(2,k)+getVariable(9,k)*getVariable(9,k)-64*Math.pow(10,+5)/getVariable(6,k)/getVariable(8,k)-getVariable(7,k)*getVariable(6,k)/getVariable(2,k)/getVariable(3,k)*getVariable(5,k)*getVariable(6,k)-getVariable(6,k)*getVariable(6,k)-getVariable(6,k)/6*Math.pow(10,+5)/12*Math.pow(10,-1)+getVariable(7,k)/getVariable(4,k)/4*Math.pow(10,+5)+getVariable(6,k)/getVariable(3,k)*getVariable(3,k)*12*Math.pow(10,+9)/getVariable(1,k)/getVariable(9,k)/getVariable(8,k)/37*Math.pow(10,-4)*getVariable(9,k)-getVariable(6,k)*13*Math.pow(10,+1)-getVariable(9,k)*getVariable(6,k)+getVariable(6,k)*6*Math.pow(10,+2)-getVariable(3,k)+getVariable(4,k)*99*Math.pow(10,+1)+getVariable(3,k)*getVariable(1,k)-getVariable(5,k)/50*Math.pow(10,+1)-getVariable(1,k)/getVariable(8,k)*getVariable(2,k)-getVariable(2,k)*getVariable(2,k)/getVariable(5,k)*getVariable(8,k)-91*Math.pow(10,+4)/getVariable(2,k)/getVariable(5,k)*getVariable(1,k)-getVariable(5,k)/getVariable(8,k)+98*Math.pow(10,-1)*getVariable(1,k)-getVariable(3,k)/24*Math.pow(10,+6)/getVariable(6,k)/getVariable(7,k)*getVariable(3,k)-getVariable(9,k)/getVariable(8,k)/getVariable(8,k)*getVariable(9,k)-98*Math.pow(10,+9)/18*Math.pow(10,+8)-getVariable(5,k)-getVariable(5,k);
					break;
				case 25:
					result = 37*Math.pow(10,+6)-26*Math.pow(10,+9)/8*Math.pow(10,+4)+getVariable(4,k)/getVariable(6,k)/getVariable(8,k)-getVariable(7,k)/getVariable(2,k);
					break;
				case 26:
					result = 68*Math.pow(10,+9)+getVariable(9,k)*getVariable(2,k)-41*Math.pow(10,+9)*getVariable(8,k)/getVariable(2,k)-getVariable(2,k)+getVariable(2,k)*getVariable(2,k)/getVariable(7,k)*90*Math.pow(10,+2)*getVariable(5,k)-getVariable(2,k)*getVariable(6,k)/getVariable(9,k)*getVariable(2,k)*getVariable(2,k)+getVariable(9,k)+getVariable(6,k)*99*Math.pow(10,-6)*getVariable(8,k)*99*Math.pow(10,+8)-getVariable(2,k)*99*Math.pow(10,+2)*getVariable(7,k)+getVariable(4,k)*42*Math.pow(10,+4)-getVariable(2,k)*getVariable(1,k)*getVariable(8,k)*getVariable(2,k)-getVariable(9,k)*getVariable(9,k)*getVariable(9,k)*getVariable(9,k)+getVariable(9,k)*getVariable(2,k)+getVariable(1,k)/3*Math.pow(10,+6)-getVariable(2,k)+51*Math.pow(10,+9)/getVariable(6,k)-getVariable(2,k)*getVariable(2,k)*getVariable(2,k)+99*Math.pow(10,+9)*getVariable(6,k)*getVariable(8,k)/getVariable(7,k)/getVariable(7,k)/getVariable(3,k)*getVariable(1,k)/getVariable(5,k)+getVariable(6,k)*25*Math.pow(10,+4)-getVariable(2,k)*getVariable(2,k)*getVariable(2,k)*getVariable(2,k)/getVariable(4,k)+8*Math.pow(10,+2)/getVariable(6,k)/6*Math.pow(10,+6)*getVariable(1,k)+getVariable(2,k)/getVariable(8,k)*getVariable(2,k)*getVariable(9,k)/getVariable(8,k)-getVariable(1,k)*getVariable(8,k)/23*Math.pow(10,+4)*58*Math.pow(10,+1)+getVariable(8,k)*getVariable(6,k)*getVariable(6,k)*getVariable(6,k)+getVariable(3,k)/getVariable(7,k)/5*Math.pow(10,+9)+getVariable(9,k)*getVariable(6,k)*getVariable(7,k)-77*Math.pow(10,+9)+getVariable(7,k)*getVariable(6,k)*getVariable(7,k)/getVariable(3,k)*getVariable(6,k);
					break;
				case 27:
					result = 99*Math.pow(10,+8)*87*Math.pow(10,+4)+24*Math.pow(10,-2)*getVariable(3,k)*getVariable(8,k)+70*Math.pow(10,-2)*getVariable(2,k)-getVariable(2,k)-getVariable(3,k)/getVariable(7,k)*11*Math.pow(10,+1)*98*Math.pow(10,-2)-getVariable(5,k)+getVariable(2,k)/getVariable(5,k)*getVariable(6,k)/getVariable(5,k)/getVariable(8,k)-getVariable(3,k)/getVariable(6,k)+getVariable(8,k)*getVariable(8,k)-getVariable(2,k)*getVariable(8,k)/getVariable(5,k)+getVariable(5,k)*getVariable(6,k)/getVariable(1,k)-getVariable(4,k)/getVariable(6,k)/getVariable(8,k)*getVariable(2,k)+getVariable(7,k)+getVariable(3,k)-getVariable(9,k)+getVariable(9,k)+getVariable(4,k)-getVariable(3,k)/getVariable(6,k)+getVariable(8,k)+getVariable(6,k)/getVariable(4,k)/getVariable(2,k)*getVariable(4,k)+getVariable(6,k)/getVariable(2,k)+getVariable(8,k)+getVariable(6,k)/getVariable(2,k)+getVariable(8,k)/getVariable(3,k)*getVariable(9,k)+62*Math.pow(10,+3)/getVariable(9,k)/getVariable(4,k)/getVariable(9,k)-getVariable(8,k);
					break;
				case 28:
					result = 74*Math.pow(10,-1)/getVariable(8,k)/30*Math.pow(10,+3)/25*Math.pow(10,+1)-83*Math.pow(10,+9)+getVariable(8,k)*getVariable(6,k)+getVariable(6,k)/getVariable(3,k)*getVariable(6,k)/getVariable(3,k)-getVariable(6,k)-getVariable(9,k)/getVariable(5,k)-getVariable(6,k)-getVariable(1,k)/getVariable(9,k)/getVariable(8,k)*getVariable(1,k)/56*Math.pow(10,-9)*getVariable(2,k)*23*Math.pow(10,+6)-getVariable(7,k)*getVariable(8,k)+getVariable(4,k)-getVariable(8,k)+98*Math.pow(10,+6)/getVariable(1,k)/34*Math.pow(10,-3)*getVariable(2,k)/getVariable(6,k)-getVariable(6,k)*getVariable(7,k)/getVariable(1,k)+getVariable(1,k)+getVariable(3,k)*getVariable(3,k)/getVariable(6,k)-getVariable(5,k)/getVariable(1,k)*getVariable(3,k)*getVariable(8,k)+getVariable(6,k)*getVariable(8,k)/getVariable(3,k)*getVariable(8,k)-getVariable(9,k)/getVariable(5,k)*getVariable(8,k)*getVariable(1,k)/getVariable(5,k)/getVariable(6,k)*getVariable(1,k)-99*Math.pow(10,+3)/getVariable(9,k)/getVariable(9,k)/getVariable(1,k)*getVariable(2,k)/getVariable(1,k)+getVariable(2,k)/getVariable(9,k)-getVariable(2,k)/getVariable(5,k)/getVariable(8,k)-getVariable(8,k)+getVariable(2,k)/getVariable(6,k)/42*Math.pow(10,+1)*getVariable(3,k);
					break;
				case 29:
					result = 43*Math.pow(10,+3)/getVariable(3,k)-38*Math.pow(10,-1)*getVariable(3,k)/getVariable(6,k)*26*Math.pow(10,+4)/getVariable(8,k)/getVariable(6,k)+getVariable(7,k)*getVariable(8,k)*getVariable(7,k)*getVariable(3,k)/getVariable(2,k)-getVariable(1,k)/28*Math.pow(10,+9)/22*Math.pow(10,-5)+getVariable(8,k)*getVariable(5,k)-getVariable(1,k)/6*Math.pow(10,+9)/getVariable(6,k)/getVariable(7,k)/getVariable(7,k)+getVariable(5,k)+getVariable(1,k)*26*Math.pow(10,+2)/getVariable(7,k)+99*Math.pow(10,+1)/getVariable(9,k)*getVariable(5,k)+getVariable(4,k)-getVariable(7,k)/13*Math.pow(10,+3)+getVariable(5,k)-getVariable(6,k)+getVariable(8,k)*getVariable(9,k)*getVariable(7,k)/getVariable(4,k)+getVariable(9,k)*getVariable(8,k)*99*Math.pow(10,-1)-getVariable(8,k)*58*Math.pow(10,-1)*getVariable(2,k)-getVariable(6,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

}
