package Assignment1;
import java.util.Scanner;
class Ans7
{
    public static void main(String[] args)
    {
        float sum=0.0f;
        Scanner obj= new Scanner (System.in);
        float[] arr = new float [6];
        for (int i=1;i< arr.length; i++)
        {
            System.out.println("Enter the marks of "+i+ " subject");
            arr [ i]= obj.nextFloat();
        }
        for (float x : arr)
        {
           sum= 
                   sum +  x;
        }
           float per = sum /5;
             float per1= (sum/500)*100;
           System.out.println("percentage marks ="+ per1 + "%");
           
    }
}