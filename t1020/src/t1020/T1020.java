// http://acm.timus.ru/problem.aspx?space=1&num=1020

// ��������� ����� ������ � ����������, ������� ����� ����� �� �����������.
// ���� ����������, �� �����, ��� ����� ����� ����� ����� ����� ���� � ����������� ����� � 180-�
// ��� � - ���� ����� ���������, ������������ ������ �������� �������.

package t1020;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class T1020 {
	
	// ���������� ����� ����� �������
	public static double len(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}
	
	// ������� ���������� ����� ����� �������
	public static double len2(double x1, double y1, double x2, double y2) {
		return Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2);
	}
	
	// ������� ���� � �������� � (x2, y2)
	public static double cosa(double x1, double y1, double x2, double y2, double x3, double y3) {
		return (len2(x1, y1, x2, y2) + len2(x2, y2, x3, y3) - len2(x1, y1, x3, y3)) / (2 * len(x1, y1, x2, y2) * len(x2, y2, x3, y3));
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			inFile.useLocale(Locale.US);
			
			int n = inFile.nextInt();
			double r = inFile.nextDouble();
			
			double[] x = new double[n];
			double[] y = new double[n];
			
			for (int i = 0; i < n; ++i) {
				x[i] = inFile.nextDouble();
				y[i] = inFile.nextDouble();
			}
			
			double l = 0;
			
			if (n == 1) {
				l = 2 * Math.PI * r;
			} else if (n == 2) {
				l = 2 * Math.PI * r + 2 * len(x[0], y[0], x[1], y[1]);
			} else {
				for (int i = 0; i < n; ++i) {
					int ind1 = i;
					int ind2 = (i+1)%n;
					int ind3 = (i+2)%n;
					
					double a = cosa(x[ind1], y[ind1], x[ind2], y[ind2], x[ind3], y[ind3]);
					
					// ����� ���� �� �����������
					double lr = r * Math.acos(-a);
					
					// ����� ���� �� ������� ����� ��������
					double ll = len(x[ind1], y[ind1], x[ind2], y[ind2]);
					
					l += lr + ll;
				}
			}
			
			outFile.println(String.format("%.2f", l, new Locale("en-US")));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
