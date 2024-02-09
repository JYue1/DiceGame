import java.awt.*;

public class Dice {
    private DiceGameViewer window;
    private Image oneImage, twoImage, threeImage, fourImage, fiveImage, sixImage;

    public Dice(DiceGameViewer window) {
        this.window = window;

        oneImage = window.getImages()[0];
        twoImage = window.getImages()[1];
        threeImage = window.getImages()[2];
        fourImage = window.getImages()[3];
        fiveImage = window.getImages()[4];
        sixImage = window.getImages()[5];


    }



    public void draw(Graphics g, ) {

    }




}
