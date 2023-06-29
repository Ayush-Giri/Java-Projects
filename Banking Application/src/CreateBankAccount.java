import java.util.ArrayList;
import java.util.Random;
public class CreateBankAccount {

    private String name;
    private String dateOfBirth;

    private int citizenShipNumber;

    private String address;

    private int accountNumber;

    private double amount = 500;

    private static ArrayList<CreateBankAccount> allAccounts = new ArrayList<CreateBankAccount>();

    private static ArrayList<Integer> storeAccountNumbers = new ArrayList<>();

    public CreateBankAccount(String name, String dateOfBirth, int citizenShipNumber, String address){
        Random random = new Random();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.citizenShipNumber = citizenShipNumber;
        this.address = address;
        int randomNumber = random.nextInt(5000, 10000);
        boolean flag = true;
        if (storeAccountNumbers.size() == 0){
            this.accountNumber = randomNumber;
        }
        else {
            while (flag){
                if (storeAccountNumbers.contains(randomNumber)){
                    randomNumber = random.nextInt(5000, 10000);
                }
                else{
                    this.accountNumber = randomNumber;
                    flag = false;
                }
            }
        }
    }

    public CreateBankAccount(CreateBankAccount account){
        this.name = account.name;
        this.dateOfBirth = account.dateOfBirth;
        this.citizenShipNumber = account.citizenShipNumber;
        this.address = account.address;
        this.accountNumber = account.accountNumber;
        this.amount = account.amount;
    }

    public String getName(){
        return this.name;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public int getCitizenShipNumber(){
        return this.citizenShipNumber;
    }

    public String getAddress(){
        return this.address;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public static ArrayList<Integer> getStoreAccountNumbers(){
        return storeAccountNumbers;
    }

    public double getAmount(){
        return this.amount;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setCitizenShipNumber(int citizenShipNumber){
        this.citizenShipNumber = citizenShipNumber;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAmount(double amount){
        this.amount = this.amount + amount;
    }

    public void deductAmount(double amount){
        this.amount = this.amount - amount;
    }

    public String toString(){
        return "Name: " + this.name + "\nAddress: " + this.address + "\nDOB: " + this.dateOfBirth + "\nCitizenship Number: " + this.citizenShipNumber + "\nAccountNumber: " + this.accountNumber + "\nAmount: " + this.amount;
    }

    public static void insertInArray(CreateBankAccount account){
        allAccounts.add(account);
    }

    public static ArrayList<CreateBankAccount> getAllAccounts(){
        return allAccounts;
    }

}
