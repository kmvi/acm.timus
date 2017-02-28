
import java.io.PrintStream;
import java.util.Scanner;

public class T1636 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int T1 = inFile.nextInt();
			int T2 = inFile.nextInt();
			
			int sum = 0;
			for (int i = 0; i < 10; ++i) {
				sum += inFile.nextInt();
			}
			
			if (T1 <= T2-20*sum)
				outFile.println("No chance.");
			else
				outFile.println("Dirty debug :(");
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
