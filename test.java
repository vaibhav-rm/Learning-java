
public class test {
    public static void main(String[] args) {
      for (int i=0; i<=5; i++) {
        int spaces = 5-i;
        for (int j=0; j<=spaces; i++) {
            System.out.print(" ");
        }
        for (int j=0; j<=i; i++) {
            System.out.print(i);
        }
        System.out.println();
      }


      for (int i=0; i<=5; i++) {
        for (int j=i; j>=1; j--) {
            System.out.print(i);
        }
        System.out.println();
      }
    }
}