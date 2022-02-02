/*
Create three new types of exceptions. Write a class with a method that throws all three. In main( ),
call the method but only use a single catch clause that will catch all three types of exceptions.
Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 */
package Java;
import java.util.*;
import java.io.*;
public class Assignment8 {
    public static void throwThreeException()
    {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter number numarator");
            int N=sc.nextInt();
            System.out.println("Enter number denominator");
            int D=sc.nextInt();
            int divideByZero=N/D;
            System.out.println("Enter string");
            String indexOutOfBounds=sc.next();
            System.out.println("Enter index of character you want");
            int index=sc.nextInt();
            System.out.println("character :"+indexOutOfBounds.charAt(index));
            int number;
            System.out.println("Enter valid number");
            number=sc.nextInt();
            System.out.println("Entered number :"+number);
            String str = null; //null value
            System.out.println(str.charAt(0));
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] arg)
    {
        throwThreeException();
    }
}
