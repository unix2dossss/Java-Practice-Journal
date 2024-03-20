import java.awt.Point;

public class cuboidRectangle{
    public static void main(String[] args){
        MySimpleRectangle r = new MySimpleRectangle();
        System.out.println(r);
        System.out.println(r.getTopLeft());
        MySimpleRectangle r1 = new MySimpleRectangle(10, 20, 30, 40);
        System.out.println(r1);
        System.out.printf("width=%d, height=%d, area=%d\n", r1.getWidth(), r1.getHeight(),r1.getPerimeter());
        MySimpleRectangle r2 = new MySimpleRectangle(new Point(10, 20));
        System.out.println(r2);
        System.out.printf("width=%d, height=%d, area=%d\n", r1.getWidth(), r1.getHeight(),r1.getPerimeter());
    }
}

class MySimpleRectangle {
    private Point topLeft;
    private int width;
    private int height;
    public MySimpleRectangle(){ 
        this(0, 0, 1, 2);
    }
    public MySimpleRectangle(Point topLeft){
        this((int) topLeft.getX(), (int) topLeft.getY(), 1, 2);
    }
    public MySimpleRectangle(int x, int y, int w, int h){
        Point point = new Point(x, y);
        this.topLeft = point;
        width = w;
        height= h;
    }

    public Point getTopLeft(){
        return topLeft;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getPerimeter(){
        return 2*(width + height);
    }

    public int getArea(){
        return width*height;
    }

    public String toString(){
        return String.format("%s, area=%d", getClass().getName(), this.getArea());
    }

}