import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T1612 {

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(System.in);
            PrintStream outFile = new PrintStream(System.out);
            
            StringBuilder b = new StringBuilder();
            int ch;
            while ((ch = System.in.read()) != -1) {
                b.append((char)ch);
            }
            
            String line = b.toString();
            int trolleybus = countWord(line, "trolleybus");
            int tram = countWord(line, "tram");
            
            if (trolleybus > tram) {
                outFile.println("Trolleybus driver");
            } else if (tram > trolleybus) {
                outFile.println("Tram driver");
            } else {
                outFile.println("Bus driver");
            }
            
            inFile.close();
            outFile.close();
        } catch (Exception ex) {}
    }
    
    static int countWord(String line, String word) {
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher match = pattern.matcher(line);
        int result = 0;
        while (match.find())
            ++result;
        return result;
    }

}
