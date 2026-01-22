import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String a=sc.nextLine();
        System.out.println("Start index");
        int start=sc.nextInt();
        System.out.println("End index");
        int end=sc.nextInt();
        StringBuilder a1=new StringBuilder();
        for(int i =start;i<end;i++){
            a1.append(a.charAt(i));
        }
        String a3=a.substring(start,end);
        boolean result=true;
        if(a1.length()!=a3.length()){
            result=false;
        }
        else{
            for(int i=0;i<a3.length();i++){
                if(a1.charAt(i)!=a3.charAt(i)){
                    result=false;
                    break;
                }
            }
        }
        System.out.println("Manual substring: " + a1);
        System.out.println("Built-in substring: " + a3);
        System.out.println("Are both substrings equal? " + result);

    }
        
    }
        