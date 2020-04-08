package calc;

import java.util.Scanner;
public class Parse {
	// получаем пользовательский ввод
	static String[] getData () {
	 String [] DataArr = new String [3];
	 Scanner Data = new Scanner(System.in);
	  for(int i = 0; i <= 2; i++) {
	   DataArr[i] = Data.next();
	  }
	  Data.close();
	  return DataArr;
	}

}
