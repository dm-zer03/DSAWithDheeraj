package Collection;
// find if any pair in Sorted & Rotated ArrayList has a target sum.
// Breaking point or pivot point 
// list(i)<list(i+1)
// 11<15>6<8<8<10
//      | Breaking Point

import java.util.ArrayList;

public class PairSum2 {

    // 2 Pointer Approach : O(n)
    public static boolean pairSum2(ArrayList<Integer> pairList, int target) {
        int bp = -1;
        int n = pairList.size();

        for (int i = 0; i < pairList.size(); i++) {
            if (pairList.get(i) > pairList.get(i + 1)) {
                //breaking point
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            // case 1
            if ((pairList.get(lp) + pairList.get(rp)) == target) {
                return true;
            }

            // case 2
            if ((pairList.get(lp) + pairList.get(rp)) < target) {
                //Modulo property
                lp = (lp + 1) % n;

            } else {
                //Modulo property
                rp = (n + rp - 1) % n;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> pairList = new ArrayList<>();
        // 11,15,6,8,9,10 - Sorted and Rotated
        pairList.add(11);
        pairList.add(15);
        pairList.add(6);
        pairList.add(8);
        pairList.add(9);
        pairList.add(10);

        int target = 160;
        System.out.println(pairSum2(pairList, target));

    }
}
