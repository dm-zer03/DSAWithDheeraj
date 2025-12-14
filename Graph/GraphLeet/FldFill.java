
public class FldFill {

    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        // Base cases for recursion
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        // Mark the current cell as visited
        vis[sr][sc] = true;

        // Change the color of the current pixel
        image[sr][sc] = color;

        // Recur for all 4 directions (left, right, up, down)
        // Left
        helper(image, sr, sc - 1, color, vis, orgCol);

        // Right
        helper(image, sr, sc + 1, color, vis, orgCol);

        // Up
        helper(image, sr - 1, sc, color, vis, orgCol);

        // Down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // If the initial pixel already has the new color, there's no need to process further
        if (image[sr][sc] == color) {
            return image;
        }

        // Visited array to keep track of visited pixels
        boolean[][] vis = new boolean[image.length][image[0].length];

        // Start the flood fill process
        helper(image, sr, sc, color, vis, image[sr][sc]);

        return image;
    }

    public static void main(String[] args) {
        // Define the image
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        // Starting point and color
        int sr = 1, sc = 1, color = 2;

        // Apply the flood fill algorithm
        int[][] result = floodFill(image, sr, sc, color);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
