package Assignment1;
import java.util.Scanner;
class Ans3_2
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int y,x;
        System.out.println("enter value of x");
        x=obj.nextInt();
        y= x++ + ++x;
        System.out.println("value of x "+ x);
        System.out.println("enter value of y "+ y);
        
    }
}