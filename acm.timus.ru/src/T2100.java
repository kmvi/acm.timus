import java.io.PrintStream;
import java.util.Scanner;

public class T2100 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int cnt = 0;
			int n = inFile.nextInt();
			inFile.nextLine();
			
			for (int i = 0; i < n; ++i, ++cnt) {
				String s = inFile.nextLine();
				String[] parts = s.split("\\+");
				if (parts.length > 1)
					++cnt;
			}
			
			cnt += 2;
			if (cnt == 13)
				++cnt;
			
			outFile.println(100 * cnt);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
