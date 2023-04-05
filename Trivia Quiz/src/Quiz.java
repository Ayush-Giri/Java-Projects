import java.util.Scanner;
public class Quiz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int userScore = 0;
        int totalScore = 20;
        System.out.println("Which Country held the 2016 Summer Olympics?");
        System.out.println("\ta)China\tb)Ireland\tc)Brazil\td)Italy");
        String userChoice = scan.nextLine();
        if (userChoice.equals("c")){
            userScore += 5;
        }

        System.out.println("Which planet is the hottest?");
        System.out.println("\ta)Venus\tb)Saturn\tc)Mercury\td)Mars");
        userChoice = scan.nextLine();
        if (userChoice.equals("a")){
            userScore += 5;
        }

        System.out.println("What is the rarest blood type?");
        System.out.println("\ta)O\tb)A\tc)B\td)AB-Negative");
        userChoice = scan.nextLine();
        if (userChoice.equals("d")){
            userScore += 5;
        }

        System.out.println("Which one of these characters is friends with harry potter?");
        System.out.println("\ta)Ron Weasley\tb)Hermione Granger\tc)Draco Malfoy");
        userChoice = scan.nextLine();
        if (userChoice.equals("a") || userChoice.equals("b")){
            userScore += 5;
        }

        if (userScore >= 15){
            System.out.println("Your score is " + userScore + "/" + totalScore);
            System.out.println("Wow you know your stuff");
        }

        else if(userScore < 15 && userScore >=5){
            System.out.println("Your score is " + userScore + "/" + totalScore);
            System.out.println("Not bad");
        }
        else{
            System.out.println("Your score is " + userScore + "/" + totalScore);
            System.out.println("better luck next time");
        }
    }
}
