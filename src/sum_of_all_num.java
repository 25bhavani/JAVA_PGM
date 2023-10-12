import java.util.Scanner;

public class sum_of_all_num {
    public static void main(String []args) {
        Scanner Sc = new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num=Sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
        }
        System.out.println("the sum of all numbers is " + sum);

    }

}
