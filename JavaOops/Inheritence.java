package JavaOops;

public class Inheritence {

    public static void main(String[] args) {
        // Fish sharks = new Fish();
        // sharks.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.breath();
        dog.legs = 4;
        dog.breed = "Husky";

        System.out.println("Legs: " + dog.legs);
        System.out.println("breed: " + dog.breed);

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

// Single level of inheritence 
// Derived Class or Sub Class
// class Fish extends Animal {
//     int fins;
//     void swim() {
//         System.out.println("Swims in water");
//     }
// }
class Mammal extends Animal {

    int legs;

}

//MultiLevel Inheritence
class Dog extends Mammal {

    String breed;
}
