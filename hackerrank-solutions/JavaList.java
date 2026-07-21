import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-- > 0) list.add(sc.nextInt());

        int q = sc.nextInt();
        while(q-- > 0) {
            if(sc.next().equals("Insert")) list.add(sc.nextInt(), sc.nextInt());
            else list.remove(sc.nextInt());
        }
        sc.close();

        for(int num : list) System.out.print(num + " ");
    }
}
