package JavaOops;

public class Abstracts {

    public static void main(String[] args) {
        // Animal hen = new Hen();
        // hen.walk();

        // Animal horse = new Horse();
        // horse.walk();
        // Hen hen = new Hen();
        // hen.eat();
        // hen.walk();
        // System.out.println("Color:" + hen.color);
        // hen.changeColor();
        // System.out.println("Color after calling chageColor:" + hen.color);
        // Horse horse = new Horse();
        // horse.eat();
        // horse.walk();
        // System.out.println("Color:" + horse.color);
        // horse.changeColor();
        // System.out.println("Color after calling chageColor:" + horse.color);
        Mustang myHorse = new Mustang();
        //Animal->Horse->Mustang
    }

}

abstract class Animal {

    String color;

    Animal() {
        color = "Peach";
        System.out.println("Animal Constructor is called ");
    }

    void eat() {
        System.out.println("Animals Eats...");
    }

    abstract void walk();
}

class Horse extends Animal {
    //constructor in Abstract class
    // works unless until we call changeColor ,default color will be Brown

    Horse() {
        System.out.println("Horse Constructor is called ");

    }

    void changeColor() {
        color = "Brown";

    }

    void walk() {
        System.out.println("Walks on 4 legs ...");
    }
}

class Mustang extends Horse {

    Mustang() {
        System.out.println("Mustang Constructor is called ");

    }

}

class Hen extends Animal {

    Hen() {
        System.out.println("Hen Constructor is called ");

    }

    void changeColor() {
        color = "Dark Brown";

    }

    void walk() {
        System.out.println("Walks on 2 legs ...");
    }
}
