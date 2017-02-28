
import java.io.PrintStream;
import java.util.Scanner;

public class T1149 {
	
	static String An(int n) {
		int m = n-1;
		StringBuilder b = new StringBuilder();
		b.append(String.format("sin(%d)", n));
		
		for (int i = n; i >= 1; --i) {
			if (m != 0) {
				b.insert(0, String.format("sin(%d%c", m, i % 2 == 0 ? '-' : '+'));
				b.append(")");
			}
			
			m--;
		}
		
		return b.toString();
	}
	
	static String Sn(int n) {
		int m = n-1;
		StringBuilder b = new StringBuilder();
		
		b.append(String.format("%s+%d", An(1), n));
		
		for (int i = 2; i <= n; ++i) {
			if (m > 0) {
				b.insert(0, "(");
				b.append(String.format(")%s+%d", An(i), m));
			}
			
			m--;
		}
		
		return b.toString();
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			outFile.println(Sn(inFile.nextInt()));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
