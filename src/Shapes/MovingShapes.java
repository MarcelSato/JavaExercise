package Shapes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MovingShapes extends JFrame 
                    implements ActionListener {
    private MyCanvas myCanvas = new MyCanvas();
    private Shape firstShape, secondShape, thirdShape;
    private Timer timer;

    public static void main(String[] args) {
        new MovingShapes();
    }
    
    public MovingShapes() {
        firstShape = new Rectangle(0, 0, 50, 50, Color.red);
        secondShape = new Oval(250, 250, 200, 200, Color.green);
        thirdShape = new Triangle(0, 400, 50, 50, Color.blue);
        timer = new Timer(100, this); // these statements trigger
        timer.setInitialDelay(0);     // an ActionEvent
        timer.start();                // ten times a second
        setLayout(new BorderLayout());
        setSize(458, 490);
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
            int x, y, width, height;
            firstShape.draw(g);
            x = firstShape.getX();
            y = firstShape.getY();
            width = firstShape.getWidth();
            firstShape.setWidth(width + 5);
            height = firstShape.getHeight();
            firstShape.setHeight(height + 5);
            firstShape.setX(x + 10);
            firstShape.setY(y + 10);

            secondShape.draw(g);
            x = secondShape.getX();
            y = secondShape.getY();
            width = secondShape.getWidth();
            secondShape.setWidth(width - 5);
            height = secondShape.getHeight();
            secondShape.setHeight(height - 5);
            secondShape.setX(x - 10);
            secondShape.setY(y - 10);

            thirdShape.draw(g);
            x = thirdShape.getX();
            y = thirdShape.getY();
            width = thirdShape.getWidth();
            thirdShape.setWidth(width + 5);
            height = thirdShape.getHeight();
            thirdShape.setHeight(height + 5);
            thirdShape.setX(x + 10);
            thirdShape.setY(y - 10);
        }
    }
}