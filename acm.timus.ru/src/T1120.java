
import java.io.PrintStream;
import java.util.Scanner;

public class T1120 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int N = inFile.nextInt();
			
			int p = (int)Math.floor((Math.sqrt(1.0 + 8.0 * N) - 1.0) / 2.0);
			double a = (double)N / p - (p - 1.0) / 2.0;
			
			while (Math.abs(a - (int)a) > 1e-6) {
				p--;
				a = (double)N / p - (p - 1.0) / 2.0;
			}
			
			outFile.println(String.format("%d %d\n", (int)a, p));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
