import java.util.ArrayList;

public class WithDrawAmount {

    public static void withDraw(int accountNumber, double amount){
        CreateBankAccount accountToDeductFrom = null;
        ArrayList<CreateBankAccount> allAccounts = CreateBankAccount.getAllAccounts();
        for (int i=0; i<allAccounts.size(); i++){
            if (allAccounts.get(i).getAccountNumber() == accountNumber){
                accountToDeductFrom = allAccounts.get(i);
                break;
            }
        }
        if (accountToDeductFrom == null){
            System.out.println("sorry the account you're looking from does not exist");
        }
        else {
            if (accountToDeductFrom.getAmount() == amount){
                accountToDeductFrom.deductAmount(amount);
                System.out.println("Balance: " + accountToDeductFrom.getAmount());
            }
            else if (accountToDeductFrom.getAmount() > amount){
                accountToDeductFrom.deductAmount(amount);
                System.out.println("Balance: " + accountToDeductFrom.getAmount());
            }
            else {
                System.out.println("sorry you don't have sufficient funds");
                System.out.println("Balance: " + accountToDeductFrom.getAmount());
            }
        }

        }
    }

