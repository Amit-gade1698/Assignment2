package Assignment2;
class Ans4_2
{
    public static void main(String[] args)
    {
        int temp=0;
        int arr[] =  {88,67,35,14,-12};
        for(int i=0; i< arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
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