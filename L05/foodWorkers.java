import java.util.ArrayList;

import javax.net.ssl.HostnameVerifier;

public class foodWorkers {
    public static void main(String[] args) {
        ArrayList<Person> pList = new ArrayList<Person>();
        pList.add(new Person("Dick", "Smith"));
        pList.add(new HouseWorker("Theresa", "Thompson"));
        pList.add(new PizzaChef("Michael", "Hill"));
        pList.add(new KFCChef("Peter", "Wong"));
        pList.add(new TakeAwayChef("Kevin", "Chan"));

        // Runs fine.
        for (Person p : pList)
            p.cookDinner();
        // Person Superclass does not have .cleanKitchen method.
        for (Person p : pList)
            p.cleanKitchen();

        // Indexing Error. Not an Array. It's an ArrayList, have to use .get()
        Person hw3 = people[1];
        hw3.cookDinner();
        HouseWorker hw4 = people[1];
        hw4.cleanKitchen();

        // 'Chicken and Potato'
        Person hw1 = pList.get(1);
        System.out.println(hw1.getClass());
        hw1.cookDinner();
        // Objects in pList are of type Person. Hw can't be Person. Vehicle can't be car.
        HouseWorker hw2 = pList.get(1);
        hw2.cleanKitchen();

    }
}

class Person {
    protected String surname;
    protected String firstname;

    public Person(String firstname, String surname) {
        this.surname = surname;
        this.firstname = firstname;
    }

    public void cookDinner() {
        System.out.println("Microwave Dinner");
    }
}

class HouseWorker extends Person {
    public HouseWorker(String firstname, String surname) {
        super(firstname, surname);
    }

    public void cookDinner() {
        System.out.println("Roast Chicken with Potato");
    }

    public void cleanKitchen() {
        System.out.println("Cleaning now");
    }
}

class PizzaChef extends Person {
    public PizzaChef(String firstname, String surname) {
        super(firstname, surname);
    }

    public void cookDinner() {
        System.out.println("Pizza");
    }

    public void garlicbread() {
        System.out.println("Yummy");
    }
}

class KFCChef extends Person {
    public KFCChef(String firstname, String surname) {
        super(firstname, surname);
    }

    public void cookDinner() {
        System.out.println("KFC Chicken");
    }
}

class TakeAwayChef extends Person {
    public TakeAwayChef(String firstname, String surname) {
        super(firstname, surname);
    }

    public void cookDinner() {
        System.out.println("Fried Rice");
    }
}