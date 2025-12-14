package JavaOops;

public class StaticKey {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.schoolName = "JMV";
        // for all object schoolName is set By "JMV"

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        s2.schoolName = "Hello";
        System.out.println(s2.schoolName);//Hello
        System.out.println(s1.schoolName);//Hello but it was "JMV"

        System.out.println(Student.rtrnPercentage(40, 50, 60));
    }
}

class Student {

    static int rtrnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
