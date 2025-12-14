
import java.util.*;

public class BellMan {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellManFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;
        // O(V*E)
        //algo O(V)
        for (int i = 0; i < V - 1; i++) {
            //edges -O(E)
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    //u,v,wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    //relaxation
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {

            System.out.print(dist[i] + " ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int V = 5;
        int src = 0;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bellManFord(graph, 0);
    }
}


/*
  import java.util.ArrayList;

public class BellmanFordAlgo {

    static class Edge {
        int src, dest, wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> edges) {
        // Adding edges (src, dest, weight)
        edges.add(new Edge(0, 1, 2));
        edges.add(new Edge(0, 2, 4));
        edges.add(new Edge(1, 2, 1));
        edges.add(new Edge(1, 3, 7));
        edges.add(new Edge(2, 4, 3));
        edges.add(new Edge(4, 3, 2));
        edges.add(new Edge(4, 5, 5));
        edges.add(new Edge(3, 5, 1));
    }

    public static void bellmanFord(ArrayList<Edge> edges, int V, int src) {
        int[] dist = new int[V];
        
        // Step 1: Initialize distances from src to all other vertices as INFINITE
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        // Step 2: Relax all edges |V| - 1 times
        for (int i = 0; i < V - 1; i++) {
            for (Edge edge : edges) {
                int u = edge.src;
                int v = edge.dest;
                int wt = edge.wt;
                
                // If the distance to the source vertex is not infinite and the path through u is shorter, update v's distance
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        // Step 3: Check for negative weight cycles
        for (Edge edge : edges) {
            int u = edge.src;
            int v = edge.dest;
            int wt = edge.wt;
            // If we can still relax an edge, then there is a negative weight cycle
            if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                System.out.println("Graph contains a negative weight cycle");
                return;
            }
        }

        // Step 4: Print the shortest distance from src to all vertices
        printSolution(dist);
    }

    // Helper function to print the solution
    public static void printSolution(int[] dist) {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(i + "\t\t" + "INF");
            } else {
                System.out.println(i + "\t\t" + dist[i]);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices
        int src = 0; // Source vertex

        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);

        bellmanFord(edges, V, src);
    }
}

 */
