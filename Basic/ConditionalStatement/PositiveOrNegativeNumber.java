package Basic.ConditionalStatement;
import java.util.*;
public class PositiveOrNegativeNumber
 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        if(x<0){
            System.out.print("The number is negative");}
        else{
            System.out.print("The number is positive");

        }    
        
        sc.close();




    }
    

}
