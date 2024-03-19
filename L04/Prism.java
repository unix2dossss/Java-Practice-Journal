// Exercise 1-2
public class Prism{
    public static void main(String[] args){
        // SimpleRectangle p = new SimpleRectangle();
        // System.out.println(p);
        // SimpleRectangle p2 = new SimpleRectangle(10, 5);
        // System.out.println(p2);
        TriangularPrism tp = new TriangularPrism(6, 4, 5, 12);
        System.out.println(tp);
    }
}

class SimpleRectangle{
    public double area;
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

class SimpleTriangle{
    public double area;

    public SimpleTriangle(){
        area = 0.50;
    }
    public SimpleTriangle(int base, int height){
        area = 0.5 * base * height;
    }
    
    public String toString(){
        return String.format("Rectangle, area=%.3f", area);
    }
}

class TriangularPrism{
    private SimpleTriangle triangle;
    private SimpleRectangle sideRect, bottomRect;
    private double surface_area;
    public TriangularPrism(int triangleBase, int triangleHeight, int triangleSide, int length){
        triangle = new SimpleTriangle(triangleBase, triangleHeight);
        sideRect = new SimpleRectangle(triangleSide, length);
        bottomRect = new SimpleRectangle(triangleBase, length);
        
        surface_area = (sideRect.area*2)+(triangle.area*2)+bottomRect.area;
    }
    public String toString(){
        return String.format("Prism, Surface area=%.2f", surface_area);
    }
}