/*
Using TextFile and a Map<Character,Integer>, create a program that takes
the file name as a command line argument and counts the occurrence of all the different characters. Save the results in a text file.
 */
package Java;
import java.io.*;
import java.util.*;
public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of files want to create");
        int N=sc.nextInt();
        try {
            for(int i=0;i<N;i++)
            {
                System.out.println("Enter File Name");
                String fileName=sc.next();
                File file = new File(fileName);
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                    HashMap<Character,Integer> map=new HashMap<>();
                    char[] fileNameArray=fileName.toCharArray();
                    for(int j=0;j<fileNameArray.length;j++)
                    {
                        map.put(fileNameArray[j],map.getOrDefault(fileNameArray[j],0)+1);
                    }
                    FileWriter fileWriter = new FileWriter(fileName);
                    for (Character character : map.keySet())
                    {
                        fileWriter.write("Character : "+character+" repeated : "+map.get(character));
                    }
                    fileWriter.close();
                    System.out.println("Successfully Saved the results in file");

                } else {
                    System.out.println("File already exists.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}