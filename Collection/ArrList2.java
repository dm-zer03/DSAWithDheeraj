
import java.util.*;

public class ArrList2 {

    public static void swap(List<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // for (int i = 0; i < list.size(); i++) {
        //     // if (list.get(i) > max) {
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println("Max Element : " + max);

        /*  Swapping
        System.out.println(list);
        int idx1 = 1, idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println(list);*/
        System.out.println("Normal list: " + list);
        // Sorting the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        //Collections:comparator defines soting logic
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Using Comparator: " + list);

        // Reversing the list
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

    }
}
