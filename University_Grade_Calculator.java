import java.util.Scanner;

public class University_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("University Grade Calculator\n");
        System.out.print("\nEnter your grade (A, B, C, D, F): ");

        switch (scanner.nextLine().toLowerCase()) {
            case "a":
                System.out.println("Your number is more than 80. Excellent work!");
                break;

            case "b":
                System.out.println("Your number is between 70 and 80. Good job!");
                break;

            case "c":
                System.out.println("Your number is between 60 and 70. You passed.");
                break;

            case "d":
                System.out.println("Your number is between 50 and 60. You need to improve.");
                break;

            case "f":
                System.out.println("Your number is less than 50. You failed.");
                break;

            default:
                System.out.println("Invalid grade entered.");
        }

        scanner.close();
    }
}
