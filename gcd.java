import java.util.*;

public class gcd {
    public static int calculategcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculategcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        int ans = calculategcd(a,b);
        System.out.println(ans);
    }
}