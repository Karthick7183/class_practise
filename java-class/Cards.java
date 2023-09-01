import java.util.*;

class Cards {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int num = customRandom(1, 13);
            int num1 = shape(0, 4);
            card(num, num1);
        }
    }

    public static void card(int b, int num) {
        String shape = "";
        switch (num) {
            case 0:
                shape = "\u2764";
                break;
            case 1:
                shape = "\u25C6";
                break;
            case 2:
                shape = "\u2660";
                break;
            case 3:
                shape = "\u2747";
                break;
        }
        switch (b) {
            case 1:
                System.out.println("A in " + shape);
                break;
            case 2:
                System.out.println("2 in " + shape);
                break;
            case 3:
                System.out.println("3 in " + shape);
                break;
            case 4:
                System.out.println("4 in " + shape);
                break;
            case 5:
                System.out.println("5 in " + shape);
                break;
            case 6:
                System.out.println("6 in " + shape);
                break;
            case 7:
                System.out.println("7 in " + shape);
                break;
            case 8:
                System.out.println("8 in " + shape);
                break;
            case 9:
                System.out.println("9 in " + shape);
                break;
            case 10:
                System.out.println("10 in " + shape);
                break;
            case 11:
                System.out.println("J in " + shape);
                break;
            case 12:
                System.out.println("Q in " + shape);
                break;
            case 13:
                System.out.println("K in " + shape);
                break;
        }

    }

    public static int customRandom(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static int shape(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

}