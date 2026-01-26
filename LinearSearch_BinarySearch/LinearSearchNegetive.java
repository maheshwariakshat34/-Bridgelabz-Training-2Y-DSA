
import java.util.*;
public class LinearSearchNegative {
    public static void main(String[] args) {
        int [] arr={1,2,3,-1,5,-5};
        
        int neg=arr[0];
        boolean found=false;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < 0) {
                System.out.print(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print("not found");
        }

    }
}
