import java.util.Scanner;

public class inti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter an integer: ");
            num = sc.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
    }
}
