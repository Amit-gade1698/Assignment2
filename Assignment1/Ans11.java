package Assignment1;
import java.util.Scanner;
class Ans11
{
    public static void main(String [] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number");
        int a,b,temp;
        a=obj.nextInt();
        System.out.println("Enter a second number");
        b=obj.nextInt();
        temp=b;
        b=a;
        a=temp;
        System.out.println("a = "+a + " b ="+b );
    }
}