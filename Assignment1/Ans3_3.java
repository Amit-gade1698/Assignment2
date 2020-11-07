package Assignment1;
import java.util.Scanner;
class Ans3_3
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int y,x,z;
        System.out.println("enter value of x");
        x=obj.nextInt();
         System.out.println("enter value of y");
        y=obj.nextInt();
        z= x++ - --y - --x + x++;
         System.out.println("value of x "+ x);
        System.out.println("enter value of y "+ y);
        System.out.println("enter value of z "+ z);
    }
}
        
        
        