// DiceGame by James Yue

import java.util.Scanner;

public class DiceGame {
    public static final int numSides = 6;

    private DiceGameViewer window;
    private String[] name;
    private String[] color;
    private Dice dieOne;
    private Dice dieTwo;
    public String winner;


    public DiceGame() {
        window = new DiceGameViewer(this);

        name = new String[2];
        color = new String[2];

        dieOne = new Dice(window);
        dieTwo = new Dice(window);

        this.winner = "";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the name of Player " + (i + 1) + ":");
            String playerName = input.nextLine();
            name[i] = playerName;
            System.out.println(name[i] + ", what is your favorite color?");
            String favoriteColor = input.nextLine();
            color[i] = favoriteColor;
        }
    }

    public String[] getName() {
        return name;
    }

    public String[] getColor() {
        return color;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome to Highest Roller!");

        System.out.println("Press the \"S\" Key to Begin");
        String start = sc.nextLine();
        if (start.equals("S")) {
            window.repaint();
        }

        if (dieOne.getRoll() > dieTwo.getRoll()) {
            winner = name[0];
        }
        else {
            winner = name[1];
        }
    }

    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.run();
    }
}





