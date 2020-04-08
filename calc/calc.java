package calc;

public class calc {
 final static String [][] DIGITS = {{"0","none"}, {"1","I"}, {"2","II"}, {"3","III"}, {"4","IV"}, {"5","V"}, {"6","VI"}, {"7","VII"}, {"8","VIII"}, {"9", "IX"}, {"10", "X"}, {"11", "XI"}, {"12", "XII"}, {"13", "XIII"}, {"14", "XIV"}, {"15", "XV"}, {"16", "XVI"}, {"17", "XVII"}, {"18", "XVIII"}, {"19", "XIX"}, {"20", "XX"}}; 
 public static String[] DataArr = Parse.getData();
  
 
 public static void main(String[] args) {
  
  if (	isArabic.isArabic(0) == isArabic.isArabic(2) && 
		getArabicCount.getCount(0) != 1000 && 
		getArabicCount.getCount(2) != 1000 && 
		DataArr.length == 3) {

	  //выводим ответ
	  	if (isArabic.isArabic(0) == true) {
	  		System.out.println(getSign.getSignAndOperate());
	  	} else {
	  		System.out.println(DIGITS[getSign.getSignAndOperate()][1]);
	  	}
	 
	} else {
		System.out.println("Тут что-то не так, ожидается ввод типа 2 + 3 или I + V");
	}
   
}
}