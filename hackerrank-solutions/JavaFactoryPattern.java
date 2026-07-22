import java.util.Scanner;

interface Food {
	public String getType();
}

class Pizza implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        //Write your code here
        switch(order.trim().toLowerCase()) {
            case "cake" -> { return new Cake(); }
            case "pizza"-> { return new Pizza(); }
            default -> { return null; }
        }
    }//End of getFood method

}

public class JavaFactoryPattern {
    public static void main(String args[]){
        //creating the factory
        try (Scanner sc = new Scanner(System.in)) {
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());

            System.out.println("The factory returned "+food.getClass());
            System.out.println(food.getType());
        }
    }
}
