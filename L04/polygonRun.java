public class polygonRun{
    public static void main(String[] args){
        MyNGon t1 = new MyNGon(6, 2);
        System.out.println(t1.getNumberOfSides());
        System.out.println(t1.getSideLength());
        MyNGon t2 = new MyNGon(8, 4);
        System.out.println(t2.getNumberOfSides());
        System.out.println(t2.getSideLength());
        
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