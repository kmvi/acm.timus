// http://acm.timus.ru/problem.aspx?space=1&num=1000

import java.io.PrintStream;
import java.util.Scanner;

public class T1000 {

	public static void main(String[] args) {
		try
		{
			Scanner sIn = new Scanner(System.in);
			PrintStream psOut = new PrintStream(System.out);
			
			int a = sIn.nextInt();
			int b = sIn.nextInt();
			
			psOut.println(a + b);
			
			sIn.close();
			psOut.close();
		}
		catch (Exception e)
		{
		
		}
	}

}
