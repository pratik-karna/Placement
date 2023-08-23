package Basic.Loop;
import java.util.*;
public class SumOfFirstnNaturalNumbers {
    public static void main(String[] args){
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= 0;
        int i = 1;
        while(i <= n){
            sum +=i;
            i++;
        }
        System.out.print("Sum:"+ sum);

        sc.close();
    }
    
}
