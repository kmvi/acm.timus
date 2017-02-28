// http://acm.timus.ru/problem.aspx?space=1&num=1712


import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

public class T1712 {
	
	public static void rotate(byte[][] mask) {
		byte[][] tmp = new byte[4][];
		
		for (int i = 0; i < 4; ++i)
			tmp[i] = Arrays.copyOf(mask[i], 4);
		
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 4; ++j) {
				mask[j][3-i] = tmp[i][j];
			}
		}
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			byte[][] mask = new byte[4][4];
			char[][] chr = new char[4][4];
			
			for (int i = 0; i < 4; ++i) {
				String ln = inFile.nextLine();
				for (int j = 0; j < 4; ++j) {
					mask[i][j] = (byte)(ln.charAt(j) == '.' ? 0 : 1);
				}
			}
			
			for (int i = 0; i < 4; ++i) {
				String ln = inFile.nextLine();
				for (int j = 0; j < 4; ++j) {
					chr[i][j] = ln.charAt(j);
				}
			}
			
			StringBuilder answ = new StringBuilder();
			
			for (int n = 0; n < 4; ++n) {
				for (int i = 0; i < 4; ++i) {
					for (int j = 0; j < 4; ++j) {
						if (mask[i][j] == 1) {
							answ.append(chr[i][j]);
						}
					}
				}
				
				rotate(mask);
			}
			
			outFile.println(answ.toString());
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
