/*Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
Use the system ping utility, do not use any deprecated methods.*/
package Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Assignment3 {
    public static void runSystemCommand(String command) {
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = "";
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
            }
            inputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception occur");
        }
    }
    public static void main(String[] args) {

        String ip;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        ip =in.nextLine();
        runSystemCommand("ping " + ip);


    }
}