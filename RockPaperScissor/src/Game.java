import java.util.Scanner;
public class Game {

    public static void main(String[] args) {

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper or scissors\n");
        System.out.println("Are you ready? Write 'yes' if you are");
        Scanner scan = new Scanner(System.in);
        String readyStatus = scan.next();

        if (readyStatus.equals("yes")){
            System.out.println("Great");
            System.out.println("Rock Paper Scissors shoot!");
            String userChoice = scan.next();
            String computerOption = computerChoice();
            scan.close();

            if (userChoice.equals("rock") && computerOption.equals("rock")){
                System.out.println("You chose " + userChoice);
                System.out.println("Computer chose " + computerOption);
                System.out.println("it's draw");
            }
            else if (userChoice.equals("paper") && computerOption.equals("paper")){
                System.out.println("You chose " + userChoice);
                System.out.println("Computer chose " + computerOption);
                System.out.println("it's a draw");
            }

            else if (userChoice.equals("scissors") && computerOption.equals("scissors")){
                System.out.println("You chose " + userChoice);
                System.out.println("Computer chose " + computerOption);
                System.out.println("it's a draw");
            }

            else if (userChoice.equals("rock") && computerOption.equals("paper")){
                System.out.println("You chose " + userChoice);
                System.out.println("Computer chose " + computerOption);
                System.out.println("paper beats rock so computer is the winner");
            }

            else if (userChoice.equals("rock") && computerOption.equals("scissors")){
                System.out.println("You chose " + userChoice);
                System.out.println("Computer chose " + computerOption);
                System.out.println("Rock beats scissors so you are the winner");
            }

            else if (userChoice.equals("paper") && computerOption.equals("rock")){
                System.out.println("You chose " + userChoice);
                System.out.println("Computer chose " + computerOption);
                System.out.println("paper beats rock so you are the winner");

            }

            else if (userChoice.equals("paper") && computerOption.equals("scissors")){
                System.out.println("You chose " + userChoice);
                System.out.println("Computer chose " + computerOption);
                System.out.println("scissor beats paper so computer is the winner");

            }

            else if (userChoice.equals("scissors") && computerOption.equals("paper")){
                System.out.println("You chose " + userChoice);
                System.out.println("Computer chose " + computerOption);
                System.out.println("scissor beats paper so you are the winner");
            }

            else {
                System.out.println("Rock beats scissors so computer is the winner");
            }


        }
        else{
            System.out.println("Darn Some other time...!");
        }

    }

    public static String computerChoice(){
        String computerSelect = "";
        int randomChoice = (int) (Math.random() * 3) + 1;
        switch (randomChoice){
            case 1:
                computerSelect = "rock";
                break;

            case 2:
                computerSelect = "paper";
                break;

            case 3:
                computerSelect = "scissors";
                break;

            default:
                computerSelect = "random gibberish";
                break;
        }
        return computerSelect;

    }


}



