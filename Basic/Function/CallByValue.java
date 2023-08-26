package Basic.Function;

public class CallByValue {

    public static void swap(int a, int b) { // Swapping the value of a and b
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a= " + a);
        System.out.println("b= " + b); // This same print function if I put inside the main function it will show the
                                       // original value of a & b
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

    }

}
