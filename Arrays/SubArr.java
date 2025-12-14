
import java.util.Arrays;

public class SubArr {

    public static void subArrays(int[] numbers) {
        int totalSub = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    //Print 
                    System.out.print(numbers[k] + " ");

                }
                totalSub++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("totalSub: " + totalSub);
    }

// TC: O(n^3) with Brute force : Simple sol
    public static void maxInSubArraysSum(int[] numbers) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println("currSum: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxSum: " + maxSum);
    }

// TC: O(n^2) with eliminating loop : optimised sol
    public static void prefixSum(int[] numbers) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix sum 
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        System.out.println("Prefix Arr: " + Arrays.toString(prefix));

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                //ternary operator
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxSum: " + maxSum);
    }

    // TC: O(n) very optimised code 
    public static void kadaneAlgo(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int cuntSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            cuntSum = cuntSum + numbers[i];
            if (cuntSum < 0) {
                cuntSum = 0;
            }
            maxSum = Math.max(cuntSum, maxSum);
        }
        System.out.println("Max sum of subArr: " + maxSum);
    }

    public static void kadaneAlgo2(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("Max sum of subArr: " + maxSum);
    }

    public static void main(String[] args) {
        // int[] numbers = {2, 4, 6, 8, 10};
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] allNegativeNumbers = {-2, -3, -1, -4};
        // subArrays(numbers);
        // maxInSubArraysSum(numbers);
        // prefixSum(numbers);
        kadaneAlgo(numbers);
        kadaneAlgo2(allNegativeNumbers);

    }
}
