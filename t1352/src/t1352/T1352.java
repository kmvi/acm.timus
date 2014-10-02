// странная задача, часть степеней есть уже в условии
// вычислять на лету числа Мерсенна, понятно, нельзя )

package t1352;

import java.io.PrintStream;
import java.util.Scanner;

public class T1352 {
	
	public static final int[] Ns = new int[] {
		2, 3, 5, 7, 13, 17, 19, 31, 61,
		89, 107, 127, 521, 607, 1279,
		2203, 2281, 3217, 4253, 4423,
		9689, 9941, 11213, 19937, 21701,
		23209, 44497, 86243, 110503, 132049,
		216091, 756839, 859433, 1257787,
		1398269, 2976221, 3021377, 6972593
	};

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int T = inFile.nextInt();
			int[] ans = new int[T];
			for (int i = 0; i < T; ++i) {
				int N = inFile.nextInt();
				ans[i] = Ns[N-1];
			}
			
			for (int i = 0; i < T; ++i) {
				outFile.println(ans[i]);
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
