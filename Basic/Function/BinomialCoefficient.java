package Basic.Function;

import java.util.Scanner;

public class BinomialCoefficient {
   public static long fact(int i) {
      if(i <= 1) {
         return 1;
      }
      return i * fact(i - 1);
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter n value: ");
     
      int n = sc.nextInt();
      System.out.println("Enter r value: ");
     
      int r = sc.nextInt();
      long ncr = fact(n)/(fact(r)*fact(n-r));
      System.out.println("c("+n+", "+r+") :"+ ncr);
      sc.close();
   }
}