// какая-то странная задача, все свелось к поиску самого
// часто встречающегося символа. я сначала думал, что нужно искать
// как минимум два подряд идущих символа.

package t1723;

import java.io.PrintStream;
import java.util.Scanner;

public class T1723 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			String src = inFile.next();
			int n = src.length();
			int[] w = new int[n];
			
			for (int i = 0; i < n; ++i) {
				char ch = src.charAt(i);
				for (int j = 0; j < n; ++j) {
					if (ch == src.charAt(j))
						w[i]++;
				}
			}
			
			int max = 0;
			int maxi = 1;
			for (int i = 0; i < n; ++i) {
				if (w[i] > max) {
					max = w[i];
					maxi = i;
				}
			}
			
			outFile.println(src.substring(maxi, maxi+1));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
