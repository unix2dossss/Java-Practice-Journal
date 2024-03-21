import java.util.ArrayList;
import java.awt.Point;

public class gridRun{
    public static void main(String[] args){
        Point[] pts = {new Point(2, 2), new Point(7, 6), new Point(24, 36), new Point(53, 85), new Point(3, 24)};
        Grid grid1 = new Grid(1, 1, 10, 10);
        for (Point element:pts)
        System.out.println(grid1.addPoint(element));
        System.out.println(grid1);
        System.out.println(grid1.getSize());
    }
}

class Grid {
    private Point topLeft;
    private Point bottomRight;
    private ArrayList<Point> points = new ArrayList<Point>();

    public Grid(){
        this(0, 0, 1, 1);
    }

    public Grid(int x1, int y1, int x2, int y2){
        topLeft = new Point(x1, y1);
        bottomRight = new Point(x2, y2);
    }

    public Boolean addPoint(Point p){
        if (p.getX()>topLeft.getX() && p.getX()<bottomRight.getX() && p.getY()>topLeft.getY() && p.getY()<bottomRight.getY()){
            points.add(p);
            return true;
        }
        return false;
    }

    public Point getPoint(int index){
        return points.get(index);
    }

    public int getSize(){
        return points.size();
    }

    public String toString(){
        StringBuffer out = new StringBuffer();
        for (int i = 0; i <= points.size()-1; i++){
            out.append(points.get(i));
        }
        return out.toString();
    }
}
