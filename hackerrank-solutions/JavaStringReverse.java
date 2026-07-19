import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int i = 0, j = A.length() - 1;

        while(i < j) {
            if(A.charAt(i++) != A.charAt(j--)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
