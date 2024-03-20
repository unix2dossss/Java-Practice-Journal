import java.awt.Point;

public class cuboidRectangle{
    public static void main(String[] args){
        MySimpleCuboid r = new MySimpleCuboid();
        System.out.println(r);
        MySimpleCuboid r1 = new MySimpleCuboid(25);
        System.out.println(r1);
        MySimpleCuboid r2 = new MySimpleCuboid(25, 32, 36, 12, 25);
        System.out.println(r2);
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

class MySimpleCuboid{
    private MySimpleRectangle base;
    private int length;
    public MySimpleCuboid(){
        this(0, 0, 1, 2, 1);
    }
    public MySimpleCuboid(int x, int y, int width, int height, int length){
        base = new MySimpleRectangle(x, y, width, height);
        this.length = length;
    }
    public MySimpleCuboid(int length){
        this(0, 0, 1, 2, length);
    }
    public int getVolume(){
        return length*base.getArea();
    }
    public String toString(){
        return String.format("%s, volume=%d", getClass().getName(), this.getVolume());
    }
}