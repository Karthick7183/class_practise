public class AddString {
    public static void main(String[] args) {
        String num1 = "3876620623801494171";
        String num2 = "6529364523802684779";
        long n1 = (long) Long.parseLong(num1);
        long n2 = (long) Long.parseLong(num2);
        long n3 = (long) n1 + n2;
        String str = Long.toString(n3);
        System.out.println(str);
    }

}
