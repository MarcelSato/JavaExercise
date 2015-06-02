package Shapes;

import java.awt.*;
class Oval extends Shape {

   Oval(int x, int y, int width, int height, Color color) {
      super(x, y, width, height, color);
   }

   public void draw(Graphics g) {
      Color oldColor = g.getColor();
      g.setColor(color);
      g.fillOval(x, y, width, height);
      g.setColor(oldColor);
      g.drawOval(x, y, width, height);
   }
}
