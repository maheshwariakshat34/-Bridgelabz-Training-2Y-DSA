import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double [] number=new double[10];
        double total=0.0;
        int index=0;
        while (true) { 
            System.out.println("enter the number zero or negative to stop.");
            double num=sc.nextDouble();
            if(num <= 0) {
                break;
            }
            if(index==number.length){
                System.out.println("Array is full. Stopping input.");
                break;
            }
            number[index] = num;
            index++;
            
            
        }
        for (int i = 0; i < index; i++) {
            total += number[i];
        }
    
        System.out.println("\n\nSum of all numbers = " + total);


    }
    
}
