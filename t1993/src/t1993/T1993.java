package t1993;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.*;

public class T1993 {

	public static void main(String[] args) {
		//try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			String ln = inFile.nextLine();
			
			Matcher delim = Pattern.compile("(\\,\\s+\\w+)").matcher(ln);
			Matcher first = Pattern.compile("\\{(.+?)\\}").matcher(ln);
			Matcher second = Pattern.compile("\\((.+?)\\)").matcher(ln);
			Matcher third = Pattern.compile("\\[(.+?)\\]").matcher(ln);
			
			StringBuffer out = new StringBuffer();
			first.find();
			out.append(first.group(0));
			out.append(" ");
			out.append(second.group(1));
			out.append(" ");
			out.append(third.group(1));
			if (delim.matches()) {
				
			} else {
				
			}
			
			outFile.println(out);
			
			inFile.close();
			outFile.close();
		//} catch (Exception ex) {}
	}

}
