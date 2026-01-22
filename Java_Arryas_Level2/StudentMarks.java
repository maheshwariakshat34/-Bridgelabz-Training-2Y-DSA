import java.util.Scanner;

class StudentMarks{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int students = 5; 
        int subjects = 3; 

        int marks[][] = new int[students][subjects];
        double percentage[] = new double[students];
        char grade[] = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks of Student " + (i + 1) + " in Physics, Chemistry, Maths:");
            for (int j = 0; j < subjects; j++) {
                int m = sc.nextInt();
                if (m < 0 || m > 100) {
                    System.out.println("Invalid marks! Enter again.");
                    j--; 
                } else {
                    marks[i][j] = m;
                }
            }
        }
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < subjects; j++) {
                total += marks[i][j];
            }
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

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + " Percentage: " + percentage[i] + " Grade: " + grade[i]);
        }
    }
}
