
public class Largest {

    //TC : O(n)
    public static int getMin(int arr[], int min) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];

            }

        }
        return min;
    }

    //TC : O(n)
    public static int getLarge(int arr[], int max) {
        if (arr.length == 0) {
            return -1;
        }
        // first all the number should be compared and largest 
        // should be found then oustide forloop max should return 
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 9};
        int max = Integer.MIN_VALUE; // -infinity
        int min = Integer.MAX_VALUE; //+ infinity

        System.out.println("The largest number in array : " + getLarge(arr, max));
        System.out.println("The minimum number in array : " + getMin(arr, min));

    }
}
