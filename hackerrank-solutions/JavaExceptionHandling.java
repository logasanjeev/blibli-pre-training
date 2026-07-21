import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt(), y = sc.nextInt();
            int res = x / y;
            System.out.println(res);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
