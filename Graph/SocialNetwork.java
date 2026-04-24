import java.util.*;

public class SocialNetwork {
    private Map<String, List<String>> adjList = new HashMap<>();

    public void addUser(String user) {
        adjList.putIfAbsent(user, new ArrayList<>());
    }

    public void addFriendship(String u1, String u2) {
        adjList.get(u1).add(u2);
        adjList.get(u2).add(u1);
    }

    public List<String> getFriends(String user) {
        return adjList.getOrDefault(user, new ArrayList<>());
    }

  
    public boolean areDirectlyConnected(String u1, String u2) {
        return adjList.containsKey(u1) && adjList.get(u1).contains(u2);
    }

   
    public int findShortestPath(String start, String end) {
        if (!adjList.containsKey(start) || !adjList.containsKey(end)) return -1;
        if (start.equals(end)) return 0;

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distance = new HashMap<>();

        queue.add(start);
        distance.put(start, 0);

        while (!queue.isEmpty()) {
            String current = queue.poll();

            for (String friend : adjList.get(current)) {
                if (!distance.containsKey(friend)) {
                    distance.put(friend, distance.get(current) + 1);
                    if (friend.equals(end)) return distance.get(friend);
                    queue.add(friend);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();

        String[] users = {"Alice", "Bob", "Charlie", "David", "Eve"};
        for (String user : users) network.addUser(user);

        network.addFriendship("Alice", "Bob");
        network.addFriendship("Alice", "Charlie");
        network.addFriendship("Bob", "David");
        network.addFriendship("Charlie", "Eve");
        network.addFriendship("David", "Eve");

        System.out.println("Friends of Alice: " + network.getFriends("Alice"));

        System.out.println("Are Bob and Eve directly connected? " + 
                           network.areDirectlyConnected("Bob", "Eve"));

        System.out.println("Shortest path between Alice and Eve: " + 
                           network.findShortestPath("Alice", "Eve"));
    }
}