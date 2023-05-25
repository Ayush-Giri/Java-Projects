import java.util.Scanner;
public abstract class MoneyMachine {

    static double Money = 0;
    static double quarterValue = 0.35;
    static double dimesValue = 0.10;
    static double nicklesValue = 0.05;
    static double penniesValue = 0.01;


    public static double processCoins(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of quarter you have: ");
        double quarter = scan.nextInt();
        System.out.println("Enter the number of dimes you have: ");
        double dimes = scan.nextInt();
        System.out.println("Enter the number of nickles you have: ");
        double nickles = scan.nextInt();
        System.out.println("Enter the number of pennies you have: ");
        double pennies = scan.nextInt();
        double total_fund = (quarter * quarterValue + dimes * dimesValue + nickles * nicklesValue + pennies * penniesValue);
        return total_fund;
    }

    public static boolean checkIsMoneySufficient(double money, String order){
        if (order.equals("espresso")){
            if (money == CoffeeMachine.espressoCost){
                addMoney(money);
                return true;
            }
            else if (money > CoffeeMachine.espressoCost){
                addMoney(money);
                double moneyToBeReturned = money - CoffeeMachine.espressoCost;
                System.out.println("Here is your return money " + moneyToBeReturned);
                return true;
            }

            else {
                return false;
            }
        }
        else if (order.equals("latte")){
            if (money == CoffeeMachine.latteCost){
                addMoney(money);
                return true;
            }
            else if (money > CoffeeMachine.latteCost){
                addMoney(money);
                double moneyToBeReturned = money - CoffeeMachine.latteCost;
                System.out.println("Here is your return money " + moneyToBeReturned);
                return true;
            }

            else {
                return false;
            }
        }
        else {
            if (money == CoffeeMachine.cappuccinoCost){
                addMoney(money);
                return true;
            }
            else if (money > CoffeeMachine.cappuccinoCost){
                addMoney(money);
                double moneyToBeReturned = money - CoffeeMachine.cappuccinoCost;
                System.out.println("Here is your return money " + moneyToBeReturned);
                return true;
            }

            else {
                return false;
            }
        }
    }

    public static void displayMoney(){
        System.out.println("The total amount money is " + Money);
    }

    public static void addMoney(double money){
        MoneyMachine.Money += money;
    }


}
