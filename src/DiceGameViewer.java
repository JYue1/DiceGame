import javax.swing.*;
import java.awt.*;

public class DiceGameViewer extends JFrame {

    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 1000;
    private DiceGame d;
    private Image[] diceFace;

    public DiceGameViewer(DiceGame d) {

        this.d = d;

        diceFace = new Image[6];
        diceFace[0] = new ImageIcon("Resources/one.jpg").getImage();
        diceFace[1] = new ImageIcon("Resources/two.jpg").getImage();
        diceFace[2] = new ImageIcon("Resources/three.jpg").getImage();
        diceFace[3] = new ImageIcon("Resources/four.jpg").getImage();
        diceFace[4] = new ImageIcon("Resources/five.jpg").getImage();
        diceFace[5] = new ImageIcon("Resources/six.jpg").getImage();

        this.setTitle("DiceGame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public Image[] getImages() {
        return diceFace;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        d.getDieOne().draw(g);
        d.getDieTwo().draw(g);

        g.setFont(new Font("Serif", Font.ITALIC, 40));
        g.drawString(d.getName()[0], 150, 350);
        g.drawString(d.getName()[1], 750, 350);


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
