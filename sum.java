import java.util.Scanner;
public class sum {
    
void func(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1 value");
    int var1=sc.nextInt();
    System.out.println("enter 2 value:");
    int var2=sc.nextInt();
    int res=var1+var2;
    System.out.println("total :"+res);
    
}
public static void main(String args[])
{
    sum obj=new sum();
    obj.func();
}
    
}
