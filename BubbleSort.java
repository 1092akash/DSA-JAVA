
public class BubbleSort {
    int arr[]={1,2,3,4,5,6,7,8,9,10,27,45,90};
    public void sort()
    
    {
        for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length-i-1;j++)
          {
              if(arr[j]>arr[j+1])
              {
             int temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
              }
          }
          }
    }
    public void traverse()
    {
      for(int res:arr)
      {
        System.out.print(res+" ");
      }  
    }
   public static void main(String []args)
   {
   BubbleSort obj=new BubbleSort();
   obj.sort();
   obj.traverse();
   }
}
