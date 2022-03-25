
public class InsertionSort {
        int arr[] = {7,8,9,3,1,2};
        int temp;
        int pos;
        public void sort()
        {
         for(int i=1;i<arr.length;i++)
         {
          temp=arr[i];
          pos=i-1;
          while(pos>=0 && temp<arr[pos])
          {
            arr[pos+1]=arr[pos];
            pos--;
          }
          arr[pos+1]=temp;
         }
        }
        public void traverse()
        {
        for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+" ");
        }
        }
        public static void main(String[]args)
        {
        InsertionSort obj = new InsertionSort();
        obj.sort();
        obj.traverse();
        }
    
}
    


    