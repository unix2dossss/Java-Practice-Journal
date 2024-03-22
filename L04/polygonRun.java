public class polygonRun{
    public static void main(String[] args){
        MyHexagon t1 = new MyHexagon(3);
        System.out.println(t1.getNumberOfSides());
        System.out.println(t1.getSideLength());System.out.printf("The area is %.2f\n", t1.getArea());
        MyHexagon t2 = new MyHexagon(5);
        System.out.println(t2.getNumberOfSides());
        System.out.println(t2.getSideLength());System.out.printf("The area is %.2f\n", t2.getArea());
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1 instanceof MyNGon);
    }
}

class MyNGon {
    protected int numberOfSides;
    protected int sideLength;
    
    public MyNGon(){
        this(0, 1);
    }
    public MyNGon(int numberOfSide, int sideLength){
        this.sideLength = sideLength;
        this.numberOfSides = numberOfSide;
    }

    public int getSideLength(){
        return sideLength;
    }

    public int getNumberOfSides(){
        return numberOfSides;
    }

    public String toString(){
        return String.format("%d sides * %d", this.numberOfSides, this.sideLength);
    }

}

class MyPentagon extends MyNGon{
    public MyPentagon(int sideLength){
        super(5, sideLength);
    }
    public double getArea(){
        return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*Math.pow(this.getSideLength(), 2);
    }

    public String toString(){
        return String.format("%s, area=%.2f", super.toString(), this.getArea());
    }
}


class MyHexagon extends MyNGon{
    public MyHexagon(int sideLength){
        super(6, sideLength);
    }
    public double getArea(){
        return ((3*Math.sqrt(3))/2)*Math.pow(this.getSideLength(), 2);
    }

    public String toString(){
        return String.format("%s, area=%.2f", super.toString(), this.getArea());
    }
}