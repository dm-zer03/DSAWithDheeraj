
public class MaxST {

    // Static segment tree array
    static int tree[];

    // Initialize the segment tree with size 4*n
    public static void init(int n) {
        tree = new int[4 * n];
    }

    // Build the segment tree recursively
    public static void buildTree(int i, int si, int sj, int arr[]) {
        // Base case: If it's a leaf node, store the array element
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }
        int mid = (si + sj) / 2;
        // Recursively build the left and right subtrees
        buildTree(2 * i + 1, si, mid, arr);        // Left subtree
        buildTree(2 * i + 2, mid + 1, sj, arr);    // Right subtree
        // Store the maximum of the two child nodes
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    // Function to get the maximum value in a given range [qi, qj]
    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    // Utility function to get the max in range [qi, qj]
    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        // No overlap case
        if (si > qj || sj < qi) {
            return Integer.MIN_VALUE;
        }
        // Full overlap case
        if (si >= qi && sj <= qj) {
            return tree[i];
        }
        // Partial overlap case
        int mid = (si + sj) / 2;
        int leftAns = getMaxUtil(2 * i + 1, si, mid, qi, qj);
        int rightAns = getMaxUtil(2 * i + 2, mid + 1, sj, qi, qj);
        return Math.max(leftAns, rightAns);
    }

    // Function to update an index in the array and segment tree
    public static void update(int arr[], int idx, int newVal) {
        arr[idx] = newVal;  // Update the array
        int n = arr.length;
        updateUtil(0, 0, n - 1, idx, newVal);  // Update the segment tree
    }

    // Utility function to update the segment tree
    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        // If the index is out of the current segment range, do nothing
        if (idx < si || idx > sj) {
            return;
        }
        // Base case: If it's a leaf node, update the value
        if (si == sj) {
            tree[i] = newVal;
            return;
        }
        // Update the left or right subtree
        int mid = (si + sj) / 2;
        if (idx <= mid) {
            updateUtil(2 * i + 1, si, mid, idx, newVal);
        } else {
            updateUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        }
        // After updating the subtree, recalculate the current node
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    // Main function to test the Max Segment Tree implementation
    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};  // Input array
        int n = arr.length;

        // Initialize and build the segment tree
        init(n);
        buildTree(0, 0, n - 1, arr);

        // Query for the maximum in range [2, 5]
        System.out.println("Max in range [2, 5]: " + getMax(arr, 2, 5));

        // Update index 2 to 20
        update(arr, 2, 20);

        // Query again after the update
        System.out.println("Max in range [2, 5] after update: " + getMax(arr, 2, 5));
    }
}
