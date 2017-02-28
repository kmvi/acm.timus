
import java.io.PrintStream;
import java.util.Scanner;

public class T1864 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			double[] a = new double[n];
			double v = 0;

			for (int i = 0; i < n; ++i) {
				a[i] = inFile.nextInt();
				v += a[i];
			}
			
			v /= (n+1);
			
			double sum = 0;
			for (int i = 0; i < n; ++i) {
				a[i] -= v;
				if (a[i] < 0)
					a[i] = 0;
				sum += a[i];
			}
			
			for (int i = 0; i < n; ++i) {
				// fucking ieee 754
				// 4.999999999 rounded to 4, so adding a small constant is significant
				a[i] = (int)Math.floor(100.0 * (Math.abs(sum) < 1e-6 ? 0 : a[i] / sum) + 1E-6);
			}
			
			for (int i = 0; i < n-1; ++i) {
				outFile.print((int)a[i]);
				outFile.print(" ");
			}
			
			outFile.print((int)a[n-1]);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
