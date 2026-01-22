import java.util.Scanner;

public class UppercaseComparison {

    
    public static String toUpperCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
        
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32); 
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
        String manualUpper = toUpperCaseManual(input);
        String builtInUpper = input.toUpperCase();


        boolean isEqual = compareStrings(manualUpper, builtInUpper);
        System.out.println("Manual uppercase: " + manualUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Are both results equal? " + isEqual);

        sc.close();
    }
}

