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
					result = 18*Math.pow(10,-2)*getVariable(6,k)+getVariable(7,k)/getVariable(2,k)/28*Math.pow(10,+9)*44*Math.pow(10,-8)*getVariable(8,k)+getVariable(7,k)/getVariable(1,k)/getVariable(8,k)*getVariable(7,k)/27*Math.pow(10,+2)/getVariable(7,k)-getVariable(2,k)/getVariable(6,k)/getVariable(8,k)*getVariable(3,k)*getVariable(2,k)/36*Math.pow(10,+2)/getVariable(6,k)/getVariable(6,k);
					break;
				case 1:
					result = 57*Math.pow(10,+4)/getVariable(2,k)/getVariable(2,k)+getVariable(8,k)*getVariable(8,k)*getVariable(1,k)/getVariable(5,k)-getVariable(2,k)/getVariable(5,k)-getVariable(8,k)+31*Math.pow(10,-5)*getVariable(8,k)*getVariable(2,k)*getVariable(1,k)-getVariable(2,k)/getVariable(6,k)+99*Math.pow(10,-3)*getVariable(6,k)-getVariable(5,k)*63*Math.pow(10,-2)/getVariable(9,k)+getVariable(2,k)*99*Math.pow(10,-6)*getVariable(6,k)/getVariable(8,k)+getVariable(8,k)/getVariable(9,k)/getVariable(8,k)/11*Math.pow(10,+5)/getVariable(9,k)/getVariable(9,k)-getVariable(5,k)/getVariable(3,k)/getVariable(3,k)*getVariable(1,k)/getVariable(9,k)-getVariable(3,k)/getVariable(8,k)/4*Math.pow(10,+3)/getVariable(6,k)*getVariable(2,k)/getVariable(6,k)/getVariable(6,k);
					break;
				case 2:
					result = 64*Math.pow(10,+2)/getVariable(2,k)+getVariable(8,k)+getVariable(5,k)-getVariable(4,k)*97*Math.pow(10,-2)+99*Math.pow(10,-3)-1*Math.pow(10,+1)/getVariable(8,k)/getVariable(8,k)+getVariable(6,k)*99*Math.pow(10,+1)/57*Math.pow(10,-2)-getVariable(8,k)/getVariable(4,k)*getVariable(5,k)*getVariable(5,k)/getVariable(4,k)/getVariable(8,k)/57*Math.pow(10,+5)/getVariable(6,k);
					break;
				case 3:
					result = 59*Math.pow(10,-2)*getVariable(7,k)-getVariable(4,k)+getVariable(8,k)/getVariable(1,k)*getVariable(2,k)/getVariable(3,k)*getVariable(6,k)-getVariable(2,k)/14*Math.pow(10,-1)*getVariable(1,k)*getVariable(7,k)/getVariable(4,k)/getVariable(6,k)*getVariable(6,k)/getVariable(3,k)+getVariable(6,k)*getVariable(4,k)/64*Math.pow(10,+2)*getVariable(6,k)/getVariable(7,k)/52*Math.pow(10,+1)/getVariable(7,k)-getVariable(2,k)/getVariable(8,k)/getVariable(6,k)+getVariable(8,k)-14*Math.pow(10,-2)-getVariable(2,k)/getVariable(1,k)+getVariable(8,k)/getVariable(9,k)*getVariable(7,k)/getVariable(9,k)-getVariable(2,k)/getVariable(5,k)/getVariable(5,k);
					break;
				case 4:
					result = getVariable(7,k)-getVariable(5,k)-getVariable(4,k)-getVariable(7,k)*getVariable(7,k)/85*Math.pow(10,-1)+getVariable(8,k)*getVariable(2,k)/getVariable(3,k)/getVariable(7,k)*getVariable(6,k)+getVariable(8,k)/getVariable(7,k)*getVariable(4,k)+99*Math.pow(10,-1)-99*Math.pow(10,-1)*getVariable(7,k)/getVariable(5,k)/getVariable(5,k)+getVariable(8,k)+getVariable(6,k)*getVariable(8,k)*getVariable(8,k)/getVariable(7,k)*getVariable(6,k)/getVariable(8,k)/getVariable(7,k)/getVariable(7,k)*getVariable(2,k)-getVariable(8,k)/getVariable(5,k)*getVariable(7,k)+getVariable(1,k)+99*Math.pow(10,-2)-getVariable(1,k)+98*Math.pow(10,-2)-99*Math.pow(10,-3)/getVariable(8,k)*getVariable(7,k)/getVariable(5,k)/getVariable(5,k)*getVariable(2,k)/getVariable(6,k)*getVariable(7,k)*getVariable(7,k)/getVariable(5,k);
					break;
				case 5:
					result = getVariable(8,k)*getVariable(8,k)+getVariable(5,k)-getVariable(2,k)/91*Math.pow(10,+2)/getVariable(9,k)/getVariable(8,k)+getVariable(8,k)/getVariable(9,k)*getVariable(6,k)/getVariable(1,k)*getVariable(6,k)-66*Math.pow(10,-2)*getVariable(5,k)*getVariable(5,k)/getVariable(6,k)+99*Math.pow(10,-2)+99*Math.pow(10,-2)+getVariable(8,k)*getVariable(9,k)/getVariable(2,k)*getVariable(7,k)/getVariable(5,k)*getVariable(8,k);
					break;
				case 6:
					result = getVariable(7,k)-getVariable(5,k)-99*Math.pow(10,-2)-getVariable(4,k)+getVariable(8,k)*99*Math.pow(10,-1)*getVariable(4,k)/getVariable(7,k)-getVariable(1,k)/getVariable(5,k)/getVariable(5,k)*getVariable(7,k)*getVariable(7,k)/6*Math.pow(10,-1)+getVariable(6,k)*getVariable(9,k)*99*Math.pow(10,-5)+35*Math.pow(10,-1)*getVariable(6,k)/getVariable(7,k)*getVariable(6,k)/getVariable(7,k)*getVariable(4,k)/getVariable(9,k)*getVariable(8,k)*getVariable(6,k)/getVariable(7,k)*getVariable(6,k)/getVariable(7,k)-99*Math.pow(10,-1)/getVariable(9,k)*getVariable(8,k)+getVariable(6,k)/getVariable(7,k)/getVariable(8,k);
					break;
				case 7:
					result = getVariable(2,k)/getVariable(7,k)*getVariable(8,k)/getVariable(3,k)*getVariable(6,k)-getVariable(5,k)-getVariable(4,k)+getVariable(7,k)-getVariable(1,k)/6*Math.pow(10,+1)/getVariable(4,k)/getVariable(5,k)*getVariable(7,k)+getVariable(8,k)*getVariable(6,k)/getVariable(7,k)+94*Math.pow(10,-1)-getVariable(8,k)-getVariable(2,k)/getVariable(5,k);
					break;
				case 8:
					result = getVariable(8,k)+getVariable(5,k)-getVariable(5,k)/getVariable(6,k)+getVariable(8,k)*getVariable(8,k)*19*Math.pow(10,-1)*getVariable(8,k)-getVariable(2,k)/getVariable(3,k)-getVariable(8,k)-7*Math.pow(10,+3)/getVariable(9,k)*99*Math.pow(10,-1)*getVariable(5,k)/getVariable(6,k)/getVariable(6,k)+getVariable(7,k)/getVariable(9,k)*getVariable(2,k)*10*Math.pow(10,-2)/getVariable(9,k)/getVariable(2,k)*99*Math.pow(10,+4)/getVariable(4,k)/getVariable(1,k);
					break;
				case 9:
					result = 1*Math.pow(10,-9)+getVariable(6,k)/95*Math.pow(10,+3)/getVariable(4,k)+getVariable(8,k)*getVariable(8,k)/75*Math.pow(10,+2)*getVariable(8,k)-getVariable(3,k)/getVariable(5,k)/getVariable(1,k)*getVariable(2,k)+1*Math.pow(10,+5)*getVariable(7,k)*getVariable(7,k)*24*Math.pow(10,-9)/getVariable(9,k)/getVariable(9,k)*getVariable(4,k)+getVariable(4,k)*getVariable(4,k)*getVariable(3,k)/13*Math.pow(10,-4)/getVariable(5,k)*getVariable(7,k)*getVariable(8,k)/getVariable(6,k)*getVariable(1,k)*getVariable(9,k)/getVariable(5,k)-getVariable(3,k)/getVariable(6,k);
					break;
				case 10:
					result = getVariable(5,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k)-80*Math.pow(10,+1)/65*Math.pow(10,+3)/getVariable(8,k)/getVariable(8,k)/getVariable(7,k)/getVariable(6,k)*getVariable(5,k)/getVariable(6,k)*getVariable(5,k)/getVariable(6,k)*getVariable(1,k)*getVariable(8,k)+getVariable(8,k)+getVariable(7,k)/getVariable(5,k)-getVariable(8,k)*getVariable(1,k)*getVariable(9,k)/getVariable(9,k)/getVariable(7,k)-getVariable(2,k)/getVariable(6,k)/getVariable(5,k)/getVariable(6,k)*getVariable(4,k)/33*Math.pow(10,+3)/getVariable(6,k)*getVariable(2,k)-getVariable(8,k)/getVariable(9,k)*getVariable(8,k)*getVariable(1,k)/getVariable(3,k)+23*Math.pow(10,-1)/getVariable(5,k)/2*Math.pow(10,+2)/getVariable(8,k);
					break;
				case 11:
					result = getVariable(8,k)+getVariable(5,k)-getVariable(1,k)/getVariable(3,k)+getVariable(8,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k)-getVariable(2,k)/getVariable(6,k)/getVariable(6,k)/getVariable(8,k)*getVariable(5,k)/77*Math.pow(10,+5)/getVariable(6,k)-getVariable(5,k)*getVariable(5,k)/5*Math.pow(10,-4)*getVariable(2,k)+getVariable(6,k)/getVariable(5,k)+getVariable(7,k)/getVariable(5,k)-getVariable(1,k)/getVariable(6,k)*getVariable(8,k);
					break;
				case 12:
					result = 77*Math.pow(10,-2)-6*Math.pow(10,+1)/50*Math.pow(10,+1)-getVariable(3,k)-getVariable(5,k)+getVariable(8,k)-getVariable(8,k)*51*Math.pow(10,-1)+getVariable(8,k)-getVariable(7,k)/getVariable(3,k)*getVariable(1,k)/getVariable(3,k)+getVariable(7,k)+99*Math.pow(10,-4)*getVariable(5,k)*getVariable(3,k)/getVariable(1,k)*getVariable(6,k)+getVariable(3,k)/getVariable(1,k)*getVariable(8,k)*62*Math.pow(10,-3)/71*Math.pow(10,+2)*51*Math.pow(10,-1)*getVariable(5,k)-99*Math.pow(10,-1)/getVariable(9,k)-getVariable(2,k)/getVariable(5,k)/getVariable(5,k)-getVariable(7,k)/getVariable(5,k)*getVariable(7,k)/getVariable(6,k)*getVariable(7,k)/1*Math.pow(10,-4)*getVariable(7,k);
					break;
				case 13:
					result = 30*Math.pow(10,-2)*getVariable(6,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k)-26*Math.pow(10,-1)+23*Math.pow(10,+1)/getVariable(4,k)-getVariable(1,k)/getVariable(8,k)/getVariable(3,k)+23*Math.pow(10,-1)*getVariable(8,k)-74*Math.pow(10,-4)*getVariable(2,k)*18*Math.pow(10,-3)*getVariable(2,k)*getVariable(2,k)/getVariable(7,k)+13*Math.pow(10,-1)-13*Math.pow(10,+1)/getVariable(6,k)*getVariable(2,k)/getVariable(7,k)/getVariable(1,k)*getVariable(3,k);
					break;
				case 14:
					result = 29*Math.pow(10,-2)*getVariable(6,k)+45*Math.pow(10,-3)-99*Math.pow(10,-4)*getVariable(2,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k)+getVariable(8,k)-getVariable(8,k)-getVariable(4,k)/getVariable(5,k)+getVariable(8,k)*getVariable(7,k)/29*Math.pow(10,+1)/72*Math.pow(10,+2)/getVariable(4,k)*getVariable(8,k)-getVariable(4,k)/getVariable(5,k)*getVariable(3,k)/getVariable(5,k)+getVariable(8,k)/getVariable(4,k)*getVariable(8,k)/getVariable(1,k)*getVariable(8,k)*getVariable(7,k)/getVariable(5,k)*getVariable(7,k)+getVariable(7,k)/getVariable(2,k)/getVariable(8,k)/getVariable(1,k)*getVariable(7,k);
					break;
				case 15:
					result = getVariable(6,k)/getVariable(7,k)*getVariable(5,k)*70*Math.pow(10,-2)*getVariable(8,k);
					break;
				case 16:
					result = 36*Math.pow(10,-1)*getVariable(7,k)/getVariable(4,k)+getVariable(6,k)/82*Math.pow(10,+1)*getVariable(8,k)+getVariable(6,k)/34*Math.pow(10,+2)/getVariable(8,k)/getVariable(4,k)+getVariable(8,k)/getVariable(9,k)+getVariable(8,k)+1*Math.pow(10,+1)/getVariable(9,k)-getVariable(3,k)/getVariable(6,k)*getVariable(3,k)*getVariable(2,k)/74*Math.pow(10,+1)/getVariable(8,k)/getVariable(5,k)*getVariable(3,k)/getVariable(6,k)/getVariable(6,k)*getVariable(3,k)+getVariable(8,k)*97*Math.pow(10,-1)/getVariable(1,k)/17*Math.pow(10,+2)-getVariable(8,k)*getVariable(1,k)/20*Math.pow(10,+1)/getVariable(3,k);
					break;
				case 17:
					result = getVariable(7,k)-getVariable(5,k)+63*Math.pow(10,-3)-getVariable(4,k)-getVariable(7,k)/getVariable(5,k)+getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(5,k)+getVariable(8,k)+94*Math.pow(10,-1)+getVariable(6,k)/getVariable(3,k)/getVariable(3,k)/getVariable(1,k)*92*Math.pow(10,+3)/getVariable(3,k)-7*Math.pow(10,-2)*getVariable(7,k)+99*Math.pow(10,-3)*getVariable(8,k)/10*Math.pow(10,+3)*99*Math.pow(10,-3)-getVariable(8,k)/getVariable(2,k)+getVariable(8,k)*getVariable(6,k)/getVariable(1,k)-getVariable(7,k)/getVariable(4,k)*getVariable(7,k)*getVariable(7,k)/getVariable(5,k)/getVariable(2,k)+getVariable(9,k)/getVariable(7,k)*getVariable(8,k);
					break;
				case 18:
					result = getVariable(8,k)+getVariable(5,k)-getVariable(2,k)/getVariable(5,k)*getVariable(8,k)/getVariable(5,k)*getVariable(8,k)+getVariable(8,k)*getVariable(8,k)/getVariable(1,k)*getVariable(7,k)/56*Math.pow(10,+2)-20*Math.pow(10,-2)/getVariable(8,k)*getVariable(4,k)+getVariable(6,k)*99*Math.pow(10,+3)/30*Math.pow(10,-4)-getVariable(5,k)+getVariable(7,k)/8*Math.pow(10,+4)/57*Math.pow(10,-5)*getVariable(7,k)-getVariable(1,k)/67*Math.pow(10,-2)*getVariable(2,k)-getVariable(3,k)*getVariable(2,k)/getVariable(1,k)/getVariable(1,k)*getVariable(3,k)/getVariable(1,k)*getVariable(8,k);
					break;
				case 19:
					result = getVariable(6,k)*getVariable(8,k)/getVariable(7,k)*20*Math.pow(10,-2)*getVariable(7,k)+getVariable(2,k)/getVariable(4,k)/getVariable(8,k)/6*Math.pow(10,-1)/getVariable(8,k)/getVariable(8,k)/getVariable(8,k)*getVariable(6,k)+99*Math.pow(10,+2)/getVariable(1,k)/getVariable(2,k)*getVariable(7,k)/getVariable(4,k)+getVariable(6,k)/6*Math.pow(10,-1)/getVariable(8,k)-getVariable(1,k)/38*Math.pow(10,-2)*getVariable(6,k)-99*Math.pow(10,-1)/getVariable(5,k)/getVariable(5,k)*getVariable(2,k)*getVariable(3,k)*getVariable(3,k)/getVariable(6,k)/getVariable(5,k);
					break;
				case 20:
					result = 94*Math.pow(10,-2)*getVariable(7,k)-getVariable(3,k)*47*Math.pow(10,-2)-97*Math.pow(10,-3)*getVariable(7,k)-getVariable(5,k)+getVariable(6,k)/getVariable(7,k)*getVariable(8,k)*getVariable(8,k)*getVariable(8,k)-getVariable(8,k)*99*Math.pow(10,-2)/getVariable(5,k)*getVariable(1,k)*getVariable(1,k)/getVariable(5,k)/getVariable(6,k)*getVariable(7,k)-getVariable(2,k)/getVariable(1,k)+99*Math.pow(10,-9)*99*Math.pow(10,+4)+getVariable(8,k)*getVariable(8,k)*getVariable(5,k)/23*Math.pow(10,+2)/getVariable(7,k)+getVariable(6,k)*getVariable(8,k)/getVariable(7,k)/getVariable(7,k)*getVariable(3,k);
					break;
				case 21:
					result = 36*Math.pow(10,-1)*getVariable(8,k)+getVariable(9,k)/getVariable(4,k)-getVariable(3,k)/getVariable(8,k)*92*Math.pow(10,-4)*getVariable(4,k)+getVariable(5,k)+getVariable(6,k)*getVariable(6,k)/19*Math.pow(10,+8)/32*Math.pow(10,-5)/getVariable(5,k)/getVariable(5,k)-getVariable(2,k)/getVariable(5,k)-getVariable(9,k)/getVariable(8,k)/getVariable(4,k)-getVariable(2,k)/getVariable(3,k)/getVariable(3,k)*getVariable(5,k)*getVariable(5,k)/25*Math.pow(10,+2)/getVariable(7,k)+99*Math.pow(10,-3)/getVariable(9,k)/getVariable(9,k)*getVariable(3,k)*getVariable(6,k)/getVariable(8,k);
					break;
				case 22:
					result = 99*Math.pow(10,-2)+getVariable(7,k)-getVariable(5,k)-getVariable(4,k)-getVariable(1,k)/11*Math.pow(10,+2)/getVariable(4,k)+getVariable(8,k)*getVariable(9,k)/getVariable(4,k)*getVariable(2,k)/getVariable(7,k)/getVariable(9,k)*getVariable(6,k)*getVariable(6,k)/getVariable(7,k)+81*Math.pow(10,-4)*getVariable(4,k)*getVariable(5,k)+getVariable(5,k)/getVariable(8,k)/6*Math.pow(10,+6)*99*Math.pow(10,-8)/getVariable(7,k)*getVariable(8,k)*getVariable(6,k)-getVariable(7,k)/getVariable(5,k)/getVariable(6,k)*getVariable(7,k);
					break;
				case 23:
					result = getVariable(8,k)+getVariable(6,k)*26*Math.pow(10,-4)/1*Math.pow(10,+2)+getVariable(4,k)+53*Math.pow(10,-1)-getVariable(4,k)/getVariable(8,k)/getVariable(4,k)*getVariable(4,k)-getVariable(8,k)*99*Math.pow(10,-2)+3*Math.pow(10,+4)*49*Math.pow(10,-6)-getVariable(2,k)/getVariable(5,k)*getVariable(8,k);
					break;
				case 24:
					result = 36*Math.pow(10,-2)*getVariable(7,k)+getVariable(8,k)-getVariable(7,k)/11*Math.pow(10,-4)*getVariable(2,k)*getVariable(3,k)/getVariable(6,k)*getVariable(2,k)/getVariable(8,k)+getVariable(8,k)/getVariable(7,k)*getVariable(8,k)*getVariable(6,k)-getVariable(1,k)/getVariable(1,k)+getVariable(8,k)-getVariable(4,k)/getVariable(6,k)*73*Math.pow(10,-1)*getVariable(8,k)+getVariable(3,k)/21*Math.pow(10,+2)/getVariable(2,k)*getVariable(6,k)/getVariable(5,k)*getVariable(6,k)/getVariable(1,k);
					break;
				case 25:
					result = 95*Math.pow(10,-1)+getVariable(7,k)-getVariable(4,k)-54*Math.pow(10,-2)-getVariable(5,k)-getVariable(1,k)*getVariable(7,k)/getVariable(5,k)/getVariable(5,k)*getVariable(7,k)/getVariable(6,k)-99*Math.pow(10,-4)*getVariable(7,k)*getVariable(7,k)/getVariable(4,k)*getVariable(7,k)/getVariable(8,k)/getVariable(4,k)+7*Math.pow(10,-1)*getVariable(8,k)+getVariable(9,k)/18*Math.pow(10,+3)/15*Math.pow(10,+1)/64*Math.pow(10,-3)*getVariable(6,k)/getVariable(8,k)+getVariable(8,k);
					break;
				case 26:
					result = 44*Math.pow(10,-3)/16*Math.pow(10,+2)*getVariable(6,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k)/12*Math.pow(10,+3)*getVariable(1,k)/getVariable(6,k)/getVariable(4,k)-getVariable(2,k)/getVariable(6,k)-getVariable(8,k)/getVariable(6,k)*getVariable(8,k)/12*Math.pow(10,+8)/getVariable(6,k)/getVariable(6,k)/getVariable(6,k)*getVariable(1,k)/getVariable(5,k)+getVariable(9,k)*getVariable(8,k)/getVariable(1,k);
					break;
				case 27:
					result = getVariable(5,k)-getVariable(8,k)-73*Math.pow(10,+1)/getVariable(6,k)+getVariable(8,k)*getVariable(8,k)*getVariable(8,k)*getVariable(8,k)-getVariable(5,k)/getVariable(6,k)*getVariable(1,k)/getVariable(9,k)-getVariable(8,k)/getVariable(6,k)*getVariable(2,k)+getVariable(6,k)*getVariable(8,k)/getVariable(5,k)/getVariable(5,k)*getVariable(2,k)/8*Math.pow(10,-1)/47*Math.pow(10,+3)-getVariable(4,k)/getVariable(6,k)+getVariable(6,k)/getVariable(5,k)/getVariable(5,k)-getVariable(8,k)+99*Math.pow(10,-2)/getVariable(8,k)-99*Math.pow(10,-6)*getVariable(1,k)*getVariable(1,k)*getVariable(8,k);
					break;
				case 28:
					result = getVariable(8,k)*getVariable(2,k)/getVariable(1,k)+getVariable(7,k)+88*Math.pow(10,-2)-getVariable(4,k)-getVariable(5,k)+getVariable(9,k)/getVariable(7,k)*1*Math.pow(10,+1)+getVariable(8,k)/4*Math.pow(10,+2)/getVariable(9,k)+getVariable(8,k)-getVariable(7,k)*getVariable(7,k)/getVariable(5,k)/getVariable(5,k)-57*Math.pow(10,-5)*getVariable(7,k)*getVariable(1,k)+getVariable(8,k)+getVariable(6,k)/getVariable(8,k)/getVariable(3,k)*getVariable(6,k)/getVariable(7,k);
					break;
				case 29:
					result = getVariable(8,k)+getVariable(5,k)-getVariable(2,k)/getVariable(5,k)-getVariable(2,k)/getVariable(6,k)+12*Math.pow(10,-1)*getVariable(8,k)*getVariable(8,k)/getVariable(5,k)*getVariable(7,k)-95*Math.pow(10,-2)/12*Math.pow(10,+2)-13*Math.pow(10,-4)+getVariable(8,k)+getVariable(9,k)/getVariable(5,k)+getVariable(6,k)/getVariable(5,k)-getVariable(5,k)*getVariable(8,k)*getVariable(3,k)/getVariable(6,k)/getVariable(6,k)*getVariable(5,k)*99*Math.pow(10,-4)*getVariable(3,k)-getVariable(5,k)/getVariable(3,k)+getVariable(6,k)/getVariable(1,k)+getVariable(6,k)/getVariable(9,k)/getVariable(9,k);
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
