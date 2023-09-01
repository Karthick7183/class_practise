import java.util.Scanner;

public class Star5To1NoSpace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
// .flex{
//     display: flex;
//     }
//     .flex1{
//         width: 30%;
//         display: flex;
//         align-items: center;
//         justify-content: space-between;
//     }
//     .flex2{
//         margin-left: 700px;
//         width: 30%;
//         display: flex;
//         align-items: center;
//         justify-content: space-between;
//     }
//     .mar{
//         background-color: hsl(135, 64%, 61%);
//     padding: 8px;
//     border:1px solid white;
//     border-radius: 900px;
//     font-size: medium;
//     }
//     .mar1{
//     background-color: rgb(177, 240, 173);
//     padding: 8px;
//     border:1px solid white;
//     border-radius: 900px;
//     font-size: medium;
//     }
//     .nav-item:hover{
//         display: flex;
//         background-color: hsl(135, 64%, 61%)
//     }
//     .nav{
//         display: flex;
//         justify-content: space-around;
//         width: 30%;
//     }
//     .nav-item{
//         display: flex;
//     }
