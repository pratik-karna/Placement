package Arrays;

//Linear Search Algorithm

public class LinearSearch{
    public static int linear(int numbers[], int key){
        for(int i=0; i<=numbers.length; i++){
            if(numbers[i] == key){
                 return i;
        }
    }
        return -1;
}

    public static void main(String args[]){
        int numbers[] = {10, 2, 8, 16, 3};
        int key = 8;
        int index = linear(numbers, key);
        if(index == -1){
            System.out.print("Not Found");

        }
        else
        {
            System.out.print("key is at index " + index);
        }
    }
    
}
