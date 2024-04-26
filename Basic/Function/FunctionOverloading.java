package Basic.Function;


// In methodoverloading we can only change the inside method of parameter not the written type


public class FunctionOverloading {

     //Function to calculate the two integer values

    public static int sum(int a, int b){
        return a+b;
    }
    
    //Function to calculate the three integer values

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println("Addition of two number: "+ sum(5,10)); //calling the two integer addition 
        System.out.println("Addition of three number: " +sum(10,20,30));   //calling the function for adding the three integer
    }




//Using different Data Types
    

    // public static int sum(int a, int b){
    //     return a+b;
    // }

    // public static float sum(float a, float b){
    //     return a+b;
    // }

    // public static void main(String args[]){
    //     System.out.println("Addition of two number:"+ sum(10,10));
    //     System.out.println("Addition of two float values:"+ sum(9.8f, 10.2f));
    // }


}
