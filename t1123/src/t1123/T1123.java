// http://acm.timus.ru/problem.aspx?space=1&num=1123

package t1123;

import java.io.PrintStream;
import java.util.Scanner;

public class T1123 {
	
	// добавляет к числу в строке s число n (n - цифра)
	static String add(String s, int n) {
		char[] t = s.toCharArray();
		
		int c = 0;
		for (int i = t.length-1; i >= 0; --i) {
			int v = t[i] - 0x30;
			v += (i == t.length-1 ? n : 0) + c;
			if (v >= 10) {
				c = 1;
				v %= 10;
			} else c = 0;
			t[i] = (char)(v + 0x30);
		}
		
		StringBuilder b = new StringBuilder();
		b.append(t);
		
		if (c == 1) {
			b.insert(0, '1');
		}
		
		return b.toString();
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			String src = inFile.next();
			
			String left, right, fullLeft, rev;
			StringBuilder out = new StringBuilder();
			
			if (src.length() % 2 == 0) {
				left = src.substring(0, src.length()/2);
				right = src.substring(src.length()/2);
				rev = (new StringBuilder(left)).reverse().toString();
				if (rev.compareTo(right) < 0) {
					left = add(left, 1);
					rev = (new StringBuilder(left)).reverse().toString();
				}
				out.append(left);
				out.append(rev);
			} else {
				left = src.substring(0, src.length()/2);
				right = src.substring(src.length()/2+1);
				fullLeft = src.substring(0, src.length()/2+1);
				rev = (new StringBuilder(left)).reverse().toString();
				if (rev.compareTo(right) < 0) {
					fullLeft = add(fullLeft, 1);
					left = fullLeft.substring(0, fullLeft.length()-1);
					rev = (new StringBuilder(left)).reverse().toString();
				}
				out.append(fullLeft);
				out.append(rev);
			}
			
			outFile.println(out.toString().replaceFirst("^0+", "0"));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
