import java.util.Scanner;

public class StringIndexOutOfBounds {
    public static void generateException(String text){
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    
    public static void handleException(String text) {
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Index is out of bounds. " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        System.out.println("\n=== Generating StringIndexOutOfBoundsException ===");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling StringIndexOutOfBoundsException ===");
        handleException(input);

        sc.close();
    }
}

