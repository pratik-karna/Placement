package Basic.ConditionalStatement;

import java.util.*;

public class WeekSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.print("Sunday");
                break;

            case 2:
                System.out.print("Monday");
                break;

            case 3:
                System.out.print("Tuesday");
                break;

            case 4:
                System.out.print("Wednesday");
                break;

            case 5:
                System.out.print("Thrusday");
                break;

            case 6:
                System.out.print("Friday");
                break;

            case 7:
                System.out.print("Saturday");
                break;

            default:
                System.out.print("enter numbers only from 1 to 7 next time");

        }

        sc.close();
    }

}
