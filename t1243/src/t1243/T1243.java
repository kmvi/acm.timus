// http://acm.timus.ru/problem.aspx?space=1&num=1243

// используется признак делимости Паскаля

package t1243;

import java.io.PrintStream;
import java.util.Scanner;

public class T1243 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			String num = inFile.nextLine();
			int[] r = new int[] {1, 3, 2, 6, 4, 5};
			
			long sum = 0;
			int cnt = 0;
			for (int i = num.length()-1; i >= 0; --i) {
				sum += r[cnt++ % 6] * (num.charAt(i) - 0x30);
			}
			
			outFile.println(sum % 7);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
