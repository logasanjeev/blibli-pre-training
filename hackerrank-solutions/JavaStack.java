import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String []argh) {
		Scanner sc = new Scanner(System.in);

        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

		while (sc.hasNext()) {
			String input=sc.next();

            //Complete the code

            Stack<Character> stack = new Stack<>();
            boolean res = true;

            for(char ch : input.toCharArray()) {
                if(map.containsKey(ch)) stack.push(ch);
                else if(!stack.isEmpty() && map.get(stack.peek()) == ch) stack.pop();
                else {
                    res = !res;
                    break;
                }
            }
            System.out.println(res && stack.isEmpty());
        }

        sc.close();
    }
}
