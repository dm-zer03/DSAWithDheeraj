
import java.util.*;

public class IndianCoins {

    public static void main(String[] args) {

        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int idx = 0; idx < coins.length; idx++) {
            if (coins[idx] <= amount) {
                while (coins[idx] <= amount) {
                    countOfCoins++;
                    ans.add(coins[idx]);
                    amount -= coins[idx];
                }
            }
        }
        System.out.println("Total(min) coins used = " + countOfCoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
