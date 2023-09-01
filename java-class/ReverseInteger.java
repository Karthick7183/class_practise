import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = scan.nextInt();
        int rev = 0;
        for (int i = 0; a != 0; i++) {
            int b = a % 10;
            rev = (rev * 10) + b;
            a = a / 10;
        }
        System.out.println(rev);

    }

}
