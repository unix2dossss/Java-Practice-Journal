import java.awt.Point;
import java.util.ArrayList;;

public class polyLineRun {
    public static void main(String[] args){
    PolyLine line1 = new PolyLine(); 
    line1.appendPoint(10, 20); 
    PolyLine line2 = new PolyLine(); 
    line2.appendPoint(10, 20);
    System.out.println(line1);
    System.out.println(line2);
    System.out.println(line1 == line2);
    line1.appendPoint(20, 30);
    System.out.println(line1);
    PolyLine line3 = new PolyLine();
    System.out.println(line3);
    System.out.println("DONE");
    }
}

class PolyLine {
    private static ArrayList<Point> points;
    public PolyLine(){
        points = new ArrayList<Point>();
    }
    public void appendPoint(int x, int y){
        points.add(new Point(x, y));
    }
    public String toString(){
        StringBuffer out = new StringBuffer();
        if (points.size() == 0) {
            return "";
        } else if (points.size() != 1){
            for (int p = 0; p<=points.size()-2; p++){
                out.append(String.format("%s>", points.get(p).toString()));
            }
        }
        out.append(String.format("%s", points.get(points.size()-1).toString()));
        return out.toString();
    }
}