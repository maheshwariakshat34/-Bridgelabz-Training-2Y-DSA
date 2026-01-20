package ClassQuestion;

public class JumpGame {
    public static void main(String[] args) {
        int [] arr={2,3,1,1,4};
        int maxReach=0;
        for(int i=0;i<arr.length;i++){
            if(i>maxReach){
                System.out.print("False");
                return;
            }
            int currentReach=i+arr[i];
            if(currentReach>maxReach){
                maxReach=currentReach;


            }
        }
        System.out.print("True");

    }
}
