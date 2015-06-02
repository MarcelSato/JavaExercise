package Shapes;

import java.awt.*;
abstract class Shape {

    // What do our shapes have in common?
    // A top left (x, y) position, 
    // a width and height
    // and a color, so:
    protected int x, y, width, height;
    protected Color color;

    // Constructor
    Shape(int x, int y, int width, int height, Color color) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    // get methods
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public Color getColor() { return color; }

    // set methods
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setWidth(int width) { 
        // can't have a negative width so:
        this.width = (width < 0) ? 0 : width;
    }
    public void setHeight(int height) { 
        // can't have a negative height so:
        this.height = (height < 0) ? 0 : height;
    }
    public void setColor(Color color) { this.color = color; }
    
    // Abstract method to draw the shape
    public abstract void draw(Graphics g);

    // Note that each subclass MUST implement draw if it is not
    // itself to be abstract
}
