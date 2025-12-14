package TC;

public class TC {

    public static void main(String[] args) {
        //Simple loop
        int n = 10;
        // n : Input Size May be length of arr or anything
        for (int i = 0; i < n; i++) {
            // Some constant work 
            //is done in this loop
        }

        //TC: O(n*k) -> O(n)
        // k -> Constant Work 
        // Nested loop//
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                // Some constant work 
                // is done in this loop
            }
        }

    }

}
