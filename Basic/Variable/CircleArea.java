import java.util.*;

public class CircleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        float radius = sc.nextFloat();
        float Area = 3.14f * radius * radius;
        System.out.print("Area of Circle is " + Area);

        sc.close();

    }
}
