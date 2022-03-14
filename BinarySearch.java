
import java.util.Scanner;


public class BinarySearch {
    int arr[] = {10,20,30,40,50,60,70,80,90,100};
    int first=0;
    int last=arr.length-1;
    int mid;
    int item;
    public void Search(int item){
        mid =  ((first + last)/2);
        while(item!=arr[mid]&& first<=last)
        {
            if(item>arr[mid])
            {
            first=mid+1;
            }
            else{
            last=mid+1;
            }
            mid=(first+last)/2;
         
    }
        if(item==arr[mid]){
        System.out.println("Search successfull: "+mid);
        }
    }
    public static void main(String agrs[]){
    BinarySearch obj = new BinarySearch();
    Scanner sca = new Scanner(System.in);
    System.out.println("Enter the item");
    int n = sca.nextInt();
    obj.Search(n);
    
    }
    
        
    }
    

