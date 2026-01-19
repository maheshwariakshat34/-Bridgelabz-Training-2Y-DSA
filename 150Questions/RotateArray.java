package ClassQuestion;

import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
    static void reverse(int arr[],int left,int right){

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    }
        System.out.println("enter the number to rotate by ");
        int k=sc.nextInt();
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.print(Arrays.toString(arr));

    }
}
