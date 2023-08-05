import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle : ");
        int p = sc.nextInt();
        System.out.print("Enter the Time : ");
        int t = sc.nextInt();
        System.out.print("Enter the Rate : ");
        int r = sc.nextInt();
        int result = (p * t * r) / 100;
        System.out.print("The Simple Interest is : " + result);
        sc.close();

    }

}
