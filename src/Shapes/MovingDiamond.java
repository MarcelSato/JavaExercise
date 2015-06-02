package Shapes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MovingDiamond extends JFrame
        implements ActionListener {

    private MovingDiamond.MyCanvas myCanvas = new MovingDiamond.MyCanvas();
    private Shape diamond, firstShape, secondShape, thirdShape;
    private Timer timer;
    int shrinkFactor = 2;
    private int xChange = 10;
    private int yChange = 10;
    private int aChange = 10;
    private int bChange = 10;
    private int cChange = 10;
    private int dChange = 10;
    private int eChange = 10;
    private int fChange = 10;
    public static void main(String[] args) {
        new MovingDiamond();
    }

    public MovingDiamond() {
        diamond = new Diamond(800, 100, 200, 200, Color.yellow);
        firstShape = new Rectangle(0, 0, 50, 50, Color.red);
        secondShape = new Oval(250, 250, 200, 200, Color.green);
        thirdShape = new Triangle(0, 400, 50, 50, Color.blue);
        timer = new Timer(10, this); // these statements trigger
        timer.setInitialDelay(0);     // an ActionEvent
        timer.start();                // ten times a second
        setLayout(new BorderLayout());
        setSize(1000, 1000);
        setTitle("Moving Shapes");
        add("Center", myCanvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        myCanvas.repaint();
    }

    private class MyCanvas extends Canvas {

        public void paint(Graphics g) {
            int x, y, a, b, c, d, e, f, width, height, width1, height1, width2, height2, width3, height3;


            diamond.draw(g);
            firstShape.draw(g);
            secondShape.draw(g);
            thirdShape.draw(g);


            x = diamond.getX();
            y = diamond.getY();
            a = firstShape.getX();
            b = firstShape.getY();
            c = secondShape.getX();
            d = secondShape.getY();
            e = thirdShape.getX();
            f = thirdShape.getY();

            width = diamond.getWidth();
            height = diamond.getHeight();
            width3 = thirdShape.getWidth();
            height3 = thirdShape.getHeight();
            width2 = secondShape.getWidth();
            height2 = secondShape.getHeight();
            width1 = firstShape.getWidth();
            height1 = firstShape.getHeight();




            if (x < 0 || x > 1000 || y < 0 || y > 1000 || width == 0 ||a < 0 || a > 1000 || b < 0 || b > 1000 || width1 == 0 || c < 0 || c > 1000 || d < 0 || d > 1000 || width2 == 0 || e < 0 || e > 1000 || f < 0 || f > 1000 || width3 == 0) {
                x = (int) (1000 * Math.random());
                y = (int) (1000 * Math.random());
                shrinkFactor = (int) (10 * Math.random());
                width = 200;
                height = 200;
                width1 = 200;
                height1 = 200;
                width2 = 200;
                height = 200;
                width3 = 200;
                height3 = 200;
                xChange = (int) (10 * (Math.random() - 0.5));
                yChange = (int) (10 * (Math.random() - 0.5));
                aChange = (int) (10 * (Math.random() - 0.5));
                bChange = (int) (10 * (Math.random() - 0.5));
                cChange = (int) (10 * (Math.random() - 0.5));
                dChange = (int) (10 * (Math.random() - 0.5));
                eChange = (int) (10 * (Math.random() - 0.5));
                fChange = (int) (10 * (Math.random() - 0.5));
            }
            diamond.setWidth(width - shrinkFactor);
            diamond.setHeight(height - shrinkFactor);
            diamond.setX(x + xChange);
            diamond.setY(y + yChange);
//            diamond.setWidth(width - 2);
//            diamond.setHeight(height - 2);
//            diamond.setX(x - 5);
//            diamond.setY(y + 7);


            firstShape.setWidth(width1 + shrinkFactor);
            firstShape.setHeight(height1 + shrinkFactor);
            firstShape.setX(a + aChange);
            firstShape.setY(b + bChange);

            secondShape.setWidth(width2 + shrinkFactor);
            secondShape.setHeight(height2 + shrinkFactor);
            secondShape.setX(c + cChange);
            secondShape.setY(d + dChange);

            thirdShape.setWidth(width3 + shrinkFactor);
            thirdShape.setHeight(height3 + shrinkFactor);
            thirdShape.setX(e + eChange);
            thirdShape.setY(f + fChange);
        }
    }
}