package t1638;

import java.io.PrintStream;
import java.util.Scanner;

public class T1638 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			long h = inFile.nextInt();
			long w = inFile.nextInt();
			long start = inFile.nextInt();
			long stop = inFile.nextInt();
			
			long result;
			if (start < stop) {
				long t = (stop - start >= 1) ? (stop - start - 1) * (h + w * 2) : 0;
				result = w + t + w;
			} else if (start == stop) {
				result = h;
			} else {
				long t = (start - stop >= 1) ? (start - stop - 1) * (h + w * 2) : 0;
				result = h + w + t + w + h;
			}
			
			outFile.println(result);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
