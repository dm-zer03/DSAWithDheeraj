
public class Palindrome {

    //TC:O(n)
    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // check for not palindrome 
                System.out.println("The String is not a Palindrome");
                return false;
            }
        }
        System.out.println("The String is Palindrome");
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // South 
            if (dir == 'S') {
                y--;

            } //North
            else if (dir == 'N') {
                y++;

            } //West
            else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = 0; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        // String str = "racecar";
        // isPalindrome(str);

        // String path = "WNEENESENNN";
        // System.out.println("Shortest Path:" + getShortestPath(path));
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");
        // == check the object and address 
        // equals checks the value only 
        // if (s1 == s2) {
        //     System.out.println("Strings are equals");
        // } else {
        //     System.out.println("Strings are not equals");
        // }
        // if (s1 == s3) {
        //     System.out.println("Strings are equals");
        // } else {
        //     System.out.println("Strings are not equals");
        // }
        //Wherever you need to compare String use equals()
        // if (s1.equals(s3)) {
        //     System.out.println("Strings are equals");
        // } else {
        //     System.out.println("Strings are not equals");
        // }
        String str = "HelloWorld";
        //In subString last idx is non-inclusive
        System.out.println(str.substring(0, 5));
        // System.out.println("SubStr:" + subString(str, 0, 4));
    }

}
