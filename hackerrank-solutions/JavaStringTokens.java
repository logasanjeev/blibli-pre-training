import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        s = s.trim();
        if(s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] tokens = s.split("[ ,.'!@_?]+");

        System.out.println(tokens.length);
        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
