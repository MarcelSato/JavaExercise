package Shapes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FixedShapes extends JFrame {
    private MyCanvas myCanvas = new MyCanvas();

    public static void main(String[] args) {
        new FixedShapes();
    }
    
    public FixedShapes() {
        setLayout(new BorderLayout());
        setSize(560, 560);
        setTitle("Fixed Shapes");
        add("Center", myCanvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class MyCanvas extends Canvas {
        public void paint(Graphics g) {
            Shape firstShape = new Rectangle(100, 100, 150, 150, Color.red);
            Shape secondShape = new Oval(200, 150, 150, 150, Color.green);
            Shape thirdShape = new Triangle(120, 220, 150, 150, Color.blue);
            Shape fourthShape = new RectangleOutline(100, 100, 150, 150, Color.red);
            Shape fithShape = new OvalOutline(200, 150, 150, 150, Color.green);
            Shape sixthShape = new TriangleOutline(120, 220, 150, 150, Color.blue);
            Shape diamond = new Diamond(70,170,150,150,Color.blue);
            firstShape.draw(g);
            secondShape.draw(g);
            thirdShape.draw(g);
            fourthShape.draw(g);
            fithShape.draw(g);
            sixthShape.draw(g);
            diamond.draw(g);
        }
    }
}