package Assignment1;
import java.util.Scanner;
class Ans14_2
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter year");
        int year=obj.nextInt();
        String c= (year % 4== 0) ?  "This is leap year" : "This is not leap year";
        System.out.println(c);
    }
}