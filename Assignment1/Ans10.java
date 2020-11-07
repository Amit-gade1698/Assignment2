package Assignment1;
import java.util.Scanner;

class Ans10
{
    public static void main(String [] args)
    {
        Scanner obj= new Scanner (System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double temp=obj.nextDouble();
        double degg = (5*(temp-32))/9;
        System.out.println(degg);
    }
}