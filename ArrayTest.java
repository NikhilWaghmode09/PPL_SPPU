/*USING ARRAYS IN JAVA GETTING INT INPUT FOR ARRAY AND DISPLAYING IT*/
import java.util.*;

public class ArrayTest{
    
    public static void main(String [] args){
        
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
