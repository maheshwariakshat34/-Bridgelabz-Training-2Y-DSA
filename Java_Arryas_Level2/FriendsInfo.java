import java.util.Scanner;
public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] names={"Amar","Akbar","Anthony"};
        int [] ages=new int[3];
        int [] height=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("enter the age of " + names[i] + " :");
            ages[i]=sc.nextInt();
        } 
        for(int i=0;i<3;i++){
            System.out.print("enter the height of " + names[i] + " :");
            height[i]=sc.nextInt();
        } 
        int youngestIndex=0;
        for(int i=0;i<3;i++){
            if(ages[i]<youngestIndex){
            youngestIndex=i;
            }
        } 
        int tallestIndex=0;
        for(int i=0;i<3;i++){
            if(height[i]<tallestIndex){
                tallestIndex=i;
            }
        } 
        
        System.out.println("Youngest Friend : " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("Tallest Friend  : " + names[tallestIndex] + " with height " + height[tallestIndex] );

    }
    
}
