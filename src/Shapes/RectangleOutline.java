package Shapes;

import java.awt.*;
class RectangleOutline extends Shape {

   RectangleOutline(int x, int y, int width, int height, Color color) {
      super(x, y, width, height, color);
   }

   public void draw(Graphics g) {
       x+=150;
       y+=150;
      Color oldColor = g.getColor();
      g.setColor(color);
//      g.fillRect(x, y, width, height);
      g.drawRect(x, y, width, height);
      g.setColor(oldColor);
   }
}