package Basic.ConditionalStatement;

import java.util.*;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.print("EVEN");
        } else {
            System.out.print("ODD");
        }
        sc.close();
    }

}
