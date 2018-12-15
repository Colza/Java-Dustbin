import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;

public class Layouts {

    public static void main(String[] args) {
        Layouts my = new Layouts();
        my.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel result = new JLabel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button;
        JButton buttonTwo;
        JTextField txtfield = new JTextField(20);
        txtfield.addActionListener(e -> result.setText(txtfield.getText()));

        button = new JButton("Red");
        buttonTwo = new JButton("Green");
        //buttonTwo.setVisible(false);

        button.addActionListener(e -> {
            panel.setBackground(Color.RED);
            //  button.setVisible(false);
            //  buttonTwo.setVisible(true);
            frame.repaint();
        });


        buttonTwo.addActionListener(e -> {
            panel.setBackground(Color.GREEN);
            // buttonTwo.setVisible(false);
            //  button.setVisible(true);
            frame.repaint();
        });
        panel.add(button);
        panel.add(buttonTwo);
        panel.add(txtfield);
        panel.add(result);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.setSize(250, 400);
        frame.setVisible(true);
    }
}
