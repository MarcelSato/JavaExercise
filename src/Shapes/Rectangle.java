package Shapes;

import java.awt.*;
class Rectangle extends Shape {

   Rectangle(int x, int y, int width, int height, Color color) {
      super(x, y, width, height, color);
   }

   public void draw(Graphics g) {
      Color oldColor = g.getColor();
      g.setColor(color);
      g.fillRect(x, y, width, height);
      g.setColor(oldColor);
      g.drawRect(x, y, width, height);
   }
}