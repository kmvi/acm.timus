import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class T2073 {

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(System.in);
            PrintStream outFile = new PrintStream(System.out);
            
            int contestCount = inFile.nextInt();
            inFile.nextLine();
            
            ArrayList<Contest> result = new ArrayList<Contest>();
            while (contestCount-- > 0) {
                Contest c = new Contest();
                c.name = inFile.nextLine();
                c.date = inFile.nextLine();

                int problemCount = inFile.nextInt();
                int sendCount = inFile.nextInt();
                inFile.nextLine();
                
                c.problems = new char[problemCount];
                for (int i = 0; i < c.problems.length; ++i)
                    c.problems[i] = '.';
                
                while (sendCount-- > 0) {
                    parseSend(c.problems, inFile.nextLine());
                }
                
                result.add(c);
            }
            
            outFile.println("+------------------------------+--------+-------------+");
            outFile.println("|Contest name                  |Date    |ABCDEFGHIJKLM|");
            
            for (Contest c : result) {
                outFile.println("+------------------------------+--------+-------------+");
                outFile.printf("|%-30s|%8s|%13s|", c.name, c.date, c.getProblems());
                outFile.println();
            }
            
            outFile.println("+------------------------------+--------+-------------+");
            
            inFile.close();
            outFile.close();
        } catch (Exception ex) {}
    }
    
    static void parseSend(char[] result, String send) {
        String[] parts = send.split(" ", 2);
        int index = parts[0].charAt(0) - 'A';
        if (parts[1].equals("Accepted")) {
            result[index] = 'o';
        } else if (result[index] != 'o') {
            result[index] = 'x';
        }
    }
    
    static class Contest {
        String name;
        String date;
        char[] problems;
        
        public String getProblems() {
            char[] result = new char[13];
            for (int i = 0; i < result.length; ++i)
                result[i] = ' ';
            for (int i = 0; i < problems.length; ++i)
                result[i] = problems[i];
            return new String(result);
        }
    }

}
