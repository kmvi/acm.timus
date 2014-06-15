package t1224;

import java.io.PrintStream;
import java.util.Scanner;

public class T1224 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			long rows = inFile.nextLong();
			long cols = inFile.nextLong();
			long p;
			
			if (rows == 1) {
				p = 0;
			} else if (cols == 1) {
				p = 1;
			} else {
				p = 0;
				
				while (rows > 2 && cols > 2) {
					p += 4;
					rows -= 2;
					cols -= 2;
				}
				
				if (rows > 1 && cols == 1)
					p += 2;
				else if (rows == 1 && cols > 0)
					p++;
				
				p--;
			}
			
			outFile.println(p);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
