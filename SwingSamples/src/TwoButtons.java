import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons {
    JFrame frame;
    JLabel label;
    public static void main (String[] args) {
        TwoButtons gui = new TwoButtons ();
        gui.go();
    }
    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());
        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());
        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    class LabelListener implements ActionListener { //inner class
        public void actionPerformed(ActionEvent event) {
            label.setText("Ouch!");
        }
    } // close inner class

    class ColorListener implements ActionListener { //inner class
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    } // close inner class


    class MyDrawPanel extends JPanel {   // Paint the panel
        public void paintComponent(Graphics g) {
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillOval(70, 70, 100, 100);
        }
    }
}
