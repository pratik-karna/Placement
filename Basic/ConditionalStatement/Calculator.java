package Basic.ConditionalStatement;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.print(a + b);
                break;

            case '-':
                System.out.print(a - b);
                break;

            case '*':
                System.out.print(a * b);
                break;

            case '/':
                System.out.print(a / b);
                break;

            default:
                System.out.print("Invalid Operator");

        }
        sc.close();

    }

}
