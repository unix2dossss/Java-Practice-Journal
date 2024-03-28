public class subclassesExercise03 {
    public static void main(String[] args) {
        // Base b1 = new Base();
        // Derived d = new Derived();
        // Base b2 = new Derived();

        // // print base string method;
        // System.out.println(b1);
        // // print derived string method;
        // System.out.println(d);
        // // print derived string method;
        // System.out.println(b2);

        // // 300
        // System.out.println(b1.foo());
        // // 400
        // System.out.println(d.foo());

        // 301
        System.out.println(Base.goo());
        // 401
        System.out.println(Derived.goo());

    }
}

class Base {
    protected int x = 20;
    public static int y = 300;

    Base() {
        x = y++;
    }

    public int foo() {
        return x;
    }

    public void method1() {
        System.out.println("Base");
    }

    public static int goo() {
        return y;
    }

    public String toString() {
        return String.format("%s:x=%d,y=%d", "Base", x, y);
    }
}

class Derived extends Base {
    private int x = 30;
    public static int y = 400;

    Derived() {
        x = y++;
    }

    public int foo() {
        return x;
    }

    public void method2() {
        System.out.println("Derived");
    }

    public static int goo() {
        return y;
    }

    public String toString() {
        return String.format("super.x=%d,super.y=%d,x=%d,y=%d", super.x, super.y, x, y);
    }
}
