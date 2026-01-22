import java.util.Scanner;

public class IllegalArgument {

    public static void generateException(String text) {
        
        System.out.println("Substring result: " + text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
        
            System.out.println("Substring result: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught a general runtime exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\n=== Generating IllegalArgumentException ===");
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e);
    
        System.out.println("\n=== Handling IllegalArgumentException ===");
        handleException(input);

        sc.close();
    }
    
}
}