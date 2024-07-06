import java.util.Scanner;

public class binomial {
    public static int fact(int num) {
        // System.out.println(num);
        int fact = 1;
        if (num == 1) {
            return fact;
        }
        fact = fact * num;
        fact(num-1);
        return fact;
        
    }

    public static void main(String args[]) {
        // int nmulr;
        // int nfact;
        // int rfact;
        // int nrfact;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of n");
        int n = sc.nextInt();
        System.out.println("Enter a value of r");
        int r = sc.nextInt();
        // nfact = fact(n);
        // rfact = fact(r);
        // int div = n - r;
        // // nrfact = fact(div);
        // int canswer=nfact/(rfact*nrfact);
        // System.out.println(nfact+" "+rfact+" "+nrfact);
        // System.out.println(canswer);
        int num=fact(10);
        System.out.println(num);


    }
}
