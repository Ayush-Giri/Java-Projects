import java.util.Scanner;
import java.util.concurrent.Callable;

public abstract class CoffeeMachine {
    static int water = 300;
    static int milk = 200;
    static int coffee = 100;
    static int espressoWater = 50;
    static int espressoCoffee = 18;

    static double espressoCost = 1.5;
    static int latteWater = 200;
    static int latteMilk = 150;
    static int latteCoffee = 24;
    static double latteCost = 2.5;
    static int cappuccinoWater = 250;
    static int cappuccinoMilk = 100;
    static int cappuccinoCoffee = 24;
    static double cappuccinoCost = 3.0;

    public static void displayResource(){
        System.out.println( "Water: " + CoffeeMachine.water + "\nMilk: " + CoffeeMachine.milk + "\nCoffee: " + CoffeeMachine.coffee);
    }

    public static void takeOrder(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("What would you like to order press 1 for espresso 2 for latte and 3 for cappuccino");
        int userInput = scan.nextInt();
        if (userInput < 1 || userInput > 3){
            System.out.println("please enter a valid input to process the order");
            takeOrder();
        }
        else{
            processOrder(userInput);

        }


    }
    private static boolean isResourceSufficient(String order){
        if (order.equals("espresso")){
            if (CoffeeMachine.water >= espressoWater && CoffeeMachine.coffee >= espressoCoffee){
                return true;
            }
            else {
                return false;
            }
        }

        else if (order.equals("latte")){
            if (CoffeeMachine.water >= latteWater && CoffeeMachine.milk >= latteMilk && CoffeeMachine.coffee >= latteCoffee){
                return true;
            }
            else{
                return false;
            }
        }

        else{
            if (CoffeeMachine.water >= cappuccinoWater && CoffeeMachine.milk >= cappuccinoMilk && CoffeeMachine.coffee >= cappuccinoCoffee){
                return true;
            }
            else {
                return false;
            }
        }

    }

    private static void processOrder(int orderNumber){
        if (orderNumber == 1){
            String orderName = "espresso";
                boolean isResourceEnough = isResourceSufficient(orderName);
                if (isResourceEnough){
                    double processedMoney = MoneyMachine.processCoins();
                    boolean isThereEnoughMoney = MoneyMachine.checkIsMoneySufficient(processedMoney, orderName);
                    if (isThereEnoughMoney){
                        System.out.println("here is your coffee enjoy and have a great day");
                        decreaseResource(orderName);
                    }
                    else{
                        System.out.println("sorry the money is not enough to process this order");

                    }
                }
                else {
                    System.out.println("sorry the resources are not enough");
                }

            }
        else if (orderNumber == 2){
            String orderName = "latte";
            boolean isResourceEnough = isResourceSufficient(orderName);
            if (isResourceEnough){
                double processedMoney = MoneyMachine.processCoins();
                boolean isThereEnoughMoney = MoneyMachine.checkIsMoneySufficient(processedMoney, orderName);
                if (isThereEnoughMoney){
                    System.out.println("here is your coffee enjoy and have a great day");
                    decreaseResource(orderName);
                }
                else{
                    System.out.println("sorry the money is not enough to process this order");
                }
            }
            else {
                System.out.println("sorry the resources are not enough");
            }

        }
        else{
            String orderName = "cappuccino";
            boolean isResourceEnough = isResourceSufficient(orderName);
            if (isResourceEnough){
                double processedMoney = MoneyMachine.processCoins();
                boolean isThereEnoughMoney = MoneyMachine.checkIsMoneySufficient(processedMoney, orderName);
                if (isThereEnoughMoney){
                    System.out.println("here is your coffee enjoy and have a great day");
                    decreaseResource(orderName);
                }
                else{
                    System.out.println("sorry the money is not enough to process this order");
                }
            }
            else {
                System.out.println("sorry the resources are not enough");
            }

        }
    }

    private static void decreaseResource(String orderName){
        if (orderName.equals("espresso")){
            CoffeeMachine.water -= espressoWater;
            CoffeeMachine.coffee -= espressoCoffee;
        }

        else if (orderName.equals("latte")){
            CoffeeMachine.water -= latteWater;
            CoffeeMachine.milk -= latteMilk;
            CoffeeMachine.coffee -= latteCoffee;
        }

        else{
            CoffeeMachine.water -= cappuccinoWater;
            CoffeeMachine.milk -= cappuccinoMilk;
            CoffeeMachine.coffee -= cappuccinoCoffee;
        }
    }
    private static void fillUpResources(){
        CoffeeMachine.water = 300;
        CoffeeMachine.milk = 200;
        CoffeeMachine.coffee = 100;
    }
}
