
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class T2023 {

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(System.in);
			PrintStream outFile = new PrintStream(System.out);
			
			String[] c1 = new String[] {
					"ALICE", "ARIEL", "AURORA",
					"PHIL", "PETER", "OLAF",
					"PHOEBUS", "RALPH", "ROBIN"
			};
			
			String[] c2 = new String[] {
					"BAMBI", "BELLE", "BOLT",
					"MULAN", "MOWGLI", "MICKEY",
					"SILVER", "SIMBA", "STITCH"
			};
			
			String[] c3 = new String[] {
					"DUMBO", "GENIE", "JIMINY",
					"KUZKO", "KIDA", "KENAI",
					"TARZAN", "TIANA", "WINNIE"
			};
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			Arrays.sort(c3);
			
			int n = inFile.nextInt();
			int curC = 0, count = 0;
			for (int i = 0; i < n; ++i) {
				int newCurC = curC;
				String adr = inFile.next().toUpperCase();
				if (Arrays.binarySearch(c1, adr) >= 0) {
					newCurC = 0;
				} else if (Arrays.binarySearch(c2, adr) >= 0) {
					newCurC = 1;
				} else if (Arrays.binarySearch(c3, adr) >= 0) {
					newCurC = 2;
				}
				
				count += Math.abs(curC - newCurC);
				curC = newCurC;
			}
			
			outFile.println(count);
			
			inFile.close();
			outFile.close();
		} catch (Exception ex) {}
	}

}
