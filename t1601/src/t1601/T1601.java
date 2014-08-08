package t1601;

import java.io.PrintStream;
import java.util.Scanner;

public class T1601 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			StringBuffer buf = new StringBuffer();
			while (inFile.hasNext()) {
				buf.append(inFile.nextLine());
				buf.append('\n');
			}
			
			char[] chs = buf.toString().toLowerCase().toCharArray();
			
			boolean end = true;
			for (int i = 0; i < chs.length; ++i) {				
				if (chs[i] == '!' || chs[i] == '.' || chs[i] == '?') {
					end = true;
				} else if (end && Character.isAlphabetic(chs[i])) {
					chs[i] = Character.toUpperCase(chs[i]);
					end = false;
				}
			}
			
			outFile.println(chs);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
