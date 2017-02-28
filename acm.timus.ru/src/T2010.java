package t2010;

import java.io.PrintStream;
import java.util.Scanner;

public class T2010 {
	
	public static int getKing(int n, int x, int y)
	{
		int count = 0;
		
		if (x + 1 <= n) count++;
		if (x + 1 <= n && y + 1 <= n) count++;
		if (x + 1 <= n && y - 1 > 0) count++;
		if (x - 1 > 0) count++;
		if (x - 1 > 0 && y + 1 <= n) count++;
		if (x - 1 > 0 && y - 1 > 0) count++;
		if (y - 1 > 0) count++;
		if (y + 1 <= n) count++;
		
		return count;
	}
	
	public static int getKnight(int n, int x, int y)
	{
		int count = 0;
		
		if (x + 2 <= n && y + 1 <= n) count++;
		if (x + 2 <= n && y - 1 > 0) count++;
		if (x - 2 > 0 && y + 1 <= n) count++;
		if (x - 2 > 0 && y - 1 > 0) count++;
		if (x + 1 <= n && y + 2 <= n) count++;
		if (x - 1 > 0 && y + 2 <= n) count++;
		if (x - 1 > 0 && y - 2 > 0) count++;
		if (x + 1 <= n && y - 2 > 0) count++;
		
		return count;
	}
	
	public static int getBishop(int n, int x, int y)
	{
		int count = 0;

		count += Math.min(n-x, n-y);
		count += Math.min(x-1, y-1);
		count += Math.min(n-x, y-1);
		count += Math.min(x-1, n-y);
		
		return count;
	}
	
	public static int getRook(int n, int x, int y)
	{
		int count = 0;
		
		count += n-x;		
		count += x-1;
		count += y-1;		
		count += n-y;
		
		return count;
	}
	
	public static int getQueen(int n, int x, int y)
	{
		return getBishop(n, x, y) + getRook(n, x, y);
	}

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();			
			int x = inFile.nextInt();
			int y = inFile.nextInt();
			
			outFile.println(String.format("King: %d", getKing(n, x, y)));
			outFile.println(String.format("Knight: %d", getKnight(n, x, y)));
			outFile.println(String.format("Bishop: %d", getBishop(n, x, y)));
			outFile.println(String.format("Rook: %d", getRook(n, x, y)));
			outFile.println(String.format("Queen: %d", getQueen(n, x, y)));
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
