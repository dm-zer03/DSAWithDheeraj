
public class Sorting {

    //Inbuilt Sorts
    // Array.sort(arr); =>O(n logn)
    // Arrays.sort(arr,si,ei);
    // ? Optimised code for sorted Array with TC:O(n)
    //TC:O(n^2)
    public static void bubbleSorting(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //TC:O(n^2)
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
                //SWAP
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }
    }

    //TC:O(n^2)
    //For negative visit stackOverFlow
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            //finding out the correct pos to insert 

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] = curr;
        }
    }

    //int sort[] = {1, 4, 1, 3, 2, 4, 3, 7};
    public static void countingSort(int sort[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < sort.length; i++) {
            largest = Math.max(largest, sort[i]);
        }

        // Creatring a frequency array
        //largest+1 => because we have to consider zero as well
        int count[] = new int[largest + 1];
        for (int i = 0; i < sort.length; i++) {
            // System.out.println("sort[i]:" + sort[i]);
            // System.out.println("count[sort[i]]++:" + count[sort[i]]++);
            count[sort[i]]++;

        }
        // Sorting 
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sort[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr(Integer Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Integer Arr[] = {5, 4, 1, 3, 2};
        int sort[] = {1, 4, 1, 3, 2, 4, 3, 7};
        //bubbleSorting(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //Arrays.sort(arr);
        //Arrays.sort(arr, 0, 4);
        //printArr(arr);
        //Arrays.sort(Arr, Collections.reverseOrder());
        //Arrays.sort(Arr, 0, 4, Collections.reverseOrder());
        countingSort(sort);
        printArr(sort);
    }
}
