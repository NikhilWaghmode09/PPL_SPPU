/*String operations like length of string, Comparing two strings, extracting char of a string & concating two strings*/
import java.util.*;

public class StrOperations{
    
    static public void main(String[] args){
        String str1 = new String("INDIA");
        String str2 = new String("indiaa");
        
        System.out.println("LENGTH OF STR1:" + str1.length());  //FINDS LENGTH OF STRING
        System.out.println("LENGTH OF STR2:" + str2.length());  //FINDS LENGTH OF STRING

        if(str1.equals(str2) == true)   //TO COMPARE TWO STRINGS
        {
            System.out.println("THE STRINGS ARE EQUAL.");
        }
        else
        {
            System.out.println("THE STRINGS ARE NOT EQUAL.");
        }
        System.out.println(str1+str2);  //concating two string
        System.out.println("The char at 3th index of str1 is "+str1.charAt(3));  //EXTRACTION OF CHARACTER FROM STRING
    }
}
