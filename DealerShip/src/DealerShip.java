import java.util.Scanner;
public class DealerShip {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the java dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option){
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000){
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a driver's licence 'yes' or 'no'");
                    String licence = scan.nextLine();
                    System.out.println("What is your credit score");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && licence.equals("yes") && creditScore > 600){
                        System.out.println("congratulations we have a deal");
                    }
                    else{
                        System.out.println("We're sorry you're not eligible");
                    }
                }
                else{
                    System.out.println("We don't sell cars under $"+budget);
                }
                break;

            case "b":
                System.out.println("What is your car valued at?");
                int carValue = scan.nextInt();
                System.out.println("What is you selling price?");
                int sellingPrice = scan.nextInt();
                if (sellingPrice < carValue && sellingPrice < 30000){
                    System.out.println("Congratulation we have a deal in");
                }
                else{
                    System.out.println("We're sorry we cannot buy your car because we think it's two expensive");
                }
                break;

            default:
                System.out.println("Invalid option");

        }
        scan.close();




    }
}
