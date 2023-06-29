import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        boolean flag = true;
        while (flag) {
            System.out.println("welcome to java bank");
            System.out.println("What service would you like to avail\n" +
                    "1. Create a bank account\n" +
                    "2. Display all account details\n" +
                    "3. Search by account number\n" +
                    "4. Withdraw the amount\n" +
                    "5. Deposit the amount\n" +
                    "6. Exit\n" +
                    "please enter the option number accordingly");

            int userChoice = scan.nextInt();

            switch (userChoice) {

                case 1:
                    System.out.println("\n");
                    System.out.println("You have opted to create a bank account please fill all the details" +
                            "for the question below");
                    gatherUserDetails();
                    break;

                case 2:
                    System.out.println("This is an admin section you need to add the password to view all the account details");
                    String password = scan.next();

                    if (password.equals("password")) {
                        System.out.println("your access has been granted now you can view all the account details");
                        System.out.println("\n here is the list of all accounts");
                        System.out.println(CreateBankAccount.getAllAccounts());
                        break;
                    } else {
                        System.out.println("oops wrong password now the application is getting closed");
                        break;
                    }

                case 3:
                    System.out.println("Please enter an account number to search to");
                    int accountNumberToSearch = scan.nextInt();
                    CreateBankAccount accountFound = SearchByAccountNumber.searchAccount(CreateBankAccount.getAllAccounts(), accountNumberToSearch);
                    if (accountFound == null){
                        System.out.println("oops sorry the account you're looking for does not exist");
                        printNewLine();
                    }
                    else{
                        System.out.println(accountFound);
                        printNewLine();
                    }
                    break;

                case 4:
                    System.out.println("please enter the account number you want to withdraw the money from ");
                    int accountNumber = scan.nextInt();
                    System.out.println("please enter the amount you want to withdraw");
                    double amountToWithDraw = scan.nextDouble();
                    WithDrawAmount.withDraw(accountNumber, amountToWithDraw);
                    break;


                case 5:
                    System.out.println("please enter the account number of the account you want to deposit the balance to");
                    int accountToDepositTo = scan.nextInt();
                    System.out.println("please enter the balance amount you want to deposit");
                    double amount = scan.nextDouble();
                    DepositAmount.addAmount(accountToDepositTo, amount);
                    break;

                case 6:
                    System.out.println("Thank you for taking a look at our services i hope you have a great day");
                    flag = false;
                    break;

            }
        }
    }

    public static void gatherUserDetails(){
        scan.nextLine();
        System.out.println("Full name");
        String userName = scan.nextLine();

        System.out.println("Date of birth separated by -");
        String dateOfBirth = scan.next();

        System.out.println("Enter your citizenship number");
        int citizenShipNumber = scan.nextInt();

        System.out.println("Enter your address");

        scan.nextLine();
        String address = scan.nextLine();
        System.out.println("\n");

        System.out.println(userName);
        System.out.println(dateOfBirth);
        System.out.println(citizenShipNumber);
        System.out.println(address);

        System.out.println("please check your details correctly if correct type yes else type no ");
        String isCorrect = scan.next();

        if (isCorrect.equals("yes")){
            CreateBankAccount bankAccount = new CreateBankAccount(userName, dateOfBirth, citizenShipNumber, address);
            System.out.println("ok your account shall now be created and the details are below please note it down a paper");
            System.out.println(bankAccount);
            CreateBankAccount.insertInArray(bankAccount);
        }
        else {
            gatherUserDetails();
        }

    }

    public static void printNewLine(){
        System.out.println("\n");
    }
}
