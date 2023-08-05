import java.util.*;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        int l = sc.nextInt();
        int Area = l * l;
        System.out.print("The Area of Square is : " + Area);
        sc.close();

    }
}
