import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    
    public static void generateException(String[] names) {
        
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    
    public static void handleException(String[] names) {
        try {
            
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught a general runtime exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        
        System.out.println("\n=== Generating ArrayIndexOutOfBoundsException ===");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }


        System.out.println("\n=== Handling ArrayIndexOutOfBoundsException ===");
        handleException(names);

        sc.close();
    }
}

