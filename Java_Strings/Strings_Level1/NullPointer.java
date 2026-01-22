public class NullPointer {
    public static void main(String[] args) {
        
        System.out.println("=== Generating NullPointerException ===");
        try {
            String text = null;  
            System.out.println(text.length());  
        } catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e);
        }

        
        System.out.println("Handling NullPointerException ");
        String text2 = null;  
        if (text2 != null) {
            System.out.println(text2.length());
        }
         else {
            System.out.println("Cannot get length: text2 is null");
        }
    }
}
