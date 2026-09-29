import java.util.Scanner;
public class AgeCatagory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your child's age: ");

        int age = scanner.nextInt();

        System.out.println("Your child is " + age + " years old.");

        if (age < 2) {
            System.out.println("Your child is an infant.");
        } else if (age >= 2 && age < 10) {
            System.out.println("Your child is a child.");
        } else if (age >= 10 && age < 20) {
            System.out.println("Your child is a teenager.");
        } else if (age >= 20 && age < 30) {
            System.out.println("Your child is an adult.");
        } else {
            System.out.println("Your child is an old person.");
        }
    }
}
