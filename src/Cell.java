import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import java.awt.Rectangle;

public class Cell extends Rectangle {
  // fields
  static int size = 35;

  // constructors
  public Cell(int inX, int inY) {
    super(inX, inY, size, size);
  }

  // methods
  public void paint(Graphics g, Point mousePos, Actor[] actors) {
    if (mousePos != null && contains(mousePos)) {
      g.setColor(Color.GRAY);
    }
    else {
      g.setColor(Color.WHITE);
    }
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }

  @Override
  public boolean contains(Rectangle p) {
    if (p != null) {
      return x < p.x && x + size > p.x && y < p.y && y + size > p.y;
    } else {
      return false;
    }
  }

  public boolean containsActor(Actor a) {
    if (a != null) {
      return x < a.x && x + size > a.x && y < a.y && y + size > a.y;
    } else {
      return false;
    }
  }
}
