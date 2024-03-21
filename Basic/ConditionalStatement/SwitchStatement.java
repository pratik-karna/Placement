package Basic.ConditionalStatement;

public class SwitchStatement {
    public static void main(String[] args) {
        int number = 3;  //Switch  also support String Value
        switch (number) {
            case 1:
                System.out.println("School");
                break;

            case 2:
                System.out.println("College");
                break;

            case 3:
                System.out.println("University");
                break;

            default:
                System.out.println("Not Valid");

        }
    }

}
