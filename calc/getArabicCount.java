package calc;

public class getArabicCount extends calc {
	 public static int getCount (int n) {
		 int result = 1000;
		 for(int i = 0; i <= 10; i++) {     
			if (DataArr[n].equals(DIGITS[i][0])) {
				result = i;
			} else if (DataArr[n].equals(DIGITS[i][1])) {
				result = i;
			}
		 }
		 return result;
	 }
}
