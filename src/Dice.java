import java.awt.*;

public class Dice {
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 1000;
    private final int dieOneX = 300;
    private final int dieOneY = 300;
    private final int dieTwoX = 300;
    private final int dieTwoY = 300;

    private DiceGameViewer window;
    private Image oneImage, twoImage, threeImage, fourImage, fiveImage, sixImage;
    private int currentRoll;

    public Dice(DiceGameViewer window) {
        this.window = window;
        this.currentRoll = 0;

        oneImage = window.getImages()[0];
        twoImage = window.getImages()[1];
        threeImage = window.getImages()[2];
        fourImage = window.getImages()[3];
        fiveImage = window.getImages()[4];
        sixImage = window.getImages()[5];
    }

    public int getRoll() {
        currentRoll = (int)(Math.random() * 6) + 1;
        return currentRoll;
    }

    public void draw(Graphics g) { // take an x and y where dice one is located and dice two
    // Dice one will always have this x and y location and dice two will always have this x and y location

        g.setFont(new Font("Serif", Font.BOLD, 40));
        g.drawString("Welcome to Highest Roller!", 220, 150);
        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("Insturctions: Whichever player rolls the highest die wins the game", 180, 250);


        if (currentRoll == 1) {
            g.drawImage(oneImage, dieOneX, dieOneY, 150, 150, window);
        }
        else if (currentRoll == 2) {
            g.drawImage(twoImage, dieOneX, dieOneY, 150, 150, window);
        }
        else if (currentRoll == 3) {
            g.drawImage(threeImage, dieOneX, dieOneY, 150, 150, window);
        }
        else if (currentRoll == 4) {
            g.drawImage(fourImage, dieOneX, dieOneY, 150, 150, window);
        }
        else if (currentRoll == 5) {
            g.drawImage(fiveImage, dieOneX, dieOneY, 150, 150, window);
        }
        else if (currentRoll == 6) {
            g.drawImage(sixImage, dieOneX, dieOneY, 150, 150, window);
        }
    }
}