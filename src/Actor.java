import java.awt.Color;
import java.awt.Graphics;

import java.awt.Rectangle;

public class Actor extends Rectangle {

    static int size = 35;
    private String name;
    private Color color;

    public void paint(Graphics g) {
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }

    public static Actor createActor(int inX, int inY, String actorName, Color actorColor)
    {
        Actor returnVal = new Actor();
        returnVal.x = inX;
        returnVal.y = inY;
        returnVal.name = actorName;
        returnVal.color = actorColor;
        return returnVal;
    }
}
