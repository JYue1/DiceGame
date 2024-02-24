// James Yue

// C.T. Can write a class containing instance variables, constructors, and methods, using access modifiers (private vs public) appropriately.
// C.T. Can write methods, including accessors (getters) and mutators (setters), with correct return types.
// C.T. Can utilize class-scope instance variables and local parameters in methods.

import java.awt.*;

public class Dice {
    // C.T. Can declare and initialize Arrays, ArrayLists, and 2D Arrays.

    // Instance variables
    private DiceGameViewer window;
    private Image oneImage, twoImage, threeImage, fourImage, fiveImage, sixImage;
    private int currentRoll;

    public Dice(DiceGameViewer window) {
        // Pass information from the Front-End to this class
        this.window = window;
        this.currentRoll = 0;

        // The six faces of the die
        oneImage = window.getImages()[0];
        twoImage = window.getImages()[1];
        threeImage = window.getImages()[2];
        fourImage = window.getImages()[3];
        fiveImage = window.getImages()[4];
        sixImage = window.getImages()[5];
    }

    public int getRoll() {
        // C.T. Can use Math class, especially Math.random().
        // Generate a random number to determine the face of the die
        currentRoll = (int)(Math.random() * 6) + 1;
        return currentRoll;
    }

    // Take in the Graphics g and the location of die one and die two
    public void draw(Graphics g, int x, int y) {
        // Message of the welcome and introduction displayed on the screen to the users
        g.setFont(new Font("Serif", Font.BOLD, 40));
        g.drawString("Welcome to Highest Roller!", 220, 150);
        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("Insturctions: Whichever player rolls the highest die wins the game", 180, 250);


        // C.T. Can use if, while, and for.
        // Depending on the face of the die, display that image
        if (currentRoll == 1) {
            g.drawImage(oneImage, x, y, 150, 150, window);
        }
        else if (currentRoll == 2) {
            g.drawImage(twoImage, x, y, 150, 150, window);
        }
        else if (currentRoll == 3) {
            g.drawImage(threeImage, x, y, 150, 150, window);
        }
        else if (currentRoll == 4) {
            g.drawImage(fourImage, x, y, 150, 150, window);
        }
        else if (currentRoll == 5) {
            g.drawImage(fiveImage, x, y, 150, 150, window);
        }
        else if (currentRoll == 6) {
            g.drawImage(sixImage, x, y, 150, 150, window);
        }
    }
}