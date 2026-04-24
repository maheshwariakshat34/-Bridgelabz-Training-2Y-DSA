import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;
    Edge(int s, int d, int w) {
        src = s; dest = d; weight = w;
    }
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class NetworkMST {
    int vertices;
    List<Edge> edges = new ArrayList<>();

    NetworkMST(int v) { vertices = v; }

    void addEdge(int s, int d, int w) {
        edges.add(new Edge(s, d, w));
    }

    int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]);
    }

    void union(int[] parent, int[] rank, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        if (rank[rootX] < rank[rootY]) parent[rootX] = rootY;
        else if (rank[rootX] > rank[rootY]) parent[rootY] = rootX;
        else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    void kruskalMST() {
        Collections.sort(edges);
        int[] parent = new int[vertices];
        int[] rank = new int[vertices];
        for (int i = 0; i < vertices; i++) parent[i] = i;

        List<Edge> result = new ArrayList<>();
        int totalCost = 0;

        for (Edge edge : edges) {
            int x = find(parent, edge.src);
            int y = find(parent, edge.dest);

            if (x != y) {
                result.add(edge);
                totalCost += edge.weight;
                union(parent, rank, x, y);
            }
        }

        System.out.println("Edges in MST:");
        for (Edge e : result) {
            System.out.println(e.src + " -- " + e.dest + " == " + e.weight);
        }
        System.out.println("Minimum Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        NetworkMST graph = new NetworkMST(4);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);

        graph.kruskalMST();
    }
}