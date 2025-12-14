package Recursion;

public class Duplicate {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //Work 
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static int friendPairing(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        // Choice 
        //Single 
        int fnm1 = friendPairing(n - 1);

        //Pair
        int fnm2 = friendPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        //Total Ways 
        int totalWays = fnm1 + pairWays;

        return totalWays;

    }

    public static void printBinString(int n, int lastPlace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinString(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {

        String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(friendPairing(3));
        printBinString(3, 0, "");
    }
}
