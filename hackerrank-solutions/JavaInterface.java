import java.util.Scanner;

interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here

class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n){
        int sum = n;
        for(int i = 1 ; i <= n/2 ; i++) if(n%i == 0) sum += i;

        return sum;
    }
}

public class JavaInterface {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");

        ImplementedInterfaceNames(my_calculator);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(my_calculator.divisor_sum(n) + "\n");
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
