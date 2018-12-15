
import java.awt.*;
import javax.swing.JFrame;

public class Graphics1 extends Canvas{

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
        Graphics1 m=new Graphics1();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        //f.setLayout(null);
        f.setVisible(true);
    }

}