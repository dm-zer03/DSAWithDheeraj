
import java.util.*;

public class CycDtcn {

    // Edge class represents an edge between two vertices
    static class Edge {

        int src;  // Source vertex
        int dest; // Destination vertex

        // Constructor to initialize an edge
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Function to create the graph (using adjacency list representation)
    static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize each vertex's adjacency list
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); // Each vertex will have a list of edges
        }

        // Adding edges to the graph
        // Graph structure:
        // 0 --- 1
        // | \   |
        // |  \  |
        // 2 --- 3 --- 4
        // 
        // Explanation:
        // Vertex 0 is connected to vertices 1, 2, and 3
        // Vertex 1 is connected to vertices 0 and 2
        // Vertex 2 is connected to vertices 0 and 1
        // Vertex 3 is connected to vertices 0 and 4
        // Vertex 4 is connected to vertex 3
        // Adding edges for vertex 0
        graph[0].add(new Edge(0, 1)); // Edge from vertex 0 to 1
        graph[0].add(new Edge(0, 2)); // Edge from vertex 0 to 2
        graph[0].add(new Edge(0, 3)); // Edge from vertex 0 to 3

        // Adding edges for vertex 1
        graph[1].add(new Edge(1, 0)); // Edge from vertex 1 to 0
        graph[1].add(new Edge(1, 2)); // Edge from vertex 1 to 2

        // Adding edges for vertex 2
        graph[2].add(new Edge(2, 0)); // Edge from vertex 2 to 0
        graph[2].add(new Edge(2, 1)); // Edge from vertex 2 to 1

        // Adding edges for vertex 3
        graph[3].add(new Edge(3, 0)); // Edge from vertex 3 to 0
        graph[3].add(new Edge(3, 4)); // Edge from vertex 3 to 4

        // Adding edge for vertex 4
        graph[4].add(new Edge(4, 3)); // Edge from vertex 4 to 3
    }

    // Function to detect if a cycle exists in the graph
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        // Visited array to keep track of visited vertices
        boolean vis[] = new boolean[graph.length];

        // Check each component of the graph (since graph might be disconnected)
        for (int i = 0; i < graph.length; i++) {
            // If a vertex has not been visited, check for cycles starting from that vertex
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle found in any component
    }

    // Utility function to detect a cycle using DFS
    // curr: current vertex, parent: parent of current vertex in the DFS tree
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int parent) {
        vis[curr] = true; // Mark the current vertex as visited

        // Explore all adjacent vertices
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i); // Get the edge from current vertex to another vertex

            // If the adjacent vertex is not visited, recursively check for cycles
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true; // Cycle detected in recursion
                }
            } // If the adjacent vertex is visited and is not the parent, a cycle is found
            else if (e.dest != parent) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle found from this vertex
    }

    // DFS utility function to traverse the graph (used for other purposes like graph traversal)
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        // Visit the current node
        System.out.print(curr + " ");
        vis[curr] = true; // Mark the current vertex as visited

        // Explore all adjacent vertices
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis); // Recursively visit all neighbors
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices in the graph
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V]; // Create an empty ArrayList for each vertex

        // Create the graph (add edges)
        createGraph(graph);

        // Check for cycles
        System.out.println("Cycle Detected: " + detectCycle(graph)); // Output whether a cycle exists
    }
}
