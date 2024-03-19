// Exercise 1-2
public class aggregation{
    public static void main(String[] args){
        SimpleRectangle p = new SimpleRectangle();
        System.out.println(p);
        SimpleRectangle p2 = new SimpleRectangle(10, 5);
        System.out.println(p2);
    }
}

class SimpleRectangle{
    private double area;
    public SimpleRectangle(){
        area = 1f;
    }
    public SimpleRectangle(int l, int w){
        area = (float) l*w;
    }

    public String toString(){
        return String.format("Rectangle, area=%.3f", area);
    }
}