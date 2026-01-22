import java.util.Scanner;

public class NumberFormat {


    public static void generateException(String text) {
        
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught a general runtime exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        System.out.println("\n=== Generating NumberFormatException ===");
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e);
        }

        
        System.out.println("\n=== Handling NumberFormatException ===");
        handleException(input);

        sc.close();
    }
}

