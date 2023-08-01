package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {

    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException{
        if (name == null){
            throw new IllegalArgumentException("sorry name cannot be null");
        }
        this.name = name.toLowerCase();

        if (phoneNumber == null){
            throw new IllegalArgumentException("sorry phone number cannot be null");
        }
        this.phoneNumber = phoneNumber;

        if (birthDate == null){
            throw new IllegalArgumentException("sorry birthdate cannot be null");
        }
        this.birthDate = birthDate;
        this.age = calculateAge(birthDate);

    }

    public Contact(Contact obj){
        this.name = obj.name;
        this.phoneNumber = obj.phoneNumber;
        this.birthDate = obj.birthDate;
        this.age = obj.age;
    }

    private int calculateAge(String birthDate) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/YYYY");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime();
        return  (int)TimeUnit.MILLISECONDS.toDays(diff) / 365;
    }

    public void setName(String name){
        if (name == null){
            throw new IllegalArgumentException("sorry name cannot be null");
        }
        this.name = name.toLowerCase();
    }

    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber == null){
            throw new IllegalArgumentException("sorry phone number cannot be null");
        }
        this.phoneNumber = phoneNumber;
    }


    public void setBirthDate(String birthDate) throws ParseException{
        if (birthDate == null){
            throw new IllegalArgumentException("sorry birthdate cannot be null");
        }
        this.birthDate = birthDate;
        this.setAge(birthDate);
    }

    private void setAge(String dateOfBirth) throws ParseException{
        this.age = calculateAge(dateOfBirth);
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getBirthDate(){
        return this.birthDate;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "Name: " + this.name + "\nPhone Number: " + this.phoneNumber + "\nAge: " + this.age;
    }


}
