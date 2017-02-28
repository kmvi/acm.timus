package t1786;

import java.io.PrintStream;
import java.util.Scanner;

public class T1786 {
	
	public static int getMetric(String str1, String str2)
	{
		int result = str1.length() * 2;
		
		for (int i = 0; i < str1.length(); ++i) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			char uch1 = Character.toUpperCase(ch1);
			char uch2 = Character.toUpperCase(ch2);
			
			if (ch1 == ch2)
				result -= 2;
			else if (uch1 == uch2)
				result -= 1;
			else if ((ch1 != uch1 && ch2 != uch2) || (ch1 == uch1 && ch2 == uch2)) // буквы одного регистра
				result -= 1;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			String str = inFile.next();
			
			final String name = "Sandro";			
			
			int len = str.length() - name.length();
			int minMetric = Integer.MAX_VALUE;
			for (int i = 0; i <= len; ++i) {
				String part = str.substring(i, i + name.length());
				int curMetric = getMetric(name, part);
				if (minMetric > curMetric) {
					minMetric = curMetric;
				}
			}
			
			outFile.println(minMetric * 5);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
