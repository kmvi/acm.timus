
import java.io.PrintStream;
import java.util.Scanner;

public class T1581 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			
			int cur = -1;
			int cnt = 1;
			for (int i = 0; i < n-1; ++i) {
				int next = inFile.nextInt();
				if (next == cur) cnt++;
				else if (cur != -1) {
					outFile.print(cnt);
					outFile.print(' ');
					outFile.print(cur);
					outFile.print(' ');
					cur = next;
					cnt = 1;
				} else if (cur == -1) cur = next;
			}
			
			int next = inFile.nextInt();
			if (next == cur) {
				cnt++;
				outFile.print(cnt);
				outFile.print(' ');
				outFile.print(cur);
			} else if (cur != -1) {
				outFile.print(cnt);
				outFile.print(' ');
				outFile.print(cur);
				outFile.print(" 1 ");
				outFile.print(next);
			} else if (cur == -1) {
				outFile.print("1 ");
				outFile.print(next);
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
