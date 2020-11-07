package Assignment1;
import java.util.Scanner;
class Ans12
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner (System.in);
         double sal;
        System.out.println("Enter your salary");
        sal=obj.nextDouble();
        if (sal < 10000)
        {
          double hra,da,temp;
          da=sal * 0.9;
          hra= sal * 0.1;
          temp= sal+da+hra;
                System.out.println("Your gross salray is = "+ temp );  
          
        }
        else 
        {
             double hra,da,temp;
            da=sal * 0.98;
          hra=2000;
          temp= sal+da+hra;
                System.out.println("Your gross salray is = "+ temp );  
            
        }
    }
}