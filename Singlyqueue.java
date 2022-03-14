
import java.util.Scanner;


public class Singlyqueue 
{
    int ar[];
    int Front,Rear;
  Singlyqueue()
          
  {
   ar= new int[5];
   Front=-1;
   Rear=-1;
  }
  void insert()
  {
      if(Rear==ar.length-1)
      {
          System.out.println("queue full");
      }
      else
      {
          System.out.println("Enter data");
          Scanner sc = new Scanner(System.in);
          int data = sc.nextInt();
          
          if(Front==-1)
          {
              Front=0;
          }
          Rear = Rear +1;
          ar[Rear]=data;
          System.out.println("data inserted... ");
      }
  }
  void delete()
  {
      if(Front==-1)
      {
          System.out.println("queue empty ");
      }
      else
      {
          System.out.println("deleted.."+ar[Front]);
         if(Front==Rear)
         {
             Front=-1;
             Rear=-1;
         }
         else if(Front<Rear)
         {
             Front = Front +1;
         }
      }
  }
  void traverse()
  {
      if(Front==-1 || Rear==-1)
      {
          System.out.println("Singly queue empty");
      }
      else
      {
          for(int i=Front;i<Rear;i++)
          {
              System.out.print(" "+ar[i]);
          }
      }
  }
  public static void main(String[] args) {
        Singlyqueue obj = new Singlyqueue();
        while (true){
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");

            System.out.println("enter ur choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    obj.delete();
                    break;
                default: 
                    System.out.println("Wrong choice");
            }
            }

        }
       
}

                
   