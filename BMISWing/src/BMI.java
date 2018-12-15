import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI {
    private JPanel BMI;
    private JTextField height;
    private JTextField weight;
        private JButton calculateButton;
    private JLabel result;

    public BMI() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double h = Double.parseDouble(height.getText());
                Double w = Double.parseDouble(weight.getText());
                double bmi = w /( h * h);
                result.setText("Your BMI is " +bmi);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI Calculator");
        frame.setContentPane(new BMI().BMI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
