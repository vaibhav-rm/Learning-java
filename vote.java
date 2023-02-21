import java.util.*;

public class vote {

    public static void check(int age) {
        if (age>=18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        check(age);
    }
}