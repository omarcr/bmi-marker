public class PopEvaluator1 extends algorithm.AbstractPopEvaluator {

	public double evaluate(int idxExpr, int k) {
		double result = 0.0;

		double t = 0.0;

		if(idxExpr<50&& idxExpr>=0){
			result=evaluate1(idxExpr, k);
		}
		if(idxExpr<100&& idxExpr>=50){
			result=evaluate2(idxExpr, k);
		}
		if(idxExpr<150&& idxExpr>=100){
			result=evaluate3(idxExpr, k);
		}
		if(idxExpr<200&& idxExpr>=150){
			result=evaluate4(idxExpr, k);
		}
		if(idxExpr<250&& idxExpr>=200){
			result=evaluate5(idxExpr, k);
		}
		if(idxExpr<300&& idxExpr>=250){
			result=evaluate6(idxExpr, k);
		}
		if(idxExpr<350&& idxExpr>=300){
			result=evaluate7(idxExpr, k);
		}
		if(idxExpr<400&& idxExpr>=350){
			result=evaluate8(idxExpr, k);
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
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-6)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 1:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(5,k);
					break;
				case 2:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)-getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 3:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 4:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 5:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 6:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 7:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 8:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-1)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 9:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 10:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 11:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 12:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 13:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 14:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 15:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 16:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-11*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 17:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 18:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 19:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(2,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 20:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*42*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 21:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 22:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 23:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 24:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-getVariable(7,k)-getVariable(1,k)*96*Math.pow(10,-2)*getVariable(7,k)*2*Math.pow(10,-8)*getVariable(8,k)*99*Math.pow(10,-2)*getVariable(5,k)+18*Math.pow(10,+1)*getVariable(7,k)-99*Math.pow(10,-3)*getVariable(3,k)+40*Math.pow(10,-3)*getVariable(8,k)*getVariable(2,k)+getVariable(3,k)*getVariable(6,k)*87*Math.pow(10,-3)*getVariable(4,k)+getVariable(4,k)-getVariable(2,k)-getVariable(2,k)-99*Math.pow(10,-8)+getVariable(7,k);
					break;
				case 25:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 26:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 27:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 28:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,+3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)-87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 29:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 30:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-27*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 31:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 32:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 33:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 34:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-4)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(8,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 35:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 36:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,+3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 37:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 38:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(7,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 39:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 40:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 41:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 42:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 43:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 44:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 45:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 46:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 47:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(7,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 48:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 49:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate2(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 50:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 51:
					result = 95*Math.pow(10,-3)-getVariable(7,k)-getVariable(3,k)-getVariable(5,k)+99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)*getVariable(8,k)-2*Math.pow(10,-8)-getVariable(8,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(1,k)*99*Math.pow(10,-3)*getVariable(7,k)+40*Math.pow(10,-3)*getVariable(8,k)-getVariable(5,k)*getVariable(7,k)+getVariable(3,k)*getVariable(8,k)*getVariable(2,k)+getVariable(3,k)*getVariable(6,k)*87*Math.pow(10,-3)*getVariable(4,k)+getVariable(4,k)-getVariable(2,k)-99*Math.pow(10,-8)-getVariable(2,k)+92*Math.pow(10,-4)*66*Math.pow(10,-2)-18*Math.pow(10,-3)*getVariable(5,k)-getVariable(7,k)*getVariable(8,k)-getVariable(3,k)+getVariable(9,k)+getVariable(7,k)-49*Math.pow(10,-9)-getVariable(9,k)-4*Math.pow(10,-9)-getVariable(1,k)-getVariable(1,k)+getVariable(6,k)-getVariable(5,k)+getVariable(1,k)*getVariable(8,k)+getVariable(2,k)-19*Math.pow(10,-9)-getVariable(9,k)+98*Math.pow(10,-4)*getVariable(8,k)-getVariable(8,k)-getVariable(3,k);
					break;
				case 52:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)-getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 53:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 54:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 55:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 56:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 57:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 58:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 59:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,+4)+getVariable(2,k);
					break;
				case 60:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 61:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 62:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)+96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 63:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 64:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,+3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 65:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 66:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,+8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 67:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,+8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 68:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 69:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 70:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 71:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(5,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 72:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 73:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 74:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 75:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 76:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 77:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 78:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 79:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 80:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,+3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 81:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 82:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 83:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 84:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 85:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*76*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 86:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 87:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 88:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(6,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 89:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 90:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 91:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(1,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 92:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)+40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 93:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 94:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 95:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 96:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 97:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 98:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-28*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 99:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate3(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 100:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 101:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,+2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 102:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 103:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 104:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-3*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 105:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 106:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 107:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 108:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 109:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 110:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 111:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 112:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 113:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 114:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 115:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 116:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 117:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,+8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 118:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 119:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 120:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 121:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 122:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 123:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 124:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 125:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 126:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 127:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 128:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*48*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 129:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 130:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 131:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 132:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 133:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 134:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 135:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-99*Math.pow(10,-3)+getVariable(5,k)*getVariable(8,k)-getVariable(8,k);
					break;
				case 136:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 137:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-1)+getVariable(2,k);
					break;
				case 138:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 139:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 140:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 141:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 142:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 143:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 144:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 145:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-5)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 146:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 147:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 148:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 149:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate4(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 150:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 151:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 152:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 153:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 154:
					result = getVariable(7,k)-getVariable(8,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 155:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-90*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 156:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 157:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 158:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,+3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+getVariable(3,k)*getVariable(8,k);
					break;
				case 159:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 160:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)*getVariable(2,k)*getVariable(3,k)*7*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 161:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 162:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 163:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 164:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 165:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 166:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 167:
					result = getVariable(3,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 168:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-getVariable(8,k)*getVariable(7,k)-99*Math.pow(10,-3)-getVariable(1,k)*96*Math.pow(10,-2)*getVariable(7,k)*2*Math.pow(10,-8)*getVariable(8,k)*99*Math.pow(10,-2)*getVariable(5,k)+18*Math.pow(10,+1)*getVariable(7,k)-99*Math.pow(10,-3)*getVariable(3,k);
					break;
				case 169:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 170:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 171:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 172:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 173:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 174:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 175:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 176:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)-99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 177:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 178:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 179:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,+4)+getVariable(2,k);
					break;
				case 180:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 181:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(3,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 182:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+51*Math.pow(10,-3)*getVariable(2,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)+getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 183:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 184:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 185:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 186:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 187:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 188:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(3,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 189:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 190:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 191:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-3)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 192:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+53*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 193:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)*87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 194:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 195:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 196:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 197:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 198:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 199:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate5(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 200:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 201:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 202:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 203:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k);
					break;
				case 204:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 205:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 206:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 207:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 208:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 209:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*99*Math.pow(10,-3)-getVariable(8,k)*96*Math.pow(10,-2)-getVariable(8,k)-2*Math.pow(10,-8)*getVariable(7,k)*99*Math.pow(10,-2)*getVariable(1,k)*18*Math.pow(10,+1)*getVariable(7,k)*99*Math.pow(10,-3)+getVariable(8,k)*40*Math.pow(10,-3)-getVariable(5,k)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 210:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 211:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 212:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 213:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 214:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 215:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 216:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 217:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 218:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 219:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 220:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 221:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 222:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+getVariable(5,k)*99*Math.pow(10,-3)-getVariable(7,k)*getVariable(3,k)+getVariable(8,k)*getVariable(2,k)*getVariable(3,k)+getVariable(6,k)*getVariable(4,k)*getVariable(4,k)*40*Math.pow(10,-3)+getVariable(2,k)-getVariable(2,k)-getVariable(2,k)-87*Math.pow(10,-3)+getVariable(7,k);
					break;
				case 223:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 224:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 225:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 226:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 227:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-8)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 228:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k);
					break;
				case 229:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 230:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 231:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 232:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 233:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(3,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 234:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 235:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 236:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 237:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-5)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 238:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 239:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 240:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-99*Math.pow(10,-3)+getVariable(5,k)*getVariable(8,k)-96*Math.pow(10,-2)*getVariable(8,k)-2*Math.pow(10,-8)-getVariable(8,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(1,k)*99*Math.pow(10,-3)*getVariable(7,k)+40*Math.pow(10,-3)*getVariable(8,k)-getVariable(5,k)*87*Math.pow(10,-3)+getVariable(7,k);
					break;
				case 241:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(9,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*getVariable(6,k)*getVariable(4,k)+getVariable(4,k)-getVariable(2,k)-getVariable(2,k)-99*Math.pow(10,-8)+getVariable(4,k);
					break;
				case 242:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 243:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 244:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 245:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 246:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(2,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 247:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 248:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 249:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate6(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 250:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 251:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,+8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 252:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 253:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 254:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 255:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 256:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-5)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 257:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 258:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 259:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 260:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-77*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 261:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,+2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 262:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(5,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 263:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)-87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 264:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 265:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 266:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 267:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)+2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 268:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 269:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 270:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 271:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)-99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 272:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 273:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)*96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 274:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 275:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 276:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+54*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 277:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 278:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 279:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 280:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 281:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 282:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 283:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 284:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 285:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-2)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+getVariable(3,k)*getVariable(8,k)*getVariable(2,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(6,k)*getVariable(4,k)+getVariable(4,k);
					break;
				case 286:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 287:
					result = getVariable(7,k)-getVariable(3,k)-23*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 288:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 289:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 290:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 291:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 292:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 293:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 294:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 295:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 296:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 297:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)*99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 298:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 299:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-96*Math.pow(10,-4)+getVariable(2,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate7(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 300:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 301:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 302:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(7,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 303:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 304:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 305:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 306:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(8,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 307:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 308:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 309:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 310:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 311:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 312:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 313:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,+2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 314:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 315:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,+8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 316:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 317:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(8,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 318:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 319:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 320:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 321:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*99*Math.pow(10,-3)-getVariable(8,k)*96*Math.pow(10,-2)+getVariable(8,k)-2*Math.pow(10,-8)*getVariable(7,k)*99*Math.pow(10,-2)*getVariable(1,k)*18*Math.pow(10,+1)*getVariable(7,k)*99*Math.pow(10,-3)+getVariable(8,k)*40*Math.pow(10,-3)-getVariable(5,k)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(9,k);
					break;
				case 322:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 323:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 324:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 325:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 326:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 327:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 328:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 329:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 330:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 331:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,+2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 332:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 333:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-40*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,+3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 334:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 335:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-99*Math.pow(10,-3)+getVariable(5,k)*getVariable(8,k)-96*Math.pow(10,-2)*getVariable(8,k)-2*Math.pow(10,-8)-getVariable(8,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(1,k)*99*Math.pow(10,-3)*getVariable(7,k)+40*Math.pow(10,-3)*getVariable(8,k)-87*Math.pow(10,-3)*getVariable(5,k)+99*Math.pow(10,-8)*getVariable(7,k)*getVariable(3,k)+getVariable(8,k)*getVariable(2,k)*92*Math.pow(10,-4)*getVariable(3,k)+getVariable(6,k)-getVariable(4,k)-getVariable(4,k)-50*Math.pow(10,+3)+getVariable(2,k);
					break;
				case 336:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)*getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 337:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 338:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,-1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 339:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 340:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,+8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 341:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,+8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 342:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 343:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 344:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*15*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 345:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 346:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)+92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 347:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 348:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 349:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate8(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 350:
					result = getVariable(6,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 351:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 352:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(2,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 353:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 354:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 355:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 356:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 357:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 358:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 359:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,+4)+getVariable(2,k);
					break;
				case 360:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,-1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 361:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*99*Math.pow(10,-2)*getVariable(1,k)*72*Math.pow(10,+1)*getVariable(7,k)*99*Math.pow(10,-3)+getVariable(8,k)*40*Math.pow(10,-3)-getVariable(5,k)*87*Math.pow(10,-3)+getVariable(7,k);
					break;
				case 362:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 363:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)-87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 364:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 365:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*17*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 366:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 367:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)+getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 368:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 369:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 370:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 371:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 372:
					result = getVariable(7,k)+getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-92*Math.pow(10,-4)-getVariable(4,k)-getVariable(2,k)+50*Math.pow(10,+6)*getVariable(2,k);
					break;
				case 373:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 374:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 375:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 376:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-66*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 377:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 378:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 379:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 380:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-1)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,+3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 381:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 382:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+72*Math.pow(10,+4)*getVariable(2,k)-getVariable(7,k)+getVariable(8,k)*getVariable(2,k)-55*Math.pow(10,+1)+getVariable(8,k)-getVariable(5,k)+getVariable(2,k)+getVariable(8,k)*getVariable(9,k)-getVariable(3,k);
					break;
				case 383:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 384:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 385:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 386:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)*getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 387:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 388:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 389:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 390:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 391:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(1,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)-getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 392:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 393:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 394:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(3,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 395:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 396:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 397:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 398:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-20*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 399:
					result = getVariable(7,k)-getVariable(3,k)-95*Math.pow(10,-3)-getVariable(5,k)+getVariable(8,k)*getVariable(8,k)-99*Math.pow(10,-3)*getVariable(8,k)-96*Math.pow(10,-2)-getVariable(7,k)*2*Math.pow(10,-8)*getVariable(1,k)*99*Math.pow(10,-2)*getVariable(7,k)*18*Math.pow(10,+1)*getVariable(8,k)+99*Math.pow(10,-3)*getVariable(5,k)-40*Math.pow(10,-3)*getVariable(7,k)+87*Math.pow(10,-3)*getVariable(3,k)*getVariable(8,k)+getVariable(2,k)*getVariable(3,k)*99*Math.pow(10,-8)*getVariable(6,k)+getVariable(4,k)-getVariable(4,k)-getVariable(2,k)-92*Math.pow(10,-4)+getVariable(2,k);
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
