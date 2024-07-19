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
		if(Double.isNaN(result)) {
			result = Double.POSITIVE_INFINITY;
		}
		return result;
	}

	public double evaluate1(int idxExpr, int k) {		double result = 0.0;

		double t = 0.0;

			switch(idxExpr) {
				case 0:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<65.526)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070-getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 1:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 2:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 3:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*(getVariable(3,k)*getVariable(47,k))))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 4:
					if(((getVariable(150,k)>=(7.571*getVariable(3,k)-79.848-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.655*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 5:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-798.483-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 6:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((getVariable(50,k)*65.526)<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 7:
					if(((getVariable(150,k)>=7.576)||(((79.808*getVariable(3,k)-348.055-87.535)+65.526<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||(getVariable(166,k)<getVariable(162,k))))))){result=0;}else{result=1;}
					break;
				case 8:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.843+348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=2.420)))))))){result=0;}else{result=1;}
					break;
				case 9:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-77.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 10:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)){result=0;}else{result=1;}
					break;
				case 11:
					if(((getVariable(150,k)>=(7.575*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 12:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 13:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 14:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 15:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)&&(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 16:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<24.207)||((getVariable(166,k)>=getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 17:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(133,k)))))||(((65.677*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<262.090)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 18:
					if(((getVariable(150,k)>(7.576-getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 19:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((6.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 20:
					if((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748*348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 21:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-797.483-480.958)+75.351)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 22:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.065)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)*getVariable(52,k)))||(((getVariable(43,k)-getVariable(50,k))<(65.526*getVariable(45,k)))&&(((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<getVariable(141,k)+getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 23:
					if(((getVariable(150,k)>7.576)&&(((79.648*(348.005-getVariable(3,k)-87.535+67.076))<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*(getVariable(3,k)*getVariable(47,k)))<getVariable(179,k)+getVariable(75,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)>getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 24:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 25:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 26:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 27:
					if(((((7.571*getVariable(150,k)-79.848-348.095)+86.535+getVariable(3,k))>=(getVariable(117,k)-getVariable(24,k)*(getVariable(126,k)-(getVariable(85,k)*getVariable(52,k)))))||(((65.576*getVariable(171,k))<(getVariable(50,k)*getVariable(45,k)+getVariable(3,k)))||((getVariable(47,k)-getVariable(179,k)<getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)>getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(110,k))))))))){result=0;}else{result=1;}
					break;
				case 28:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 29:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 30:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 31:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((95.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<2.420)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 32:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)+79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((getVariable(50,k)*(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))<getVariable(179,k)+getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(193,k))))))))){result=0;}else{result=1;}
					break;
				case 33:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(77,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 34:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 35:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(86,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 36:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(24,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 37:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.036*getVariable(50,k))<242.060)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(8,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 38:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 39:
					if(((getVariable(150,k)<=(7.572*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(46,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)+getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))&&((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(115,k))))))))){result=0;}else{result=1;}
					break;
				case 40:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 41:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 42:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 43:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.091)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 44:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(36,k)<getVariable(117,k))||(getVariable(38,k)>=24.207)))))))){result=0;}else{result=1;}
					break;
				case 45:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.070)))))))){result=0;}else{result=1;}
					break;
				case 46:
					if(((getVariable(150,k)>(4.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)+getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 47:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+57.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 48:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-75.848-348.005)+87.535)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((650.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 49:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((65.576+(getVariable(117,k)-getVariable(24,k)*(getVariable(126,k)-(getVariable(85,k)*getVariable(52,k))))<(2.420*getVariable(171,k)))||(((getVariable(50,k)*getVariable(45,k)+getVariable(3,k))<getVariable(47,k)+getVariable(179,k))&&((getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<6.507-getVariable(24,k)-getVariable(126,k))&&(((getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))<(624.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<0.002)||(getVariable(162,k)<getVariable(59,k)))))))){result=0;}else{result=1;}
					break;
				case 51:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(118,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((67.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 52:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 53:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(103,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=2.420)))))))){result=0;}else{result=1;}
					break;
				case 54:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 55:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 56:
					if(((getVariable(150,k)>(9.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.520<(getVariable(45,k)*getVariable(101,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 57:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526+getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(8,k))||((getVariable(162,k)<=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 58:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)>=(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 59:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 60:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(31,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 61:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 62:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 63:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 64:
					if(((getVariable(150,k)>=(7.571*getVariable(3,k)-79.848-348.095)+8.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((62.420+getVariable(179,k))<getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 65:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((655.762*getVariable(50,k))<420.700)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 66:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*2.420))&&((getVariable(47,k)<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 67:
					if(((getVariable(150,k)>=(6.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(110,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.520<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 68:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 69:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 70:
					if(((getVariable(150,k)>=(getVariable(3,k)*7.576-7.980-834.809)-58.757)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.552*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 71:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(46,k))<(getVariable(45,k)-getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 72:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+875.346)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 73:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 74:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.539)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 75:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 76:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(178,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<2.820)))))){result=0;}else{result=1;}
					break;
				case 77:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.888-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 78:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.677*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 79:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 80:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 81:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-71.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<2.420)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||(getVariable(32,k)<getVariable(162,k))))))){result=0;}else{result=1;}
					break;
				case 82:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.708-348.095)+87.575)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<(getVariable(179,k)+getVariable(141,k)))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 83:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(56,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 84:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-39.808-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 85:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 86:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 87:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(104,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 88:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.195)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.070)))))))){result=0;}else{result=1;}
					break;
				case 89:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 90:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+(56.552-getVariable(126,k))*getVariable(85,k)))||(((getVariable(52,k)-getVariable(171,k))<(624.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 91:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.626*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 92:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.004)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(163,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 93:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 94:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.845-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 95:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.141-348.095)+87.534)||(getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))){result=0;}else{result=1;}
					break;
				case 96:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.845-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)+getVariable(171,k)))))||((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 97:
					if(((getVariable(150,k)>=(7.576*getVariable(11,k)-79.868-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 98:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 99:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 101:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(28,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 102:
					if(((getVariable(150,k)>((7.576*getVariable(3,k)-79.848-348.005)+87.535))||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.986*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 103:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.835)||((getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 104:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||(((65.026+getVariable(117,k)-getVariable(24,k)*(getVariable(126,k)-(getVariable(85,k)*getVariable(52,k))))<(282.070*getVariable(171,k)))||(((getVariable(50,k)*getVariable(45,k)+getVariable(3,k))<(getVariable(47,k)-getVariable(179,k)))&&((getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 105:
					if(((getVariable(89,k)>=(7.576*getVariable(3,k)-79.848-34.800)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.502*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 106:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 107:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-398.005)+87.531)||(((getVariable(117,k)+getVariable(24,k)-(getVariable(126,k)*(getVariable(85,k)-getVariable(52,k))))*65.076<(2.420*getVariable(171,k)))||(((getVariable(50,k)*getVariable(45,k)+getVariable(3,k))<(getVariable(47,k)-getVariable(179,k)))&&((getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 108:
					if(((getVariable(150,k)<(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<65.526)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 109:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 110:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 111:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<24.207)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 112:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(44,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 113:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.539)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)-getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 114:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*65.076*getVariable(52,k))))||((getVariable(171,k)<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<744.428)||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>getVariable(59,k))&&(getVariable(2,k)>=getVariable(117,k))))))))){result=0;}else{result=1;}
					break;
				case 115:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808*348.098)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(187,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 116:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.530)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<=getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 117:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-798.483-480.958)+75.346)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 118:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 119:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+875.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(4,k))))))))){result=0;}else{result=1;}
					break;
				case 120:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-7.984-534.800)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*56.507<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 121:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 122:
					if(((getVariable(150,k)<(7.506*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 123:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.003)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<2.426)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 124:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((56.552*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 125:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841+348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 126:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)-getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 127:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.648-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*(getVariable(3,k)*getVariable(47,k))))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.070)))))))){result=0;}else{result=1;}
					break;
				case 128:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 129:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)+getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 130:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 131:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.395)+87.535)||(((65.076+(getVariable(117,k)-getVariable(24,k)*(getVariable(126,k)-(getVariable(85,k)+getVariable(52,k)))))<(242.070*getVariable(171,k)))||(((getVariable(50,k)*getVariable(45,k)+getVariable(3,k))<getVariable(47,k)+getVariable(179,k))&&((getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 132:
					if(((getVariable(150,k)>(7.576*getVariable(147,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<=24.207)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 133:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)*79.848-348.005)+87.531)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 134:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 135:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576-getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(167,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 136:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(33,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 137:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 138:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-348.095-87.535)+65.526<getVariable(117,k))&&(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<=(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 139:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-3.480)-05.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*getVariable(52,k)-getVariable(171,k))))||(((35.650*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 140:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-798.483-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 141:
					if(((getVariable(146,k)>(7.576*getVariable(3,k)-79.848-348.005)+8.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 142:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.888-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+2.420+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 143:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 144:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 145:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.546-348.005)+87.535)||((getVariable(122,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.036*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 146:
					if(((getVariable(150,k)>=(7.576*getVariable(21,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 147:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 148:
					if(((getVariable(150,k)>7.576)||(((79.841*getVariable(3,k)-348.005-87.531)+65.076<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.060*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<(getVariable(179,k)+getVariable(141,k)))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 149:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<=getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))&&((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)-getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 151:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-7.984-834.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.552*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 152:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(173,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 153:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.986*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(78,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 154:
					if(((getVariable(150,k)>=7.576)||(((79.848*getVariable(3,k)-348.095-87.535)+65.576<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<(getVariable(179,k)+getVariable(141,k)))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 155:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((655.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 156:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.828-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((64.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 157:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(117,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 158:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 159:
					if(((getVariable(150,k)>=7.576)&&(((79.848*getVariable(3,k)-348.005-87.530)+65.076<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(64.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 160:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<242.060)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 161:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.878-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<=getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 162:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(88,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 163:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+86.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<24.207)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 164:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<24.207)&&(((getVariable(45,k)*getVariable(3,k)+getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||(getVariable(59,k)<getVariable(28,k)))))))){result=0;}else{result=1;}
					break;
				case 165:
					if(((getVariable(150,k)<7.576)||(((79.808*getVariable(3,k)-348.095-87.535)+65.526<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(15,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 166:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 167:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(158,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 168:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-7.984-834.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 169:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 170:
					if(((getVariable(150,k)>=757.679)||(((84.834*getVariable(3,k)-800.587-53.565)+67.726>getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(209.004*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 171:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-328.095)+87.575)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(113,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 172:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.075)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)+getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 173:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 174:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+8.753)||((getVariable(117,k)<56.547)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(624.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 175:
					if(((getVariable(150,k)>=(75.767*getVariable(3,k)-98.483-480.058)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<420.700*getVariable(45,k)*getVariable(3,k))&&((getVariable(47,k)+getVariable(179,k)<getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<=getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 176:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)+79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(14,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 177:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.507*getVariable(50,k))<=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 178:
					if(((getVariable(150,k)>(7.776*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 179:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+80.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(134,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 180:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.448-348.055)+87.031)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 181:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 182:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-70.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 183:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(10,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 184:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+875.316)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 185:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.476*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(100,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 186:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(144,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<2.470)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 187:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.009)+87.531)&&((getVariable(117,k)<=getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 188:
					if(((getVariable(150,k)>(7.576*getVariable(172,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 189:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<242.030)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 190:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-308.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<getVariable(45,k)*getVariable(3,k)*getVariable(47,k))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 191:
					if(((getVariable(150,k)<(7.576*getVariable(3,k)-79.848-348.095)+87.035)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<9.420)&&(((getVariable(45,k)*getVariable(3,k)+getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 192:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-348.095-87.535)+65.076<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<getVariable(50,k)*24.207)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))&&((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 193:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(154,k)-348.095-87.535)+65.526<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 194:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.539)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<242.070))))))){result=0;}else{result=1;}
					break;
				case 195:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 196:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 197:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)+(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 198:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k)-getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(183,k))))))))){result=0;}else{result=1;}
					break;
				case 199:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>=(7.571*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 201:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 202:
					if((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 203:
					if(((getVariable(150,k)>=(7.506*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 204:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)&&((getVariable(117,k)<(getVariable(4,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 205:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.435)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 206:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)*getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<24.207)||(getVariable(117,k)>getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 207:
					if(((getVariable(150,k)>(7.566*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 208:
					if((getVariable(150,k)>=getVariable(3,k))){result=0;}else{result=1;}
					break;
				case 209:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<((getVariable(24,k)+getVariable(126,k))-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.076<242.070)||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 210:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.076<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)-getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 211:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.650*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=76.242)))))))){result=0;}else{result=1;}
					break;
				case 212:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)-87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(55,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 213:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.572)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(10,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 214:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.858-348.095)+87.535)||((getVariable(117,k)<65.576)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)>getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 215:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)){result=0;}else{result=1;}
					break;
				case 216:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 217:
					if((getVariable(118,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)){result=0;}else{result=1;}
					break;
				case 218:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 219:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 220:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 221:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 222:
					if(((getVariable(150,k)>(7.576+getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-65.026))))||((getVariable(171,k)<(282.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(3,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 223:
					if(((getVariable(150,k)>=(757.679*getVariable(3,k)-84.834-800.587)+53.565)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 224:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(53,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)>=getVariable(166,k))||(242.070+getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 225:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<((getVariable(24,k)+getVariable(126,k))-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(11,k))))))))){result=0;}else{result=1;}
					break;
				case 226:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.626*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 227:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<60.526)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))>=getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 228:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||(getVariable(117,k)>=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)-(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 229:
					if(((getVariable(150,k)>=getVariable(3,k)*7.576)||((getVariable(117,k)-79.848-348.095<getVariable(24,k))||(((getVariable(126,k)+getVariable(85,k)+(getVariable(52,k)-(getVariable(171,k)*getVariable(50,k))))<getVariable(45,k)-87.535)&&(((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<getVariable(141,k)*getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 230:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.846-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 231:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>=getVariable(92,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 232:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((655.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 233:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 234:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 235:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 236:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(129,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 237:
					if(((getVariable(150,k)>=(7.577*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 238:
					if(((getVariable(150,k)>=getVariable(3,k)*(7.576-getVariable(117,k)-79.848+348.095))||((getVariable(24,k)<(getVariable(126,k)+getVariable(85,k)-(getVariable(52,k)*(getVariable(171,k)-getVariable(50,k)))))||(((87.535*getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)*getVariable(179,k)))&&((getVariable(141,k)+getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(59,k))))))))){result=0;}else{result=1;}
					break;
				case 239:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 240:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<2.420)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)<getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 241:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.648-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*(getVariable(3,k)*getVariable(47,k))))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 242:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+89.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 243:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)+242.070<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 244:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.677*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 245:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<242.060)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)>getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 246:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 247:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(154,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 248:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(9,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.070)))))))){result=0;}else{result=1;}
					break;
				case 249:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(131,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.608-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 251:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 252:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 253:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-798.483*480.958)+75.356)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 254:
					if(((getVariable(150,k)>(7.570*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 255:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((6.507*getVariable(50,k))<(getVariable(45,k)+getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 256:
					if(((getVariable(150,k)<7.576)||(((79.848*getVariable(3,k)-348.005-87.535)+65.076<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<(getVariable(179,k)+getVariable(141,k))))))){result=0;}else{result=1;}
					break;
				case 257:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 258:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(25,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 259:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 260:
					if(((getVariable(150,k)>=7.576)||(((79.838*getVariable(3,k)-348.095-87.535)+65.576<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 261:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-348.095-87.535)+65.626<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 262:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.595)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.677*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<262.090)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 263:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(162,k)))))||(((65.676*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<24.206)&&((getVariable(59,k)>=getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 264:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 265:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(23,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.070)))))))){result=0;}else{result=1;}
					break;
				case 266:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.526<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 267:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 268:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<65.526)&&(((getVariable(6,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k)+getVariable(179,k))<getVariable(141,k))||(getVariable(166,k)<getVariable(162,k))))))){result=0;}else{result=1;}
					break;
				case 269:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.835)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 270:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.448-348.005)+87.031)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 271:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(96,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 272:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)*87.535)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 273:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848+348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.076<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 274:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((6.557*getVariable(50,k))<624.207)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)<=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 275:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 276:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((60.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=2.420)))))))){result=0;}else{result=1;}
					break;
				case 277:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(158,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<242.070)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 278:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 279:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.530)||((getVariable(117,k)<65.072)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*(0.002*getVariable(3,k)))<getVariable(47,k))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)>=getVariable(117,k))))))))){result=0;}else{result=1;}
					break;
				case 280:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.677*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 281:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.608-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 282:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(145,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 283:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 284:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(65,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)+getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 285:
					if(((getVariable(150,k)>(7.570*getVariable(3,k)-79.848-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.552*getVariable(50,k))<(getVariable(45,k)+getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 286:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 287:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 288:
					if(((getVariable(150,k)>(7.570*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<2.420)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 289:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<24.206)||((getVariable(37,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 290:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.576<(2.420*getVariable(45,k)*getVariable(3,k)))&&((getVariable(47,k)+getVariable(179,k)<getVariable(141,k))||((getVariable(154,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 291:
					if(((getVariable(150,k)>=7.576)||(((79.828*getVariable(3,k)-348.095-87.535)+65.526<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)+(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 292:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-72.841-348.005)+87.531)){result=0;}else{result=1;}
					break;
				case 293:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848+348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(176,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 294:
					if(((getVariable(150,k)>(757.679*getVariable(3,k)-84.834-809.587)+53.565)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((52.024*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<207.000)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 295:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.076<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 296:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 297:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 298:
					if(((getVariable(150,k)<(7.576*getVariable(3,k)-79.648-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.677*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 299:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.650*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((655.262*getVariable(50,k))<getVariable(45,k))&&((getVariable(3,k)*getVariable(47,k)<getVariable(179,k)*getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 301:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 302:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.521*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 303:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 304:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<=getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 305:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 306:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 307:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)*getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 308:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<((getVariable(24,k)+getVariable(126,k))-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.576<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 309:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(155,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 310:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(100,k)*getVariable(3,k)-getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 311:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)+getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 312:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 313:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 314:
					if(((getVariable(150,k)>=getVariable(3,k))||(((7.586*getVariable(117,k)-79.848-348.005)<getVariable(24,k))||((getVariable(126,k)+getVariable(85,k)+(getVariable(52,k)-(getVariable(171,k)*getVariable(50,k)))<(8.753-getVariable(45,k)))&&(((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<(getVariable(141,k)*getVariable(166,k)))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(108,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 315:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 316:
					if(((getVariable(150,k)>(7.577*getVariable(3,k)-79.848-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.655*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 317:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.605)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.076*getVariable(50,k)<(getVariable(45,k)*getVariable(162,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 318:
					if(((getVariable(150,k)>=(7.573*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 319:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(172,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 320:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.858-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 321:
					if(((getVariable(150,k)>=(7.574*getVariable(3,k)-798.483-480.055)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<=6.207)||((getVariable(166,k)<getVariable(35,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 322:
					if(((getVariable(150,k)>=(75.767*getVariable(3,k)-98.083-480.558)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(80,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 323:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-798.483-480.058)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 324:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.576<(getVariable(97,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 325:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 326:
					if(((getVariable(150,k)>=(8.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((655.762*getVariable(50,k))<(getVariable(45,k)*getVariable(76,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 327:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(53,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 328:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 329:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 330:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 331:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.655*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<76.242)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 332:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.776*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 333:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 334:
					if(((getVariable(150,k)>(75.767*getVariable(3,k)-98.083-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 335:
					if(((getVariable(150,k)>(7.576-getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 336:
					if(((getVariable(150,k)>(75.767*getVariable(3,k)+98.083-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 337:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(173,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)-getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 338:
					if(((getVariable(150,k)>=(757.679*getVariable(3,k)-84.834-800.587)+53.565)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((07.624*getVariable(50,k))<(getVariable(4,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 339:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(116,k)))))||((56.552*getVariable(50,k))<=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 340:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(116,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 341:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 342:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 343:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-7.984-834.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((46.557*getVariable(50,k))<(getVariable(181,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 344:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+875.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)*getVariable(52,k)))||(((getVariable(171,k)-getVariable(50,k))<getVariable(45,k)*55.762)&&(((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<getVariable(141,k)+getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(188,k))))))))){result=0;}else{result=1;}
					break;
				case 345:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.845-348.005)+87.135)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 346:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+65.526-(getVariable(126,k)*getVariable(85,k))-getVariable(52,k)))||((getVariable(171,k)<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 347:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.677*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 348:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.076<(getVariable(45,k)*getVariable(93,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 349:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-348.005-875.356)+50.762<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(62.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.525)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=244.070)))))))){result=0;}else{result=1;}
					break;
				case 351:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(76,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 352:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(180,k)))))&&(((65.076*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 353:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 354:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.077*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(158,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 355:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(123,k))))))))){result=0;}else{result=1;}
					break;
				case 356:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 357:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+65.526-getVariable(126,k)))||(((getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<(getVariable(179,k)+getVariable(141,k)))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 358:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.448-348.005)+87.530)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(122,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<=getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 359:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 360:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)+(getVariable(52,k)-getVariable(120,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)+getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(135,k))))))))){result=0;}else{result=1;}
					break;
				case 361:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 362:
					if(((getVariable(150,k)>getVariable(3,k)*7.576)||((getVariable(117,k)-79.848-348.095<getVariable(24,k))||((getVariable(126,k)+getVariable(85,k)+(getVariable(52,k)-(getVariable(171,k)*getVariable(50,k))))>=(87.535-getVariable(45,k)))))){result=0;}else{result=1;}
					break;
				case 363:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)+(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((655.762*getVariable(50,k))<420.700)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 364:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-7.984-834.809)+58.753)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 365:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.828+348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 366:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)>(getVariable(144,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((655.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 367:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)+(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 368:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((((getVariable(117,k)+getVariable(24,k)-(getVariable(126,k)*(getVariable(85,k)-getVariable(52,k))))*65.076)<(242.070*getVariable(171,k)))||(((getVariable(50,k)*getVariable(45,k)+getVariable(3,k))<getVariable(47,k)+getVariable(179,k))&&((getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 369:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 370:
					if(((getVariable(150,k)>(7.576+getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 371:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>getVariable(122,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 372:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 373:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<24.209)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))>=getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 374:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-448.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 375:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 376:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.530)){result=0;}else{result=1;}
					break;
				case 377:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848+348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 378:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)+(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 379:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(37,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((242.070+getVariable(179,k))<getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 380:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 381:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.060*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)<=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 382:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<((getVariable(24,k)+getVariable(126,k))-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 383:
					if(((getVariable(150,k)>=(7.576+getVariable(3,k)-7.984-834.800)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 384:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)&&((getVariable(117,k)<(getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(110,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 385:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 386:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<242.060)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 387:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 388:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)*79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((6.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 389:
					if(((getVariable(150,k)>(7.576-getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<65.526)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k)))))){result=0;}else{result=1;}
					break;
				case 390:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 391:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-7.984-434.809)+58.753)||((getVariable(117,k)<56.507)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(6.242*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 392:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.003)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 393:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.581)){result=0;}else{result=1;}
					break;
				case 394:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.055)-87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 395:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 396:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((650.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 397:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((6.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 398:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 399:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.676*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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
					if((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 401:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 402:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 403:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.849-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 404:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 405:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 406:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 407:
					if(((getVariable(150,k)<(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((getVariable(50,k)*6.507)<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<(62.420-getVariable(166,k)))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 408:
					if(((getVariable(150,k)>=7.576)||(((79.808*getVariable(3,k)-348.095-87.535)+6.552<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))>(624.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(145,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 409:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-798.413-480.058)+75.316)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<420.603)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 410:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*65.076)))||(((getVariable(52,k)-getVariable(171,k))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 411:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(181,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=24.206)))))))){result=0;}else{result=1;}
					break;
				case 412:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 413:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)){result=0;}else{result=1;}
					break;
				case 414:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.845-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(75,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 415:
					if(((getVariable(150,k)>(7.556*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 416:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 417:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.003)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 418:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<2.420)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 419:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(191,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 420:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)+(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 421:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-((getVariable(85,k)*getVariable(52,k))-getVariable(171,k))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 422:
					if(((getVariable(150,k)>(getVariable(3,k)*7.576-79.848-getVariable(117,k))+348.095)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(87.535*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))&&((getVariable(166,k)<getVariable(95,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<65.576)||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 423:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.009)+87.531)||((getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.078*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.070)))))))){result=0;}else{result=1;}
					break;
				case 424:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(91,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 425:
					if(((getVariable(150,k)>=(7.571*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)*getVariable(171,k))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)))&&((getVariable(47,k)<getVariable(179,k))||(((getVariable(141,k)*getVariable(166,k))<242.070)||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)>=getVariable(117,k))))))))){result=0;}else{result=1;}
					break;
				case 426:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(28,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 427:
					if(((getVariable(150,k)>=7.576)||(((79.608*getVariable(3,k)-348.095-87.535)+65.526<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 428:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-048.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)-getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(29,k))))))))){result=0;}else{result=1;}
					break;
				case 429:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 430:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(140,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 431:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(135,k)<getVariable(59,k))||((getVariable(2,k)<242.070)||(getVariable(117,k)<=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 432:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+8.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((56.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 433:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)-87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 434:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-7.984-837.800)+58.753)||(((getVariable(117,k)+getVariable(24,k)-(getVariable(126,k)*(getVariable(85,k)-getVariable(52,k))))*(56.507*getVariable(171,k))<(getVariable(50,k)*getVariable(45,k)+getVariable(3,k)))||((getVariable(47,k)-getVariable(179,k)<getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(88,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(163,k))))))))){result=0;}else{result=1;}
					break;
				case 435:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.035)+87.635)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((6.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 436:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+97.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)-getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 437:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((942.070+getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 438:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.530)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 439:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)-getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<242.070)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 440:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.868-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<24.207)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 441:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.858-348.007)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 442:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 443:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-798.083-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*55.262<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(178,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 444:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(65.576*getVariable(85,k))))||(((getVariable(52,k)-getVariable(171,k))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)>=getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 445:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+875.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 446:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-34.805)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.552*getVariable(4,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 447:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 448:
					if(((getVariable(150,k)>(getVariable(92,k)*(7.574-getVariable(117,k)-79.848+348.005)))||((getVariable(24,k)<(getVariable(126,k)+getVariable(85,k)-(getVariable(52,k)*(getVariable(171,k)-getVariable(50,k)))))||(((87.515*getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)*getVariable(179,k)))&&((getVariable(141,k)+getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<=getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=65.076)))))))){result=0;}else{result=1;}
					break;
				case 449:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<282.070)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 451:
					if(((getVariable(150,k)>(757.679*getVariable(3,k)-84.834-809.587)+53.565)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((07.624*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 452:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-78.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(21,k))))))))){result=0;}else{result=1;}
					break;
				case 453:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.077*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 454:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 455:
					if(((7.576*(79.808-getVariable(150,k)-348.095+87.575)+65.526>getVariable(3,k))||(((getVariable(117,k)-getVariable(24,k)*(getVariable(126,k)-(getVariable(85,k)*getVariable(52,k))))<(2.420*getVariable(171,k)))||(((getVariable(50,k)*getVariable(45,k)+getVariable(3,k))<getVariable(47,k)+getVariable(179,k))&&((getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 456:
					if(((getVariable(150,k)>=(7.576*(79.848-getVariable(3,k)-348.008))+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<2.420)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 457:
					if(((getVariable(150,k)>(75.767*getVariable(3,k)-94.483-480.558)+70.316)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<420.703*getVariable(45,k)*getVariable(3,k))&&((getVariable(124,k)+getVariable(179,k)<getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 458:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(138,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 459:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 460:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(99,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)-getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 461:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 462:
					if(((getVariable(150,k)>=(7.574*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 463:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(180,k)*(getVariable(52,k)-getVariable(171,k)))))&&((34.655*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 464:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-65.076))||(((getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 465:
					if(((((7.576*getVariable(150,k)-79.848-348.065)+8.753+56.552)>=getVariable(3,k))||(((getVariable(117,k)-getVariable(24,k)*(getVariable(126,k)-(getVariable(85,k)*getVariable(52,k))))<(62.420*getVariable(171,k)))||(((getVariable(50,k)*getVariable(45,k)+getVariable(3,k))<getVariable(47,k)-getVariable(179,k))&&(getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 466:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 467:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 468:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.248+348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 469:
					if(((getVariable(150,k)>=(getVariable(3,k)*7.576-69.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<2.420)||((getVariable(59,k)<=getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 470:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 471:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+8.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(56.507*getVariable(85,k)-getVariable(52,k))))||((getVariable(171,k)<(62.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 472:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.094)+87.535)||(((65.076+(getVariable(117,k)-getVariable(24,k)*(getVariable(126,k)-(getVariable(85,k)*getVariable(52,k)))))<(2.420*getVariable(171,k)))||(((getVariable(50,k)*getVariable(45,k)+getVariable(3,k))<getVariable(47,k)+getVariable(179,k))&&((getVariable(141,k)<70.002)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 473:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(3,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 474:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)-getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 475:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 476:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+57.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.677*getVariable(50,k))<(getVariable(45,k)+getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(((262.090+getVariable(162,k))<getVariable(59,k))&&((getVariable(2,k)<0.427)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 477:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.448-348.095)+87.535)&&((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 478:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 479:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)*79.848-348.005)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 480:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 481:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 482:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)+(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 483:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 484:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 485:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 486:
					if(((getVariable(150,k)>(7.576+getVariable(3,k)-79.848-348.095)+875.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<42.070)||((getVariable(59,k)>=getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 487:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<65.526)||(((getVariable(24,k)+getVariable(126,k)+(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 488:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 489:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.046*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 490:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(57,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 491:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<2.420)||((getVariable(166,k)<getVariable(162,k))||(getVariable(59,k)<getVariable(2,k)))))))){result=0;}else{result=1;}
					break;
				case 492:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<=(getVariable(54,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 493:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(59,k)-(getVariable(85,k)*getVariable(52,k)-getVariable(171,k))))||((getVariable(50,k)<(65.076*getVariable(45,k)))&&(((getVariable(3,k)*getVariable(47,k)+getVariable(179,k))<getVariable(141,k)+getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 494:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)+(getVariable(52,k)-getVariable(171,k)))))||(((65.626*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=2.420)))))))){result=0;}else{result=1;}
					break;
				case 495:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-348.095-87.535)+65.520<getVariable(117,k))&&(((getVariable(24,k)+getVariable(126,k)-(getVariable(130,k)*(getVariable(52,k)-getVariable(171,k))))<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 496:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<282.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 497:
					if(((getVariable(150,k)>=(75.767*getVariable(3,k)-98.483-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(39,k)-(getVariable(85,k)*(getVariable(52,k)-55.762))))||((getVariable(171,k)<(920.700*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<0.280)||((getVariable(179,k)+getVariable(141,k)<=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)>=getVariable(117,k))))))))){result=0;}else{result=1;}
					break;
				case 498:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-348.005-87.535)+65.026<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(282.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)<=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 499:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(178,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 501:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-getVariable(117,k)-79.848)+348.005)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(158,k))))<(87.531*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)<getVariable(38,k)))))))){result=0;}else{result=1;}
					break;
				case 502:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<242.060)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 503:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.035)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 504:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-getVariable(117,k)-79.848)+348.095)||((getVariable(24,k)<(getVariable(126,k)+getVariable(85,k)-(getVariable(52,k)*(getVariable(171,k)-getVariable(50,k)))))||((87.535*getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)*getVariable(179,k)))))){result=0;}else{result=1;}
					break;
				case 505:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 506:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.847-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-((65.576*getVariable(85,k))-getVariable(52,k))))||((getVariable(171,k)<getVariable(50,k)-242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 507:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=2.420)))))))){result=0;}else{result=1;}
					break;
				case 508:
					if(((getVariable(150,k)>(75.768*getVariable(3,k)-98.483-480.058)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 509:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.655*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 510:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(87,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+(getVariable(141,k)+getVariable(166,k))<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(124,k))))))))){result=0;}else{result=1;}
					break;
				case 511:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(57,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 512:
					if(((getVariable(30,k)>(7.576*getVariable(3,k)-79.841-345.005)+87.531)||((getVariable(117,k)>=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 513:
					if(((getVariable(150,k)>getVariable(3,k)*getVariable(117,k)-7.576-79.808+348.095)||((getVariable(24,k)<(getVariable(126,k)+getVariable(85,k)-(getVariable(52,k)*(getVariable(171,k)-getVariable(50,k)))))||(((87.535*getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)*getVariable(179,k)))&&((getVariable(141,k)+getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(93,k))))))))){result=0;}else{result=1;}
					break;
				case 514:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((getVariable(50,k)*getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)*getVariable(179,k)))&&((getVariable(141,k)+getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>getVariable(131,k))))))))){result=0;}else{result=1;}
					break;
				case 515:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)+getVariable(52,k)-65.526)))||((getVariable(171,k)<242.070)&&(((00.210*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)))||((getVariable(47,k)<getVariable(179,k))||((getVariable(141,k)<getVariable(166,k))&&(getVariable(162,k)>=getVariable(59,k))))))))){result=0;}else{result=1;}
					break;
				case 516:
					if(((getVariable(150,k)>(7.576*getVariable(39,k)*79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 517:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)&&((getVariable(117,k)<((getVariable(24,k)+65.076)-getVariable(126,k)))||(((getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))<getVariable(50,k)*26.207)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||(getVariable(59,k)<getVariable(2,k)))))))){result=0;}else{result=1;}
					break;
				case 518:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-798.483-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)-getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<=getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 519:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.608-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-((65.526*getVariable(85,k))-getVariable(52,k))))||((getVariable(171,k)<(242.070*getVariable(50,k)))&&(((getVariable(192,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 520:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 521:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 522:
					if(((getVariable(150,k)>(6.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(((getVariable(162,k)+getVariable(59,k))<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(84,k))))))))){result=0;}else{result=1;}
					break;
				case 523:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 524:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.530)&&((getVariable(117,k)+(getVariable(24,k)-getVariable(126,k)*(getVariable(85,k)-(getVariable(52,k)*getVariable(171,k))))<getVariable(50,k)*65.076)||(((getVariable(45,k)*getVariable(3,k)+getVariable(47,k))<getVariable(179,k)-getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(142,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(109,k))))))))){result=0;}else{result=1;}
					break;
				case 525:
					if(((getVariable(150,k)>=(7.577*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 526:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+242.070+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 527:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(161,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((25.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 528:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((655.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 529:
					if(((getVariable(150,k)>=(7.576*getVariable(182,k)-79.848-348.005)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 530:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 531:
					if(((getVariable(150,k)>(7.576+getVariable(3,k)-79.808-348.355)+8.753)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 532:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.099)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(39,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<242.070)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 533:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 534:
					if(((getVariable(150,k)<7.576)||(((79.858*getVariable(3,k)-348.005-87.531)+65.076<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<(getVariable(179,k)+getVariable(141,k)))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 535:
					if(((getVariable(150,k)>=(7.506*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 536:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 537:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.530)){result=0;}else{result=1;}
					break;
				case 538:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 539:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-34.809-58.753)+56.552<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(624.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(130,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 540:
					if(((getVariable(150,k)>=(7.576-getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*getVariable(52,k)-65.526)))||((getVariable(171,k)<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 541:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.650*getVariable(50,k))<7.624)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 542:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.195)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.036*getVariable(50,k))<=(getVariable(45,k)*getVariable(70,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 543:
					if(((getVariable(150,k)>(7.576+getVariable(3,k)-79.844-348.095)+87.535)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 544:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+875.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.362*getVariable(50,k))<(getVariable(45,k)-getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 545:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 546:
					if(((getVariable(150,k)>=(7.577*getVariable(3,k)-79.848-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)+getVariable(171,k)))))||(((56.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<624.207)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 547:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(116,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 548:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 549:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.844-348.005)+875.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>(7.576*(getVariable(3,k)-79.848)-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(177,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 551:
					if(((getVariable(150,k)>(757.679*getVariable(3,k)-84.834-809.587)+53.565)||((getVariable(117,k)<(getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((52.624*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(88,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 552:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<2.420)||((getVariable(59,k)<getVariable(2,k))&&(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 553:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<65.076)||((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))))){result=0;}else{result=1;}
					break;
				case 554:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((05.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(32,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 555:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(89,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 556:
					if(((getVariable(150,k)>(75.767*getVariable(3,k)-98.483-480.058)+75.316)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(76,k)<getVariable(117,k))&&(getVariable(38,k)<getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 557:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 558:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)-(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(110,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 559:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 560:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 561:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(58,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 562:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 563:
					if(((getVariable(150,k)>=(757.679*getVariable(3,k)-84.834-800.587)+53.565)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((07.624*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 564:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)>=((getVariable(24,k)+getVariable(126,k))-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&((getVariable(50,k)*65.076<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 565:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<63.526)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(43,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 566:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)>=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 567:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 568:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 569:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.844-348.095)+87.534)||((getVariable(117,k)<65.576)||(((getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k)))))){result=0;}else{result=1;}
					break;
				case 570:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+47.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 571:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=2.420)))))))){result=0;}else{result=1;}
					break;
				case 572:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 573:
					if(((getVariable(150,k)>(7.576-getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<24.207)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(163,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 574:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 575:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.576<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 576:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.847-34.800)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((16.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(111,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<624.206)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 577:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.858-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*0.028)<getVariable(47,k))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)>=getVariable(117,k))))))))){result=0;}else{result=1;}
					break;
				case 578:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)>=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.078*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 579:
					if(((getVariable(150,k)>(7.576+getVariable(3,k)-79.748-348.095)+87.525)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 580:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 581:
					if(((getVariable(150,k)>(75.767*getVariable(3,k)-98.483-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<420.700)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 582:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 583:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-345.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)+getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(97,k))))))))){result=0;}else{result=1;}
					break;
				case 584:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.025)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.677*getVariable(50,k))<(getVariable(45,k)-getVariable(3,k)*2.620))))){result=0;}else{result=1;}
					break;
				case 585:
					if(((getVariable(150,k)>(7.574*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 586:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)){result=0;}else{result=1;}
					break;
				case 587:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 588:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.868-348.005)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 589:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.527*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 590:
					if(((getVariable(150,k)>=(75.767*getVariable(3,k)-98.483-480.058)+75.356)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)*getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 591:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 592:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)*87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 593:
					if(((getVariable(150,k)>=(75.767*getVariable(3,k)-98.483-480.958)+65.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 594:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 595:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 596:
					if(((getVariable(150,k)>=7.576)||(((79.841*getVariable(3,k)-348.005-87.531)+65.076<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.060*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(129,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 597:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 598:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-346.095)+87.534)||((getVariable(125,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 599:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>(7.576*getVariable(3,k)+79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<2.426)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 601:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.065)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+242.070+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 602:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(165,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.077*getVariable(50,k))<(getVariable(45,k)+getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 603:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 604:
					if(((getVariable(150,k)*(7.576-getVariable(3,k)-79.848+348.005)+87.531>=getVariable(117,k))||(((getVariable(24,k)-getVariable(126,k)*(getVariable(85,k)-(getVariable(52,k)*getVariable(171,k))))<(65.076*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)+getVariable(47,k))<getVariable(179,k)+getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(113,k))))))))){result=0;}else{result=1;}
					break;
				case 605:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 606:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 607:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-7.924-834.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)+getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 608:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 609:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 610:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.748-348.095)*85.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 611:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 612:
					if(((getVariable(150,k)>=7.576)||(((79.808*getVariable(3,k)-348.095-87.575)+65.526<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*getVariable(52,k))-getVariable(171,k))<getVariable(50,k))&&(((2.420*getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)<getVariable(141,k))||((getVariable(135,k)<getVariable(162,k))||(getVariable(59,k)>=getVariable(2,k))))))))){result=0;}else{result=1;}
					break;
				case 613:
					if(((getVariable(150,k)>(757.679*getVariable(3,k)-84.834-809.587)+53.565)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((52.624*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 614:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<242.070)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 615:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848*348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.626*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 616:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)+getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 617:
					if(((getVariable(150,k)>(7.776*getVariable(3,k)-79.838-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((6.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 618:
					if(((getVariable(150,k)>getVariable(3,k)*7.576-79.848-348.095+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.576<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 619:
					if(((getVariable(150,k)>=7.576)||(((79.848*getVariable(3,k)-348.005-87.535)+65.026<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(15,k))))<(282.070*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 620:
					if(((getVariable(150,k)>7.576)||(((79.808*getVariable(3,k)-348.055-87.535)+65.526<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(140,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 621:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-7.984-834.800)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.502*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 622:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.778-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 623:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(54,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 624:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.530)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(118,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 625:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 626:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.539)||((getVariable(117,k)<65.046)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(2.620*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 627:
					if(((getVariable(150,k)>=((7.576*getVariable(3,k)-79.868-348.005)+getVariable(117,k)))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(87.535*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(60,k))))))))){result=0;}else{result=1;}
					break;
				case 628:
					if(((getVariable(150,k)>(3.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076-getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(169,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<24.207)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 629:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.555)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(242.070+getVariable(179,k)<getVariable(141,k)))))){result=0;}else{result=1;}
					break;
				case 630:
					if((getVariable(150,k)>(getVariable(3,k)*getVariable(117,k)-7.576-79.848)+348.095)){result=0;}else{result=1;}
					break;
				case 631:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+80.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(55,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 632:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 633:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(34,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<(getVariable(179,k)+getVariable(141,k)))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 634:
					if(((getVariable(150,k)>7.576)||(((79.808*getVariable(3,k)-348.355-87.535)+65.526<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 635:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((655.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 636:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.086*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 637:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)>=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 638:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848*348.005)+87.535)||((getVariable(117,k)<getVariable(24,k))||((getVariable(126,k)+getVariable(85,k)<(getVariable(52,k)-(getVariable(171,k)*getVariable(50,k))))&&(((65.026-getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)<getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||(getVariable(59,k)>=getVariable(2,k))))))))){result=0;}else{result=1;}
					break;
				case 639:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<(282.070-getVariable(166,k)))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 640:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.741-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(69,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 641:
					if((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)){result=0;}else{result=1;}
					break;
				case 642:
					if(((getVariable(150,k)>=getVariable(3,k)*7.576-79.848-348.095+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 643:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(47,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)+242.070<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 644:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(149,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 645:
					if(((getVariable(150,k)>=(7.076*getVariable(3,k)-79.843-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 646:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.532)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 647:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848+348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 648:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.395)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 649:
					if(((getVariable(150,k)>=(7.571*getVariable(3,k)-79.848-388.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.868-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 651:
					if(((getVariable(150,k)>=(7.574*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*(getVariable(50,k)*getVariable(45,k))*3.620)<getVariable(3,k))&&((getVariable(47,k)<(getVariable(179,k)+getVariable(141,k)))||(getVariable(166,k)<getVariable(162,k))))))){result=0;}else{result=1;}
					break;
				case 652:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 653:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.748-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 654:
					if(((getVariable(150,k)>=(757.679*getVariable(3,k)-84.834-800.587)+53.165)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*07.624<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 655:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)){result=0;}else{result=1;}
					break;
				case 656:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)-getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.060)))))))){result=0;}else{result=1;}
					break;
				case 657:
					if(((getVariable(150,k)>(7.576-getVariable(3,k)-59.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(172,k)))))||(getVariable(50,k)*65.526<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 658:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 659:
					if(((getVariable(150,k)>=(7.577*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 660:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((6.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 661:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((2.420*getVariable(179,k)<getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 662:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((242.070+getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 663:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 664:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*(getVariable(50,k)*getVariable(45,k))*getVariable(3,k))<=getVariable(47,k))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 665:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+84.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 666:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 667:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 668:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 669:
					if(((getVariable(150,k)>=(7.570*getVariable(3,k)-79.848-348.095)+85.535)||((getVariable(117,k)<(getVariable(24,k)*getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(116,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 670:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)+(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<242.070)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 671:
					if(((getVariable(150,k)>=7.576)||(((79.848*getVariable(3,k)-348.095-87.534)+6.557<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<getVariable(50,k)*624.207)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 672:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)-87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(95,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 673:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-((getVariable(85,k)*65.076)-getVariable(52,k))))||((getVariable(171,k)<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(92,k))&&(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 674:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.395)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.086*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 675:
					if((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.539)){result=0;}else{result=1;}
					break;
				case 676:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 677:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 678:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-getVariable(117,k)-79.848)+348.095)||((getVariable(24,k)<(getVariable(126,k)+getVariable(85,k)-(getVariable(52,k)*(getVariable(171,k)-getVariable(50,k)))))||((87.535*getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)*getVariable(179,k)))))){result=0;}else{result=1;}
					break;
				case 679:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.868-348.005)+87.535)||((getVariable(117,k)<65.976)&&((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))))){result=0;}else{result=1;}
					break;
				case 680:
					if(((getVariable(150,k)>(7.574*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>=getVariable(158,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 681:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 682:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+81.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<2.420)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 683:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(189,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 684:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.435)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(58,k)))))&&(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 685:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.847-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 686:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-148.095)+87.539)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 687:
					if(((getVariable(150,k)>7.576)||(((79.608*getVariable(3,k)-348.095-87.535)+65.526<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)<=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 688:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 689:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.091)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 690:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-99.858-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 691:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 692:
					if(((getVariable(150,k)>(757.679*getVariable(3,k)-84.834-809.587)+53.565)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*getVariable(52,k))))||((getVariable(171,k)<getVariable(50,k))&&(((52.624-getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)<getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||(getVariable(59,k)>=getVariable(2,k))))))))){result=0;}else{result=1;}
					break;
				case 693:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 694:
					if(((getVariable(150,k)>=(7.576*getVariable(156,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((650.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 695:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.868-348.005)+87.535)||((getVariable(117,k)<((65.076+getVariable(24,k))-(getVariable(126,k)*getVariable(85,k))-getVariable(52,k)))||((getVariable(171,k)<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(193,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 696:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 697:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 698:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(127,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<2.420)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 699:
					if(((getVariable(150,k)>(7.570*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(133,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<24.206)||((getVariable(166,k)<getVariable(162,k))&&((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 701:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 702:
					if(((getVariable(150,k)>7.576)||(((79.808*getVariable(3,k)-3.480-95.875)+35.655<getVariable(117,k))&&(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(27,k)-getVariable(171,k))))<getVariable(50,k)*262.420)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)<=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 703:
					if(((getVariable(150,k)>7.576*getVariable(3,k)-79.848-348.095+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 704:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-7.984-834.809)+58.785)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.557*getVariable(187,k))<=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 705:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 706:
					if(((getVariable(150,k)>=(7.571*getVariable(3,k)-79.844-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<24.207)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))&&(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 707:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.795)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 708:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 709:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 710:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+242.070)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 711:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<getVariable(24,k))||((getVariable(126,k)+getVariable(85,k)<(getVariable(52,k)-(getVariable(171,k)*getVariable(50,k))))&&(((65.576-getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)<getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||(getVariable(59,k)>=getVariable(2,k))))))))){result=0;}else{result=1;}
					break;
				case 712:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(101,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 713:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 714:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 715:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<26.209)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))&&((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 716:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 717:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<64.576)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<=(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(94,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 718:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 719:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+875.356)||((getVariable(117,k)<55.262)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(15,k)-getVariable(171,k))))<(420.700+getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)<getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 720:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 721:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-3.480)+05.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((31.650*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)-getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 722:
					if(((getVariable(150,k)>=7.576)||(((79.848*getVariable(3,k)-3.480-95.875)+35.655<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(262.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||(((getVariable(166,k)+getVariable(162,k))<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 723:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 724:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.533)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<242.070)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 725:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.845-348.005)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<1.620)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 726:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.581)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.016*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 727:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076-getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.070)))))))){result=0;}else{result=1;}
					break;
				case 728:
					if(((getVariable(150,k)>=getVariable(3,k)*(7.576-getVariable(117,k)-79.848+348.005))||((getVariable(24,k)<(getVariable(126,k)+getVariable(85,k)-(getVariable(52,k)*(getVariable(171,k)-getVariable(50,k)))))||(((87.535*getVariable(45,k))<(getVariable(3,k)*getVariable(47,k)*getVariable(179,k)))&&((getVariable(141,k)+getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(181,k))))))))){result=0;}else{result=1;}
					break;
				case 729:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-348.095-87.535)+65.076<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k)))))){result=0;}else{result=1;}
					break;
				case 730:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 731:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-798.483-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(37,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 732:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.876*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 733:
					if((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)){result=0;}else{result=1;}
					break;
				case 734:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+875.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((50.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 735:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 736:
					if(((getVariable(150,k)>7.576)||(((79.808*getVariable(3,k)-348.095-87.535)+65.526<getVariable(117,k)+getVariable(24,k)-(getVariable(126,k)*getVariable(85,k))-getVariable(52,k))||((getVariable(171,k)<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)+getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 737:
					if(((getVariable(150,k)>(7.596*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 738:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 739:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((6.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 740:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 741:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)-getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 742:
					if(((getVariable(150,k)>(7.571*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 743:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<242.070)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(185,k))))))))){result=0;}else{result=1;}
					break;
				case 744:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.051)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 745:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.395)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 746:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 747:
					if(((getVariable(150,k)>(7.576*getVariable(136,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 748:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<2.420)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 749:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<65.526)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<65.526)||((getVariable(24,k)+getVariable(126,k)-242.070<(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))&&(((002.804*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)))||((getVariable(47,k)<getVariable(179,k))||((getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)>=getVariable(59,k))))))))){result=0;}else{result=1;}
					break;
				case 751:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<65.526)&&(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<=(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||(((getVariable(166,k)+getVariable(162,k))<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 752:
					if(((getVariable(150,k)>=(7.576*getVariable(43,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 753:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(133,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 754:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-344.005)+87.530)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(164,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<24.207)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 755:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+27.581)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.016*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 756:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.527*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 757:
					if(((getVariable(150,k)>(7.576*getVariable(89,k)-79.748+348.095)+89.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 758:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 759:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 760:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 761:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 762:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.655*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 763:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 764:
					if(((getVariable(150,k)>=7.576)||((79.848*getVariable(3,k)-348.095-87.535)+69.076<getVariable(117,k)))){result=0;}else{result=1;}
					break;
				case 765:
					if(((getVariable(150,k)>(7.570*getVariable(3,k)-79.848-348.095)+88.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<24.207)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 766:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((2.420+getVariable(179,k))<getVariable(141,k))||((getVariable(166,k)<7.000)||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)>=getVariable(117,k))))))))){result=0;}else{result=1;}
					break;
				case 767:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)*getVariable(141,k)<242.060*getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 768:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 769:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)-getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 770:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.868-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<242.070)||((getVariable(59,k)<=getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 771:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 772:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 773:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 774:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.626*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<242.070)||((getVariable(59,k)<getVariable(178,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 775:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 776:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+27.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(65.076*getVariable(85,k))))||(((getVariable(52,k)-getVariable(171,k))<(2.420*getVariable(50,k)))&&(((getVariable(45,k)-getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(108,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 777:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)+getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 778:
					if(((getVariable(150,k)>=(7.576+getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 779:
					if(((getVariable(150,k)>(7.576+getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 780:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 781:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)&&((getVariable(117,k)<((getVariable(24,k)+getVariable(126,k))-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 782:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 783:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 784:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848*348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 785:
					if(((getVariable(150,k)>=(7.576*getVariable(5,k)-79.841-348.005)+87.531)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.206*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 786:
					if(((getVariable(150,k)<(7.576*getVariable(3,k)-79.848-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.552*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 787:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k))))){result=0;}else{result=1;}
					break;
				case 788:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 789:
					if(((getVariable(150,k)>(7.570*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 790:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((95.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 791:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 792:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.025)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)>=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 793:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.448-348.005)+87.581)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)+(getVariable(52,k)-getVariable(171,k)))))||(((65.016*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<24.207)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 794:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 795:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 796:
					if(((getVariable(150,k)>=(75.767*getVariable(3,k)-98.413-480.059)+75.316)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 797:
					if(((getVariable(150,k)>(7.974*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*((getVariable(50,k)*getVariable(45,k))*getVariable(3,k)))<getVariable(159,k))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 798:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-248.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)-getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 799:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.545)||((getVariable(117,k)<(getVariable(24,k)+getVariable(29,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.677*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 801:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((650.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 802:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 803:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-798.083-480.558)+75.356)){result=0;}else{result=1;}
					break;
				case 804:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<242.070)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 805:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.868-348.005)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 806:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*getVariable(85,k)*getVariable(52,k)))||(((getVariable(171,k)-getVariable(50,k))<(655.762*getVariable(45,k)))&&(((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<getVariable(141,k)+getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(84,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 807:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 808:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 809:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 810:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 811:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(23,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 812:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)>=getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 813:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 814:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(113,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 815:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 816:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.026*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 817:
					if(((getVariable(150,k)>=(7.506*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((650.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 818:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.708-34.809)+58.757)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.552*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 819:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.086*getVariable(50,k))<2.420)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 820:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((getVariable(50,k)*(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))<getVariable(179,k)+getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(104,k))))))))){result=0;}else{result=1;}
					break;
				case 821:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<65.076)&&(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)>getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 822:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*(242.050*getVariable(3,k))))&&((getVariable(47,k)<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 823:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((66.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<2.420)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 824:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.505)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(29,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 825:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k))<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 826:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 827:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.526<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 828:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 829:
					if(((getVariable(150,k)>=(7.506*getVariable(3,k)-7.944-834.800)+58.703)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((16.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 830:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 831:
					if(((getVariable(150,k)>=7.576*getVariable(3,k)-79.858-348.005+87.531)&&(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 832:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=28.207)))))))){result=0;}else{result=1;}
					break;
				case 833:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 834:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.348-348.095)+87.535)||((getVariable(117,k)<((getVariable(24,k)+getVariable(126,k))-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.326*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 835:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-348.095-87.535)+67.576<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*0.002)<getVariable(47,k))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)>=getVariable(117,k))))))))){result=0;}else{result=1;}
					break;
				case 836:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)+(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 837:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(104,k)-getVariable(171,k)))))&&(((65.026*getVariable(50,k))<(getVariable(45,k)+getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 838:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 839:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*65.076-getVariable(52,k))))||((getVariable(171,k)<getVariable(50,k)*242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 840:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.835)||((getVariable(117,k)<(getVariable(185,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.576<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)>getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 841:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<24.207)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 842:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||(((getVariable(117,k)+(getVariable(24,k)-getVariable(126,k)*(getVariable(85,k)-(getVariable(52,k)*getVariable(171,k)))))<(65.076*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)+getVariable(47,k))<getVariable(179,k)*getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))&&((getVariable(59,k)>=getVariable(2,k))||((getVariable(117,k)<242.060)||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 843:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 844:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.527*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 845:
					if(((getVariable(89,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<042.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))&&((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 846:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(57,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)-getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))&&(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 847:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.070)))))))){result=0;}else{result=1;}
					break;
				case 848:
					if(((getVariable(150,k)<=getVariable(3,k)*7.576)||((getVariable(117,k)-79.848-348.005<getVariable(24,k))&&(((getVariable(126,k)+getVariable(85,k)+(getVariable(52,k)-(getVariable(171,k)*getVariable(50,k))))<(87.535-getVariable(45,k)))&&(((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<getVariable(141,k)*getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 849:
					if(((getVariable(150,k)>(8.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(61,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.844-348.095)+88.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<2.420)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 851:
					if((((7.576*getVariable(150,k)-79.848-348.005)+87.535+getVariable(3,k)>(getVariable(117,k)-getVariable(24,k)*(getVariable(126,k)-(getVariable(85,k)*getVariable(52,k)))))||(((65.076*getVariable(171,k))<242.070)||(((getVariable(50,k)*getVariable(45,k)+getVariable(3,k))<getVariable(47,k)+getVariable(179,k))&&((getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 852:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 853:
					if((getVariable(150,k)>=(7.576*getVariable(71,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 854:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(47,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 855:
					if(((getVariable(150,k)>=7.571)||(((798.483*getVariable(3,k)-480.958-75.356)+55.762<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(42.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(133,k))||((getVariable(166,k)>getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 856:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.835)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 857:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.077*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 858:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.677*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 859:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 860:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.848-348.005)+875.356)||((getVariable(117,k)<(getVariable(24,k)*getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 861:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.868-348.005)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 862:
					if((getVariable(150,k)>=(7.576*getVariable(3,k)-798.483-480.958)+75.356)){result=0;}else{result=1;}
					break;
				case 863:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 864:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.748-348.395)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*22.207))&&((getVariable(47,k)+getVariable(179,k)<getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 865:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.348-348.095)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 866:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(129,k))))))))){result=0;}else{result=1;}
					break;
				case 867:
					if(((getVariable(150,k)>getVariable(3,k)*7.576)||((getVariable(117,k)-79.848-348.095<getVariable(24,k))||(((getVariable(126,k)+getVariable(85,k)+(getVariable(52,k)-(getVariable(171,k)-getVariable(50,k))))<(87.535-getVariable(45,k)))&&(((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<getVariable(141,k)*getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 868:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 869:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.530)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(63,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 870:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||(getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 871:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 872:
					if(((getVariable(150,k)>(7.506*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 873:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)-348.005-87.535)+65.076<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 874:
					if(((getVariable(150,k)>(7.574*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)+getVariable(47,k)))&&((getVariable(14,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 875:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.530)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 876:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)-87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(142,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.697*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 877:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<24.207)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||(getVariable(166,k)>getVariable(162,k))))))){result=0;}else{result=1;}
					break;
				case 878:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)*getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 879:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+65.520-getVariable(126,k)))||(((getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 880:
					if(((getVariable(150,k)>(7.576+getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 881:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 882:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 883:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<242.070)||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 884:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)+getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<2.420)||((getVariable(59,k)>=getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 885:
					if(((getVariable(150,k)>=(7.576+getVariable(3,k)-79.848-348.005)+87.535)||(((getVariable(117,k)+(getVariable(24,k)-getVariable(126,k)*(getVariable(85,k)-(getVariable(52,k)*getVariable(171,k)))))<(65.076*getVariable(50,k)))||((getVariable(45,k)*getVariable(3,k)+getVariable(47,k))<getVariable(179,k)-getVariable(141,k))))){result=0;}else{result=1;}
					break;
				case 886:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 887:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.847-348.005)+88.531)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 888:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 889:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808*348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.526<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 890:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-3.480)+05.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.650*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 891:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+8.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 892:
					if(((getVariable(150,k)>7.576)||(((79.868*getVariable(3,k)-348.005-87.535)+650.762<getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(420.700*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))&&(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 893:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+875.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 894:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.626*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 895:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((65.826*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 896:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 897:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<24.207)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 898:
					if(((getVariable(150,k)>(7.576+getVariable(3,k)-79.808-34.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)))||((getVariable(52,k)<56.552)&&(((getVariable(171,k)*getVariable(50,k))<(624.207-getVariable(45,k)))||(((getVariable(3,k)*getVariable(47,k))<getVariable(179,k))||((getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)>=getVariable(59,k))))))))){result=0;}else{result=1;}
					break;
				case 899:
					if((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 901:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 902:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)*getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 903:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(49,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 904:
					if(((getVariable(150,k)>=(7.577*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))&&(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 905:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.555)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<248.070)||((getVariable(166,k)<getVariable(162,k))||(getVariable(59,k)<getVariable(2,k)))))))){result=0;}else{result=1;}
					break;
				case 906:
					if((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)){result=0;}else{result=1;}
					break;
				case 907:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))>=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 908:
					if(((getVariable(150,k)>=(7.574*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))&&((getVariable(162,k)<=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 909:
					if(((getVariable(58,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.476*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<242.070)||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 910:
					if(((getVariable(166,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<65.526)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 911:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.405)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(186,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 912:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 913:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-75.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(29,k))))))))){result=0;}else{result=1;}
					break;
				case 914:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<242.060)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 915:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 916:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.845-348.005)+87.135)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(((1.620+getVariable(162,k))<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 917:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-79.848-348.505)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 918:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((555.262*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(33,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=420.700)))))))){result=0;}else{result=1;}
					break;
				case 919:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-798.413-480.058)+75.336)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 920:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k))<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 921:
					if((getVariable(150,k)>(7.570*getVariable(3,k)-79.848-348.095)+77.535)){result=0;}else{result=1;}
					break;
				case 922:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.838-3.480)+95.875)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((35.655*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(17,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 923:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))&&(((65.476*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 924:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<((getVariable(24,k)+getVariable(126,k))-(getVariable(85,k)*getVariable(52,k))-getVariable(171,k)))||((getVariable(50,k)<(65.576*getVariable(45,k)))&&((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<getVariable(141,k)+getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 925:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.677*getVariable(50,k))<26.209)||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 926:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 927:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 928:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<=(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=2.420)))))))){result=0;}else{result=1;}
					break;
				case 929:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(191,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 930:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.828-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 931:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.076)<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))))){result=0;}else{result=1;}
					break;
				case 932:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.846-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 933:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(5,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 934:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.476*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 935:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)>(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 936:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.235)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(36,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 937:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)-getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.520*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)<=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 938:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(112,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 939:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.476*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)-getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 940:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(121,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 941:
					if(((getVariable(150,k)<(7.576*getVariable(3,k)-79.848-348.095)+87.535)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 942:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(114,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 943:
					if((getVariable(145,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 944:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<=getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 945:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<242.060)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(21,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 946:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 947:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(161,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 948:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.868-378.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+242.070<getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 949:
					if(((getVariable(150,k)>=7.576*getVariable(3,k)-79.848-348.095+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+242.070+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<0.028)&&((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
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
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 951:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-39.848-348.095)+87.535)||((getVariable(117,k)<=(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 952:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<65.526)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)*getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 953:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)){result=0;}else{result=1;}
					break;
				case 954:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-71.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 955:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)||((getVariable(117,k)<65.076)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*(getVariable(3,k)*getVariable(47,k)))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 956:
					if((getVariable(150,k)>(7.576*getVariable(3,k)-79.840-348.095)+87.535)){result=0;}else{result=1;}
					break;
				case 957:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.841-34.800)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((16.507*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(42,k))||((getVariable(162,k)<624.206)||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)<getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 958:
					if(((getVariable(150,k)>=(7.576*getVariable(102,k)-79.848-348.095)+87.535)||((getVariable(117,k)<65.376)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(24.207*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 959:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.055)+87.535)||((getVariable(117,k)<((getVariable(24,k)+getVariable(126,k))-getVariable(85,k)))||(((getVariable(52,k)*(getVariable(171,k)-getVariable(50,k)))<(65.526*getVariable(45,k)))&&(((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<getVariable(141,k)+getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 960:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.534)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)*(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<242.070)&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 961:
					if((getVariable(150,k)<(7.576*getVariable(3,k)-79.841-348.005)+87.531)){result=0;}else{result=1;}
					break;
				case 962:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 963:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(89,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.086*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 964:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-7.984-834.800)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.547*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(8,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 965:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-368.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 966:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)+(getVariable(52,k)-getVariable(171,k)))))||(((65.476*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=242.060)))))))){result=0;}else{result=1;}
					break;
				case 967:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-798.483-480.958)+75.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((55.202*getVariable(50,k))>(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+42.070+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))&&((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 968:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.576*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)*getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=2.420)))))))){result=0;}else{result=1;}
					break;
				case 969:
					if(((getVariable(150,k)<=(7.576*getVariable(3,k)-7.984-834.809)+58.753)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((56.552*getVariable(50,k))<(getVariable(45,k)*(getVariable(3,k)*getVariable(47,k))))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 970:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)-87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 971:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 972:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.555)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 973:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+17.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 974:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.090)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 975:
					if(((getVariable(150,k)>=7.576)||((getVariable(3,k)*79.858<getVariable(117,k)-348.095-87.535)||(getVariable(24,k)<(getVariable(126,k)+getVariable(85,k)+(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 976:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-341.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)>=getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 977:
					if(((getVariable(150,k)>(75.767*getVariable(3,k)-98.483-480.958)+75.356)||(getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))))){result=0;}else{result=1;}
					break;
				case 978:
					if(((getVariable(150,k)>=(7.571*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*getVariable(52,k)-getVariable(171,k))))&&((getVariable(50,k)<(65.576*getVariable(45,k)))&&(((getVariable(3,k)*getVariable(47,k)*getVariable(179,k))<getVariable(141,k)+getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 979:
					if(((getVariable(150,k)>7.576)||(((79.848*getVariable(3,k)+348.095-87.535)+65.576>=getVariable(117,k))||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(111,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 980:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.841-348.007)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(27,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 981:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.026*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||(getVariable(162,k)<getVariable(59,k))))))){result=0;}else{result=1;}
					break;
				case 982:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||((getVariable(50,k)*65.076<(getVariable(45,k)*getVariable(23,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 983:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-((getVariable(85,k)*getVariable(52,k))-getVariable(171,k))))&&(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<=getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 984:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||(getVariable(2,k)<getVariable(117,k)))))))){result=0;}else{result=1;}
					break;
				case 985:
					if(((getVariable(149,k)>(7.576*getVariable(3,k)-79.748-348.095)+87.535)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 986:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<655.762)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(420.700*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 987:
					if(((getVariable(150,k)>(7.576*(getVariable(3,k)-getVariable(117,k))-79.848)+348.005)||(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(87.531*getVariable(50,k)))||(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))&&((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(72,k))))))))){result=0;}else{result=1;}
					break;
				case 988:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(130,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 989:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k)+getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||((getVariable(117,k)<getVariable(38,k))||(getVariable(40,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 990:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 991:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.535)||((getVariable(117,k)<65.076)&&(((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(2.420*getVariable(50,k)))&&(((getVariable(45,k)*getVariable(3,k)*getVariable(47,k))<getVariable(179,k)+getVariable(141,k))||((getVariable(166,k)<getVariable(162,k))||((getVariable(59,k)<getVariable(2,k))||(getVariable(117,k)>=getVariable(38,k))))))))){result=0;}else{result=1;}
					break;
				case 992:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))||(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 993:
					if(((getVariable(4,k)>=(7.576*getVariable(3,k)-79.748-341.095)+87.535)||((getVariable(117,k)<65.076)||((getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k))))<(242.070*getVariable(50,k)))))){result=0;}else{result=1;}
					break;
				case 994:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.846-348.005)+87.531)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 995:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.858-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((6.557*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 996:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.808-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(22,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 997:
					if(((getVariable(150,k)>(7.576*getVariable(3,k)-79.848-348.005)+87.531)&&((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.076*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(getVariable(179,k)+getVariable(141,k)<getVariable(166,k)))))){result=0;}else{result=1;}
					break;
				case 998:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.748-348.095)+875.356)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((50.762*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&(((getVariable(179,k)+getVariable(141,k))<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
					break;
				case 999:
					if((getVariable(150,k)>=(7.571*getVariable(3,k)-79.848-348.095)+87.535)){result=0;}else{result=1;}
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
