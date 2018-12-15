import java.awt.*;
import javax.swing.*;

public class FlagPanel extends JPanel{  //don't use canvas it's from AWT.

    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("flag-round-250.png");
        g.drawImage(i, 50,50,this);

    }
    public static void main(String[] args) {
        FlagPanel myPanel = new FlagPanel();
        JFrame frame = new JFrame();
        frame.add(myPanel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

} 