package JavaOops;

public class DeepCopy {

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

    //Deep copy constructor :LazyCopy:StackOverflow
    Student(Student student) {
        marks = new int[3];
        this.name = student.name;
        this.rollNo = student.rollNo;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = student.marks[i];
        }
    }

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
