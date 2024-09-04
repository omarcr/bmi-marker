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
					result = 1*Math.pow(10,+1)/getVariable(9,k)+getVariable(7,k)-getVariable(3,k)-26*Math.pow(10,-4)/7*Math.pow(10,+9)*getVariable(1,k)*42*Math.pow(10,-6)/getVariable(3,k)/getVariable(6,k)*getVariable(7,k)+getVariable(2,k)*getVariable(8,k)/getVariable(6,k)*getVariable(8,k)-getVariable(2,k)/getVariable(1,k)/getVariable(6,k)*getVariable(7,k);
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
