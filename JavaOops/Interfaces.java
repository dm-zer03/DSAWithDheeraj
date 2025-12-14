package JavaOops;

public class Interfaces {

    public static void main(String[] args) {

        // How abstractions -> we have just defined in superClass
        // moves only and every class heas it own move style. 
        Queen q = new Queen();
        q.moves();

    }
}

interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer {

    public void moves() {
        System.out.println("Up,Down,Left,Right,Diagonal (In all 4 directions)");
    }
}

class Rook implements ChessPlayer {

    public void moves() {
        System.out.println("Up,Down,Left,Right");
    }
}

class King implements ChessPlayer {

    public void moves() {
        System.out.println("Up,Down,Left,Right,Diagonal by one Step");
    }
}
