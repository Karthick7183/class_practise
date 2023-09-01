import java.util.Scanner;

public class Reverse2Digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = scan.nextInt();
        int rev = 0;
        int last = a % 10;
        rev = rev * 10 + last;
        a = a / 10;
        rev = (rev * 10) + a;
        System.out.println(rev);
    }

}
