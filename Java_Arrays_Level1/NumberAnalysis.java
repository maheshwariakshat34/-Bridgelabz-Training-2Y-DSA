import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] num =new int [5];
        for(int i=0;i<num.length;i++){
            System.out.print("enter the number " + (i+1) + " :");
            num[i]=sc.nextInt();

        }
        System.out.println();
        for(int i =0;i<num.length;i++){
            int n=num[i];
            if(n>0){
                
                if(n%2==0){
                    System.out.println("the number " + n +" is positive" + "  and is even");
                }
                else{
                    System.out.println("the number " + n +" is positive" +" and is odd");
                }
            }
            else if(n<0){
                System.out.println("The number " + n + " is negative");
            }
            else{
                System.out.println("the number is zero");
            }
        }
        
        if(num[0]==num[4]){
            System.out.println("the first number and the last number is equal.");
        }
        else if(num[0]>num[4]){
            System.out.println("the first is greater than the last number");
        }
        else{
            System.out.println("the first number is less than the last number");
        }
        
        
        
    }
}
    

