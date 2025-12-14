package JavaOops;

// Copy: C++ By default provide this 
// In Java we have to create this 
public class CopyConstructors {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Dheeraj.Mishra";
        s1.rollNo = 3;
        s1.password = "Mishra";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "Dheeraj";
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.password);

        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {

    String name;
    int rollNo;
    String password;
    int marks[];

    // Copy Constructor but Shallow
    Student(Student student) {
        marks = new int[3];
        this.name = student.name;
        this.rollNo = student.rollNo;
        this.marks = student.marks;
        System.out.println("The Copy Constructor is called..");
    }

    //Deep copy constructor 
    //Constructor =>if It is commented then CTE , this is req to initialised 
    // Copy Constructor. 
    Student() {
        marks = new int[3];
        System.out.println("The Default Constructor is called..");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int rollNo) {
        marks = new int[3];
        this.rollNo = rollNo;
    }
}
