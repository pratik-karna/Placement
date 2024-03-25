package Basic.Function;
import java.util.*;

public class PrimeOrNot {
    public static boolean isPrime(int n) {

        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) { // completely dividing
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        sc.close();
    }
}