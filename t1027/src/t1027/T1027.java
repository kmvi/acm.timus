package t1027;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Stack;

public class T1027 {
	
	enum State
	{
		INIT, WORD, ARITHMETIC, COMMENT
	}
	
	public static boolean validate(StringBuilder sb)
	{
		Stack<Character> braces = new Stack<Character>();
		
		boolean valid = true;
		int cnt = 0;
		while (cnt < sb.length()) {
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		try {
			BufferedReader inFile = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
			
			/*StringBuilder str = new StringBuilder();
			String tmp = inFile.readLine();
			while (tmp != null) {
				str.append(tmp);
				str.append("\r\n");
				tmp = inFile.readLine();
			}
			
			tmp = str.toString();*/
			
			char next;
			State state = State.INIT;
			boolean valid = true;
			StringBuilder sb = null;
			Stack<State> prevStates = new Stack<State>();
			Stack<Character> braces = new Stack<Character>();
			
			HashSet<Character> sym = new HashSet<Character>();
			sym.add(Character.valueOf('='));
			sym.add(Character.valueOf('+'));
			sym.add(Character.valueOf('-'));
			sym.add(Character.valueOf('*'));
			sym.add(Character.valueOf('/'));
			//sym.add(Character.valueOf('('));
			//sym.add(Character.valueOf(')'));
			sym.add(Character.valueOf('0'));
			sym.add(Character.valueOf('1'));
			sym.add(Character.valueOf('2'));
			sym.add(Character.valueOf('3'));
			sym.add(Character.valueOf('4'));
			sym.add(Character.valueOf('5'));
			sym.add(Character.valueOf('6'));
			sym.add(Character.valueOf('7'));
			sym.add(Character.valueOf('8'));
			sym.add(Character.valueOf('9'));
			
			while ((next = (char)inFile.read()) != 65535) {
				if (state == State.INIT) {
					if (next == '(') {
						next = (char)inFile.read();
						if (next != 65535) {
							if (next == '*') {
								prevStates.push(state);
								state = State.COMMENT;
							} else {
								prevStates.push(state);
								state = State.ARITHMETIC;
								sb = new StringBuilder();
								sb.append(next);
							}
						} else {
							valid = false;
							break;
						}
					} else {
						//prevStates.push(state);
						state = State.WORD;
					}
				} else if (state == State.WORD) {
					if (next == '(') {
						next = (char)inFile.read();
						if (next != 65535) {
							if (next == '*') {
								prevStates.push(state);
								state = State.COMMENT;
							} else if (sym.contains(Character.valueOf(next))) {
								prevStates.push(state);
								braces.push(Character.valueOf('('));
								state = State.ARITHMETIC;								
							} else if (next == ')') {
								
							} else if (next == '(') {
								prevStates.push(state);
								braces.push(Character.valueOf('('));
								braces.push(Character.valueOf('('));
								state = State.ARITHMETIC;	
							} else {
								valid = false;
								break;
							}
						} else {
							valid = false;
							break;
						}
					}
				} else if (state == State.COMMENT) {
					if (next == '*') {
						next = (char)inFile.read();
						if (next != 65535) {
							if (next == ')') {
								if (prevStates.empty()) {
									valid = false;
									break;
								}
								state = prevStates.pop();
							}
						} else {
							valid = false;
							break;
						}
					}
				} else { // arithmetic
					if (next == ')') {
						if (braces.empty()) {
							valid = false;
							break;
						}
						
						braces.pop();
						
						if (braces.empty()) {
							if (prevStates.empty()) {
								valid = false;
								break;
							}
							state = prevStates.pop();
						}
					} else if (next == '(') {
						next = (char)inFile.read();
						if (next != 65535) {
							if (next == '(') {
								braces.push(Character.valueOf('('));
								braces.push(Character.valueOf('('));
							} else if (next == ')') {
								if (braces.empty()) {
									valid = false;
									break;
								}
								braces.pop();
							} else if (next == '*') {
								prevStates.push(state);
								state = State.COMMENT;
							} else if (!sym.contains(Character.valueOf(next))) {
								valid = false;
								break;
							} else {
								braces.push(Character.valueOf('('));
							}
						} else {
							valid = false;
							break;
						}
						
					} else if (!sym.contains(next)) {
						//sb.append(next);
						valid = false;
						break;
					}
				}
			}
			
			if (!braces.empty())
				valid = false;
			
			if (!prevStates.empty())
				valid = false;
			
			outFile.println(valid ? "YES" : "NO");
						
			outFile.flush();
		} catch (Exception e) {}
	}

}