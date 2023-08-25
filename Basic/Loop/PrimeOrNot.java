package Basic.Loop;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args){
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i<=a-1; i++){
            if(a % i == 0){
            isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.print("a is prime");
        }
        else{
            System.out.print("a is not prime");
        }
        sc.close();

    }
    
}
