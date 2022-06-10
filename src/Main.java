import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> allDrinks = new ArrayList<>();
        int sum = 0;
        Cafe drink = new Cafe();
        Menu drinkAdd = new Menu();
        int answer = 0;
        do {
            System.out.println("Do you want a drink? 1 - Yes, 2 - No");
            Scanner ack = new Scanner(System.in);
            answer = ack.nextInt();
            if (answer == 1) {
                System.out.println("What would you like? Enter the drink: 1 - Americano, 2 - Latte, 3 - Cappuccino, 4 - Tea. ");
                Scanner in = new Scanner(System.in);
                int sel = in.nextInt();
                switch (sel) {
                    case (1):
                        drink.americano();
                        drinkAdd.americano();
                        System.out.println(" in " + Drinks.Americano);
                        sum = sum + drink.getPrice();
                        allDrinks.add("Americano");
                        break;
                    case (2):
                        drink.latte();
                        drinkAdd.latte();
                        System.out.println(" in " + Drinks.Latte);
                        sum = sum + drink.getPrice();
                        allDrinks.add("Latte");
                        break;
                    case (3):
                        drink.cappuccino();
                        drinkAdd.cappuccino();
                        System.out.println(" in " + Drinks.Cappuccino);
                        sum = sum + drink.getPrice();
                        allDrinks.add("Cappuccino");
                        break;
                    case (4):
                        drink.tea();
                        drinkAdd.tea();
                        System.out.println(" in " + Drinks.Tea);
                        sum = sum + drink.getPrice();
                        allDrinks.add("Tea");
                        break;
                }
            } else if ( answer == 2) {
                answer = 2;
            }
        } while (answer == 1);
            System.out.println("Your enter incorect data");
            System.out.println("Your drinks: " + allDrinks);
            System.out.println("Full price: " + sum);

    }
}
