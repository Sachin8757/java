public class reverse{
    public static void main(String args[]){
        int num =9848;
        int rem,rev=0;

        //only display reverse number
        // while (num>0) {
        //     rem=num%10;
        //     System.out.print(rem);
        //     num=num/10;
        // }
        //here save reverse number in original variable witch is already store number
        while (num>0) {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        num=rev;
        System.out.println(num);

    }
}