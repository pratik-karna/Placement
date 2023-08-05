package Basic.ConditionalStatement;

public class PrintTheLargestOfThreeNumbers {
    public static void main(String[] args) {
        int C = 10;
        int B = 20;
        int A = 30;

        if ((A >= C) && (B >= A)) {
            System.out.print("largest is A");
        } else if (B >= C) {
            System.out.print("Largest is B");
        } else {
            System.out.print("Largest is C");
        }

    }

}
