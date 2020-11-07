package Assignment1;
import java.util.Scanner;
class Ans14
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a year");
        int year=obj.nextInt();
        if (year % 4 == 0)
        {
           System.out.println( year+ "is a leap year");
           
        }
        else
        {
            System.out.println(year+ " It is not leap year");
        }
    }
}
