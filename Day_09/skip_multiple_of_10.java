import java.util.*;

public class skip_multiple_of_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("enter the number:-");
            num = sc.nextInt();
            if ((num % 10) == 0) {
                continue;
            }
            System.out.println("you entered:-"+num);

        } while (true);
    }
}
