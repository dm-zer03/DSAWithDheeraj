
import java.util.*;

public class BiPartite {

    static class Edge {

        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartite(ArrayList<Edge> graph[]) {

        int clr[] = new int[graph.length];
        for (int i = 0; i < clr.length; i++) {
            clr[i] = -1;//no clr
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (clr[i] == -1) {
                //BFS
                q.add(i);
                clr[i] = 0;//Yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);//e.dest is neighbour
                        if (clr[e.dest] == -1) {
                            int nextClr = clr[curr] == 0 ? 1 : 0;
                            clr[e.dest] = nextClr;
                            q.add(e.dest);
                        } else if (clr[e.dest] == clr[curr]) {
                            return false;//Not bipartite
                        }
                    }
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        //TC :O(V+E)
        //If graph doesnot have cycle by default it is Bi-Partite
        /*  0
           / \
           1   2
           \   \
            3---4 */
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));

    }
}
