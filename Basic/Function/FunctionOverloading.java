package Basic.Function;


// In methodoverloading we can only change the inside method parameter not the written type


public class FunctionOverloading {

    public static int sum(int a, int b){
        return a+b;
    }
    
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println("Addition of two number: "+ sum(5,10)); //calling the two integer addition 
        System.out.println("Addition of three number: " +sum(10,20,30));   //calling the function for adding the three integer
    }
}
