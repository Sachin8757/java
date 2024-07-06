import java.util.*;

public class multiple_of_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:- ");
        int num = sc.nextInt();
        while ((num %= 10) != 0) {
            System.out.println("enter a number:- ");
             num = sc.nextInt();
             System.out.println(num);
        }
        System.out.println("you are entered multiple of 10");
    }
}
