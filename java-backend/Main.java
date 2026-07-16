import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // testMyList();

        // testMyGenericList();

        testEmployeeList();
    }

    // private static void testMyList() {
    //     MyList list1 = new MyList();

    //     list1.add(1);
    //     list1.add(2);
    //     list1.add(3);
    //     System.out.println(list1.toString());

    //     list1.deleteByIndex(2);
    //     System.out.println(list1.toString());

    //     System.out.println(list1.deleteByValue(1));
    //     System.out.println(list1.toString());

    //     try{
    //         list1.deleteByIndex(1);
    //     } catch(IndexOutOfBoundsException e) {
    //         System.out.println(e);
    //     }

    //     MyList list2 = new MyList(), list3 = new MyList();

    //     for(int i = 1; i <= 150; i++) {
    //         list2.add(i);
    //         list3.add(i);
    //     }

    //     System.out.println(list2.equals(list3));
    // }

    // private static void testMyGenericList() {
    //     MyGenericList<Integer> list1 = new MyGenericList<>();

    //     list1.add(1);
    //     list1.add(2);
    //     list1.add(3);
    //     System.out.println(list1.toString());

    //     list1.deleteByIndex(2);
    //     System.out.println(list1.toString());

    //     System.out.println(list1.deleteByValue(1));
    //     System.out.println(list1.toString());

    //     try{
    //         list1.deleteByIndex(1);
    //     } catch(IndexOutOfBoundsException e) {
    //         System.out.println(e);
    //     }

    //     MyGenericList<String> list2 = new MyGenericList<>(), list3 = new MyGenericList<>();

    //     for(int i = 1; i <= 150; i++) {
    //         list2.add((char) i + "" + (char) i + 1);
    //         list3.add((char) i + "" + (char) i + 1);
    //     }

    //     System.out.println(list2);

    //     System.out.println(list2.equals(list3));
    // }

    public static void testEmployeeList() {
        MyGenericList<Employee> list1 = new MyGenericList<>();

        Employee emp1 = new Employee("E001", "Alice", 23, new Date());
        Employee emp2 = new Employee("E002", "Bob", 25, new Date());
        Employee emp3 = new Employee("E003", "Charlie", 22, new Date());

        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        System.out.println(list1);

        System.out.println(list1.get(1));

        System.out.println(list1.deleteByValue(emp2));
        System.out.println(list1);

        list1.deleteByIndex(0);
        System.out.println(list1);

        try {
            list1.deleteByIndex(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        MyGenericList<Employee> list2 = new MyGenericList<>();
        list2.add(new Employee("E003", "Charlie", 22, emp3.getDateOfJoining()));

        System.out.println(list1.equals(list2));
    }
}
