/*
Using the documentation for java.util.regex.Pattern as a resource,
 write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
 */
package Java;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
class Assignment9 {
    public static void main(String args[]) {
        Pattern pattern = Pattern.compile("^[A-Z]+[A-Za-z0-9]*[.]");
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        Matcher matcher = pattern.matcher(string);
        System.out.println("User string start with Capital letter and end with period "+matcher.matches());
    }
}

