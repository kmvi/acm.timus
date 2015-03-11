package t1740;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class T1740 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int l = inFile.nextInt();
			int k = inFile.nextInt();
			int h = inFile.nextInt();
			
			int minTime = (l / k) * h;
			int maxTime = minTime;
			if (l % k > 0)
				maxTime += h;
			
			outFile.println(String.format(new Locale("en-US"), "%.6f %.6f", (double)minTime, (double)maxTime));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
