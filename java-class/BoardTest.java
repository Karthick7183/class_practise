public class BoardTest {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int array[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                array[i][k] = arr[2 - k][i];
            }

        }
        for (int l = 0; l < arr.length; l++) {
            for (int h = 0; h < arr.length; h++) {
                System.out.print(array[l][h] + " ");
            }
            System.out.println();
        }

    }
}
