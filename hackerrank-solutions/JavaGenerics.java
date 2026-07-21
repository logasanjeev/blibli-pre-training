public class JavaGenerics {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] nums = {1, 2, 3};
        String[] strs = {"Hello", "World"};

        printArray(nums);
        printArray(strs);
    }

    public static <T> void printArray(T[] array) {
        for(T a : array) System.out.println(a);
    }
}
