
public class MulInheri {

    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eatsHerb();
        bear.eatCarni();
    }
}

interface Herbivore {

    void eatsHerb();
}

interface Carnivore {

    void eatCarni();
}

class Bear implements Herbivore, Carnivore {

    public void eatsHerb() {
        System.out.println("Eats grasses");
    }

    public void eatCarni() {
        System.out.println("Eats meats");
    }
}
