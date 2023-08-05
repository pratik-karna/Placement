import java.util.*;

public class Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nuumber: ");
        int a = sc.nextInt();
        System.out.print("Enter the number: ");
        int b = sc.nextInt();
        int Product = a * b;
        System.out.print("Product of a and b is " + Product);

        sc.close();

    }

}
