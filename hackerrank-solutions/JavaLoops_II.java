import java.util.Scanner;

public class JavaLoops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        while(q-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a + b;

            for(int i = 0; i < n; i++){
                System.out.print(s+" ");
                s += b * Math.pow(2, i + 1);
            }

            System.out.println();
        }

        in.close();
    }
}
