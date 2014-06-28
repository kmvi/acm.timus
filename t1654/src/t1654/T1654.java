// http://acm.timus.ru/problem.aspx?space=1&num=1654

// варианты с регулярными выражениями и переборами массивов слишком медленные
// поэтому используется стек

package t1654;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

public class T1654 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			LinkedList<Character> lst = new LinkedList<>();
			
			String src = inFile.next();
			
			int n = src.length();
			for (int i = 0; i < n; ++i) {
				char c = src.charAt(i);

				Character last = lst.peekLast();
				if (last != null && last.charValue() == c) {
					lst.removeLast();
				} else {
					lst.addLast(c);
				}
			}
			
			for (Character c: lst) {
				outFile.print(c);
			}
			
			outFile.println();
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
