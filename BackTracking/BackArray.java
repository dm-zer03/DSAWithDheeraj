package BackTracking;

public class BackArray {
    //TC : O(n)
    //SC : O(n)

    public static void changeArr(int[] arr, int i, int val) {
        //base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);//It will first full the array then
        // After return call there will be minus 
        arr[i] = arr[i] - 2; //BackTracking Step -Always Should be after function call 

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

    }

}
