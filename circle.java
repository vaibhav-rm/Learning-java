import java.util.*;

public class circle {

    public static double circum(int r) {
       double cir = 2*(3.14*r);
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double cir = circum(r);
        System.out.println(cir);
    }
}