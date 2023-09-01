package Basic.Function;
import java.util.*;

public class Product {
    public static int multiply(int a, int b){
    int multiply = a * b;
    System.out.println("Multiple is: "+ multiply);
    return multiply;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a = sc.nextInt();
        System.out.println("Enter the b: ");
        int b = sc.nextInt();
        multiply(a, b);
        sc.close();
        
    } 
}
