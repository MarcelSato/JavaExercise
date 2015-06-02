package Shapes;

import java.awt.*;
class OvalOutline extends Shape {

   OvalOutline(int x, int y, int width, int height, Color color) {
      super(x, y, width, height, color);
   }

   public void draw(Graphics g) {
       x+=150;
       y+=150;
      Color oldColor = g.getColor();
      g.setColor(color);
//      g.fillOval(x, y, width, height);
      g.drawOval(x, y, width, height);
      g.setColor(oldColor);
   }
}
