package JavaOops;

//Public class should be always on the top if there is multiple class
// this -> when we have same name variable then it comes more effective.
// First set then get 
public class OOPS {

    public static void main(String[] args) {
        // Pen p1 = new Pen(); // Created a Pen Object of name p1
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // System.out.println(p1.getColor());

        // p1.setTip(7);
        // System.out.println(p1.tip);
        // System.out.println(p1.getTip());
        // BankAccount myAcc = new BankAccount();
        // myAcc.userName = "Dheeraj.Mishra";
        // myAcc.setPassword("Mishra");
        Student s1 = new Student("Dheeraj.Mishra", 03);
        Student s2 = new Student();

        System.out.println("Name:" + s1.name);
        System.out.println("RollNo:" + s1.rollNo);

    }
}

class Pen {

    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;

    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

}

/* 
class BankAccount {

    public String userName;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
 */
class Student {

    String name;
    int rollNo;

    //Constructor
    Student() {
        System.out.println("The Default Constructor is called..");
    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("The Parameterised Constructor is called..");

    }

    //default constructor Student() => java automatically create when 
    // and if not created by Programmer.but there will be no initializations
}
