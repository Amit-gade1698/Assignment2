
package Assignment2;
class Ans4
{
    public static void main(String[] args)
    {
        int temp=0;
        int arr[] =  {5,14,35,90,139};
        for(int i=0; i< arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        for (int x : arr)
        {
            System.out.println(x);
        }
    }
}