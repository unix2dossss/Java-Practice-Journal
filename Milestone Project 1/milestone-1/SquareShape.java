/**
 * ===============================================================================
 * SquareShape.java : A shape that is a square.
 * YOUR UPI:
 * =============================================================================== */
import java.awt.*;
//Complete the SquareShape class

class SquareShape extends RectangleShape{
    public SquareShape(){
        this(DEFAULT_X, DEFAULT_Y, DEFAULT_HEIGHT, DEFAULT_PANEL_WIDTH, DEFAULT_PANEL_HEIGHT, DEFAULT_COLOR, DEFAULT_BORDER_COLOR, DEFAULT_PATHTYPE);
    }
    public SquareShape(int x, int y, int s, int panelWidth, int panelHeight, Color c, Color bc, PathType pt){
        super(x, y, s, s, panelWidth, panelHeight, c, bc, pt);
    }
}