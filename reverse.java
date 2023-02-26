
public class reverse {
    public static void main(String[] args) {
        StringBuilder mystring = new StringBuilder("tokyo");
        for(int i=0; i<mystring.length()/2; i++) {
            int front = i;
            int back = mystring.length()-1-i;
            char frontChar = mystring.charAt(front);
            char backChar = mystring.charAt(back);
            mystring.setCharAt(front, backChar);
            mystring.setCharAt(back, frontChar);
        }
        System.out.println(mystring);
    }
}