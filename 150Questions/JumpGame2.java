package ClassQuestion;

public class JumpGame2 {
    public static void main(String[] args) {


        int[] arr = {2, 3, 1, 1, 4};

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < arr.length - 1; i++) {


            int currentReach = i + arr[i];
            if (currentReach > farthest) {
                farthest = currentReach;
            }
            
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
    }
}