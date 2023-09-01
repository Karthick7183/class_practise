import java.util.Scanner;

public class Star1To5NoSpace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
// .a{

//     background-color: rgba(228, 167, 13, 0.893);
//     height: 40px;
// }
// img{
//     float: left;
// }
// .b{
//     margin-right: 300px;
//     text-align: center;
// }
// .c{
//     margin-right: 300px;
// }
// .d{
// margin-right: 150px;
// }
// .e{
//     margin-left: 300px;
// }
// div{
//     float: left;
// }
// .abc{
//     background-color: brown;
//     color: white;
//     display: flex;
//     justify-content: center;
// }
// table{
//     align-items: center;
// }
// .img1{
//     width: 100%;
// }
