import java.util.*;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a :");
        int a = sc.nextInt();
        System.out.print("Enter the b :");
        int b = sc.nextInt();
        System.out.print("Enter the c :");
        int c = sc.nextInt();

        int Avg = (a + b + c) / 3;
        System.out.print("Average of number is : " + Avg);
        sc.close();

    }
}
