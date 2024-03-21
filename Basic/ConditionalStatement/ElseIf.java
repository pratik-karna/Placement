package Basic.ConditionalStatement;

public class ElseIf {
    public static void main(String[] args) {
        int age = 13;

        if (age >= 18){
            System.out.print("adult");

        }else if (age >= 13 && age < 18){
            System.out.print("teenager");
        }else{
            System.out.print("child");
        }

    }

}
