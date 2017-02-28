
import java.io.PrintStream;
import java.util.Scanner;

public class T1457 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			
			long sum = 0;
			for (int i = 0; i < n; ++i) {
				sum += inFile.nextLong();
			}
			
			outFile.println(String.format("%.6f", (double)sum / n));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
