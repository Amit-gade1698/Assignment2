package Assignment1;
import java.util.Scanner;
class Ans13
{
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a first number");
        a=obj.nextInt();
         System.out.println("Enter a second number");
        b=obj.nextInt();
         System.out.println("Enter a third number");
        c=obj.nextInt();
        if (a > b && a>c)
        {
            System.out.println(a + "is gretest number");
            
        }
        else if (b>a && b>c)
        {
            System.out.println(b + "is gretest number");
        }
        else
        {
            System.out.println(c + "is a grestset number");
        }
    }
}