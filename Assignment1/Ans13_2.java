package Assignment1;
import java.util.Scanner;
class Ans13_2
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
         int a,b,c;
        System.out.println("Enter a first number");
        a=obj.nextInt();
         System.out.println("Enter a second number");
        b=obj.nextInt();
         System.out.println("Enter a third number");
        c=obj.nextInt();
        String d= (a>b && a>c)? a+ " is gretest number":(b>a && b>c)? (b+ "is gretest number"): (c + " is gretest number");
        System.out.println(d);
    }
}