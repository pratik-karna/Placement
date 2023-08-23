package Basic.Loop;
import java.util.*;
public class ReverseOfNumber {
    public static void main(String[] args){
        System.out.print("Enter the Number:");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        while(a>0){
            rev = rev*10;
            rev = rev +a%10;
            a= a/10;
        }
        System.out.print("Reverse: "+ rev);
        sc.close();
    }
}
