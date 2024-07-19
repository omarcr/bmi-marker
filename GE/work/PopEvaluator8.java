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
					if(((354.428*getVariable(62,k)*getVariable(119,k)+getVariable(56,k)*((3.273-getVariable(20,k)-getVariable(3,k))+48.896)*3.120>=47.374)||((7.540-(getVariable(58,k)*5.406)>((getVariable(172,k)*2.204)+(getVariable(185,k)*9.285)*902.547))&&((getVariable(43,k)-(getVariable(53,k)-getVariable(168,k))+(getVariable(23,k)-getVariable(14,k))<getVariable(52,k))&&((getVariable(134,k)<(getVariable(54,k)+getVariable(53,k)))||((getVariable(62,k)>=getVariable(88,k))&&((getVariable(108,k)<getVariable(104,k))&&(getVariable(182,k)>=getVariable(78,k))))))))){result=0;}else{result=1;}
					break;
				case 1:
					if(((((getVariable(62,k)+(50.220-(getVariable(48,k)+getVariable(3,k))))*((getVariable(14,k)-getVariable(48,k)-(968.844+getVariable(6,k)))+978.140))+36.526>87.760)||((getVariable(152,k)>getVariable(73,k)-(1.168*getVariable(72,k))+((getVariable(186,k)+getVariable(80,k))+getVariable(117,k)*997.628))&&((getVariable(101,k)>=getVariable(181,k)*(3.064*getVariable(36,k)))&&((getVariable(14,k)<5.818)&&(((getVariable(182,k)-getVariable(45,k))<=getVariable(119,k))||((getVariable(47,k)<=getVariable(117,k))&&(getVariable(12,k)<3.813)))))))){result=0;}else{result=1;}
					break;
				case 2:
					if(((getVariable(3,k)-(getVariable(119,k)*(32.008-(getVariable(48,k)*getVariable(102,k))*getVariable(12,k)-getVariable(9,k)*30.103))<040.368)&&((getVariable(100,k)>=(getVariable(48,k)*(getVariable(15,k)-(618.877*getVariable(145,k)))))&&((getVariable(161,k)*getVariable(76,k)>getVariable(119,k))||((5.548-(getVariable(52,k)+getVariable(48,k))>=(getVariable(34,k)*662.360))&&((getVariable(90,k)<getVariable(103,k))||((getVariable(35,k)<00.900)||(getVariable(22,k)>getVariable(137,k))))))))){result=0;}else{result=1;}
					break;
				case 3:
					if(((9.435-96.191+(getVariable(3,k)+getVariable(3,k))-getVariable(150,k)<=(2.879+getVariable(35,k)*(getVariable(13,k)-105.865+(72.835*getVariable(181,k)))))||((2.694*(getVariable(62,k)+getVariable(36,k)-getVariable(33,k))*(getVariable(49,k)*getVariable(76,k))>=766.655)||(((50.799+getVariable(41,k))<=00.369)||(((151.757*getVariable(24,k))>22.271)||((getVariable(62,k)>=4.789)&&((getVariable(167,k)>getVariable(102,k))||(getVariable(84,k)<=getVariable(79,k))))))))){result=0;}else{result=1;}
					break;
				case 4:
					if((((9.178*((getVariable(5,k)-getVariable(117,k))-(getVariable(12,k)*getVariable(112,k)))-(getVariable(139,k)+18.236)-getVariable(7,k)*getVariable(52,k)+5.856)>=(getVariable(20,k)*(004.990-getVariable(62,k)*getVariable(119,k)-getVariable(62,k))*545.685))&&((getVariable(42,k)>getVariable(169,k)-getVariable(64,k)-getVariable(57,k)*(18.936-getVariable(17,k)))&&(((getVariable(34,k)*getVariable(151,k)*916.568)<=getVariable(89,k))&&((068.706+getVariable(44,k)>(getVariable(3,k)-getVariable(48,k)))&&((getVariable(78,k)*0.661>=getVariable(120,k))&&((getVariable(123,k)>getVariable(22,k))||(getVariable(113,k)<=getVariable(153,k))))))))){result=0;}else{result=1;}
					break;
				case 5:
					if((((getVariable(142,k)-(((getVariable(17,k)-929.158)+18.038)+(825.253-(getVariable(66,k)*getVariable(74,k))))+04.980)>(getVariable(2,k)*(getVariable(9,k)+(getVariable(3,k)*(getVariable(45,k)+2.467)))))&&((66.420-getVariable(52,k)+getVariable(56,k)*getVariable(89,k)+62.349+getVariable(39,k)-75.709>getVariable(3,k))&&(((getVariable(95,k)-getVariable(89,k)-((getVariable(118,k)+getVariable(191,k))*605.665))<=((getVariable(62,k)-getVariable(11,k))*5.764))&&((getVariable(23,k)<=getVariable(76,k)-98.521)||(((getVariable(88,k)+getVariable(188,k))>=getVariable(34,k))&&((getVariable(35,k)<=getVariable(166,k))&&(getVariable(123,k)>=getVariable(113,k))))))))){result=0;}else{result=1;}
					break;
				case 6:
					if(((getVariable(3,k)-((getVariable(181,k)-getVariable(52,k))*006.656+7.536+(4.982*(getVariable(63,k)*(getVariable(46,k)-getVariable(88,k)))))<=28.885)&&(((getVariable(95,k)+getVariable(109,k)*getVariable(86,k)-getVariable(9,k)-57.783)+getVariable(55,k)+(2.661-getVariable(19,k))<366.531)||((getVariable(59,k)*getVariable(189,k)<(getVariable(16,k)-getVariable(108,k)+getVariable(171,k)))||(((getVariable(46,k)-(getVariable(130,k)+getVariable(62,k)))<getVariable(20,k)*getVariable(88,k))&&((getVariable(163,k)+getVariable(172,k)<getVariable(96,k))||((getVariable(40,k)>67.482)||(getVariable(61,k)>getVariable(146,k))))))))){result=0;}else{result=1;}
					break;
				case 7:
					if((((getVariable(52,k)*(8.155+getVariable(132,k)*(673.656-getVariable(79,k))-1.646))<=(getVariable(106,k)-((getVariable(82,k)+getVariable(3,k)-2.592)-41.934-getVariable(131,k)*6.525)))||((getVariable(2,k)<=((7.229*getVariable(62,k)*getVariable(57,k))+(getVariable(158,k)+getVariable(23,k))*05.342))&&((getVariable(35,k)+getVariable(9,k)<getVariable(119,k))&&((getVariable(112,k)>=getVariable(142,k))||((getVariable(164,k)<=getVariable(74,k))||((getVariable(60,k)>=7.464)||(getVariable(129,k)>8.250)))))))){result=0;}else{result=1;}
					break;
				case 8:
					if(((23.783*((getVariable(20,k)+getVariable(15,k)+(142.063*getVariable(34,k)))+(928.458*(getVariable(77,k)-getVariable(24,k)+getVariable(117,k))))<=(2.529*getVariable(63,k)*getVariable(134,k)*361.148-getVariable(159,k)-(getVariable(164,k)+getVariable(52,k))*913.178))||(((getVariable(68,k)*((getVariable(187,k)*57.390)+21.378))<=72.707)&&(((getVariable(7,k)+(getVariable(57,k)*8.045)-getVariable(68,k))>=(getVariable(48,k)*getVariable(137,k)+7.841))||(((696.040-getVariable(85,k))<=96.579)||((87.042+getVariable(62,k)>=93.751)||((getVariable(25,k)>=16.765)||(getVariable(183,k)<getVariable(118,k))))))))){result=0;}else{result=1;}
					break;
				case 9:
					if(((getVariable(191,k)-getVariable(13,k)+8.687*00.708<=(getVariable(103,k)+21.038-getVariable(52,k)-getVariable(3,k)+021.590))||(((getVariable(189,k)+getVariable(109,k)+getVariable(119,k)*508.301-getVariable(73,k)*getVariable(2,k))>1.755)&&(((getVariable(53,k)+86.320+getVariable(129,k)*851.174)<(getVariable(63,k)*597.379))||(((0.127+getVariable(23,k))+0.234<(getVariable(175,k)-getVariable(12,k)))||((getVariable(80,k)>getVariable(29,k))&&((getVariable(127,k)>=getVariable(59,k))||(getVariable(123,k)>getVariable(178,k))))))))){result=0;}else{result=1;}
					break;
				case 10:
					if(((getVariable(150,k)>=(7.576*getVariable(3,k)-79.848-348.095)+87.535)||((getVariable(117,k)<(getVariable(24,k)+getVariable(126,k)-(getVariable(85,k)*(getVariable(52,k)-getVariable(171,k)))))||(((65.526*getVariable(50,k))<(getVariable(45,k)*getVariable(3,k)*getVariable(47,k)))&&((getVariable(179,k)+getVariable(141,k)<getVariable(166,k))||((getVariable(162,k)<getVariable(59,k))||((getVariable(2,k)<getVariable(117,k))||(getVariable(38,k)>=getVariable(40,k))))))))){result=0;}else{result=1;}
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