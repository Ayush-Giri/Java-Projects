import java.util.Arrays;
import java.util.Scanner;
public class Main {

    static Scanner scan = new Scanner(System.in);
    static Item[][] items = {{new Item("Pepsi", 3.99, 40), new Item("Lays", 2.7, 50), new Item("Cadbury", 6.12, 62)}, {new Item("Water", 0.99, 20), new Item("Orange Juice", 4.65, 5), new Item("Cold Coffee", 9.12, 14)},{new Item("Cookies", 7.45, 13), new Item("Crisps", 3.22, 5), new Item("Sauce", 2.45, 2)}};
    static double money = 0d;
    static Machine machine = new Machine(items);




    public static void main(String[] args){

        greetCustomerAndProcessOrder();

    }

    public static void greetCustomerAndProcessOrder(){


        System.out.println("Welcome to the Vending Machine");
        System.out.println("would you like to take a look at our products type 1 for yes and 0 for no: ");
        int userChoice = scan.nextInt();

        if (userChoice ==  1){
            System.out.println("her are the list of products with respective price and quantity");
            System.out.println("\n");
            System.out.println(machine);

            System.out.println("would you like to buy something if yes the type 1 else type 0");
            int isBuying = scan.nextInt();

            if (isBuying == 1){
                System.out.println(machine);
                System.out.println("\n");
                System.out.println("please enter the row and column number of the thing you want to buy");

                int rowNumber = scan.nextInt();
                int columnNumber = scan.nextInt();

                System.out.println("please enter the quantity ");
                int quantity = scan.nextInt();

                System.out.println("so you want to buy " + items[rowNumber][columnNumber].getName() + " which costs " + items[rowNumber][columnNumber].getPrice() +  " for one and " + (items[rowNumber][columnNumber].getPrice() * quantity) + " for " + quantity);

                System.out.println("please process with the order payment");
                double userMoney = scan.nextDouble();

                if (userMoney == items[rowNumber][columnNumber].getPrice() * quantity){
                    money += items[rowNumber][columnNumber].getPrice();
                    items[rowNumber][columnNumber].setQuantity(items[rowNumber][columnNumber].getQuantity() - quantity);
                    System.out.println("Here is your " + items[rowNumber][columnNumber].getName());
                    greetCustomerAndProcessOrder();

                }
                else if (userMoney > items[rowNumber][columnNumber].getPrice() * quantity){
                    money += userMoney;
                    double moneyToBeReturned = userMoney - items[rowNumber][columnNumber].getPrice();
                    money -= moneyToBeReturned;
                    items[rowNumber][columnNumber].setQuantity(items[rowNumber][columnNumber].getQuantity() - quantity);
                    System.out.println("Here is your " +  items[rowNumber][columnNumber].getName() + " and return " + moneyToBeReturned);
                    greetCustomerAndProcessOrder();

                }

                else{
                    System.out.println("Sorry we cannot process your order because of insufficient funds");
                    greetCustomerAndProcessOrder();
                }

            }
            else{
                System.out.println("Thanks for taking a look at our products we appreciate your valuable time");
                greetCustomerAndProcessOrder();
            }
        }

        else{
            System.out.println("No worries have a great day");
            greetCustomerAndProcessOrder();
        }



    }



}
