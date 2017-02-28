
import java.io.PrintStream;
import java.util.Scanner;

public class T1925 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int k = inFile.nextInt();
			
			int sumExpected = k - 2;
			int sumFact = 0;
			for (int i = 0; i < n; ++i) {
				sumExpected += (inFile.nextInt() - 2);
				sumFact += inFile.nextInt();
			}
			
			if (sumExpected >= sumFact)
				outFile.println(sumExpected - sumFact);
			else
				outFile.println("Big Bang!");
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
