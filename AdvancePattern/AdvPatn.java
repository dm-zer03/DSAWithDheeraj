package AdvancePattern;

public class AdvPatn {

    public static void hollowRect(int totRows, int totCols) {

        // Outer loop - rows
        for (int i = 1; i <= totRows; i++) {
            // inner loop - cols
            for (int j = 1; j <= totRows; j++) {
                //cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totRows) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // After printing all cell next line
            System.out.println("");
        }
    }

    public static void invRotHalfPyramid(int n) {
        //Outer 
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            //after printing in cell then next Line
            System.out.println();
        }

    }

    public static void floydTriangle(int n) {
        int count = 1;
        // Outer
        for (int i = 1; i <= n; i++) {
            // inner 
            for (int j = 1; j <= i; j++) {
                // print the count 
                System.out.print(count + " ");
                count++;
            }
            // nxt line
            System.out.println();
        }
    }

    public static void oneZero(int n) {
        // Outer
        for (int i = 1; i <= n; i++) {
            // inner 
            for (int j = 1; j <= i; j++) {
                // print the count 
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            // nxt line
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st half 
        for (int i = 1; i <= n; i++) {
            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // 2nd half 
        for (int i = n; i >= 1; i--) {
            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void invRotNumHalfPyramid(int n) {
        //Outer 
        for (int i = 1; i <= n; i++) {
            //printing into cell 
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            //after printing in cell then next Line
            System.out.println();
        }

    }

    public static void solidRhombus(int n) {
        // Outer loop: No of line to be printed 
        for (int i = 1; i <= n; i++) {
            // Inner Loop : 
            //  Spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Star
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    public static void hollowRhombus(int n) {
        // Outer loop: No of line to be printed 
        for (int i = 1; i <= n; i++) {
            // Inner Loop : 
            //  Spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Star
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
    }

    public static void diamond(int n) {
        //1st half 
        // Outer loop 
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //2nd half 
        // Outer loop 
        for (int i = n; i >= 1; i--) {
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowRect(10, 10);
        // invRotHalfPyramid(4);
        //invRotNumHalfPyramid(5);
        //floydTriangle(5);
        //oneZero(5);
        //butterfly(4);
        // solidRhombus(5);
        // hollowRhombus(5);
        diamond(4);
    }
}
