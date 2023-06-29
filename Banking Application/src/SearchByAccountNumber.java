import java.util.ArrayList;

public class SearchByAccountNumber {

    public static CreateBankAccount searchAccount(ArrayList<CreateBankAccount> accounts, int accountNumber){
        for (int i=0; i<accounts.size(); i++){
            if (accounts.get(i).getAccountNumber() == accountNumber){
                return accounts.get(i);
            }
        }
        return null;
    }
}
