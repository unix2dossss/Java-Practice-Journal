/*
 *	===============================================================================
 *	PolygonShape.java : A shape that is a polygon.
 *  YOUR UPI:
 *	=============================================================================== */
import java.awt.*;
import java.util.Arrays;
//Complete the PolygonShape class

class PolygonShape extends SquareShape{
    private Point centre;
    private int radius;
    private int numberOfSides;

    public PolygonShape(){
        this(DEFAULT_X, DEFAULT_Y, DEFAULT_HEIGHT, DEFAULT_PANEL_WIDTH, DEFAULT_PANEL_HEIGHT, DEFAULT_COLOR, DEFAULT_BORDER_COLOR, DEFAULT_PATHTYPE, ShapeType.HEXAGON);
    }
    public PolygonShape(int x, int y, int s, int panelWidth, int panelHeight, Color c, Color bc, PathType pt, ShapeType st){
        super(x, y, s, panelWidth, panelHeight, c, bc, pt);
        radius = s/2;
        numberOfSides = st.getNumberOfSides();
        centre = new Point(s/2, s/2);
    }
    public void draw(Graphics g){
        centre.x = super.getX() + super.getWidth() / 2;
        centre.y = super.getY() + super.getHeight() / 2;
        System.out.println(this.color);
        System.out.println(this.borderColor);
        System.out.println(super.toString());

        int[] x_coordinates = new int[numberOfSides];
        int[] y_coordinates = new int[numberOfSides];

        for (int i = 0; i <= numberOfSides-1; i++) {
            x_coordinates[i] = (int) (centre.x + radius * Math.cos((i * 2 * Math.PI) / numberOfSides));
            y_coordinates[i] = (int) (centre.y + radius * Math.sin((i * 2 * Math.PI) / numberOfSides));
        }
        System.out.println(String.format("%s:%s,%s", this.getClass().getName(), Arrays.toString(x_coordinates), Arrays.toString(y_coordinates)));
    }
}