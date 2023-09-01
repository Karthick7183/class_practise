import java.util.Scanner;

public class Star1357WithAlign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            for (int k = a - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
