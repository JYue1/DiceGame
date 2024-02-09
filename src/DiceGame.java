// DiceGame by James Yue

import java.util.Scanner;

public class DiceGame {

    private DiceGameViewer window;
    private Dice die;


    public DiceGame() {
        window = new DiceGameViewer(this);




    }

    public String getPlayerNameOne() {
        return playerNameOne;
    }


    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Highest Roller!");

        System.out.println("Enter the name of Player 1:");
        // Maybe make a Player Class because I need to create an object
        // then I can have getter methods 
        String playerNameOne = input.nextLine();
        System.out.println("Enter the name of Player 2:");
        String playerNameTwo = input.nextLine();



    }













    public static void main(String[] args) {


    }
}





