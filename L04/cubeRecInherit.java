import java.awt.Point;

public class cubeRecInherit{
    public static void main(String[] args){
        MySubCuboid r = new MySubCuboid();
        System.out.println(r);
        MySubCuboid r1 = new MySubCuboid(25);
        System.out.println(r1);
        MySubCuboid r2 = new MySubCuboid(25, 32, 36, 12, 25);
        System.out.println(r2);
        System.out.println(r2 instanceof MySimpleRectangle);
        System.out.println(r2 instanceof MySubCuboid);
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

class MySubCuboid extends MySimpleRectangle{
    private double length;
    public MySubCuboid(){
        this(1);
    }
    public MySubCuboid(int x, int y, int width, int height, int length){
        super(x, y, width, height);
        this.length = length;
    }
    public MySubCuboid(int length){
        super();
        this.length = length;
    }
    public int getVolume(){
        return ((int)this.length*this.getArea());
    }

    public String toString(){
        return String.format("MySubCuboid, volume=%d", this.getVolume());
    }
}