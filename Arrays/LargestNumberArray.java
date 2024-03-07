package Arrays;
public class LargestNumberArray {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i])
            largest = numbers[i];
        }
        return largest;
    }
    

    public static void main(String[] args)
    {
         int numbers[] = {3, 4, 5, 10, 8, 20, 9, 11, 17, 13, 12};
         System.out.print("largest value is :"+ getLargest(numbers));

    }
    
}