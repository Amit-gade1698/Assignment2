package Assignment2;
class Ans1
{
    public static void main(String[] args)
    {
        int arr[]= {23,60,94,3,102};
        int arr1[]={42,16,74};
        int arr2[]= new int [8];
       
        for (int i=0;i<arr.length;i++)
        {
           arr2 [i]= arr[i];
        }
        for (int j=0;j<arr1.length;j++)
        {
            arr2[arr.length+j]=arr1[j];
        }
        for (int x: arr2)
        {
            System.out.print(x+" ");
        }
    }
}
