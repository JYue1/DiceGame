// James Yue

// C.T. Can write a class containing instance variables, constructors, and methods, using access modifiers (private vs public) appropriately.
// C.T. Can write methods, including accessors (getters) and mutators (setters), with correct return types.
// C.T. Can utilize class-scope instance variables and local parameters in methods.

import javax.swing.*;
import java.awt.*;

public class DiceGameViewer extends JFrame {
    // C.T. Can declare and initialize Arrays, ArrayLists, and 2D Arrays.

    // Magic numbers
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 1000;
    private final int dieOneX = 150;
    private final int dieOneY = 400;
    private final int dieTwoX = 700;
    private final int dieTwoY = 400;
    // Instance variables
    private DiceGame d;
    private Image[] diceFace;

    public DiceGameViewer(DiceGame d) {
        // Access data from DiceGame
        this.d = d;

        // The faces of a die
        diceFace = new Image[6];
        diceFace[0] = new ImageIcon("Resources/one.png").getImage();
        diceFace[1] = new ImageIcon("Resources/two.png").getImage();
        diceFace[2] = new ImageIcon("Resources/three.png").getImage();
        diceFace[3] = new ImageIcon("Resources/four.png").getImage();
        diceFace[4] = new ImageIcon("Resources/five.png").getImage();
        diceFace[5] = new ImageIcon("Resources/six.png").getImage();

        // Creates the screen
        this.setTitle("DiceGame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    // Getter
    public Image[] getImages() {
        return diceFace;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        // Sets and draws the location of dieOne and dieTwo
        d.getDieOne().draw(g, dieOneX, dieOneY);
        d.getDieTwo().draw(g, dieTwoX, dieTwoY);

        // Displays the name of the user above their die
        g.setFont(new Font("Serif", Font.ITALIC, 40));
        g.drawString(d.getName()[0], 150, 350);
        g.drawString(d.getName()[1], 720, 350);

        // C.T. Can use if, while, and for.
        // Determine who has won the game and displays their name at the bottom of the screen
        if (d.getWinner().equals(d.getName()[0])) {
            g.drawString(d.getName()[0] + " has won!", 350, 650);
        }
        else if (d.getWinner().equals(d.getName()[1])) {
            g.drawString(d.getName()[1] + " has won!", 350, 650);
        }
        else {
            g.drawString("It's a tie!", 350, 650);
        }
    }
}
