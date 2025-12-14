
import java.util.ArrayList;
import java.util.Collections;

public class Krskl {

    static class Edge implements Comparable<Edge> {

        int dest;
        int src;
        int wt;

        public Edge(int d, int s, int w) {
            this.dest = d;
            this.src = s;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;
        }
    }

    public static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    // Initialize Union-Find (Disjoint Set)
    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;  // Parent of each node is itself
            rank[i] = 0; // Initialize rank to 0
        }
    }

    // Find function with path compression
    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    // Union by rank
    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    // Kruskal's algorithm
    public static void krskl(ArrayList<Edge> edges, int V) {
        Collections.sort(edges); // Sort edges based on weight
        int mstCost = 0;
        int count = 0; // Number of edges included in the MST

        for (int i = 0; count < V - 1; i++) {
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);

            if (parA != parB) {
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }

        System.out.println("MST Cost: " + mstCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);

        // Initialize the Union-Find data structures
        init();

        // Run Kruskal's algorithm
        krskl(edges, V);
    }
}
