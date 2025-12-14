package JavaOops;

//Super : Immediate parent class.
public class Supers {

    public static void main(String[] args) {
        Horse horse = new Horse();
        System.out.println(horse.color);

    }
}

class Animal {

    String color;

    Animal() {
        System.out.println("Animal Constructor is called...");
    }
}

class Horse extends Animal {

    Horse() {
        super();// Explicitly written but java also called by default as well 
        super.color = "Brown";
        System.out.println("Horse Constructor is called...");

    }

}
