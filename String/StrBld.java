
public class StrBld {

    //TC:O(n^2)
    public static String conOfString(String str) {

        for (char ch = 'a'; ch <= 'z'; ch++) {
            str += (ch);
        }
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        //O(26)
        // Memory efficiency & programming is easy with string builder.
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.length());

        conOfString("");
    }
}
