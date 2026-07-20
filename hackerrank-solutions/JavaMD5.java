import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(input.getBytes());

            BigInteger number = new BigInteger(1, hash);
            StringBuilder hashText = new StringBuilder(number.toString(16));

            while (hashText.length() < 32) {
                hashText.insert(0, '0');
            }

            System.out.println(hashText.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
