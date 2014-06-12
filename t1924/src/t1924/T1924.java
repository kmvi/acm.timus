// http://acm.timus.ru/problem.aspx?space=1&num=1924

// �� �����, ����� ���� �������, ������� ��� �������� � �����������
// �������� ��� ���������� ����� 1..n

package t1924;

import java.io.PrintStream;
import java.util.Scanner;

public class T1924 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			int k = n*(n+1)/2;
			
			if (k % 2 == 0) {
				outFile.println("black");
			} else {
				outFile.println("grimy");
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
