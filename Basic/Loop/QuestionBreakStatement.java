package Basic.Loop;
import java.util.*;
public class QuestionBreakStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Print your Number: ");
            int n = sc.nextInt();
        if(n % 10 ==0){
            break;     
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
    
}
