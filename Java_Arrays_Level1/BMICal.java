import java.util.Scanner;

class BMIStudentStyle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double weight[] = new double[n];
        double height[] = new double[n];
        double bmi[] = new double[n];
        String status[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) and height (m) of Person " + (i + 1) + ":");
            double w = sc.nextDouble();
            double h = sc.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input! Enter positive values.");
                i--; // retry
                continue;
            }

            weight[i] = w;
            height[i] = h;
        }
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("\nPerson\tHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + height[i] + "\t" + weight[i] + "\t" + bmi[i] + "\t" + status[i]);
        }
    }
}
