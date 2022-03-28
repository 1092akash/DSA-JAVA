
public class quickSorting 
{
    static void swap(int arr[],int i,int j)
    {
     int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
    }
    static int partition(int arr[],int beg,int end)
    {
       int pivot=arr[end];
       int i=(beg-1);
       for(int j=beg;j<=end;j++)
       {
         if(arr[j]<pivot)
         {
           i++;
           swap(arr,i,j);
         }
         
       }
       swap(arr,i+1,end);
       return i+1;
    }
    static void quicksort(int arr[],int beg,int end)
    {
       if(beg<end)
       {
         int split=partition(arr,beg,end);
         quicksort(arr,beg,split-1);
         quicksort(arr,split+1,end);
       }
    }
    static void printarr(int arr[],int size)
    {
      for(int i=0;i<size;i++)
      {
      System.out.print(arr[i]+" ");
      }
    }
    public static void main(String []args)
    {
      int arr[]={44,22,33,66,77,88,11};
      int n=arr.length;
      quicksort(arr,0,n-1);
      printarr(arr,n);
    }
}
