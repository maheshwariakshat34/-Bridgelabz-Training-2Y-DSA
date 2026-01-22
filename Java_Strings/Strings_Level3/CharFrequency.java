import java.util.Scanner;

public class CharFrequency {

    
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

    
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; 
                
            }
        }

        
        String[][] result = new String[uniqueCount][2];
        int index = 0;

    
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] < 0) {
                int count = -freq[c]; 
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(count);
                index++;
                freq[c] = 0; 
            }
        }

        return result;
    }


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


    }
}
