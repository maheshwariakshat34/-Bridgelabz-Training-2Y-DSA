package ClassQuestion;
import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=0;

    int [] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("enter the val :");
    int val= sc.nextInt();
    for(int i=0;i<n;i++){
        if(arr[i]!=val){
            arr[k]=arr[i];
            k++;
        }
    }
    System.out.println(k);
    for(int i=0;i<n;i++){
        System.out.print(arr[k] +" ");
    }
    }
}
