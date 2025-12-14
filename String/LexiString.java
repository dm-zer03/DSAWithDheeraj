
public class LexiString {

    //TC:O(x*n)
    // where x = length of largest string 
    // n = no of iteration 
    public static void main(String[] args) {
        //Lexicography: character wise checking 
        // str1.compareTo(str2)  // Same compareToIgnoreCase()
        // 0:equals
        // <0:-ve str1<str2
        // >0:+ve str1>str2

        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("Largest:" + largest);
    }
}
