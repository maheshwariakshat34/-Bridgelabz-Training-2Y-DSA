import java.util.*;

public class CircularTour {

    static int findStart(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> q = new LinkedList<>();
        int start = 0, currPetrol = 0, count = 0;

        while (count < n) {
            currPetrol += petrol[count] - distance[count];
            q.add(count);

            while (currPetrol < 0 && !q.isEmpty()) {
                int idx = q.poll();
                currPetrol -= petrol[idx] - distance[idx];
                start = idx + 1;
            }

            count++;
        }

        return q.size() == n ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        System.out.println(findStart(petrol, distance));
    }
}