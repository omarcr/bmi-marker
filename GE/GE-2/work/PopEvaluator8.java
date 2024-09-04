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
					result = 18*Math.pow(10,-2)-99*Math.pow(10,+3)*87*Math.pow(10,-9)/55*Math.pow(10,+5)+getVariable(7,k)*getVariable(7,k)/getVariable(7,k)*42*Math.pow(10,-2)+79*Math.pow(10,-3)-getVariable(4,k)+getVariable(9,k)*getVariable(6,k)/getVariable(1,k)*12*Math.pow(10,-4)*getVariable(6,k)+getVariable(4,k)-79*Math.pow(10,-1)/getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k)-getVariable(8,k)*getVariable(1,k)*getVariable(2,k)/42*Math.pow(10,-4)/getVariable(5,k)*getVariable(6,k)*getVariable(7,k)/35*Math.pow(10,-1)*getVariable(6,k)+1*Math.pow(10,+2)/getVariable(9,k)*getVariable(6,k)/getVariable(1,k)/48*Math.pow(10,-2)*getVariable(6,k)*getVariable(6,k)-getVariable(3,k)/getVariable(9,k)*getVariable(2,k)/getVariable(6,k);
					break;
				case 1:
					result = 95*Math.pow(10,-2)*getVariable(7,k)-getVariable(5,k)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(2,k)/getVariable(7,k)/getVariable(7,k)*getVariable(6,k)-getVariable(1,k)/getVariable(5,k)/getVariable(4,k)/getVariable(4,k)/getVariable(3,k)*getVariable(1,k)/95*Math.pow(10,+5)*getVariable(8,k)+1*Math.pow(10,+1)/getVariable(3,k)*getVariable(9,k)*getVariable(5,k)/getVariable(7,k)*10*Math.pow(10,+1)/getVariable(9,k)-getVariable(3,k)/getVariable(5,k)*getVariable(2,k)/getVariable(1,k)/getVariable(8,k)/getVariable(6,k)*getVariable(1,k)/getVariable(4,k)*getVariable(7,k)+getVariable(5,k)/getVariable(7,k)*getVariable(6,k)/6*Math.pow(10,+2)/getVariable(1,k)-1*Math.pow(10,-3)*getVariable(7,k)/getVariable(4,k)/getVariable(8,k)*getVariable(7,k)/48*Math.pow(10,+1)*getVariable(8,k)/getVariable(8,k)*getVariable(7,k)+34*Math.pow(10,-3)-getVariable(8,k)*getVariable(5,k)/getVariable(4,k)+94*Math.pow(10,-2)+90*Math.pow(10,-2)+getVariable(5,k)/60*Math.pow(10,+1)*getVariable(5,k)/getVariable(7,k)*getVariable(5,k)/getVariable(7,k)*getVariable(6,k)/getVariable(7,k)*getVariable(8,k)*1*Math.pow(10,+3)/getVariable(2,k)-getVariable(7,k)/getVariable(3,k)/getVariable(3,k)*25*Math.pow(10,+2)/getVariable(2,k)/getVariable(4,k)*getVariable(7,k)-4*Math.pow(10,+8)/getVariable(6,k)/getVariable(6,k)/getVariable(4,k)/getVariable(5,k)/getVariable(4,k)/getVariable(6,k)*getVariable(2,k)+getVariable(6,k)/getVariable(5,k)/getVariable(9,k)/getVariable(8,k)/getVariable(5,k)*getVariable(6,k)/getVariable(3,k)*getVariable(6,k)/getVariable(5,k)*getVariable(6,k)/getVariable(8,k);
					break;
				case 2:
					result = getVariable(8,k)+getVariable(5,k)-getVariable(1,k)/getVariable(3,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k)-getVariable(2,k)/getVariable(6,k)*1*Math.pow(10,-9)*getVariable(5,k)/16*Math.pow(10,+8)*getVariable(5,k)+getVariable(7,k)*2*Math.pow(10,-2)*getVariable(8,k)+getVariable(6,k)/26*Math.pow(10,+2)/getVariable(5,k)-getVariable(3,k)/getVariable(6,k)/getVariable(1,k)*getVariable(2,k)/getVariable(7,k)*getVariable(2,k)+getVariable(3,k)-getVariable(1,k)/getVariable(3,k)-68*Math.pow(10,-3)+16*Math.pow(10,-2)-getVariable(3,k)*95*Math.pow(10,-2)-getVariable(8,k)-getVariable(2,k)*getVariable(2,k)*getVariable(2,k)*getVariable(2,k)/getVariable(6,k)/getVariable(7,k)/getVariable(7,k)/getVariable(2,k);
					break;
				case 3:
					result = 1*Math.pow(10,-9)-getVariable(1,k)*99*Math.pow(10,+3)/35*Math.pow(10,-4)-getVariable(3,k)-getVariable(5,k)+getVariable(7,k)+getVariable(3,k)*79*Math.pow(10,-2)/getVariable(7,k)*getVariable(6,k)-getVariable(2,k)/getVariable(5,k)/getVariable(8,k)+getVariable(8,k)/getVariable(8,k)+10*Math.pow(10,-5)*getVariable(4,k)*getVariable(5,k)*getVariable(3,k)/91*Math.pow(10,+4)/getVariable(1,k)/getVariable(4,k)*getVariable(5,k)-getVariable(7,k)/getVariable(3,k)*getVariable(7,k)/getVariable(5,k)+getVariable(8,k)-86*Math.pow(10,-1)/getVariable(5,k)*getVariable(2,k)/getVariable(5,k)/getVariable(8,k)*72*Math.pow(10,+1)/getVariable(2,k)-getVariable(7,k)/getVariable(8,k)/getVariable(5,k)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)+getVariable(5,k)*getVariable(2,k)*getVariable(6,k)/getVariable(3,k)/getVariable(7,k)/getVariable(4,k);
					break;
				case 4:
					result = 4*Math.pow(10,+4)/getVariable(2,k)/getVariable(1,k)*54*Math.pow(10,-2)-getVariable(3,k)*85*Math.pow(10,-2)*96*Math.pow(10,-2)-getVariable(5,k)+getVariable(7,k)+getVariable(5,k)/46*Math.pow(10,+1)-getVariable(2,k)*getVariable(1,k)/getVariable(3,k)/getVariable(6,k)*getVariable(7,k)/getVariable(3,k)*getVariable(7,k)/getVariable(1,k)-getVariable(2,k)/getVariable(5,k)/getVariable(8,k)-70*Math.pow(10,-2)+getVariable(8,k)-getVariable(7,k)/getVariable(5,k)/80*Math.pow(10,+3)/46*Math.pow(10,-5)*getVariable(5,k)*getVariable(1,k)*getVariable(7,k)/getVariable(5,k)*getVariable(7,k)+getVariable(7,k)/getVariable(4,k)/getVariable(4,k)*getVariable(8,k)+getVariable(8,k)+getVariable(9,k)/16*Math.pow(10,+2)/getVariable(7,k)-69*Math.pow(10,+5)/getVariable(5,k)/getVariable(8,k)/getVariable(5,k)/getVariable(5,k)/getVariable(6,k)+getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(7,k)*61*Math.pow(10,-1)-getVariable(7,k)/getVariable(5,k)/9*Math.pow(10,-1)*getVariable(3,k)/getVariable(8,k)-getVariable(7,k)*getVariable(2,k)/getVariable(3,k)*getVariable(7,k)/getVariable(3,k)/getVariable(3,k)/getVariable(5,k)/getVariable(8,k)/getVariable(4,k)*getVariable(7,k)+getVariable(2,k)/17*Math.pow(10,-1)*getVariable(6,k)/14*Math.pow(10,-4)/79*Math.pow(10,+9)*getVariable(6,k)/9*Math.pow(10,-1)/getVariable(4,k)/getVariable(9,k)*getVariable(5,k)/getVariable(7,k);
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
