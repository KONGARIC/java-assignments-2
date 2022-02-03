package Java;

import java.lang.invoke.CallSite;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int numberOfInputs=scanner.nextInt();
        String dates[][]=new String[numberOfInputs][2];
        scanner.nextLine();
        for(int index=0;index<numberOfInputs;index++)
            dates[index]= scanner.nextLine().split(" ");

        for(int index=0;index<numberOfInputs;index++)
            validateKYC(dates[index][0],dates[index][1]);
    }

    public static void validateKYC(String inputSignUpDate,String inputCurrentDate) {
        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            Date signUpDate = dateFormatter.parse(inputSignUpDate);
            Date currentDate= dateFormatter.parse(inputCurrentDate);
            //if signUpDate is after currentDate then it is not in range.
            if(signUpDate.after(currentDate))
                System.out.println("No Range");
            else {
                Calendar kycYear=Calendar.getInstance();
                Calendar calendar = Calendar.getInstance();
                kycYear.setTime(currentDate);
                //set before 30 days date
                calendar.setTime(signUpDate);
                calendar.add(Calendar.DATE, -30);
                calendar.set(Calendar.YEAR,kycYear.get(Calendar.YEAR));
                Date before30Days=calendar.getTime();
                //set after 30 days date
                calendar.setTime(signUpDate);
                calendar.set(Calendar.YEAR,kycYear.get(Calendar.YEAR));
                calendar.add(Calendar.DATE, 30);
                Date after30Days=calendar.getTime();
                //print range like 30 days before and early date from any one of currentDate or after30Days.
                if(after30Days.after(currentDate))
                    after30Days=currentDate;
                System.out.println(dateFormatter.format(before30Days)+" "+dateFormatter.format(after30Days));
            }
        }
        catch (Exception e) {
            System.out.print("Exception occured !!!");
        }
    }
}