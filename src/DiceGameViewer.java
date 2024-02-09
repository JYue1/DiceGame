import javax.swing.*;
import java.awt.*;

public class DiceGameViewer extends JFrame {

    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 1000;
    private DiceGame d;
    private Image[] diceFace;

    public DiceGameViewer(DiceGame d) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("DiceGame");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);

        this.d = d;

        diceFace = new Image[6];
        diceFace[0] = new ImageIcon("Resources/one.jpg").getImage();
        diceFace[1] = new ImageIcon("Resources/two.jpg").getImage();
        diceFace[2] = new ImageIcon("Resources/three.jpg").getImage();
        diceFace[3] = new ImageIcon("Resources/four.jpg").getImage();
        diceFace[4] = new ImageIcon("Resources/five.jpg").getImage();
        diceFace[5] = new ImageIcon("Resources/six.jpg").getImage();
    }

    public Image[] getImages() {
        return diceFace;
    }

    public void paint(Graphics g) {






    }



}
