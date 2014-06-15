package t1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1404 {

	public static void main(String[] args) {
		try {
			BufferedReader inFile = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			char[] msg = inFile.readLine().toCharArray();
			
			for (int i = msg.length-1; i >= 0; --i) {
				int chi = msg[i];
				
				chi -= (i == 0 ? 5+0x61 : (int)msg[i-1]);
				chi = (chi < 0 ? chi+26 : chi);
				chi %= 26;
				chi += 0x61;
				
				msg[i] = (char)chi;
			}
			
			outFile.println(String.valueOf(msg));
						
			outFile.flush();
		} catch (Exception e) {}
	}

}