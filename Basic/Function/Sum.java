package Basic.Function;
import java.util.*;
public class Sum {
    public static void CalculateSum(int a, int b){
        int Sum = a + b;
        System.out.println("Sum:"+ Sum);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        CalculateSum(a, b);
        sc.close();
       

    }   
     
}
