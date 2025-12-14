//Near --> PQ

import java.util.*;

public class NearByCar {

    static class Point implements Comparable<Point> {

        int x;
        int y;
        int idx;
        int distSq;

        public Point(int x, int y, int idx, int distSq) {
            this.x = x;
            this.y = y;
            this.idx = idx;
            this.distSq = distSq;

        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq; //Asceding
        }
    }

    public static void main(String[] args) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], i, distSq));

        }

        //Nearest K Cars
        for (int i = 0; i < k; i++) {
            System.out.println("C " + pq.remove().idx);
        }
    }
}
