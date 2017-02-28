
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class T1161 {
	
	// в массиве только один ненулевой элемент, и он стоит на последнем месте
	// массив отсортирован
	public static boolean hasOnlyOneNumber(double[] arr)
	{
		return (Math.abs(arr[arr.length - 2]) < 1e-6);
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int N = inFile.nextInt();
			double[] w = new double[N];
			
			for (int i = 0; i < N; ++i) {
				w[i] = inFile.nextInt();
			}
			
			if (N > 1) {			
				Arrays.sort(w);
				while (!hasOnlyOneNumber(w)) {
					w[N-1] = 2.0 * Math.sqrt(w[N-1] * w[N-2]);
					w[N-2] = 0.0;
					Arrays.sort(w);
				}
			}
			
			outFile.println(String.format(new Locale("en-US"), "%.2f\n", w[N-1]));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
