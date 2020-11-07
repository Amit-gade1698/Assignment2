package Assignment1;
import java.util.Scanner;
class Ans8
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter princple amount");
        a=obj.nextFloat();
         System.out.println("Enter rate of interest");
         b=obj.nextFloat();
          System.out.println("Enter number of year ");
          c=obj.nextFloat();
          float d= (a*b*c)/100;
          System.out.println("simple interest is = "+ d);
          System.out.println("Total amount you get after"+c+ "year is "+ (d+a));
         
        
    }
}