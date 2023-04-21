import java.util.Arrays;
import java.util.Scanner;
public class TicTacToe {
    static Scanner scan = new Scanner(System.in);
    static char[][] board = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    public static void main(String[] args){

        System.out.println("lets play tic tac toe\n");
        printBoard(board);

        for (int i=0; i<9; i++){
            if (i % 2 == 0){
                System.out.println("Turn: X please remember the indexing starts at 0");
                int[] position = askUser();
                board[position[0]][position[1]] = 'X';
                printBoard(board);
                String winnerStatus = checkForWinner(board);
                if (winnerStatus.equals("player x")){
                    System.out.println("player X you are the winner");
                    break;
                }

            }
            else{
                System.out.println("Turn: Y please remember the indexing starts at 0");
                int[] position = askUser();
                board[position[0]][position[1]] = '0';
                printBoard(board);
                String winnerStatus = checkForWinner(board);
                if (winnerStatus.equals("player y")){
                    System.out.println("player Y you are the winner");
                    break;
                }
            }
        }
    }

    public static void printBoard(char[][] gameBoard){
        for (int i=0; i<gameBoard.length; i++){
            System.out.println("\n");
            for (int j=0; j<gameBoard[i].length; j++){
                System.out.print("\t" + (gameBoard[i][j]));
            }
        }
        System.out.println();
    }

    public static int[] askUser(){
        int[] rowColPosition = new int[2];
        System.out.print("\t.pick a row and column number: ");
        int rowNumber = scan.nextInt();
        int columnNumber = scan.nextInt();
        if (board[rowNumber][columnNumber] == 'X' || board[rowNumber][columnNumber] == '0'){
            System.out.println("sorry the spot is already taken please choose again");
            askUser();
        }
        else{
            rowColPosition[0] = rowNumber;
            rowColPosition[1] = columnNumber;
        }
        return rowColPosition;

    }

    public static String checkForWinner(char[][] boardStatus){
        String winner = "None";
        if (boardStatus[0][0] == 'X' && boardStatus[0][1] == 'X' && boardStatus[0][2] == 'X'){
            winner = "player x";
            return winner;
        }
        else if(boardStatus[1][0] == 'X' && boardStatus[1][1] == 'X' && boardStatus[1][2] == 'X'){
            winner = "player x";
            return winner;
        }
        else if (boardStatus[2][0] == 'X' && boardStatus[2][1] == 'X' && boardStatus[2][2] == 'X'){
            winner = "player x";
            return winner;
        }
        else if (boardStatus[0][0] == 'X' && boardStatus[1][0] == 'X' && boardStatus[2][0] == 'X') {
            winner = "player x";
            return winner;
        }
        else if (boardStatus[0][1] == 'X' && boardStatus[1][1] == 'X' && boardStatus[2][1] == 'X'){
            winner = "player x";
            return winner;
        }

        else if (boardStatus[0][2] == 'X' && boardStatus[1][2] == 'X' && boardStatus[2][2] == 'X'){
            winner = "player x";
            return winner;
        }

        else if (boardStatus[0][0] == 'X' && boardStatus[1][1] == 'X' && boardStatus[2][2] == 'X'){
            winner = "player x";
            return winner;
        }
        else if (boardStatus[0][2] == 'X' && boardStatus[1][1] == 'X' && boardStatus[2][0] == 'X'){
            winner = "player x";
            return winner;
        }

        else if (boardStatus[0][0] == '0' && boardStatus[0][1] == '0' && boardStatus[0][2] == '0'){
            winner = "player y";
            return winner;
        }
        else if(boardStatus[1][0] == '0' && boardStatus[1][1] == '0' && boardStatus[1][2] == '0'){
            winner = "player y";
            return winner;
        }
        else if (boardStatus[2][0] == '0' && boardStatus[2][1] == '0' && boardStatus[2][2] == '0'){
            winner = "player y";
            return winner;
        }
        else if (boardStatus[0][0] == '0' && boardStatus[1][0] == '0' && boardStatus[2][0] == '0') {
            winner = "player y";
            return winner;
        }
        else if (boardStatus[0][1] == '0' && boardStatus[1][1] == '0' && boardStatus[2][1] == '0'){
            winner = "player y";
            return winner;
        }

        else if (boardStatus[0][2] == '0' && boardStatus[1][2] == '0' && boardStatus[2][2] == '0'){
            winner = "player y";
            return winner;
        }

        else if (boardStatus[0][0] == '0' && boardStatus[1][1] == '0' && boardStatus[2][2] == '0'){
            winner = "player y";
            return winner;
        }
        else if (boardStatus[0][2] == '0' && boardStatus[1][1] == '0' && boardStatus[2][0] == '0'){
            winner = "player y";
            return winner;
        }


        return winner;
    }


}
