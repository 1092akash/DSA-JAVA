import java.util.Scanner;
public class swap {
    swap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 value");
        int v1=sc.nextInt();
        System.out.println("enter 2 value");
        int v2=sc.nextInt();
        System.out.println("value of v1="+v1);
        System.out.println("value of v2="+v2);
        int t=v1;
        v1=v2;
        v2=t;
        System.out.println("value of v1="+v1);
        System.out.println("value of v2="+v2);
        
    
    }
    public static void main(String args[]){
        swap obj=new swap();
    }
}