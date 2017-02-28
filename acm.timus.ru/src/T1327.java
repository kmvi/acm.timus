// http://acm.timus.ru/problem.aspx?space=1&num=1327


import java.io.PrintStream;
import java.util.Scanner;

public class T1327 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int A = inFile.nextInt();
			int B = inFile.nextInt();
			int ans;
			
			if (A == B) {
				ans = A % 2;
			} else {
				if (A % 2 == 0)
					A++;
				
				if (B % 2 == 0)
					B--;
				
				ans = (B - A) / 2 + 1;
			}
			
			outFile.println(ans);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
