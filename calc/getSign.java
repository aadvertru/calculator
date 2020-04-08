package calc;

public class getSign extends calc {
	public static int getSignAndOperate () {
		int answer;
		if (DataArr[1].equals("+")) {
		    answer = getArabicCount.getCount(0) + getArabicCount.getCount(2);
		} else if (DataArr[1].equals("-")) {
				answer = getArabicCount.getCount(0) - getArabicCount.getCount(2);
		} else if (DataArr[1].equals("*")) {
			   answer = getArabicCount.getCount(0) * getArabicCount.getCount(2);
		} else if (DataArr[1].equals("/")) {
			   answer = getArabicCount.getCount(0) / getArabicCount.getCount(2);
		} else {
			answer = 1000;
		   //System.out.println("какой-то неправильный знак ");
		}
		return answer;
	}
}