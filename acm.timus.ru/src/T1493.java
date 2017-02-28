// http://acm.timus.ru/problem.aspx?space=1&num=1493

package t1493;

import java.io.PrintStream;
import java.util.Scanner;

public class T1493 {
	
	public static int sum(int n)
	{
		return (n%10) + ((n/10)%10) + (n/100);
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			String num = inFile.nextLine();
			int n1 = Integer.parseInt(num.substring(0, 3));
			int n2 = Integer.parseInt(num.substring(3));
			
			if (sum(n2) > sum(n1)) {
				if (sum(n1) == sum(n2-1))
					outFile.println("Yes");
				else
					outFile.println("No");
			} else {
				if (sum(n1) == sum(n2+1))
					outFile.println("Yes");
				else
					outFile.println("No");
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
