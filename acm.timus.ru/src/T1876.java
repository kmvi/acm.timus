
import java.io.PrintStream;
import java.util.Scanner;

public class T1876 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int a = inFile.nextInt();
			int b = inFile.nextInt();
			
			int max;
			if (39*2 + 40 + (a-40)*2 + 1 > 2*b + 40) {
				max = 39*2 + 40 + (a-40)*2 + 1;
			} else {
				max = 2*b + 40;
			}
			
			outFile.println(max);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
