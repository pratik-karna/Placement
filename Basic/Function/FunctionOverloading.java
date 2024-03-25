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
        System.out.println("Addition is: "+ sum(10, 15, 25)); //calling the two integer addition 
        System.out.println("Addition is: " +sum(5,10));   //calling the function for adding the three integer
    }
}
