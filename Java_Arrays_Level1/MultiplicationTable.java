import java.util.Scanner;
class MultiplicationTable{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("ENTER THE NUMBER FOR MULTIPLICATION TABLE : ");
        int n=sc.nextInt();
        int []table=new int[11];
        for(int i=1;i<=10;i++){
            table[i]=n*(i+1);
        }
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + table[i]);
        }

    }
}