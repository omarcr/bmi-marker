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
					result = 5*Math.pow(10,-9)+getVariable(7,k)-getVariable(3,k)*93*Math.pow(10,-2)-getVariable(5,k)+getVariable(8,k)-99*Math.pow(10,-8)*79*Math.pow(10,-3)*getVariable(7,k)*getVariable(7,k)*getVariable(7,k)*getVariable(7,k)+getVariable(3,k)-getVariable(3,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-2)*getVariable(1,k)+94*Math.pow(10,-4)*getVariable(1,k)-32*Math.pow(10,-1)+getVariable(1,k)-99*Math.pow(10,-2)+98*Math.pow(10,-3)*getVariable(6,k)*99*Math.pow(10,-5)*getVariable(6,k)-96*Math.pow(10,-3)+getVariable(5,k)*getVariable(6,k)*99*Math.pow(10,-5)+99*Math.pow(10,-5)*getVariable(5,k)*getVariable(6,k);
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
