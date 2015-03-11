package t1297;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T1297 {
	
	public static boolean isPalindrome(String str)
	{
		int n = str.length() / 2;
		for (int i = 0; i < n; ++i) {
			if (str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		//try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);			
			
			String str = inFile.next();
			Pattern p = Pattern.compile("((.)(?\\1)*\\2|.?)");
			Matcher m = p.matcher(str.subSequence(0, str.length()-1));			
			
			String maxPal = "";
			int maxLen = 1;
			for (int i = m.groupCount(); i > 0; --i) {
				String s = m.group(i);
				if (s.length() >= maxLen) {
					maxLen = s.length();
					maxPal = s;
				}
			}
			
			outFile.println(maxPal);
			
			inFile.close();
			outFile.close();
		//} catch (Exception ex) {}
	}

}
