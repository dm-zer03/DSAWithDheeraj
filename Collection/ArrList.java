package Collection;

import java.util.ArrayList;
//TC 
// Add Element : O(1)
// Get Elemant : O(1)
// Remove Element : O(n)
// Set Element at Index  : O(n)
// Contains Element : O(n)

public class ArrList {

    public static void main(String[] args) {
        //Vectors in C++
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //Add element => O(1)
        list.add(25);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //Get Element => O(1)
        System.out.println("Get @ 2: " + list.get(2));

        //Remove Element => O(n) -> Return remove element
        System.out.println("Removed @ 2: " + list.remove(2));

        //Set element at index  => O(n) -> Return  set index previous element
        System.out.println("Set @ 0: " + list.set(0, 12));
        System.out.println(list);

        //Contains element =>O(n)
        System.out.println("Contains: " + list.contains(12));
        System.out.println("Contains: " + list.contains(15));

        //Adding element at particular index =>O(n)
        // Shifting operations
        list.add(0, 9);
        System.out.println("Adding element at particular index: " + list);

        // Size Of ArrayList 
        System.out.println("Size:" + list.size());

        System.out.println("---Using for Loop---");

        //Print ArrayList using for Loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("---Using for Each Loop---");
        //Print ArrayList using for each 
        for (Integer num : list) {
            System.out.print(num + " "); // Will print each sublist
        }
        System.out.println();

        System.out.println("---ArrayList Reverse---");

        //Print ArrayList in reverse 
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
