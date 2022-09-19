import Models.PizzaMenuItems;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("Hello again!");

        int num1 = 10;
        int num2 = 15;

        if(num1 == num2){
            System.out.println("rovnají se");
        }
        else if (num1 < num2){
            System.out.println("1. je < než 2.");

        }



        PizzaMenuItems item1 = new PizzaMenuItems(180, "hawai", "pizza hawai");
        PizzaMenuItems item2 = new PizzaMenuItems(190, "chicken", "pizza with chicken");
        PizzaMenuItems item3 = item1;

        System.out.println(item1);

    }
}
