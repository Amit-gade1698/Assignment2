package Assignment1;
import java.util.Scanner;
class Ans9
{
    public static void main(String [] args)
    {
       int days;
       Scanner obj= new Scanner(System.in);
       System.out.println("enter days");
       days=obj.nextInt();
       int year = days /360;
       days= days % 360;
       System.out.println("Number of years =" + year);
       int month=days/12;
       days= days % 12;
       System.out.println("Number of month = " + month);
       System.out.println("Number of days = "+ days);
    }
}