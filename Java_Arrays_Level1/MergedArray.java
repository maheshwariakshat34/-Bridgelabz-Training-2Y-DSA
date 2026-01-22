import java.util.Scanner;
public class MergedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rows ");
        int rows=sc.nextInt();
        System.out.print("enter the cols ");
        int cols=sc.nextInt();
        int [][] matrix=new int[rows][cols];
        int[] array = new int[rows * cols];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
                array[index++]=matrix[i][j];

            }
        }
        System.out.print("Merged Array ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
    
}
