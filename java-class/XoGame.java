import java.util.Scanner;

public class XoGame {
    public static char arr[][] = { { '-', '-', '-' },
            { '-', '-', '-' },
            { '-', '-', '-' } };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char player = 'x';
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter the num");
            int num = scan.nextInt();
            boolean b1 = move(num, player);
            if (!b1) {
                i--;
                continue;
            }
            boolean b = ifwinner(arr, player);
            if (b) {
                break;
            }
            player = PlayerSwitch(player);
            Display();
        }
    }

    public static char PlayerSwitch(char player) {
        if (player == 'x') {
            return ('o');
        } else {
            return ('x');
        }

    }

    public static boolean move(int num, char player) {
        switch (num) {
            case 1:
                if (arr[0][0] == '-') {
                    arr[0][0] = player;
                    return true;
                }
                break;
            case 2:
                if (arr[0][1] == '-') {
                    arr[0][1] = player;
                    return true;
                }
                break;
            case 3:
                if (arr[0][2] == '-') {
                    arr[0][2] = player;
                    return true;
                }
                break;
            case 4:
                if (arr[1][0] == '-') {
                    arr[1][0] = player;
                    return true;
                }
                break;
            case 5:
                if (arr[1][1] == '-') {
                    arr[1][1] = player;
                    return true;
                }
                break;
            case 6:
                if (arr[1][2] == '-') {
                    arr[1][2] = player;
                    return true;
                }
                break;
            case 7:
                if (arr[2][0] == '-') {
                    arr[2][0] = player;
                    return true;
                }
                break;
            case 8:
                if (arr[2][1] == '-') {
                    arr[2][1] = player;
                    return true;
                }
                break;
            case 9:
                if (arr[2][2] == '-') {
                    arr[2][2] = player;
                    return true;
                }
                break;

        }
        return false;

    }

    public static boolean ifwinner(char[][] array, char player1) {
        for (int i = 0; i < arr.length; i++) {
            if (array[i][0] == player1 && array[i][1] == player1 && array[i][2] == player1) {
                System.out.println(player1 + " is" + " Winner");
                Display();
                return true;
            }
            if (array[0][i] == player1 && array[1][i] == player1 && array[2][i] == player1) {
                System.out.println(player1 + " is" + " Winner");
                Display();
                return true;
            }
        }
        if ((array[0][0] == player1 && array[1][1] == player1 && array[2][2] == player1)
                || (array[0][2] == player1 && array[1][1] == player1 && array[2][0] == player1)) {
            System.out.println(player1 + " is" + " Winner");
            Display();
            return true;
        } else {
            System.out.println("Draw");
        }
        return false;
    }

    public static void Display() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
