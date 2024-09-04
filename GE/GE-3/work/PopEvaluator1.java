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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+78*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 2:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 3:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 4:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 5:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 6:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 7:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)/getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 8:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 9:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-99*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 10:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 11:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 12:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 13:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-9)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 14:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+94*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)/getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 15:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 16:
					result = getVariable(6,k)+getVariable(7,k)/getVariable(2,k)/getVariable(2,k)/getVariable(1,k)+99*Math.pow(10,+6)/getVariable(5,k)/83*Math.pow(10,+2)*getVariable(8,k)-45*Math.pow(10,-1)/getVariable(6,k)+1*Math.pow(10,+1)-32*Math.pow(10,-1)-getVariable(6,k)+81*Math.pow(10,-2)+getVariable(5,k)/getVariable(8,k)/getVariable(6,k)*getVariable(8,k)*getVariable(7,k)/99*Math.pow(10,-3)/getVariable(3,k)/34*Math.pow(10,-2)*46*Math.pow(10,-2)*getVariable(7,k)-getVariable(7,k)*13*Math.pow(10,+5)*getVariable(1,k)*getVariable(4,k)/getVariable(3,k)/getVariable(5,k)*getVariable(4,k)/getVariable(9,k);
					break;
				case 17:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 18:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 19:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 20:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 21:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 22:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 23:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)*getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 24:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 25:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 26:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-9)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(5,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 27:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 28:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 29:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 30:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 31:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-28*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 32:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 33:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 34:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 35:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 36:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 37:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 38:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)*getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 39:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 40:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 41:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 42:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 43:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 44:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 45:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 46:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)+getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(1,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 47:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 48:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 49:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 51:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 52:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 53:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 54:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 55:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-4)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 56:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 57:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 58:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(8,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 59:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 60:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 61:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 62:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 63:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 64:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 65:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 66:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-17*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 67:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 68:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 69:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 70:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 71:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 72:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(6,k)/getVariable(4,k);
					break;
				case 73:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 74:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 75:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+getVariable(6,k)+getVariable(5,k)/getVariable(8,k)+getVariable(6,k)*getVariable(8,k)*getVariable(4,k)/65*Math.pow(10,-3)/getVariable(3,k)/34*Math.pow(10,-2)*46*Math.pow(10,-2)*getVariable(7,k)-getVariable(7,k)*13*Math.pow(10,+5)*getVariable(1,k)*getVariable(4,k)/getVariable(3,k)/getVariable(5,k)*getVariable(4,k)/getVariable(1,k);
					break;
				case 76:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 77:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 78:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 79:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 80:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 81:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 82:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 83:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 84:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 85:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 86:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 87:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 88:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)/getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 89:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-59*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k);
					break;
				case 90:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 91:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 92:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)+1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 93:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 94:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(4,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 95:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 96:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 97:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 98:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 99:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 101:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 102:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/28*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 103:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 104:
					result = getVariable(6,k)+getVariable(6,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+3)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 105:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(1,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 106:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 107:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 108:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 109:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 110:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 111:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+17*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 112:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 113:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(3,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 114:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)/getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 115:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 116:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 117:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 118:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 119:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 120:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,-6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 121:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 122:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-65*Math.pow(10,-3)+getVariable(6,k)+34*Math.pow(10,-2)/getVariable(6,k)/getVariable(5,k)*getVariable(8,k);
					break;
				case 123:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 124:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 125:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(2,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 126:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 127:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 128:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 129:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 130:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,-2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 131:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 132:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 133:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 134:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,+2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 135:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 136:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-52*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 137:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-75*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 138:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 139:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 140:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 141:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*getVariable(7,k)*getVariable(1,k)*getVariable(4,k)/getVariable(3,k)/getVariable(5,k)*getVariable(4,k);
					break;
				case 142:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)/83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 143:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 144:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 145:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 146:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 147:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(7,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 148:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 149:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 151:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 152:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 153:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 154:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 155:
					result = 99*Math.pow(10,+6)+getVariable(6,k)/83*Math.pow(10,+2)/getVariable(7,k)/getVariable(2,k)-45*Math.pow(10,-1)/getVariable(2,k)/1*Math.pow(10,+1)*getVariable(1,k)-32*Math.pow(10,-1)/getVariable(5,k)+81*Math.pow(10,-2)-65*Math.pow(10,-3)-getVariable(8,k)+34*Math.pow(10,-2)+getVariable(6,k)/getVariable(6,k)/getVariable(5,k)*getVariable(8,k)*getVariable(6,k)/46*Math.pow(10,-2)/getVariable(8,k)/13*Math.pow(10,+5)*20*Math.pow(10,-4)*getVariable(7,k)-getVariable(3,k)*31*Math.pow(10,-3)*getVariable(7,k)*getVariable(7,k)/getVariable(1,k)/getVariable(4,k)*getVariable(3,k)/getVariable(5,k);
					break;
				case 156:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 157:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)+getVariable(4,k);
					break;
				case 158:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 159:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)-getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 160:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 161:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 162:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 163:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 164:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 165:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 166:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-6)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*33*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 167:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 168:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(8,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 169:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 170:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 171:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-1)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 172:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(7,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 173:
					result = getVariable(6,k)-getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 174:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 175:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 176:
					result = getVariable(6,k)+getVariable(3,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 177:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 178:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 179:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 180:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)*34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 181:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*73*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 182:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 183:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 184:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 185:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 186:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/90*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 187:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 188:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/57*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 189:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 190:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 191:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 192:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*58*Math.pow(10,-9)*getVariable(7,k)/getVariable(1,k)/getVariable(4,k)*getVariable(3,k)/getVariable(5,k);
					break;
				case 193:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,-5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 194:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 195:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 196:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 197:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 198:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 199:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 201:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*getVariable(7,k);
					break;
				case 202:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 203:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 204:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,+1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 205:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 206:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)-getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 207:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 208:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 209:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 210:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 211:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)*getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 212:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+getVariable(6,k);
					break;
				case 213:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-47*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 214:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 215:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 216:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 217:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 218:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 219:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 220:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 221:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 222:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 223:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(5,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 224:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-5)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 225:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 226:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,+1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 227:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 228:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 229:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,+4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 230:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(5,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 231:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 232:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 233:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 234:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 235:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 236:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 237:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 238:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 239:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 240:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 241:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 242:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+getVariable(6,k)+getVariable(5,k)/getVariable(8,k)/getVariable(6,k)*getVariable(8,k)*65*Math.pow(10,-3)/getVariable(7,k)/34*Math.pow(10,-2)/46*Math.pow(10,-2)*getVariable(3,k)*getVariable(7,k)-getVariable(7,k)*getVariable(1,k)*getVariable(4,k)*getVariable(3,k)/getVariable(5,k)/getVariable(4,k)*getVariable(3,k)/getVariable(6,k);
					break;
				case 243:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+9)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 244:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 245:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-42*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 246:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 247:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 248:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+9)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 249:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*getVariable(7,k);
					break;
				case 251:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 252:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*49*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 253:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+9)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 254:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(1,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 255:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 256:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 257:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 258:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(6,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 259:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 260:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-getVariable(6,k)-81*Math.pow(10,-2)+65*Math.pow(10,-3)+getVariable(6,k);
					break;
				case 261:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 262:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/24*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 263:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 264:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 265:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 266:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 267:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 268:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 269:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)-getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 270:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 271:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 272:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 273:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 274:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 275:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 276:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/46*Math.pow(10,-2)/13*Math.pow(10,+5)*getVariable(7,k)*getVariable(3,k)-getVariable(7,k)*getVariable(7,k)*getVariable(1,k)*getVariable(4,k)/getVariable(3,k)/getVariable(5,k)*getVariable(4,k)/getVariable(7,k);
					break;
				case 277:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 278:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-8)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 279:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+5)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*getVariable(3,k)*getVariable(7,k)-13*Math.pow(10,+5)*getVariable(7,k)*getVariable(1,k)*getVariable(4,k)/getVariable(3,k)/getVariable(5,k)*getVariable(4,k)/20*Math.pow(10,-4)-55*Math.pow(10,+1)*getVariable(8,k)*getVariable(3,k);
					break;
				case 280:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)*getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 281:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 282:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,-2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 283:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)-getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 284:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)-getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 285:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 286:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 287:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 288:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 289:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 290:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 291:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 292:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 293:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+2)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 294:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 295:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 296:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(4,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 297:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 298:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 299:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,+1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 301:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 302:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 303:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 304:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 305:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 306:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 307:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 308:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 309:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 310:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 311:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 312:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 313:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 314:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 315:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 316:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 317:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 318:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 319:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*66*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 320:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-65*Math.pow(10,-3)+getVariable(6,k)+34*Math.pow(10,-2)/getVariable(6,k)/getVariable(5,k)*getVariable(8,k);
					break;
				case 321:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 322:
					result = getVariable(6,k)-getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 323:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 324:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-1)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 325:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 326:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 327:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 328:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 329:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 330:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 331:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(5,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 332:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,-2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 333:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k);
					break;
				case 334:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,+4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 335:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 336:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,+2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 337:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 338:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 339:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)-46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 340:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 341:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 342:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 343:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(9,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 344:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 345:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 346:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-62*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-3)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 347:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)-getVariable(4,k);
					break;
				case 348:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 349:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 351:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 352:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-6)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 353:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,+1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 354:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 355:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 356:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+1)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 357:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 358:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 359:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 360:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 361:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)*81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 362:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+35*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 363:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 364:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)/getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 365:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 366:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 367:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 368:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 369:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 370:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-75*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 371:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 372:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 373:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,+4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 374:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 375:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 376:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 377:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 378:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+5)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 379:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 380:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 381:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 382:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 383:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 384:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 385:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 386:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 387:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 388:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 389:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 390:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)+getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 391:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,-6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 392:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 393:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(8,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 394:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)+getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 395:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 396:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(4,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 397:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(5,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 398:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 399:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 401:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 402:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 403:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)-34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 404:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-8)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 405:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 406:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 407:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(4,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k);
					break;
				case 408:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 409:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)/1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 410:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*94*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 411:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 412:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 413:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 414:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 415:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 416:
					result = getVariable(6,k)+getVariable(7,k)/58*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)+45*Math.pow(10,-1)*getVariable(1,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 417:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 418:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 419:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 420:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 421:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 422:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 423:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)*81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 424:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 425:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 426:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)+13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 427:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-10*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 428:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 429:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(6,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 430:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 431:
					result = getVariable(6,k)+getVariable(6,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 432:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 433:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 434:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,+2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 435:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*getVariable(3,k);
					break;
				case 436:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 437:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 438:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-4)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 439:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 440:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 441:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 442:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 443:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 444:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)*getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 445:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(6,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 446:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 447:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 448:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 449:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)-getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 451:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 452:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 453:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 454:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 455:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 456:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 457:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,+2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 458:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 459:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 460:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 461:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)+getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 462:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 463:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 464:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 465:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 466:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 467:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 468:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 469:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 470:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)+34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 471:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 472:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 473:
					result = getVariable(8,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 474:
					result = getVariable(6,k)+getVariable(6,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 475:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 476:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 477:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,+1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 478:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 479:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 480:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-8)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 481:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 482:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 483:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 484:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 485:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-41*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 486:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-1)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 487:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-1)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 488:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 489:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 490:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+71*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 491:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 492:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 493:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 494:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 495:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 496:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 497:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,+1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 498:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 499:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,+1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 501:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 502:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 503:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*39*Math.pow(10,-9)*getVariable(7,k)/getVariable(1,k);
					break;
				case 504:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 505:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 506:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 507:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*34*Math.pow(10,-2)*getVariable(6,k)/46*Math.pow(10,-2)/13*Math.pow(10,+5)/getVariable(8,k)*getVariable(7,k)*getVariable(3,k)-getVariable(7,k)*getVariable(7,k)*getVariable(3,k)*getVariable(4,k)/getVariable(3,k)/getVariable(5,k)*getVariable(4,k)/20*Math.pow(10,-4)-getVariable(5,k)+getVariable(8,k);
					break;
				case 508:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 509:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 510:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 511:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 512:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+6)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 513:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 514:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-3)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 515:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 516:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 517:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 518:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 519:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-9)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 520:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 521:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 522:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 523:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 524:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 525:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 526:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 527:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 528:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 529:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)*getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 530:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 531:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 532:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-65*Math.pow(10,-3)+getVariable(6,k)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*34*Math.pow(10,-2)/getVariable(8,k)/46*Math.pow(10,-2)/13*Math.pow(10,+5)*getVariable(7,k)*getVariable(3,k)-getVariable(7,k)*getVariable(7,k)*getVariable(1,k)*getVariable(4,k)/getVariable(3,k)/getVariable(5,k)*getVariable(4,k)/getVariable(5,k);
					break;
				case 533:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/getVariable(3,k)*getVariable(7,k);
					break;
				case 534:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 535:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 536:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 537:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 538:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 539:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 540:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,+4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 541:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 542:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 543:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-4)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 544:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 545:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)-65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 546:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 547:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 548:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 549:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 551:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-6)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 552:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 553:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 554:
					result = 99*Math.pow(10,+6)+83*Math.pow(10,+2)/getVariable(6,k)/getVariable(7,k)/45*Math.pow(10,-1)-getVariable(2,k)/1*Math.pow(10,+1)/getVariable(2,k)*32*Math.pow(10,-1)-getVariable(1,k)/81*Math.pow(10,-2)+65*Math.pow(10,-3)-getVariable(5,k)-34*Math.pow(10,-2)+getVariable(8,k)+getVariable(6,k)/getVariable(6,k)/getVariable(5,k)*getVariable(8,k)*46*Math.pow(10,-2)/getVariable(6,k)/13*Math.pow(10,+5)/20*Math.pow(10,-4)*getVariable(8,k)*getVariable(7,k)-getVariable(3,k)*getVariable(7,k)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 555:
					result = getVariable(6,k)+getVariable(7,k)/17*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 556:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 557:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 558:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 559:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 560:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(9,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 561:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 562:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(8,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 563:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*50*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 564:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 565:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 566:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 567:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 568:
					result = getVariable(6,k)+getVariable(7,k)/getVariable(2,k)/getVariable(2,k)/99*Math.pow(10,+6)-getVariable(1,k)/getVariable(5,k)/83*Math.pow(10,+2)*getVariable(8,k);
					break;
				case 569:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 570:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(7,k)+32*Math.pow(10,-1)-67*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 571:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)/65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 572:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 573:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 574:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 575:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 576:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k);
					break;
				case 577:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)/getVariable(5,k)/getVariable(4,k);
					break;
				case 578:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 579:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 580:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 581:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 582:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 583:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 584:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 585:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 586:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 587:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 588:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 589:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*90*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 590:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)+81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 591:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,+1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 592:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 593:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 594:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 595:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 596:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 597:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 598:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(4,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 599:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 601:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(5,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 602:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(2,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 603:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 604:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(8,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 605:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/38*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 606:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 607:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 608:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 609:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 610:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 611:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 612:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 613:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(5,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 614:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,+1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 615:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 616:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)-45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 617:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 618:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 619:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 620:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,+1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-2)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 621:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 622:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 623:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 624:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 625:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 626:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 627:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 628:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 629:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 630:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(9,k)-getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 631:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-5)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 632:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 633:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 634:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 635:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 636:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-6)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 637:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 638:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 639:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 640:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 641:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 642:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 643:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 644:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+8)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 645:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 646:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 647:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 648:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 649:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 651:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 652:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 653:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 654:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 655:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 656:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 657:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 658:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 659:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 660:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 661:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 662:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 663:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 664:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 665:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 666:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 667:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 668:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 669:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 670:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(1,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*getVariable(3,k)*getVariable(7,k);
					break;
				case 671:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-4)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 672:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 673:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,-5)*getVariable(1,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 674:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(1,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 675:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 676:
					result = getVariable(6,k)+getVariable(7,k)/getVariable(2,k)/getVariable(2,k)/getVariable(1,k)-99*Math.pow(10,+6)/getVariable(5,k)/83*Math.pow(10,+2)*getVariable(8,k)-45*Math.pow(10,-1)/getVariable(6,k)+1*Math.pow(10,+1)-32*Math.pow(10,-1)-getVariable(6,k)+81*Math.pow(10,-2)+getVariable(5,k)/getVariable(8,k)/getVariable(6,k)*getVariable(8,k)*getVariable(7,k)/65*Math.pow(10,-3)/getVariable(3,k)/34*Math.pow(10,-2)*46*Math.pow(10,-2)*getVariable(7,k)-getVariable(7,k)*13*Math.pow(10,+5)*getVariable(1,k)*getVariable(4,k)/getVariable(3,k)/getVariable(5,k)*getVariable(4,k)/getVariable(3,k);
					break;
				case 677:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+15*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 678:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(8,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 679:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 680:
					result = getVariable(6,k)+getVariable(8,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 681:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 682:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 683:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,+2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 684:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 685:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,+3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 686:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,+4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 687:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 688:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 689:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-3)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 690:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+81*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 691:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 692:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 693:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 694:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 695:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 696:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+getVariable(6,k);
					break;
				case 697:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 698:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(1,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 699:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 701:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+4)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*57*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 702:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 703:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-86*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,+3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 704:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 705:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 706:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 707:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 708:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 709:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 710:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 711:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)/83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 712:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 713:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 714:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 715:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/68*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 716:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 717:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 718:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 719:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/2*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 720:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 721:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 722:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 723:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+9)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 724:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 725:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 726:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 727:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 728:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 729:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 730:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,+4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 731:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 732:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 733:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+6)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 734:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 735:
					result = 99*Math.pow(10,+6)+getVariable(6,k)/getVariable(7,k)/getVariable(2,k)/83*Math.pow(10,+2)-getVariable(2,k)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k);
					break;
				case 736:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 737:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 738:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 739:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(9,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 740:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(8,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 741:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 742:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 743:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,+1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 744:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 745:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 746:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 747:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 748:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)+getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 749:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 751:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 752:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 753:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 754:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 755:
					result = getVariable(6,k)+getVariable(7,k)-99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 756:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 757:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 758:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)+getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 759:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 760:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 761:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-63*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 762:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 763:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)-getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 764:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-3)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 765:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-3)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 766:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 767:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 768:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 769:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 770:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 771:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 772:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 773:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 774:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 775:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 776:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*39*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 777:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 778:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 779:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 780:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 781:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 782:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,-1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 783:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,+2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 784:
					result = getVariable(3,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 785:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 786:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 787:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 788:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 789:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 790:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 791:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 792:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 793:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,-2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 794:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 795:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 796:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,+1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 797:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)+getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 798:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 799:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,+1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)+getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 801:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 802:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 803:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 804:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 805:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 806:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-9)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 807:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 808:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 809:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k);
					break;
				case 810:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 811:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 812:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 813:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 814:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 815:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 816:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 817:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 818:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 819:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-8)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)-32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 820:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 821:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)-getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 822:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 823:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 824:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 825:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 826:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 827:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 828:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 829:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 830:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(3,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 831:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 832:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 833:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,+1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-5)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 834:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 835:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 836:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+1)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 837:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 838:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(1,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 839:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 840:
					result = getVariable(6,k)+getVariable(7,k)/64*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 841:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-getVariable(8,k);
					break;
				case 842:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 843:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 844:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 845:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 846:
					result = getVariable(2,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,-5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 847:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-8)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 848:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 849:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 851:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 852:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 853:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)*getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 854:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 855:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 856:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 857:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 858:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 859:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/28*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,-1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 860:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 861:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 862:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 863:
					result = getVariable(6,k)+getVariable(7,k)+99*Math.pow(10,-6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(4,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 864:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 865:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 866:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 867:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 868:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 869:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 870:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 871:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/74*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 872:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 873:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 874:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*45*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 875:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 876:
					result = getVariable(6,k)+getVariable(7,k)/75*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-5)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 877:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 878:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 879:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/86*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 880:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 881:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 882:
					result = getVariable(6,k)+getVariable(5,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 883:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 884:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 885:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 886:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 887:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 888:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,-1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 889:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 890:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*96*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 891:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 892:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k);
					break;
				case 893:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 894:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,-1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 895:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 896:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)-getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 897:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 898:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 899:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 901:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 902:
					result = getVariable(6,k)+getVariable(7,k)/16*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 903:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 904:
					result = getVariable(6,k)+getVariable(7,k)/86*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 905:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 906:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 907:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/52*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-2)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,+2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 908:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/28*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 909:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 910:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 911:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 912:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 913:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 914:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(1,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 915:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)/13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 916:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 917:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 918:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 919:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 920:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 921:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 922:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,-6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 923:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 924:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)+getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 925:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 926:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 927:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 928:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,-6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 929:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 930:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 931:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 932:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/19*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 933:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 934:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 935:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 936:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(9,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 937:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 938:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 939:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 940:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 941:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 942:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 943:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 944:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 945:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 946:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k);
					break;
				case 947:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 948:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 949:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 951:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 952:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/32*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 953:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 954:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 955:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 956:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 957:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 958:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 959:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 960:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 961:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 962:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 963:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+41*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 964:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 965:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 966:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,+2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 967:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 968:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 969:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 970:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 971:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 972:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 973:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 974:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 975:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 976:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 977:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 978:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 979:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 980:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 981:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 982:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 983:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 984:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 985:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)+getVariable(4,k);
					break;
				case 986:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 987:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 988:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 989:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 990:
					result = getVariable(6,k)+getVariable(7,k)/getVariable(2,k)/getVariable(2,k)/getVariable(1,k)-getVariable(5,k)/99*Math.pow(10,+6)/getVariable(8,k)*83*Math.pow(10,+2)-getVariable(6,k);
					break;
				case 991:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,+2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 992:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)+getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 993:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(1,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 994:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 995:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 996:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 997:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 998:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 999:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1001:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1002:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1003:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,+2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1004:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1005:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1006:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1007:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*59*Math.pow(10,-5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1008:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1009:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1010:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1011:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1012:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)-getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1013:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1014:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)+getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1015:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1016:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1017:
					result = getVariable(6,k)+getVariable(1,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1018:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1019:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,-1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1020:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1021:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(2,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1022:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,-6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*11*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
					break;
				case 1023:
					result = getVariable(6,k)+getVariable(7,k)/99*Math.pow(10,+6)/getVariable(2,k)/getVariable(2,k)-83*Math.pow(10,+2)/getVariable(1,k)/45*Math.pow(10,-1)*getVariable(5,k)-1*Math.pow(10,+1)/getVariable(8,k)+32*Math.pow(10,-1)-81*Math.pow(10,-2)-getVariable(6,k)+65*Math.pow(10,-3)+getVariable(6,k)/getVariable(5,k)/getVariable(8,k)*getVariable(6,k)*getVariable(8,k)/34*Math.pow(10,-2)/getVariable(7,k)/46*Math.pow(10,-2)*13*Math.pow(10,+5)*getVariable(3,k)-getVariable(7,k)*20*Math.pow(10,-4)*getVariable(7,k)*getVariable(1,k)/getVariable(4,k)/getVariable(3,k)*getVariable(5,k)/getVariable(4,k);
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
