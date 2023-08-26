package Basic.Function;
import java.util.*;
public class Sum {
    public static int CalculateSum(int a, int b)  // int a int b is parameter for calling the a & b
    //Declaring the CalculateSum Function 

    { 
        int sum = a + b;
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);   // arguments parameters || actual parameters
          //Calling the CalculateSum Function
        System.out.println("sum is "+ sum);
        sc.close();
       

    }   
     
}
