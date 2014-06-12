package t1881;

import java.io.PrintStream;
import java.util.Scanner;

public class T1881 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int linesPerPage = inFile.nextInt();
			int chPerLine = inFile.nextInt();
			int wordsCount = inFile.nextInt();
			
			int pagesCount = 1;
			int chCount = 0;
			int linesCount = 1;
			for (int i = 0; i < wordsCount; ++i) {
				String w = inFile.next();
				int len = w.length();
				
				if (i == 0) {
					chCount += len;
				} else
					chCount += len+1;
				
				if (chCount > chPerLine) {
					chCount = len;
					linesCount++;
					if (linesCount > linesPerPage) {
						linesCount = 1;
						pagesCount++;
					}
				}
			}
			
			outFile.println(pagesCount);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
