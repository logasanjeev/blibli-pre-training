import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String a = sc.next(), b = sc.next();
        sc.close();

        BigInteger num1 = new BigInteger(a), num2 = new BigInteger(b);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}
