import java.util.ArrayList;

import javax.net.ssl.HostnameVerifier;

public class test {
    public static void main(String[] args) {
        Cat theCat = new Cat();
        Dog theDog = new Dog();
        Frog theFrog = new Frog();
        Flamingo theFlamingo = new Flamingo();
        System.out.println("The CAT says :" + theCat.speak());
        System.out.println("The DOG says :" + theDog.speak());
        System.out.println("The FROG says :" + theFrog.speak());
        System.out.println("The FLAMINGO says :" + theFlamingo.speak());
    }
}

class Pet {
    String speak() {
        return "Hi, I'm a happy and contented pet";
    }
}

class Dog extends Pet {
    String speak() {
        return super.speak() + ". Arf, Arf";
    }
}

class Cat extends Pet {
    String speak() {
        return super.speak() + ". Meow, meow";
    }
}

class Flamingo extends Pet {
    String speak() {
        return "They're holding me captive. You must help!";
    }
}

class Frog extends Pet {
    public String speak(){
        return "Ribbit!🐸";
    }
}