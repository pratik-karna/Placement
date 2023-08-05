/*
Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil :");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price pf pen :");
        float pen = sc.nextInt();
        System.out.print("Enter the price of eraser :");
        float eraser = sc.nextInt();
        float total = (pencil + pen + eraser) * 18 / 100 + (pencil + pen + eraser);
        System.out.println("Total price of the item is  :" + total);
        sc.close();
    }

}
