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
		if(idxExpr<450&& idxExpr>=400){
			result=evaluate9(idxExpr, k);
		}
		if(idxExpr<500&& idxExpr>=450){
			result=evaluate10(idxExpr, k);
		}
		if(idxExpr<550&& idxExpr>=500){
			result=evaluate11(idxExpr, k);
		}
		if(idxExpr<600&& idxExpr>=550){
			result=evaluate12(idxExpr, k);
		}
		if(idxExpr<650&& idxExpr>=600){
			result=evaluate13(idxExpr, k);
		}
		if(idxExpr<700&& idxExpr>=650){
			result=evaluate14(idxExpr, k);
		}
		if(idxExpr<750&& idxExpr>=700){
			result=evaluate15(idxExpr, k);
		}
		if(idxExpr<800&& idxExpr>=750){
			result=evaluate16(idxExpr, k);
		}
		if(idxExpr<850&& idxExpr>=800){
			result=evaluate17(idxExpr, k);
		}
		if(idxExpr<900&& idxExpr>=850){
			result=evaluate18(idxExpr, k);
		}
		if(idxExpr<950&& idxExpr>=900){
			result=evaluate19(idxExpr, k);
		}
		if(idxExpr<1000&& idxExpr>=950){
			result=evaluate20(idxExpr, k);
		}
		if(idxExpr<1050&& idxExpr>=1000){
			result=evaluate21(idxExpr, k);
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
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 1:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 2:
					result = 3*Math.pow(10,-6)/getVariable(8,k)*81*Math.pow(10,+2)*getVariable(7,k)+getVariable(8,k);
					break;
				case 3:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 4:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+83*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 5:
					result = 55*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 6:
					result = 40*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 7:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/getVariable(1,k)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 8:
					result = 40*Math.pow(10,-9)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 9:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,-2)*45*Math.pow(10,+3)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 10:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 11:
					result = getVariable(4,k)/getVariable(4,k);
					break;
				case 12:
					result = 36*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 13:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 14:
					result = 64*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 15:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 16:
					result = 2*Math.pow(10,-5)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 17:
					result = 45*Math.pow(10,-4)*getVariable(3,k)+getVariable(8,k)+17*Math.pow(10,-9)*getVariable(6,k)+getVariable(7,k)/getVariable(2,k)*40*Math.pow(10,-9)/getVariable(4,k)*49*Math.pow(10,-2)*getVariable(1,k)/getVariable(6,k);
					break;
				case 18:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 19:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 20:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 21:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 22:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(3,k);
					break;
				case 23:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 24:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 25:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 26:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(4,k)*getVariable(8,k);
					break;
				case 27:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 28:
					result = 55*Math.pow(10,-2)*getVariable(9,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 29:
					result = getVariable(7,k)-getVariable(8,k);
					break;
				case 30:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)+getVariable(8,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 31:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(7,k);
					break;
				case 32:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 33:
					result = 40*Math.pow(10,-8)-getVariable(4,k);
					break;
				case 34:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 35:
					result = getVariable(4,k)/getVariable(4,k);
					break;
				case 36:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)+getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 37:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)*getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 38:
					result = 55*Math.pow(10,-2)-getVariable(7,k)+getVariable(7,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 39:
					result = 55*Math.pow(10,-9)*36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 40:
					result = 9*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 41:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 42:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 43:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 44:
					result = getVariable(8,k)-getVariable(5,k);
					break;
				case 45:
					result = getVariable(1,k)+getVariable(5,k);
					break;
				case 46:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 47:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 48:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 49:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
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
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 51:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 52:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(7,k)*getVariable(8,k);
					break;
				case 53:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(8,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 54:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 55:
					result = getVariable(5,k)*getVariable(7,k);
					break;
				case 56:
					result = 67*Math.pow(10,-2)/getVariable(3,k);
					break;
				case 57:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 58:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,-1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 59:
					result = 40*Math.pow(10,+9)-8*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 60:
					result = 17*Math.pow(10,-1)-getVariable(8,k)-getVariable(4,k)*77*Math.pow(10,-9)/getVariable(1,k);
					break;
				case 61:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 62:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 63:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 64:
					result = 36*Math.pow(10,-2)+getVariable(1,k)/getVariable(3,k);
					break;
				case 65:
					result = getVariable(7,k)+getVariable(5,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 66:
					result = getVariable(3,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 67:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 68:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-3)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 69:
					result = 34*Math.pow(10,-2)+getVariable(1,k)/getVariable(3,k);
					break;
				case 70:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 71:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 72:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 73:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 74:
					result = 40*Math.pow(10,-2)/32*Math.pow(10,-1)/getVariable(4,k)-getVariable(6,k)-getVariable(2,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k)-getVariable(3,k);
					break;
				case 75:
					result = 91*Math.pow(10,-4)-6*Math.pow(10,-1)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 76:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)*getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 77:
					result = 12*Math.pow(10,-5)-29*Math.pow(10,+1)+getVariable(9,k);
					break;
				case 78:
					result = 9*Math.pow(10,-5)+getVariable(5,k);
					break;
				case 79:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 80:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 81:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 82:
					result = 55*Math.pow(10,-5)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(8,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 83:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(7,k)+getVariable(8,k);
					break;
				case 84:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 85:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+getVariable(8,k)/getVariable(3,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 86:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 87:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 88:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 89:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 90:
					result = 66*Math.pow(10,-8)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 91:
					result = getVariable(5,k)-getVariable(1,k);
					break;
				case 92:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+2)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 93:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 94:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 95:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 96:
					result = 40*Math.pow(10,-9)/83*Math.pow(10,-4)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 97:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 98:
					result = 55*Math.pow(10,-9)/73*Math.pow(10,-9)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 99:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
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
					result = getVariable(9,k)/getVariable(7,k);
					break;
				case 101:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 102:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 103:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 104:
					result = 40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 105:
					result = getVariable(8,k)+getVariable(5,k);
					break;
				case 106:
					result = 6*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-1)*getVariable(1,k)*getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 107:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+2)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 108:
					result = 58*Math.pow(10,-9)/getVariable(9,k)*getVariable(5,k)-getVariable(7,k);
					break;
				case 109:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 110:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+83*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 111:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-55*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 112:
					result = getVariable(7,k)/getVariable(6,k);
					break;
				case 113:
					result = 77*Math.pow(10,-1)/getVariable(7,k);
					break;
				case 114:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 115:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 116:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-1)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 117:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-9)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+2)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 118:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 119:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 120:
					result = 86*Math.pow(10,-6)-getVariable(4,k);
					break;
				case 121:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 122:
					result = 73*Math.pow(10,-4)+getVariable(2,k);
					break;
				case 123:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 124:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+40*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 125:
					result = 55*Math.pow(10,-8)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 126:
					result = getVariable(5,k)/getVariable(1,k)-getVariable(1,k);
					break;
				case 127:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 128:
					result = getVariable(3,k)-getVariable(6,k)*2*Math.pow(10,-5)/getVariable(6,k)/getVariable(9,k)*getVariable(5,k)/getVariable(3,k);
					break;
				case 129:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)*36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 130:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 131:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 132:
					result = getVariable(7,k)/getVariable(8,k);
					break;
				case 133:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(2,k)+getVariable(8,k);
					break;
				case 134:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+9)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 135:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 136:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 137:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+2)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 138:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 139:
					result = 26*Math.pow(10,-1)*getVariable(4,k)/getVariable(1,k);
					break;
				case 140:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 141:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 142:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)*55*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 143:
					result = 40*Math.pow(10,-9)-83*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 144:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 145:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 146:
					result = 22*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+8*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 147:
					result = 78*Math.pow(10,-9)-40*Math.pow(10,-9)-55*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 148:
					result = getVariable(7,k)+getVariable(7,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 149:
					result = 55*Math.pow(10,-2)*40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
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
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 151:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 152:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 153:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 154:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 155:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 156:
					result = 54*Math.pow(10,-6)-69*Math.pow(10,-9)*getVariable(1,k)-getVariable(3,k);
					break;
				case 157:
					result = getVariable(9,k)-getVariable(5,k);
					break;
				case 158:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,+2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 159:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/71*Math.pow(10,-1)-getVariable(4,k);
					break;
				case 160:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 161:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 162:
					result = 55*Math.pow(10,+9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 163:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,-1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 164:
					result = getVariable(2,k)+getVariable(5,k);
					break;
				case 165:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 166:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-8)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 167:
					result = 8*Math.pow(10,-2)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 168:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 169:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-6)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 170:
					result = 55*Math.pow(10,-9)+65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+3)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 171:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)/getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 172:
					result = getVariable(4,k)/getVariable(7,k);
					break;
				case 173:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(3,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 174:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 175:
					result = 90*Math.pow(10,-2)/getVariable(3,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 176:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+4)-getVariable(4,k)+getVariable(8,k);
					break;
				case 177:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 178:
					result = getVariable(3,k)-getVariable(8,k);
					break;
				case 179:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 180:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 181:
					result = getVariable(4,k)/getVariable(3,k);
					break;
				case 182:
					result = 6*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 183:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 184:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 185:
					result = 78*Math.pow(10,-9)-40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(4,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 186:
					result = 28*Math.pow(10,-2)*getVariable(7,k);
					break;
				case 187:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 188:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 189:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 190:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 191:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 192:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 193:
					result = 29*Math.pow(10,+1)/getVariable(6,k);
					break;
				case 194:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)+getVariable(8,k);
					break;
				case 195:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)*getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 196:
					result = 66*Math.pow(10,-8)*40*Math.pow(10,-9)+91*Math.pow(10,-1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 197:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+2)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 198:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*40*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 199:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
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
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+65*Math.pow(10,-2)*getVariable(2,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 201:
					result = 55*Math.pow(10,-8)-getVariable(9,k)+getVariable(1,k);
					break;
				case 202:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 203:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 204:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 205:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*40*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 206:
					result = getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 207:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*20*Math.pow(10,-8)*getVariable(7,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 208:
					result = 55*Math.pow(10,-5)+40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 209:
					result = 85*Math.pow(10,-4)-getVariable(5,k);
					break;
				case 210:
					result = 82*Math.pow(10,+1)+getVariable(2,k);
					break;
				case 211:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 212:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+36*Math.pow(10,+8)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 213:
					result = 55*Math.pow(10,-9)/55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 214:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 215:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 216:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 217:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 218:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+40*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 219:
					result = 95*Math.pow(10,-4)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 220:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 221:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 222:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 223:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 224:
					result = 38*Math.pow(10,-6)*getVariable(9,k)/getVariable(7,k)/getVariable(3,k)*3*Math.pow(10,+3)/getVariable(8,k)*getVariable(7,k);
					break;
				case 225:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 226:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 227:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+2)-getVariable(4,k);
					break;
				case 228:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 229:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 230:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*32*Math.pow(10,+1)-getVariable(8,k)-getVariable(2,k)/getVariable(4,k)+getVariable(9,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 231:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 232:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 233:
					result = 66*Math.pow(10,-8)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 234:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)/getVariable(8,k);
					break;
				case 235:
					result = 79*Math.pow(10,-1)*getVariable(3,k)*getVariable(5,k)/getVariable(3,k)+getVariable(4,k);
					break;
				case 236:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 237:
					result = getVariable(7,k)-getVariable(6,k);
					break;
				case 238:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/47*Math.pow(10,-4)*68*Math.pow(10,+4)-getVariable(4,k)/14*Math.pow(10,-4)*95*Math.pow(10,-2)+getVariable(1,k)-getVariable(2,k)/getVariable(7,k)/getVariable(7,k)-getVariable(9,k)+getVariable(8,k);
					break;
				case 239:
					result = getVariable(8,k)+getVariable(5,k);
					break;
				case 240:
					result = 33*Math.pow(10,-5)+getVariable(4,k);
					break;
				case 241:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 242:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 243:
					result = 70*Math.pow(10,-9)+getVariable(1,k)-getVariable(9,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 244:
					result = 6*Math.pow(10,-1)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 245:
					result = 55*Math.pow(10,-9)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 246:
					result = 22*Math.pow(10,-9)-78*Math.pow(10,-9)-40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+getVariable(6,k)*getVariable(2,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 247:
					result = 36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 248:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 249:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
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
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 251:
					result = getVariable(1,k)-getVariable(4,k);
					break;
				case 252:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 253:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 254:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)-55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 255:
					result = getVariable(6,k)+getVariable(4,k);
					break;
				case 256:
					result = getVariable(3,k)*getVariable(7,k);
					break;
				case 257:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)/getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 258:
					result = 55*Math.pow(10,-2)/getVariable(7,k);
					break;
				case 259:
					result = 6*Math.pow(10,-5)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+96*Math.pow(10,-5)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 260:
					result = getVariable(9,k)-getVariable(8,k);
					break;
				case 261:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 262:
					result = 22*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 263:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 264:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 265:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 266:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(8,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 267:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(7,k);
					break;
				case 268:
					result = 40*Math.pow(10,-2)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 269:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*95*Math.pow(10,-4)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 270:
					result = getVariable(1,k)-getVariable(5,k);
					break;
				case 271:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 272:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*40*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 273:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(9,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 274:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 275:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*40*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 276:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,-1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 277:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,+8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 278:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 279:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 280:
					result = 81*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 281:
					result = 40*Math.pow(10,-9)/83*Math.pow(10,-4)*95*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 282:
					result = 40*Math.pow(10,-9)-83*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/83*Math.pow(10,-2)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 283:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-36*Math.pow(10,+1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 284:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 285:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 286:
					result = 78*Math.pow(10,-6)+getVariable(5,k);
					break;
				case 287:
					result = getVariable(1,k)/getVariable(4,k);
					break;
				case 288:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 289:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 290:
					result = getVariable(1,k)+getVariable(3,k)*getVariable(8,k);
					break;
				case 291:
					result = 55*Math.pow(10,-9)/36*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 292:
					result = 83*Math.pow(10,-4)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 293:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*getVariable(8,k)/getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 294:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 295:
					result = 54*Math.pow(10,-4)/getVariable(5,k)+getVariable(8,k);
					break;
				case 296:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 297:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 298:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 299:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
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
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-4)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 301:
					result = 29*Math.pow(10,-1)*getVariable(9,k)/96*Math.pow(10,-2)/getVariable(3,k)*2*Math.pow(10,+5)/getVariable(6,k);
					break;
				case 302:
					result = getVariable(8,k)+getVariable(5,k);
					break;
				case 303:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/getVariable(7,k)+getVariable(6,k)/getVariable(9,k)*getVariable(1,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 304:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)*getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 305:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)-getVariable(8,k);
					break;
				case 306:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 307:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 308:
					result = 45*Math.pow(10,-4)*getVariable(3,k)+getVariable(8,k)+17*Math.pow(10,-9)*getVariable(6,k)+getVariable(7,k)/getVariable(2,k)*2*Math.pow(10,-5)/getVariable(4,k)*49*Math.pow(10,-2)*getVariable(1,k)/getVariable(6,k);
					break;
				case 309:
					result = 64*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 310:
					result = 61*Math.pow(10,-9)+55*Math.pow(10,-2)-getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 311:
					result = getVariable(9,k)*getVariable(5,k);
					break;
				case 312:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*40*Math.pow(10,-9)-55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 313:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)+83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 314:
					result = 85*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 315:
					result = 70*Math.pow(10,-9)+getVariable(1,k)-getVariable(9,k);
					break;
				case 316:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 317:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 318:
					result = getVariable(2,k)+getVariable(6,k);
					break;
				case 319:
					result = 30*Math.pow(10,-8)+getVariable(1,k)/getVariable(7,k)*getVariable(8,k);
					break;
				case 320:
					result = getVariable(4,k)*getVariable(8,k);
					break;
				case 321:
					result = getVariable(8,k)+getVariable(5,k);
					break;
				case 322:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 323:
					result = 82*Math.pow(10,-1)-getVariable(8,k)+getVariable(8,k);
					break;
				case 324:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)*55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 325:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)+getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 326:
					result = 22*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*83*Math.pow(10,-2)+98*Math.pow(10,-9)/getVariable(6,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 327:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 328:
					result = 71*Math.pow(10,+1)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 329:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/40*Math.pow(10,-9)-getVariable(4,k);
					break;
				case 330:
					result = 95*Math.pow(10,-1)-40*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 331:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+4)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 332:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 333:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 334:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 335:
					result = getVariable(3,k)+getVariable(1,k);
					break;
				case 336:
					result = 64*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 337:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 338:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(2,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 339:
					result = 45*Math.pow(10,-4)*getVariable(3,k)+getVariable(8,k)+17*Math.pow(10,-9)*getVariable(6,k)+getVariable(7,k)/getVariable(4,k)*2*Math.pow(10,-5)/getVariable(4,k)*49*Math.pow(10,-2)*getVariable(1,k)/getVariable(6,k);
					break;
				case 340:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 341:
					result = getVariable(4,k)/getVariable(9,k);
					break;
				case 342:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 343:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)*55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 344:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-3)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 345:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 346:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,+2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 347:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 348:
					result = 40*Math.pow(10,-9)+40*Math.pow(10,+1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 349:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/83*Math.pow(10,-2)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
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
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 351:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 352:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(4,k)*getVariable(8,k);
					break;
				case 353:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 354:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+getVariable(3,k)/getVariable(2,k)*getVariable(6,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 355:
					result = 39*Math.pow(10,-5)*62*Math.pow(10,-5)-4*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 356:
					result = 22*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 357:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 358:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/85*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 359:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 360:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 361:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+9)-getVariable(4,k)+getVariable(8,k);
					break;
				case 362:
					result = 40*Math.pow(10,+1)-getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 363:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/85*Math.pow(10,-4)-getVariable(9,k)-getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 364:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 365:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 366:
					result = getVariable(8,k)+getVariable(5,k);
					break;
				case 367:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 368:
					result = 82*Math.pow(10,-1)-getVariable(8,k)+getVariable(8,k);
					break;
				case 369:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 370:
					result = getVariable(3,k)/getVariable(8,k);
					break;
				case 371:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(7,k)*getVariable(8,k);
					break;
				case 372:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 373:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+40*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 374:
					result = 85*Math.pow(10,+4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 375:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,-1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 376:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)-getVariable(8,k)*getVariable(8,k);
					break;
				case 377:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)*getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 378:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)/getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 379:
					result = getVariable(4,k)-getVariable(8,k);
					break;
				case 380:
					result = 6*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 381:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 382:
					result = 27*Math.pow(10,-4)/getVariable(7,k)/28*Math.pow(10,-3)*81*Math.pow(10,+1)-getVariable(1,k)*getVariable(8,k)/83*Math.pow(10,+1)+getVariable(9,k);
					break;
				case 383:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 384:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 385:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 386:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 387:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 388:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 389:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 390:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 391:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 392:
					result = 36*Math.pow(10,+1)/1*Math.pow(10,-9)+getVariable(1,k)+42*Math.pow(10,-2)+80*Math.pow(10,-1)+getVariable(3,k)-getVariable(2,k);
					break;
				case 393:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/95*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 394:
					result = getVariable(8,k)*getVariable(8,k);
					break;
				case 395:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(9,k);
					break;
				case 396:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 397:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 398:
					result = 6*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+60*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 399:
					result = 55*Math.pow(10,-8)+getVariable(3,k)/getVariable(1,k)/getVariable(7,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate9(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 400:
					result = 70*Math.pow(10,-9)/getVariable(9,k)/getVariable(9,k);
					break;
				case 401:
					result = getVariable(6,k)-getVariable(8,k);
					break;
				case 402:
					result = 71*Math.pow(10,-1)/getVariable(5,k);
					break;
				case 403:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 404:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 405:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 406:
					result = 22*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 407:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 408:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 409:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 410:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 411:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 412:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(8,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 413:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(7,k)*getVariable(8,k);
					break;
				case 414:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,-9)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 415:
					result = 36*Math.pow(10,+1)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 416:
					result = 51*Math.pow(10,-8)-getVariable(3,k)+getVariable(9,k);
					break;
				case 417:
					result = getVariable(3,k)-getVariable(6,k)*2*Math.pow(10,-5)/getVariable(6,k)*getVariable(9,k)*getVariable(5,k)/getVariable(3,k);
					break;
				case 418:
					result = 55*Math.pow(10,-2)*52*Math.pow(10,+4)-getVariable(2,k)/18*Math.pow(10,-9)+getVariable(2,k)+getVariable(1,k)*getVariable(7,k)+63*Math.pow(10,-9)*getVariable(1,k)/getVariable(7,k)-getVariable(8,k)-getVariable(7,k)+getVariable(1,k)*getVariable(9,k)/25*Math.pow(10,-2)/getVariable(8,k)/getVariable(1,k)*79*Math.pow(10,+4)-5*Math.pow(10,+2)-getVariable(1,k)*getVariable(9,k)*getVariable(7,k)-getVariable(8,k)-getVariable(7,k)-57*Math.pow(10,-8)/getVariable(6,k)-59*Math.pow(10,+4)-getVariable(7,k)-getVariable(6,k);
					break;
				case 419:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/71*Math.pow(10,+1)-getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 420:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 421:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 422:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-55*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 423:
					result = 83*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 424:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)*55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 425:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 426:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 427:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 428:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 429:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 430:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 431:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 432:
					result = getVariable(4,k)*getVariable(8,k);
					break;
				case 433:
					result = getVariable(5,k)*getVariable(8,k);
					break;
				case 434:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 435:
					result = getVariable(2,k)/getVariable(3,k)-getVariable(3,k)/getVariable(6,k);
					break;
				case 436:
					result = 6*Math.pow(10,-5)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 437:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 438:
					result = 17*Math.pow(10,-1)-41*Math.pow(10,-9)*getVariable(7,k)*getVariable(8,k)+getVariable(6,k)*77*Math.pow(10,-9)/getVariable(1,k);
					break;
				case 439:
					result = getVariable(8,k)-getVariable(4,k);
					break;
				case 440:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 441:
					result = 40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 442:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 443:
					result = 65*Math.pow(10,-2)/40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 444:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 445:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 446:
					result = getVariable(8,k)/getVariable(1,k);
					break;
				case 447:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(9,k);
					break;
				case 448:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-33*Math.pow(10,-1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 449:
					result = 55*Math.pow(10,-9)/83*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate10(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 450:
					result = getVariable(3,k)+getVariable(6,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 451:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 452:
					result = 78*Math.pow(10,-9)-40*Math.pow(10,-9)-8*Math.pow(10,-2)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 453:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)*55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 454:
					result = 38*Math.pow(10,-9)/5*Math.pow(10,+8)/getVariable(8,k)/getVariable(2,k);
					break;
				case 455:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 456:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+85*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 457:
					result = 55*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 458:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,-9)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 459:
					result = 40*Math.pow(10,+1)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 460:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(2,k);
					break;
				case 461:
					result = getVariable(8,k)/getVariable(1,k);
					break;
				case 462:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 463:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 464:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 465:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 466:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/36*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 467:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 468:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/85*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 469:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 470:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-4)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 471:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 472:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)+getVariable(4,k)+getVariable(8,k);
					break;
				case 473:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)-getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 474:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-85*Math.pow(10,-4)-40*Math.pow(10,-2)-91*Math.pow(10,-6)-getVariable(6,k)*getVariable(8,k)*getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 475:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 476:
					result = 61*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 477:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 478:
					result = 22*Math.pow(10,+2)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 479:
					result = getVariable(1,k)/getVariable(9,k)*64*Math.pow(10,-5)+getVariable(9,k)/getVariable(1,k);
					break;
				case 480:
					result = 55*Math.pow(10,-9)/36*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 481:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 482:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(4,k)*getVariable(8,k);
					break;
				case 483:
					result = getVariable(8,k)*getVariable(8,k);
					break;
				case 484:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+9)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 485:
					result = 40*Math.pow(10,-1)+83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 486:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)*55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 487:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 488:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-1)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 489:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+2)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 490:
					result = getVariable(9,k)-getVariable(8,k);
					break;
				case 491:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 492:
					result = getVariable(3,k)-getVariable(6,k)*40*Math.pow(10,-5)/getVariable(6,k)*getVariable(9,k)*getVariable(5,k)/getVariable(3,k);
					break;
				case 493:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/2*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 494:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 495:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 496:
					result = 40*Math.pow(10,-2)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 497:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 498:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*95*Math.pow(10,-4)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 499:
					result = 83*Math.pow(10,-2)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate11(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 500:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 501:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 502:
					result = 40*Math.pow(10,-9)-84*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 503:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-55*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 504:
					result = 6*Math.pow(10,-1)/32*Math.pow(10,-1)/getVariable(4,k)-getVariable(6,k)-getVariable(2,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k)-getVariable(3,k);
					break;
				case 505:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 506:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)-55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 507:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)+83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 508:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 509:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 510:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 511:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 512:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-55*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 513:
					result = 83*Math.pow(10,-2)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,+2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 514:
					result = getVariable(2,k)+getVariable(1,k)/getVariable(1,k);
					break;
				case 515:
					result = 38*Math.pow(10,-5)*getVariable(8,k);
					break;
				case 516:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+45*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 517:
					result = 55*Math.pow(10,-4)/getVariable(6,k)/getVariable(2,k);
					break;
				case 518:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+71*Math.pow(10,+1)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 519:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/55*Math.pow(10,-2)-getVariable(4,k);
					break;
				case 520:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 521:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 522:
					result = getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 523:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(6,k)+getVariable(3,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 524:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 525:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 526:
					result = 83*Math.pow(10,-2)/65*Math.pow(10,-8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 527:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-55*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 528:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/8*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 529:
					result = 40*Math.pow(10,-9)-40*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 530:
					result = 95*Math.pow(10,-4)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 531:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+40*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 532:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 533:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 534:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 535:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 536:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 537:
					result = getVariable(5,k)/getVariable(9,k);
					break;
				case 538:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 539:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 540:
					result = 83*Math.pow(10,-2)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 541:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-55*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 542:
					result = getVariable(2,k)*getVariable(7,k)/getVariable(9,k)/getVariable(2,k);
					break;
				case 543:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 544:
					result = 78*Math.pow(10,-9)-61*Math.pow(10,-1)+getVariable(8,k);
					break;
				case 545:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 546:
					result = getVariable(8,k)/getVariable(1,k);
					break;
				case 547:
					result = getVariable(3,k)-getVariable(9,k)/60*Math.pow(10,+6)/getVariable(7,k);
					break;
				case 548:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 549:
					result = 66*Math.pow(10,-8)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate12(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 550:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-88*Math.pow(10,-2)-getVariable(7,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 551:
					result = getVariable(2,k)-getVariable(5,k)/getVariable(9,k)*getVariable(4,k)-getVariable(9,k)/getVariable(2,k)+83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 552:
					result = 26*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 553:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 554:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(3,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 555:
					result = 1*Math.pow(10,-4)+getVariable(4,k)/getVariable(3,k);
					break;
				case 556:
					result = getVariable(8,k)/getVariable(5,k)*getVariable(6,k);
					break;
				case 557:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 558:
					result = getVariable(8,k)+getVariable(7,k);
					break;
				case 559:
					result = 6*Math.pow(10,-5)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(5,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 560:
					result = getVariable(5,k)+getVariable(5,k)/getVariable(6,k)/getVariable(1,k);
					break;
				case 561:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)-getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 562:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 563:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 564:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)*getVariable(8,k);
					break;
				case 565:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-9)-65*Math.pow(10,-8)*getVariable(9,k)+getVariable(2,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 566:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 567:
					result = 55*Math.pow(10,-2)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 568:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+40*Math.pow(10,+1)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 569:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,-2)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 570:
					result = 40*Math.pow(10,-9)-40*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 571:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 572:
					result = 61*Math.pow(10,-9)+55*Math.pow(10,-9)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 573:
					result = 55*Math.pow(10,-2)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 574:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 575:
					result = 78*Math.pow(10,+4)*6*Math.pow(10,-5)*getVariable(4,k);
					break;
				case 576:
					result = getVariable(3,k)-getVariable(4,k)+getVariable(8,k);
					break;
				case 577:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 578:
					result = getVariable(4,k)+getVariable(7,k)/getVariable(5,k)-getVariable(4,k)+getVariable(5,k);
					break;
				case 579:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(9,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 580:
					result = 55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 581:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 582:
					result = getVariable(4,k)/getVariable(6,k);
					break;
				case 583:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 584:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 585:
					result = getVariable(6,k)-getVariable(2,k);
					break;
				case 586:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 587:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 588:
					result = getVariable(6,k)+getVariable(6,k)*39*Math.pow(10,-5)+getVariable(5,k);
					break;
				case 589:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 590:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+9)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 591:
					result = 55*Math.pow(10,-1)/55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 592:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-4)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 593:
					result = 75*Math.pow(10,-2)+62*Math.pow(10,-3)*getVariable(9,k)+getVariable(2,k);
					break;
				case 594:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 595:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 596:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 597:
					result = 54*Math.pow(10,-4)/getVariable(5,k)+getVariable(8,k);
					break;
				case 598:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,-1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 599:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,+2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)*40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate13(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 600:
					result = 66*Math.pow(10,-8)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 601:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 602:
					result = 55*Math.pow(10,-2)*getVariable(6,k)+getVariable(7,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 603:
					result = getVariable(7,k)/getVariable(7,k);
					break;
				case 604:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 605:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 606:
					result = 65*Math.pow(10,-8)+getVariable(3,k);
					break;
				case 607:
					result = 55*Math.pow(10,-9)/34*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 608:
					result = getVariable(2,k)*getVariable(7,k)/getVariable(9,k)/getVariable(2,k);
					break;
				case 609:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 610:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*55*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 611:
					result = 83*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 612:
					result = 40*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 613:
					result = 95*Math.pow(10,-4)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 614:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,-8)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 615:
					result = 40*Math.pow(10,+1)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 616:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 617:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 618:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)-55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 619:
					result = 51*Math.pow(10,-1)+getVariable(3,k);
					break;
				case 620:
					result = getVariable(7,k)+getVariable(4,k);
					break;
				case 621:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)-getVariable(6,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 622:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 623:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 624:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 625:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(4,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 626:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 627:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 628:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-40*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 629:
					result = 55*Math.pow(10,-8)-83*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 630:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 631:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-3)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(7,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 632:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 633:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 634:
					result = 40*Math.pow(10,-9)*getVariable(4,k);
					break;
				case 635:
					result = 66*Math.pow(10,-8)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 636:
					result = 95*Math.pow(10,-4)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 637:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+40*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 638:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 639:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 640:
					result = 40*Math.pow(10,-9)/83*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 641:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-55*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 642:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 643:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 644:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 645:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 646:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-55*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 647:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+83*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 648:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 649:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate14(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 650:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 651:
					result = getVariable(3,k)-getVariable(8,k);
					break;
				case 652:
					result = 95*Math.pow(10,-4)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 653:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+40*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 654:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 655:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 656:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/getVariable(4,k)/getVariable(6,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 657:
					result = 40*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 658:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+40*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 659:
					result = 95*Math.pow(10,-4)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 660:
					result = 22*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 661:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 662:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 663:
					result = 84*Math.pow(10,+1)+getVariable(3,k)*getVariable(5,k);
					break;
				case 664:
					result = getVariable(9,k)-getVariable(8,k)*getVariable(8,k);
					break;
				case 665:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 666:
					result = 6*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 667:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(3,k)/getVariable(7,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 668:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 669:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)/83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 670:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 671:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 672:
					result = 83*Math.pow(10,-5)+getVariable(7,k)/getVariable(9,k);
					break;
				case 673:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)/71*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 674:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*83*Math.pow(10,-2)*55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 675:
					result = getVariable(4,k)+getVariable(8,k);
					break;
				case 676:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 677:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 678:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 679:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 680:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 681:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 682:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-40*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 683:
					result = 55*Math.pow(10,-9)-83*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 684:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 685:
					result = 9*Math.pow(10,-5)+getVariable(5,k);
					break;
				case 686:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(8,k)-getVariable(9,k)*getVariable(8,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 687:
					result = getVariable(7,k)+getVariable(4,k)*getVariable(8,k);
					break;
				case 688:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(4,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 689:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 690:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/getVariable(7,k)/getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 691:
					result = 40*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 692:
					result = getVariable(4,k)-getVariable(3,k);
					break;
				case 693:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)/83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 694:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 695:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 696:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 697:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 698:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-3)*83*Math.pow(10,-2)+40*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 699:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate15(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 700:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(3,k)-getVariable(9,k)*getVariable(2,k)*getVariable(3,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 701:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)/getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 702:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 703:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 704:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 705:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 706:
					result = 66*Math.pow(10,-8)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 707:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 708:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 709:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 710:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(8,k)+getVariable(8,k)-getVariable(8,k)*getVariable(8,k);
					break;
				case 711:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(4,k)*getVariable(8,k);
					break;
				case 712:
					result = 38*Math.pow(10,-1)+getVariable(4,k);
					break;
				case 713:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 714:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 715:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 716:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 717:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 718:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 719:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 720:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)/55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 721:
					result = getVariable(7,k)+getVariable(4,k);
					break;
				case 722:
					result = 40*Math.pow(10,-9)/40*Math.pow(10,+1)-getVariable(4,k)*getVariable(8,k);
					break;
				case 723:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,-2)*getVariable(2,k)-getVariable(2,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 724:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 725:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 726:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 727:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 728:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 729:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 730:
					result = 9*Math.pow(10,-5)+getVariable(5,k);
					break;
				case 731:
					result = 71*Math.pow(10,-5)+getVariable(7,k)/getVariable(9,k);
					break;
				case 732:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 733:
					result = 12*Math.pow(10,+3)-46*Math.pow(10,-2)+88*Math.pow(10,-2)*getVariable(7,k)-getVariable(7,k);
					break;
				case 734:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 735:
					result = getVariable(4,k)+getVariable(9,k)/getVariable(5,k)-getVariable(4,k)+getVariable(5,k);
					break;
				case 736:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,+2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 737:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,-1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 738:
					result = getVariable(4,k)-getVariable(5,k)*49*Math.pow(10,-6)/getVariable(1,k)*getVariable(7,k);
					break;
				case 739:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 740:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)+getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 741:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)-getVariable(8,k)*getVariable(8,k);
					break;
				case 742:
					result = 55*Math.pow(10,-9)/36*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 743:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 744:
					result = 85*Math.pow(10,-1)+getVariable(5,k);
					break;
				case 745:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+4)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 746:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 747:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 748:
					result = getVariable(5,k)-getVariable(9,k);
					break;
				case 749:
					result = 95*Math.pow(10,-4)/40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate16(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 750:
					result = getVariable(7,k)+getVariable(2,k);
					break;
				case 751:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)/getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 752:
					result = 55*Math.pow(10,-9)/36*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 753:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 754:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 755:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 756:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 757:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 758:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+95*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 759:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 760:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 761:
					result = 65*Math.pow(10,+8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 762:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 763:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 764:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 765:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 766:
					result = getVariable(2,k)-getVariable(5,k)-getVariable(5,k)+getVariable(8,k);
					break;
				case 767:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 768:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 769:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 770:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)*getVariable(8,k);
					break;
				case 771:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)+getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 772:
					result = 64*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 773:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 774:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 775:
					result = 22*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 776:
					result = getVariable(9,k)-getVariable(8,k);
					break;
				case 777:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 778:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+1*Math.pow(10,-4)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 779:
					result = 55*Math.pow(10,-2)+getVariable(3,k)/getVariable(3,k);
					break;
				case 780:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 781:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 782:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 783:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 784:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,-1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 785:
					result = 85*Math.pow(10,+4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 786:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 787:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+2)-getVariable(4,k)+getVariable(8,k);
					break;
				case 788:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(2,k)+getVariable(6,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 789:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 790:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/85*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 791:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 792:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-6)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 793:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 794:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 795:
					result = getVariable(8,k)-getVariable(3,k);
					break;
				case 796:
					result = 40*Math.pow(10,-9)-83*Math.pow(10,-2)*85*Math.pow(10,-4)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 797:
					result = 83*Math.pow(10,-2)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 798:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(7,k)*getVariable(8,k);
					break;
				case 799:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(8,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate17(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 800:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 801:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 802:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 803:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 804:
					result = 90*Math.pow(10,-5)-getVariable(6,k)*getVariable(2,k);
					break;
				case 805:
					result = 35*Math.pow(10,-2)/getVariable(9,k);
					break;
				case 806:
					result = getVariable(4,k)/getVariable(2,k);
					break;
				case 807:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 808:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 809:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 810:
					result = 40*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 811:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 812:
					result = 22*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+2)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 813:
					result = 55*Math.pow(10,-1)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 814:
					result = 6*Math.pow(10,-2)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 815:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-1)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 816:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/85*Math.pow(10,+2)-getVariable(4,k);
					break;
				case 817:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-1)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 818:
					result = 55*Math.pow(10,-9)/73*Math.pow(10,-9)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 819:
					result = 24*Math.pow(10,-2)*getVariable(6,k);
					break;
				case 820:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-1)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 821:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+2)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 822:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(3,k);
					break;
				case 823:
					result = 79*Math.pow(10,-1)/getVariable(4,k)*getVariable(5,k)/getVariable(3,k)+getVariable(4,k);
					break;
				case 824:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 825:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 826:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 827:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 828:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 829:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 830:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-9)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 831:
					result = 65*Math.pow(10,-8)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 832:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 833:
					result = 64*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 834:
					result = getVariable(3,k)/getVariable(7,k);
					break;
				case 835:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 836:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 837:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)-getVariable(8,k)*getVariable(8,k);
					break;
				case 838:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*83*Math.pow(10,-4)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 839:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 840:
					result = 54*Math.pow(10,-2)/getVariable(5,k)+getVariable(8,k);
					break;
				case 841:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-4)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 842:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 843:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 844:
					result = 95*Math.pow(10,-2)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 845:
					result = 6*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-4)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 846:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 847:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 848:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,+1)-getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 849:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,-2)-66*Math.pow(10,-5)/getVariable(6,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate18(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 850:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 851:
					result = getVariable(3,k)/getVariable(7,k);
					break;
				case 852:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 853:
					result = getVariable(8,k)+getVariable(8,k)+getVariable(7,k)-getVariable(2,k)*getVariable(3,k)/getVariable(2,k)+getVariable(1,k)*56*Math.pow(10,-6)-getVariable(2,k)+getVariable(1,k);
					break;
				case 854:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)/getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 855:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)-85*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 856:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-9)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 857:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-2)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 858:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 859:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 860:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-1)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)/getVariable(8,k)*getVariable(8,k);
					break;
				case 861:
					result = 27*Math.pow(10,+2)/getVariable(3,k);
					break;
				case 862:
					result = 53*Math.pow(10,-9)/getVariable(9,k)/getVariable(8,k);
					break;
				case 863:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 864:
					result = 66*Math.pow(10,-8)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 865:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 866:
					result = 61*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(4,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 867:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(7,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 868:
					result = 91*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 869:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 870:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 871:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 872:
					result = 83*Math.pow(10,-2)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 873:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-92*Math.pow(10,+9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 874:
					result = 55*Math.pow(10,-2)*getVariable(7,k)/getVariable(7,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 875:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)+83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 876:
					result = 29*Math.pow(10,+1)/getVariable(6,k);
					break;
				case 877:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 878:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(4,k)+getVariable(8,k);
					break;
				case 879:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 880:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 881:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 882:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 883:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+getVariable(5,k)/getVariable(7,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 884:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(8,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 885:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(7,k);
					break;
				case 886:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(4,k);
					break;
				case 887:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 888:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 889:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 890:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 891:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 892:
					result = 40*Math.pow(10,-9)/36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 893:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 894:
					result = getVariable(3,k)-getVariable(9,k);
					break;
				case 895:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 896:
					result = 55*Math.pow(10,-9)*40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 897:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)-getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 898:
					result = 96*Math.pow(10,-5)/getVariable(7,k);
					break;
				case 899:
					result = 72*Math.pow(10,+1)*getVariable(9,k)-getVariable(7,k)-getVariable(9,k)/getVariable(4,k)*getVariable(8,k)*getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate19(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 900:
					result = 5*Math.pow(10,+2)/65*Math.pow(10,-8)*getVariable(7,k)+getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 901:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*64*Math.pow(10,-3)/getVariable(9,k)+getVariable(8,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 902:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 903:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 904:
					result = 55*Math.pow(10,-9)-51*Math.pow(10,-3)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 905:
					result = 55*Math.pow(10,-2)*getVariable(6,k)/getVariable(1,k);
					break;
				case 906:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 907:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 908:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 909:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 910:
					result = 40*Math.pow(10,-2)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 911:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-9)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 912:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-97*Math.pow(10,+1)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 913:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 914:
					result = 22*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 915:
					result = getVariable(1,k)-getVariable(4,k);
					break;
				case 916:
					result = 70*Math.pow(10,-6)/getVariable(4,k)/23*Math.pow(10,-5)*getVariable(1,k)/getVariable(7,k)+getVariable(1,k);
					break;
				case 917:
					result = 19*Math.pow(10,-5)-getVariable(9,k)+getVariable(2,k)/getVariable(4,k)/getVariable(8,k);
					break;
				case 918:
					result = 26*Math.pow(10,-9)+55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 919:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)-getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 920:
					result = 83*Math.pow(10,-2)/65*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 921:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-55*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 922:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 923:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 924:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+83*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 925:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-55*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 926:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 927:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 928:
					result = 4*Math.pow(10,+6)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 929:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/55*Math.pow(10,-2)*getVariable(2,k)+getVariable(7,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 930:
					result = 55*Math.pow(10,-2)*getVariable(7,k)/getVariable(7,k)/71*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 931:
					result = 54*Math.pow(10,+4)+getVariable(3,k)/35*Math.pow(10,-2)/getVariable(7,k);
					break;
				case 932:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 933:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 934:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,-2)-getVariable(4,k)+getVariable(8,k);
					break;
				case 935:
					result = 95*Math.pow(10,-4)-36*Math.pow(10,+1)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 936:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 937:
					result = 98*Math.pow(10,-3)*getVariable(8,k);
					break;
				case 938:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(7,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 939:
					result = 55*Math.pow(10,-9)/55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(4,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 940:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 941:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 942:
					result = 55*Math.pow(10,-1)/33*Math.pow(10,-1)*40*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 943:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+9)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 944:
					result = getVariable(7,k)+getVariable(4,k);
					break;
				case 945:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*61*Math.pow(10,-9)+getVariable(4,k)/getVariable(7,k)+getVariable(8,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 946:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 947:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 948:
					result = 55*Math.pow(10,-9)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 949:
					result = 55*Math.pow(10,-2)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate20(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 950:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(8,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 951:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(7,k)+getVariable(8,k);
					break;
				case 952:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 953:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 954:
					result = 58*Math.pow(10,-9)/getVariable(9,k)*getVariable(5,k)-getVariable(7,k);
					break;
				case 955:
					result = getVariable(2,k)/getVariable(9,k);
					break;
				case 956:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 957:
					result = 99*Math.pow(10,-5)-getVariable(1,k)/getVariable(2,k);
					break;
				case 958:
					result = 55*Math.pow(10,-9)-55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 959:
					result = 40*Math.pow(10,-9)/40*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 960:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 961:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 962:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 963:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 964:
					result = 55*Math.pow(10,-9)/55*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(6,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 965:
					result = 66*Math.pow(10,-8)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 966:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 967:
					result = 55*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 968:
					result = 6*Math.pow(10,-1)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 969:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 970:
					result = 70*Math.pow(10,-6)/getVariable(4,k)/23*Math.pow(10,-5)*19*Math.pow(10,-5)-getVariable(9,k)+getVariable(2,k)/getVariable(4,k)/getVariable(8,k)+getVariable(1,k);
					break;
				case 971:
					result = 40*Math.pow(10,-9)-36*Math.pow(10,-2)-84*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 972:
					result = 25*Math.pow(10,-3)/getVariable(8,k)+56*Math.pow(10,-5)-getVariable(3,k);
					break;
				case 973:
					result = 68*Math.pow(10,-3)+getVariable(9,k);
					break;
				case 974:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)-36*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 975:
					result = 40*Math.pow(10,-9)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/83*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 976:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)+getVariable(8,k);
					break;
				case 977:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)*getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 978:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 979:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 980:
					result = 40*Math.pow(10,-9)-83*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 981:
					result = getVariable(9,k)+getVariable(3,k);
					break;
				case 982:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,-1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 983:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,+2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 984:
					result = 55*Math.pow(10,-9)/36*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 985:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 986:
					result = getVariable(3,k)+getVariable(8,k);
					break;
				case 987:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 988:
					result = 55*Math.pow(10,-1)/33*Math.pow(10,-1)*40*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 989:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+9)-getVariable(4,k);
					break;
				case 990:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+getVariable(7,k)+getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 991:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*55*Math.pow(10,-2)*getVariable(3,k)+getVariable(9,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 992:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 993:
					result = 40*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 994:
					result = 55*Math.pow(10,-9)/40*Math.pow(10,+8)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 995:
					result = 26*Math.pow(10,-9)-55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 996:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 997:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 998:
					result = 91*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 999:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				default:
					result = Double.POSITIVE_INFINITY;
			}
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate21(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 1000:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 1001:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,+1)-getVariable(4,k);
					break;
				case 1002:
					result = 40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 1003:
					result = 20*Math.pow(10,-8)*getVariable(7,k);
					break;
				case 1004:
					result = getVariable(2,k)/getVariable(5,k)/getVariable(3,k)/82*Math.pow(10,-8)*getVariable(3,k);
					break;
				case 1005:
					result = 83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 1006:
					result = 95*Math.pow(10,-4)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 1007:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 1008:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 1009:
					result = 55*Math.pow(10,-9)/33*Math.pow(10,-1)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)+getVariable(8,k);
					break;
				case 1010:
					result = 55*Math.pow(10,-9)/65*Math.pow(10,-3)*83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 1011:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 1012:
					result = 55*Math.pow(10,-9)-65*Math.pow(10,-8)*83*Math.pow(10,-2)+55*Math.pow(10,+2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 1013:
					result = 55*Math.pow(10,-2)*getVariable(7,k)+getVariable(7,k)/83*Math.pow(10,-1)-getVariable(4,k);
					break;
				case 1014:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 1015:
					result = 66*Math.pow(10,-8)*40*Math.pow(10,-9)+91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k);
					break;
				case 1016:
					result = 55*Math.pow(10,-9)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 1017:
					result = getVariable(1,k)-getVariable(5,k);
					break;
				case 1018:
					result = 85*Math.pow(10,-4)-40*Math.pow(10,-2)-40*Math.pow(10,-9)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 1019:
					result = 83*Math.pow(10,-2)-8*Math.pow(10,-2)*91*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k);
					break;
				case 1020:
					result = getVariable(2,k)/getVariable(9,k);
					break;
				case 1021:
					result = 55*Math.pow(10,-5)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(4,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
					break;
				case 1022:
					result = 40*Math.pow(10,-9)/55*Math.pow(10,-2)*81*Math.pow(10,-6)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/36*Math.pow(10,+1)-getVariable(4,k)+getVariable(4,k)+getVariable(8,k);
					break;
				case 1023:
					result = 55*Math.pow(10,-8)-40*Math.pow(10,-2)-83*Math.pow(10,-2)+55*Math.pow(10,-2)*getVariable(7,k)+getVariable(4,k)/40*Math.pow(10,+1)-getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k);
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
