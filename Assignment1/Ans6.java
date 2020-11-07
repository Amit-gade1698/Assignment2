package Assignment1;
import java.util.Scanner;
class Ans6
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float rad= obj.nextFloat();
        float res=(float) 2.0f*3.14f*rad;
        System.out.println(res);
    }
    
}