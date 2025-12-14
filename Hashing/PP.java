
import java.util.*;

public class PP {

    public static void main(String[] args) {
        // Count Distinct : TC: O(n)
        int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }

        // Count Union and Intersection.
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set1 = new HashSet<>();

        // Union
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }

        System.out.println("Union : " + set1.size());
        set1.clear();

        // Intersection
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                System.out.println("Removing element: " + arr2[i]);  // Print the element being removed
                count++;
                set1.remove(arr2[i]);
            }
        }
        System.out.println("Intersection Count: " + count);
    }
}
