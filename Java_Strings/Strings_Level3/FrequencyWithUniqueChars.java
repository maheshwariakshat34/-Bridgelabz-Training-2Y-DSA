import java.util.Scanner;

public class FrequencyWithUniqueChars {


    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] tempArray = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempArray[uniqueCount] = current;
                uniqueCount++;
            }
        }

        
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempArray[i];
        }

        return uniqueChars;
    }


    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

    
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            result[i][0] = String.valueOf(c);
            result[i][1] = String.valueOf(freq[c]);
        }

        return result;
    }

    // Method to display results
    public static void displayResult(String[][] freqData) {
        System.out.println("Character  Frequency");
        System.out.println();
        for (String[] row : freqData) {
            System.out.printf("%-10s %s%n", row[0], row[1]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] freqData = findFrequency(text);

        displayResult(freqData);

        sc.close();
    }
}
