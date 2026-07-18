import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) return false;

        int[] freqs = new int[26];

        for(char ch : a.toCharArray()){
            if(ch < 'a') freqs[ch - 'A']++;
            else freqs[ch - 'a']++;
        }

        for(char ch : b.toCharArray()){
            if(ch < 'a') freqs[ch - 'A']--;
            else freqs[ch - 'a']--;
        }

        for(int freq : freqs) if(freq != 0) return false;

        return true;
    }

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
