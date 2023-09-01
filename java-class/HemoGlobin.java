import java.util.Scanner;

public class HemoGlobin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Gender ");
        char a = scan.next().charAt(0);
        System.out.println("Enter your age");
        int b = scan.nextInt();
        System.out.println("Enter your hemoglobin level");
        float c = scan.nextFloat();
        if (a == 'M' || a == 'm') {
            if (b >= 12 && b <= 18) {
                if (c >= 13.0f && c <= 16.0f) {
                    System.out.println("Your hemoglobin level is normal");
                } else {
                    System.out.println("Your hemoglobin level is not normal");
                }
            }
        }
        if (a == 'M' || a == 'm') {
            if (b > 18) {
                if (c >= 13.6f && c <= 17.7f) {
                    System.out.println("Your hemoglobin level is normal");
                } else {
                    System.out.println("Your hemoglobin level is not normal");
                }
            }
        }
        if (a == 'F' || a == 'f') {
            if (b >= 12 && b <= 18) {
                if (c >= 12.0f && c <= 16.0f) {
                    System.out.println("Your hemoglobin level is normal");
                } else {
                    System.out.println("Your hemoglobin level is not normal");
                }
            }
        }
        if (a == 'F' || a == 'f') {
            if (b > 18) {
                if (c >= 12.1f && c <= 15.1f) {
                    System.out.println("Your hemoglobin level is normal");
                } else {
                    System.out.println("Your hemoglobin level is not normal");
                }
            }
        }
        System.out.println("Take care of your health :) ");
    }
}
