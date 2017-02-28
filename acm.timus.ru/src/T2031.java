import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class T2031 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			Deque<Integer> result = new ArrayDeque<Integer>();
			
			for (int i = 1; i <= 99; ++i) {
				int f = i / 10;
				int s = i % 10;
				if (isValid(f) && isValid(s)) {
					result.push(10 * rotateDigit(s) + rotateDigit(f));
				} else {
					result.clear();
				}
				if (result.size() >= n)
					break;
			}
			
			if (result.size() < n) {
				outFile.println("Glupenky Pierre");
			} else {
				while (!result.isEmpty()) {
					outFile.print(String.format("%02d ", result.pop().intValue()));
				}
				outFile.println();
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

	static boolean isValid(int x) {
		return x == 0 || x == 1 || x == 8 || x == 6 || x == 9;
	}
	
	static int rotateDigit(int x) {
		switch (x) {
			case 6: return 9;
			case 9: return 6;
			default: return x;
		}
	}
}
