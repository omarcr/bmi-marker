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
					result = getVariable(8,k)-getVariable(2,k)*33*Math.pow(10,-4)*getVariable(7,k)+86*Math.pow(10,-4)+getVariable(7,k)-39*Math.pow(10,-2)*getVariable(3,k);
					break;
				case 1:
					result = 32*Math.pow(10,-2)*getVariable(7,k);
					break;
				case 2:
					result = getVariable(8,k)-getVariable(5,k)-getVariable(4,k)-getVariable(1,k)/getVariable(9,k)+getVariable(7,k);
					break;
				case 3:
					result = 50*Math.pow(10,-4)/83*Math.pow(10,+4)*getVariable(7,k)+63*Math.pow(10,+1)/getVariable(1,k)-77*Math.pow(10,-6)*66*Math.pow(10,+5)/2*Math.pow(10,-3)+getVariable(8,k)-getVariable(3,k);
					break;
				case 4:
					result = getVariable(3,k)/getVariable(7,k)-getVariable(1,k)*37*Math.pow(10,-2)+getVariable(7,k)-getVariable(3,k)-getVariable(7,k)/getVariable(3,k);
					break;
				case 5:
					result = getVariable(7,k)-getVariable(7,k)*22*Math.pow(10,+6)/63*Math.pow(10,-8)*getVariable(7,k)-getVariable(3,k)+75*Math.pow(10,-8)*65*Math.pow(10,+2)*getVariable(1,k)*88*Math.pow(10,-4)*getVariable(3,k)*getVariable(5,k)*getVariable(8,k);
					break;
				case 6:
					result = getVariable(5,k)+getVariable(7,k)-getVariable(5,k)-getVariable(4,k)-37*Math.pow(10,-8)+getVariable(8,k)-getVariable(1,k)/getVariable(9,k)-getVariable(5,k);
					break;
				case 7:
					result = 33*Math.pow(10,+2)/getVariable(2,k)*getVariable(7,k)/getVariable(2,k)/34*Math.pow(10,+2)-getVariable(2,k)/getVariable(8,k)/getVariable(5,k);
					break;
				case 8:
					result = getVariable(7,k)-getVariable(1,k)*40*Math.pow(10,-3)+getVariable(8,k)-getVariable(4,k)-getVariable(5,k);
					break;
				case 9:
					result = getVariable(7,k)-getVariable(5,k)-23*Math.pow(10,+4)*17*Math.pow(10,-3)/getVariable(5,k)/getVariable(5,k)-getVariable(6,k)/getVariable(5,k)-24*Math.pow(10,-6)-getVariable(4,k)*getVariable(1,k)/getVariable(6,k);
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
