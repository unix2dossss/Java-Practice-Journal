import java.awt.Point;
import java.util.ArrayList;;

public class polyLineRun {
    public static void main(String[] args){
        PolyLine line = new PolyLine();
        line.appendPoint(1, 2);
        line.appendPoint(3, 4);
        line.appendPoint(5, 6);
        System.out.printf("%.2f%n", line.getLength());
        PolyLine line2 = new PolyLine();
        line2.appendPoint(5, 6);
        System.out.printf("%.2f%n", line2.getLength());
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

    public int getSize(){
        return points.size();
    }

    public double getLength(){
        double length = 0.00;
        if (this.getSize()<=1){
            return length;
        }
        for (int p = 0; p<=this.getSize()-2; p++) {
            length += points.get(p).distance(points.get(p+1));
        }
        return length;
    }
}