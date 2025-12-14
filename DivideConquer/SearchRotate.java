package DivideConquer;

public class SearchRotate {

    public static int rotatedSearch(int arr[], int target, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        //Work 
        int mid = si + (ei - si) / 2;

        //case Found
        if (arr[mid] == target) {
            return mid;
        }

        //mid On L1
        if (arr[si] <= arr[mid]) {

            //Case a:left  
            if (arr[si] <= target && target <= arr[mid]) {
                return rotatedSearch(arr, target, si, mid - 1);
            } //Case b :right 
            else {
                return rotatedSearch(arr, target, mid + 1, ei);
            }
        } //mid on L2
        else {

            //Case c : right
            if (arr[mid] <= target && target <= arr[ei]) {
                return rotatedSearch(arr, target, mid + 1, ei);
            } //Case d:left 
            else {
                return rotatedSearch(arr, target, si, mid - 1);

            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 6; //OutPut -> Index @ 

        int tarIdx = rotatedSearch(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
