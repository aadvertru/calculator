package calc;

public class isArabic extends calc {
	 public static boolean isArabic (int n) {
		  boolean isArabic = false;
		  
		   for(int i = 0; i <= 10; i++) {    
		   if (DataArr[n].equals(DIGITS[i][0])) {
			   return isArabic = true;
		   }
		  }
		  return isArabic;
		 }
}
