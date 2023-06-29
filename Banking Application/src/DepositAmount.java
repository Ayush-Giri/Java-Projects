import java.util.ArrayList;

public class DepositAmount {

    public static void addAmount(int accountNumber, double amount){
        boolean depositSuccess = false;
        ArrayList<CreateBankAccount> allAccounts = CreateBankAccount.getAllAccounts();
        for (int i=0; i<allAccounts.size(); i++){
            if (allAccounts.get(i).getAccountNumber() == accountNumber) {
                CreateBankAccount account = SearchByAccountNumber.searchAccount(CreateBankAccount.getAllAccounts(), accountNumber);
                account.setAmount(amount);
                depositSuccess = true;
                break;
            }
        }
        if (depositSuccess){
            System.out.println("The money has been successfully deposited to the account");
            System.out.println("\n");
        }
        else{
            System.out.println("sorry the account number you're looking for does not exist");
            System.out.println("\n");
        }

    }
}
