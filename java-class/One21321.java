import java.util.Scanner;

public class One21321 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
