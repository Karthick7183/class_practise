public class MatrixMultiplication {
    public static void main(String[] args) {
        int array1[][] = { { 1, 2 }, { 4, 5 } };
        int array2[][] = { { 9, 8 }, { 6, 5 } };
        int all = (array1.length + array2.length) / 2;
        for (int i = 0; i < all; i++) {
            for (int j = 0; j < all; j++) {
                int a = 0;
                for (int k = 0; k < all; k++) {
                    a += (array1[i][k] * array2[k][j]);
                }
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

}
