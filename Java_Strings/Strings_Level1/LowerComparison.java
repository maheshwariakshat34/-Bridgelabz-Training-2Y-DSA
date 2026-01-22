import java.util.Scanner;

public class LowerComparison {

    public static String toLowerCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
        
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32); 
            }
            result.append(c);
        }
        return result.toString();
    }


    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        
        String manualLower = toLowerCaseManual(input);


        String builtInLower = input.toLowerCase();

    
        boolean isEqual = compareStrings(manualLower, builtInLower);

        
        System.out.println("Manual lowercase: " + manualLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Are both results equal? " + isEqual);

        sc.close();
    }
}


