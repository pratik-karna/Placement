package Basic.Function;
public class PrimeOrNot {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i=2; i<=n-1; i++) { //completely dividing
            if(n %i == 0){
            isPrime = false;
            }
            break;
        }
        return isPrime;
    }


public static void main(String args[]) {
    System.out.println(isPrime(17));
}
}



    
