import java.util.Scanner;
public class MeanHeight{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        double[] height=new double[11];
        for(int i=0;i<height.length;i++){
            System.out.print("enter the heght of player " + (i+1)+ " is :");
            height[i]=sc.nextDouble();
        }
        double sum=0;
        for(int i=0;i<height.length;i++){
            sum+=height[i];
        }
        System.out.println("The total sum of height of football team " + sum);
        double mean_height=sum/height.length;
        System.out.println("the mean height of the team is " +  mean_height);
        
    }
    
}
