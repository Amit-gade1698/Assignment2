package Assignment1;

import java.util.Scanner;
class Ans3_4
{
    public static void main(String[] args)
    {
        boolean x,y,z;
        Scanner obj = new Scanner (System.in);
         System.out.println("enter value of x in true or false");
        x=obj.nextBoolean();
         System.out.println("enter value of y in true or false");
        y=obj.nextBoolean();
        z= x && y ||!(x || y);
        System.out.println(z);
        
    }
}