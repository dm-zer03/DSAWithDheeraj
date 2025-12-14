
public class ArrPrblms {

    public static int linearSearch(int numbers[], int target) {
        if (numbers.length == 0) {
            return -1;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 16, 18, 20};
        // int numbers[] = {};
        int target = 20;

        int index = linearSearch(numbers, target);
        if (index == -1) {
            System.out.println("Not Found :(");
        } else {
            System.out.println("Found at index :" + index);
        }

    }
}
