package Basic.ConditionalStatement;

import java.util.Scanner;

public class eligible_for_vote {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    // System.out.print("enter age:");
    int age = sc.nextInt();
    
      if(age>=18){
        System.out.print("Eligible");

      }
    }
}
