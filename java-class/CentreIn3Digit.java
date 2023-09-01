import java.util.Scanner;

public class CentreIn3Digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scan.nextInt();
        int rev = 0;
        int last = a % 100;
        a = a / 10;
        last = a % 10;
        rev = rev * 10 + last;
        System.out.println(rev);
    }

}
