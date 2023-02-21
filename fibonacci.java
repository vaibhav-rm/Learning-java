import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = (n-2);
        for (int i=n; i>=d; i--) {
            System.out.println(i);
        }
    } 
}