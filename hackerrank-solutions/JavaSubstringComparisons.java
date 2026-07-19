import java.util.Scanner;

public class JavaSubstringComparisons {
    private static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int n = s.length();

        for(int i = 1; i <= n - k; i++) {
            String curr = s.substring(i, i + k);

            if(small(curr, smallest)) smallest = curr;
            else if(!small(curr, largest)) largest = curr;
        }

        return smallest + "\n" + largest;
    }

    private static boolean small(String A, String B) {
        int n = A.length(), i = 0;

        while(i < n && A.charAt(i) == B.charAt(i)) i++;

        return i == n || A.charAt(i) < B.charAt(i);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
