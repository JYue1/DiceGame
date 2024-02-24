// DiceGame by James Yue
// 2/23/24

// A two player dice game that is won by the player who rolled the highest die

// C.T. Can write a class containing instance variables, constructors, and methods, using access modifiers (private vs public) appropriately.
// C.T. Can write methods, including accessors (getters) and mutators (setters), with correct return types.
// C.T. Can utilize class-scope instance variables and local parameters in methods.
import java.util.Scanner;

public class DiceGame {
    // C.T. Can declare and initialize Arrays, ArrayLists, and 2D Arrays.
    // C.T. Understand the differences between Arrays and ArrayLists and can articulate the reasons for using one over the other.

    // Instance variables
    private DiceGameViewer window;
    private String[] name;
    private Dice dieOne;
    private Dice dieTwo;
    public String winner;

    public DiceGame() {
        // Allowing the Front-End (DiceGameViewer) information be accessible in the Back-End (DiceGame)
        window = new DiceGameViewer(this);

        // Creating a 2-D array with space for two names
        name = new String[2];

        // Allowing DiceGame to access information from Dice
        dieOne = new Dice(window);
        dieTwo = new Dice(window);

        // Set winner to a blank string
        this.winner = "";

        // Initialize the scanner to take in the names of the two users
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            // C.T. Can write nested for-loops to traverse 2D arrays.
            // Asking the name's of the two users
            System.out.println("Enter the name of Player " + (i + 1) + ":");
            String playerName = input.nextLine();
            // Storing the users name's
            name[i] = playerName;
        }
    }

    // Getter method for instance variables
    public String[] getName() {
        return name;
    }
    public Dice getDieOne() {
        return this.dieOne;
    }

    public Dice getDieTwo() {
        return this.dieTwo;
    }

    public String getWinner() {
        return this.winner;
    }

    public void run() {
        // C.T. Understand how to use nesting to embed loops and conditionals inside of other loops and conditionals.
        // C.T. Can use if, while, and for.

        Scanner sc = new Scanner(System.in);

        // Welcome and introduction to the DiceGame
        System.out.println("");
        System.out.println("Welcome to Highest Roller!");

        System.out.println("Press the \"S\" Key to Begin");
        String start = sc.nextLine();
        // If the user did not type in the letter "S" continue to ask them
        while (!start.equals("S")) {
            System.out.println("Press the \"S\" Key to Begin");
            start = sc.nextLine();
        }
        // Repaint the window with new information
        window.repaint();

        // Roll the dies and determine which user is the winner
        if (dieOne.getRoll() > dieTwo.getRoll()) {
            winner = name[0];
        }
        else if (dieOne.getRoll() < dieTwo.getRoll()) {
            winner = name[1];
        }
        else {
            winner = "It's a tie!";
        }
    }

    // Run the game
    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.run();
    }
}





