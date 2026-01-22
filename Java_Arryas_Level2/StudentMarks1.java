import java.util.Scanner;

class StudentGrades {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int physics[] = new int[n];
        int chemistry[] = new int[n];
        int maths[] = new int[n];
        double percentage[] = new double[n];
        char grade[] = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");
            
            int p = sc.nextInt();
            if (p < 0) {
                System.out.println("Invalid! Marks cannot be negative. Enter again.");
                i--; // retry
                continue;
            }
            physics[i] = p;

            int c = sc.nextInt();
            if (c < 0) {
                System.out.println("Invalid! Marks cannot be negative. Enter again.");
                i--;
                continue;
            }
            chemistry[i] = c;

            int m = sc.nextInt();
            if (m < 0) {
                System.out.println("Invalid! Marks cannot be negative. Enter again.");
                i--;
                continue;
            }
            maths[i] = m;
        }
        for (int i = 0; i < n; i++) {
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 85) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 50) {
                grade[i] = 'C';
            } else {
                grade[i] = 'F';
            }
        }

       
        System.out.println("Stu\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + physics[i] + "\t" + chemistry[i] + "\t\t" 
                               + maths[i] + "\t" + percentage[i] + "%\t\t" + grade[i]);
        }
    }
}

