
public class ArrPassByRef {

    public static void update(int marks[], int nonChangelable) {
        nonChangelable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {

        int marks[] = {97, 98, 99};
        int nonChangelable = 5;
        update(marks, nonChangelable);

        // printing the array element 
        for (int i = 0; i < marks.length; i++) {
            System.out.print("marks[" + i + "]:" + marks[i] + " ");
        }
        System.out.println("nonChangelable:" + nonChangelable); //No Change 
        System.out.println();
    }
}

// Arrays are call by ref :Special take care while passing as argument in functions 
//marks[0]:98 marks[1]:99 marks[2]:100  
// Variables are call by values.

