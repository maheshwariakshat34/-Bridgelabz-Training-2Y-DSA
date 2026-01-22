import java.util.Scanner;

public class BMIProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; 
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            double weight = -1, height = -1;

            while (weight <= 0) {
                System.out.print("Enter weight for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
            }

            while (height <= 0) {
                System.out.print("Enter height for person " + (i + 1) + ": ");
                height = sc.nextDouble();
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);

            double bmi = personData[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nPerson\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", i + 1, personData[i][0], personData[i][1], personData[i][2], status[i]);
        }

        sc.close();
    }
}
