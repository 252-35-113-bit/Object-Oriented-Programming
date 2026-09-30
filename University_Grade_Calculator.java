import java.util.Scanner;

public class University_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("|University Grade Calculator|\n");
        System.out.print("\nEnter your grade (A, B, C, D, F): ");

        switch (scanner.nextLine().toLowerCase()) {
            case "a":
                System.out.println("Your grade is A. Excellent work!");
                break;

            case "b":
                System.out.println("Your grade is B. Good job!");
                break;

            case "c":
                System.out.println("Your grade is C. You passed.");
                break;

            case "d":
                System.out.println("Your grade is D. You need to improve.");
                break;

            case "f":
                System.out.println("Your grade is F. You failed.");
                break;

            default:
                System.out.println("Invalid grade entered.");
        }

        scanner.close();
    }
}