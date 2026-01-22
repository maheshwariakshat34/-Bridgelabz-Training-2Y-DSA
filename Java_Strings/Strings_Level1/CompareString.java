import java.util.Scanner;
public class CompareString {
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the first string");
       String a=sc.nextLine();
       System.out.println("enter the second string");
       String b=sc.nextLine();
       boolean r1=true;
       if(a.length()!=b.length()){
        r1=false;
       }
       else{
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                r1=false;
                break;
            }
        }
       }
       boolean r2=true;
       r2=a.equals(b);
    

    
        System.out.println("Manual comparison result: " + r1);
        System.out.println("Built-in equals result: " + r2);
        System.out.println("results same :" + (r1 == r2));

    
    }
}




    
    

