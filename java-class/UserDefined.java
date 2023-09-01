public class UserDefined {
    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        int array1[] = { 123, 23, 344, 54, 2 };
        int ans = addArray(array);
        int ans1 = addArray(array1);
        System.out.println(ans);
        System.out.println(ans1);
    }

    public static int addArray(int[] array1) {
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            j += array1[i];
        }
        return j;

    }

}
