package Basic.ConditionalStatement;

import java.util.*;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the first Number: ");
        int b = sc.nextInt();
        System.out.println("Enter the second Number: ");
        char operator = sc.next().charAt(0);
        
        switch (operator) {
            case '+':
                System.out.println("a + b");
                break;

            case '-':
                System.out.println("a - b");
                break;

            case '*':
                System.out.println("a * b");
            
            case '/':
                System.out.println("a / b");


        sc.close();

        
        }

    }

}
