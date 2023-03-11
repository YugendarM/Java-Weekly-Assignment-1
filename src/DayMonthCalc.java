import java.util.Scanner;
public class DayMonthCalc {
    public static int calc(int month){
        int days;

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
        {
            days = 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11 ){
            days = 30;
        }
        else if(month == 2){
            days = 28;
        }
        else
        {
            System.out.println("Invalid Input");
            return 0;
        }

        return days;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the month:");
        int month = sc.nextInt();
        System.out.println("Number of days the in the month "+ month +" is "+calc(month));
    }


}
