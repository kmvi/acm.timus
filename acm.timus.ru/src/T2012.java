
import java.io.PrintStream;
import java.util.Scanner;

public class T2012 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int f = inFile.nextInt();			
			int time = 4 * 60 - 45 * (12 - f);
			
			outFile.println(time < 0 ? "NO" : "YES");
			
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
