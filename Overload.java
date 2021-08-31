import java.util.*;
class Overload1
 {
 public void area()
 {
  System.out.println("mu name is adnan");
  }
 public void area(int a, int b)
 {
  System.out.println("mu name is hafeez");
  }

   
 public void area(int a)
 {
  System.out.println("mu name is harshith");
  }
 public void area(double a, int b)
 {
  System.out.println("mu name is harsha");
  }
 public void area(float a, int b)
 {
  System.out.println("mu name is sandeep");
  }

}
class Overload
{
 public static void main(String args[])

 {
  
  Overload1 b=new Overload1();
  int choice;
  System.out.println("MENU");
 System.out.println("Press 1 for no args");
 System.out.println("2 for one arg,int");
 System.out.println("3 for two args");
 System.out.println("4 for double two args");
 System.out.println("5 for folat two args");
 Scanner c=new Scanner(System.in);
 choice=c.nextInt();

  switch(choice)
 {
  case 1:
  
   b.area();
  break;
  case 2:
   b.area(10);
  break;
  case 3:
   b.area(10,100);
  break;
  case 4:
   b.area(10.000100,1);
  break;
  case 5:
   b.area(12.3f,34);
  break;
}
}
}