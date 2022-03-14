
public class SelectionSort
{
    int arr[]={2,5,3,89,50,6,45,30,90,78,25};
    public void sort(int arr[])
    {
    for(int i=0;i<arr.length;i++)
    {
    for(int j=i;j<arr.length;j++)
    {
      if(arr[i]>arr[j])
      {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
    }
    
    }
    public void traverse()
    {
        for(int r:arr)
        {
          System.out.print(r+" ");
        }
    }
    public static void main(String [] args)
    {
      SelectionSort obj=new SelectionSort();
      obj.sort(obj.arr);
      obj.traverse();
      
    }
}
