package Basic.ConditionalStatement;

public class TernaryOperators {
    public static void main(String[] args) {
        int number = 10;

        // ternary operator
        String type = ((number % 2) == 0) ? "even " : "odd";
        System.out.print(type);
    }

}
