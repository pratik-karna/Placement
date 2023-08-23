package Basic.Loop;

public class BreakStatement {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            if(i == 4){
                break;
            }
            System.out.println(i);   
        }
        System.out.print("out of the loop");
    }
}
