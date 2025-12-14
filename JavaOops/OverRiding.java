package JavaOops;

public class OverRiding {

    public static void main(String[] args) {

        // Animal animal = new Animal();
        // animal.eat();
        // Animal Animal = new Deer();
        // Animal.eat();
        // Both classes have a function eat();
        // Deer class eats method get implemented 
        Deer deer = new Deer();
        deer.eat();

    }
}

class Animal {

    void eat() {
        System.out.println("Eats any things ");
    }
}

class Deer extends Animal {

    void eat() {
        System.out.println("Eats grass ");
    }
}
