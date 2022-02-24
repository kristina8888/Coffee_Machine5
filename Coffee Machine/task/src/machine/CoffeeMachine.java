package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        Scanner scanner = new Scanner(System.in);

        int cups;
        int water;
        int milk;
        int beans;
        int cupsMoze;
        int cupsMoze2;
        int sum;

        System.out.println("Write how many ml of water the coffee machine has: ");
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        cups = scanner.nextInt();

        cupsMoze = Math.min((water / 200), (milk / 50));
        cupsMoze2 = Math.min(cupsMoze, (beans / 15));

        if (cupsMoze2 > cups) {
            sum = cupsMoze2 - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + sum + " more than that)");
        }
        if (cupsMoze2 < cups) {
            System.out.println("No, I can make only " + cupsMoze2 + " cup(s) of coffee");
        }
        if (cupsMoze2 == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }
}
