public class Swap {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        int last = array.length - 1;
        int array1[] = new int[array.length];
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array1[i] = array[last - i];
            array1[last - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array1[i]);
        }
    }

}
