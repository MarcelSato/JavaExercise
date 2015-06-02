package Shapes;

import java.awt.*;
class TriangleOutline extends Shape {

   TriangleOutline(int x, int y, int width, int height, Color color) {
      super(x, y, width, height, color);
   }

   public void draw(Graphics g) {
      Color oldColor = g.getColor();
      g.setColor(color);
      // vertices are (x, y), (x+width, y), (x+width/2, y+height)
      Polygon t = new Polygon();
      x+=150;
      y+=150;
      t.addPoint(x , y);
      t.addPoint(x+width, y);
      t.addPoint(x+width/2, y+height);
//      g.fillPolygon(t);
      g.drawPolygon(t);
      g.setColor(oldColor);
      
   }
}
