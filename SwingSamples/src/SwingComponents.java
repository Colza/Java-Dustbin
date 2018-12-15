import javax.swing.*;
import java.awt.*;

public class SwingComponents {

    void start() {
        JFrame window = new JFrame("Component Test");
        JPanel panel = new JPanel();
        JTextField input = new JTextField(20);
        JButton button = new JButton("Submit");
        JCheckBox cb = new JCheckBox();
        //JLabel petOutput;
        String [] pets = {"Cat", "Dog", "Rabbit", "Gerbil", "Ferret"};
        JList petList = new JList(pets);

        JLabel output = new JLabel();
        JLabel petOutput = new JLabel();
        button.addActionListener(e -> {
            if (cb.isSelected()) {
                output.setText(input.getText());
            }else{
                output.setText(" Need to select check box");
            }
            input.setText("");
            input.requestFocus();

            petOutput.setText ((String) (petList.getSelectedValue()));
        });



        panel.add(input);
        panel.add(cb);
        panel.add(button);
        panel.add(petList);
        panel.add(output);
        panel.add(petOutput);
        window.getContentPane().add(panel);
        window.setSize(300,300);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingComponents sc = new SwingComponents();
        sc.start();
    }
}
