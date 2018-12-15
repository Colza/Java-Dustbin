import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
    }

    public static void main(String[] args) {
        MyDrawPanel m = new MyDrawPanel();
        //m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(200,200);
        m.setVisible(true);
        //m.repaint();
    }
}
