import java.util.*;

public class RouterNetwork {
    private Map<String, List<String>> adj = new HashMap<>();

    public void addEdge(String u, String v) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.putIfAbsent(v, new ArrayList<>());
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public int minHops(String start, String end) {
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distance = new HashMap<>();

        queue.add(start);
        distance.put(start, 0);

        while (!queue.isEmpty()) {
            String curr = queue.poll();

            if (curr.equals(end)) return distance.get(curr);

            for (String neighbor : adj.getOrDefault(curr, new ArrayList<>())) {
                if (!distance.containsKey(neighbor)) {
                    distance.put(neighbor, distance.get(curr) + 1);
                    queue.add(neighbor);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RouterNetwork net = new RouterNetwork();
        
        net.addEdge("R1", "R2");
        net.addEdge("R1", "R3");
        net.addEdge("R2", "R4");
        net.addEdge("R3", "R4");
        net.addEdge("R4", "R5");
        net.addEdge("R5", "R6");

        int hops = net.minHops("R1", "R6");
        System.out.println("Minimum hops from R1 to R6: " + hops);
    }
}