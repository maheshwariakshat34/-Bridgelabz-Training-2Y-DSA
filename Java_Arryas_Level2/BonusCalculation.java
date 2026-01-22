import java.util.Scanner;

class BonusCalculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double salary[] = new double[10];
        double years[] = new double[10];
        double bonus[] = new double[10];
        double newSalary[] = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for Employee " + (i + 1) + ":");

            double s = sc.nextDouble();
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please re-enter.");
                i--; 
            } else {
                salary[i] = s;
                years[i] = y;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Old Salary of all employees : " + totalOldSalary);
        System.out.println("Total Bonus to be paid            : " + totalBonus);
        System.out.println("Total New Salary of all employees : " + totalNewSalary);
    }
}
