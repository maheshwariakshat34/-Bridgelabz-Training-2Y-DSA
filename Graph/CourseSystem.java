import java.util.*;

public class CourseSystem {
    private Map<String, List<String>> adj = new HashMap<>();

    public void addCourse(String course) {
        adj.putIfAbsent(course, new ArrayList<>());
    }

    public void addPrereq(String start, String end) {
        adj.get(start).add(end);
    }

    public boolean hasCycle() {
        Set<String> visited = new HashSet<>();
        Set<String> recStack = new HashSet<>();
        for (String node : adj.keySet()) {
            if (checkCycle(node, visited, recStack)) return true;
        }
        return false;
    }

    private boolean checkCycle(String node, Set<String> visited, Set<String> recStack) {
        if (recStack.contains(node)) return true;
        if (visited.contains(node)) return false;

        visited.add(node);
        recStack.add(node);

        for (String neighbor : adj.get(node)) {
            if (checkCycle(neighbor, visited, recStack)) return true;
        }

        recStack.remove(node);
        return false;
    }

    public List<String> getTopologicalSort() {
        Map<String, Integer> inDegree = new HashMap<>();
        for (String node : adj.keySet()) inDegree.put(node, 0);
        for (String node : adj.keySet()) {
            for (String neighbor : adj.get(node)) {
                inDegree.put(neighbor, inDegree.get(neighbor) + 1);
            }
        }

        Queue<String> queue = new LinkedList<>();
        for (String node : inDegree.keySet()) {
            if (inDegree.get(node) == 0) queue.add(node);
        }

        List<String> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            order.add(curr);
            for (String neighbor : adj.get(curr)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) queue.add(neighbor);
            }
        }
        return order;
    }

    public static void main(String[] args) {
        CourseSystem sys = new CourseSystem();
        String[] courses = {"CS101", "CS102", "CS201", "CS202", "MATH101"};
        for (String c : courses) sys.addCourse(c);

        sys.addPrereq("CS101", "CS102");
        sys.addPrereq("CS101", "CS201");
        sys.addPrereq("CS102", "CS202");
        sys.addPrereq("MATH101", "CS201");

        System.out.println("Circular Dependency Found: " + sys.hasCycle());
        System.out.println("Valid Course Order: " + sys.getTopologicalSort());
    }
}