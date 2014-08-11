package t1644;

import java.io.PrintStream;
import java.util.Hashtable;
import java.util.Scanner;

public class T1644 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			int n = inFile.nextInt();
			Hashtable<Integer, Boolean> cnt = new Hashtable<>();
			
			if (n == 0) {
				outFile.println(10);
			} else if (n == 1) {
				int c = inFile.nextInt();
				String str = inFile.next();
				boolean s =str.compareTo("satisfied") == 0;
				if (s)
					outFile.println(c);
				else
					outFile.println(10);
			} else {			
				boolean inconsistent = false;
				for (int i = 0; i < n; ++i) {
					int c = inFile.nextInt();
					String str = inFile.next();
					Boolean s = Boolean.valueOf(str.compareTo("satisfied") == 0);
					
					if (!cnt.containsKey(c)) {
						cnt.put(c, s);
					} else {
						if (s.booleanValue() != cnt.get(c).booleanValue())
							inconsistent = true;
					}
				}
				
				if (!inconsistent) {
					int minSatis = Integer.MAX_VALUE, maxHung = -1;
					for (Integer c: cnt.keySet()) {
						boolean v = cnt.get(c).booleanValue();
						if (v) {
							if (minSatis > c.intValue())
								minSatis = c.intValue();
						} else {
							if (maxHung < c.intValue())
								maxHung = c.intValue();
						}
					}
					
					if (maxHung > minSatis)
						outFile.println("Inconsistent");
					else
						outFile.println(minSatis);
				} else
					outFile.println("Inconsistent");
			}
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
