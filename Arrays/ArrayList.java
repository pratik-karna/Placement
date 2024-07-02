public class ArrayList {
    public static void main(String[] args) {
        int n = 10;
        int i = 0, j = 1, nextTerm;
        System.out.print("Fibonacci series is: ");
        for (int c = 1; c < n; c++) {
            if (c <= 1)
                nextTerm = c;
            else {
                nextTerm = i + j;
                i = j;
                j = nextTerm;
            }
            System.out.print(nextTerm + "  ");
        }
    }
}
