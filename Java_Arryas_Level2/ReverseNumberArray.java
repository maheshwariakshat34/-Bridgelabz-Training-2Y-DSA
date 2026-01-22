import java.util.Scanner;

class ReverseNumberArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        int digits[] = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        int revDigits[] = new int[count];
        for (int i = 0; i < count; i++) {
            revDigits[i] = digits[count - 1 - i];
        }
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(revDigits[i]);
        }
        System.out.println();
    }
}
