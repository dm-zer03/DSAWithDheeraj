package Collection;
// Find  if any pair in a **Sorted** ArrayList has a target Sum

import java.util.ArrayList;

public class PairSum {

    //BFS TC:O(n^2)
    public static boolean pairSum(ArrayList<Integer> pairList, int target) {
        for (int i = 0; i < pairList.size(); i++) {
            for (int j = i + 1; j < pairList.size(); j++) {
                if ((pairList.get(i) + pairList.get(j)) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2 Pointer Approach : O(n)
    public static boolean pairSum2(ArrayList<Integer> pairList, int target) {
        int lp = 0;
        int rp = pairList.size() - 1;

        while (lp != rp) {
            // case 1
            if ((pairList.get(lp) + pairList.get(rp)) == target) {
                return true;
            }

            // case 2
            if ((pairList.get(lp) + pairList.get(rp)) < target) {
                lp++;
            } else {
                rp--;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> pairList = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            pairList.add(i);
        }
        // System.out.println(pairList);
        int target = 5;

        // System.out.println(pairSum(pairList, target));
        System.out.println(pairSum2(pairList, target));
    }
}
