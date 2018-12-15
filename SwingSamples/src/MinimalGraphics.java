import java.awt.*;
import javax.swing.JFrame;

public class MinimalGraphics extends Canvas{

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.drawString("Hello",40,40);
        g.fillRect(130, 30,100, 80);
        g.drawOval(30,130,50, 60);
        setForeground(Color.RED);
        g.fillOval(130,130,50, 60);
        g.drawArc(30, 200, 40,50,90,60);
        g.fillArc(30, 130, 40,50,180,40);


    }
    public static void main(String[] args) {
        MinimalGraphics m=new MinimalGraphics();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        f.setVisible(true);
    }

}