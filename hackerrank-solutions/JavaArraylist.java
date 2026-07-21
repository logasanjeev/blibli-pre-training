import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();

        while(n-- > 0) {
            int d = sc.nextInt();
            List<Integer> l = new ArrayList<>();

            while(d-- > 0) l.add(sc.nextInt());
            list.add(l);
        }

        n = sc.nextInt();
        while(n-- > 0) {
            int x = sc.nextInt() - 1, y = sc.nextInt();

            if(list.get(x).size() < y) System.out.println("ERROR!");
            else System.out.println(list.get(x).get(y-1));
        }

        sc.close();
    }
}
