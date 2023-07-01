/*Types of Constructors and 'this' keyword*/
import java.util.*;

public class Complex{
    double real, img;
    Complex(){   //DEFAULT CONSTRUCTOR(to initialize variables to 0)
        real = 0;
        img = 0;
    }
    Complex(double r, double i){  //PARAMETERIZED CONSTRUCTOR(to asign value to the instance varaibles)
        this.real = r; //using 'this' keyword to refer the obj which invoked the method.
        this.img = i; 
    }
    Complex(Complex c){   //COPY CONSTRUCTOR(to initialize a obj using another obj of same class)
        real = c.real;
        img = c.img;
        System.out.println("Copy Constructor Invoked...");
    }
    void display()
    {
        System.out.println( real + " + " + img + "i");
    }
    static public void main(String[] args){
        Complex obj1 = new Complex();  //OBJECT 1 CREATED
        obj1.display();
        Complex obj2 = new Complex(10,20);  //OBJECT 2 CREATED
        Complex obj3 = new Complex(obj2);   //OBJECT 3 CREATED
        obj3.display();
    }
}
