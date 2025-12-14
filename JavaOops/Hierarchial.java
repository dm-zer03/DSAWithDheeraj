package JavaOops;

// All class can access the properties of Animal class
public class Hierarchial {

    public static void main(String[] args) {
        Mammal ape = new Mammal();
        ape.breath();
        ape.eat();

    }
}

// Base class or Super Class
class Animal {

    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breathes");
    }
}

class Mammal extends Animal {

    void walk() {
        System.out.println("Walks...");
    }

}

class fish extends Animal {

    void swim() {
        System.out.println("Swims in water...");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.println("fly in sky...");
    }
}
