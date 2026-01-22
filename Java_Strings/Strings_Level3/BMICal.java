import java.util.Scanner;

public class BMICal {


    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }


        return new String[] {
            String.format("%.2f", weight), 
            String.format("%.2f", heightCm),
            String.format("%.2f", bmi), 
            status
        };
    }

    
    public static String[][] processBMI(double[][] hwArray) {
        String[][] result = new String[hwArray.length][4];

        for (int i = 0; i < hwArray.length; i++) {
            result[i] = calculateBMI(hwArray[i][0], hwArray[i][1]);
        }

        return result;
    }

    // Method to display the table
    public static void displayTable(String[][] bmiData) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        

        for (String[] person : bmiData) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", person[0], person[1], person[2], person[3]);
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] hwArray = new double[10][2]; 

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            hwArray[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            hwArray[i][1] = sc.nextDouble();
        }

        
        String[][] bmiData = processBMI(hwArray);

        
        System.out.println("\n");
        displayTable(bmiData);

        sc.close();
    }
}
