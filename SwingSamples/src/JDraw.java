import javax.swing.*;
        import java.awt.*;

//some Swing 2D graphics examples

public class JDraw extends JPanel {
//        public void paintComponent(Graphics g) {
//            g.setColor(Color.orange);
//            g.fillRect(20,50,100,100);
//        }

//    public void paintComponent(Graphics g) {
//        Image image = new ImageIcon("flag-round-250.png").getImage();
//        g.drawImage(image, 3, 4, this);
//    }

//    public void paintComponent(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        GradientPaint gradient = new GradientPaint(70,70,Color.blue, 150,150, Color.orange);
//        g2d.setPaint(gradient);
//        g2d.fillOval(70,70,100,100);
//    }

//    public void paintComponent(Graphics g) {
//        g.fillRect(0, 0, this.getWidth(), this.getHeight());
//        int red = (int) (Math.random() * 255);
//        int green = (int) (Math.random() * 255);
//        int blue = (int) (Math.random() * 255);
//        Color randomColor = new Color(red, green, blue);
//        g.setColor(randomColor);
//        g.fillOval(70, 70, 100, 100);
//    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);
        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);
        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }


    public static void main (String[]args){
        JFrame window = new JFrame();
        JDraw drawPanel = new JDraw();
        window.add(drawPanel);
        window.setSize(300, 300);
        window.setVisible(true);
    }
}
