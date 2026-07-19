import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        System.out.println(task2(A, B));
        System.out.println(capitalize(A) + " " + capitalize(B));
    }

    private static String task2(String A, String B) {
        int n = A.length(), i = 0;

        while(i < n && A.charAt(i) == B.charAt(i)) i++;

        return (i == n || A.charAt(i) < B.charAt(i)) ? "No" : "Yes";
    }

    private static String capitalize(String s) {
        StringBuilder sb = new StringBuilder(s);

        sb.setCharAt(0, upperCase(sb.charAt(0)));

        return sb.toString();
    }

    private static char upperCase(char ch) {
        return ch < 'a' ? ch : (char)('A' + (ch - 'a'));
    }
}
