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
					result = getVariable(7,k)-getVariable(3,k)-50*Math.pow(10,-2)*getVariable(4,k)-57*Math.pow(10,-5)*getVariable(7,k)*getVariable(7,k)/getVariable(3,k)*getVariable(1,k)+getVariable(6,k)/getVariable(1,k)*getVariable(6,k)/43*Math.pow(10,+6)/94*Math.pow(10,-9)/getVariable(1,k)*getVariable(3,k)*getVariable(6,k)*56*Math.pow(10,+2)-55*Math.pow(10,+1)/3*Math.pow(10,-2)*getVariable(2,k)/getVariable(3,k);
					break;
				case 1:
					result = 65*Math.pow(10,+3)/getVariable(3,k)/getVariable(2,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(7,k)-getVariable(7,k)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(6,k)/getVariable(1,k)*getVariable(6,k)/getVariable(7,k)*getVariable(6,k)/getVariable(4,k)*getVariable(6,k)/getVariable(1,k)-getVariable(7,k)*3*Math.pow(10,-6)*getVariable(1,k)*getVariable(7,k)-62*Math.pow(10,-1)/getVariable(6,k);
					break;
				case 2:
					result = getVariable(4,k)+getVariable(2,k)/getVariable(3,k)-getVariable(1,k)/getVariable(3,k)-getVariable(1,k)/getVariable(4,k)+getVariable(6,k)/getVariable(5,k)*getVariable(4,k)/19*Math.pow(10,+8)/42*Math.pow(10,-6)+getVariable(6,k)/getVariable(1,k)+4*Math.pow(10,+1)-getVariable(2,k)/getVariable(7,k)*getVariable(4,k)+getVariable(7,k)/getVariable(4,k)*getVariable(6,k)/getVariable(1,k)-getVariable(1,k)/getVariable(4,k)-getVariable(2,k)/getVariable(5,k)/getVariable(5,k)+71*Math.pow(10,-5)*getVariable(4,k)*getVariable(4,k)/getVariable(9,k);
					break;
				case 3:
					result = getVariable(7,k)*43*Math.pow(10,-2)-getVariable(3,k)/getVariable(7,k)*getVariable(3,k)*getVariable(1,k)/getVariable(6,k)-getVariable(2,k)/getVariable(3,k)+getVariable(7,k)/getVariable(1,k)/getVariable(4,k)*getVariable(7,k)/getVariable(1,k)*getVariable(7,k)+47*Math.pow(10,-1)/getVariable(9,k)-getVariable(2,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)/getVariable(4,k)*getVariable(6,k)*getVariable(3,k)/getVariable(4,k)+99*Math.pow(10,-4)*getVariable(9,k);
					break;
				case 4:
					result = 38*Math.pow(10,+8)/42*Math.pow(10,-2)*80*Math.pow(10,-8)*getVariable(7,k)+61*Math.pow(10,+1)/getVariable(1,k)-getVariable(4,k)+getVariable(6,k)/getVariable(5,k)-61*Math.pow(10,-3)*43*Math.pow(10,+1)*getVariable(1,k)/getVariable(6,k)-getVariable(2,k)/getVariable(9,k)/getVariable(5,k)+51*Math.pow(10,-2)*getVariable(2,k)/getVariable(4,k)/getVariable(1,k)+getVariable(2,k)/getVariable(7,k)/getVariable(2,k)*getVariable(6,k)+getVariable(4,k)*79*Math.pow(10,-6)*getVariable(4,k)*getVariable(4,k);
					break;
				case 5:
					result = getVariable(7,k)-getVariable(4,k)-getVariable(5,k)*getVariable(1,k)/getVariable(6,k)-getVariable(7,k)/getVariable(5,k)*getVariable(7,k)/getVariable(4,k)+getVariable(5,k)*99*Math.pow(10,-3)-getVariable(2,k)/getVariable(6,k)+getVariable(6,k)/getVariable(3,k)-getVariable(7,k)*1*Math.pow(10,-4)*getVariable(7,k)/getVariable(4,k)/getVariable(5,k)/getVariable(3,k)/getVariable(5,k)*getVariable(6,k)*getVariable(7,k)*getVariable(6,k)/getVariable(4,k)*16*Math.pow(10,-1)*getVariable(6,k)*getVariable(6,k)/getVariable(2,k)+95*Math.pow(10,-1)/getVariable(3,k);
					break;
				case 6:
					result = 83*Math.pow(10,+2)*getVariable(7,k)/getVariable(2,k)/getVariable(2,k)+getVariable(7,k)*getVariable(2,k)/4*Math.pow(10,-1)/getVariable(5,k)-getVariable(2,k)/getVariable(6,k)*getVariable(2,k)/getVariable(6,k)*getVariable(2,k)/getVariable(4,k)*getVariable(1,k)/getVariable(7,k)-getVariable(1,k)*getVariable(6,k)/getVariable(3,k)/getVariable(2,k)/getVariable(2,k)*getVariable(6,k)/getVariable(2,k)/getVariable(3,k)/getVariable(3,k)/getVariable(3,k)/getVariable(4,k)*4*Math.pow(10,+6)*getVariable(6,k)+92*Math.pow(10,-5)*getVariable(7,k);
					break;
				case 7:
					result = 66*Math.pow(10,-2)*getVariable(7,k)-getVariable(4,k)/getVariable(4,k)*12*Math.pow(10,-1)*getVariable(4,k)*getVariable(1,k)/getVariable(6,k)+90*Math.pow(10,-5)*getVariable(7,k)*getVariable(4,k)/getVariable(9,k)*getVariable(4,k)-99*Math.pow(10,+1)/getVariable(9,k)/getVariable(4,k)/getVariable(4,k)*getVariable(2,k)+getVariable(4,k)/getVariable(1,k)*93*Math.pow(10,+2)/getVariable(2,k)/getVariable(3,k);
					break;
				case 8:
					result = getVariable(7,k)*29*Math.pow(10,-2)-80*Math.pow(10,-2)/getVariable(3,k)*getVariable(6,k)+getVariable(7,k)/getVariable(4,k)/getVariable(4,k)*getVariable(7,k)-getVariable(2,k)/getVariable(6,k)/getVariable(5,k)*getVariable(2,k)+getVariable(7,k)/getVariable(5,k)*getVariable(2,k)/getVariable(4,k)-getVariable(2,k)/getVariable(6,k)*getVariable(1,k)/getVariable(4,k)*getVariable(1,k)/getVariable(4,k)+getVariable(2,k)/getVariable(1,k)/getVariable(3,k)*getVariable(6,k)/getVariable(1,k)*getVariable(7,k)-getVariable(2,k)*getVariable(2,k)/getVariable(4,k)/getVariable(6,k)+getVariable(1,k)/getVariable(2,k);
					break;
				case 9:
					result = 18*Math.pow(10,+2)/getVariable(2,k)-getVariable(3,k)+getVariable(7,k)*6*Math.pow(10,-1)+57*Math.pow(10,-2)-getVariable(2,k)/getVariable(6,k)-getVariable(1,k)/14*Math.pow(10,-2)*getVariable(2,k)*getVariable(5,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)/getVariable(6,k)/getVariable(4,k)*getVariable(3,k)*1*Math.pow(10,+5)*getVariable(3,k)/getVariable(4,k)/17*Math.pow(10,-5)*getVariable(6,k)*getVariable(6,k)+getVariable(3,k)/getVariable(2,k)/getVariable(9,k)*getVariable(6,k);
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
