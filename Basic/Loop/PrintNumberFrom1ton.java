package Basic.Loop;
import java.util.*;
public class PrintNumberFrom1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.print(counter + " ");
            sc.close();
        }
        System.out.println();
    }

}
