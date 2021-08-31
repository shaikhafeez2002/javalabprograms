import java.util.*;
class Overridding1
{ 
 public void print()
  {
    System.out.println("My name is sheela");
  }
}
class Overridding2 extends Overridding1
{
 public void print()
  {
    System.out.println("My name is muni");
    

  }
}
class Overridding3 extends Overridding2
{
 public void print()
  {
    System.out.println("sandeep loves mouniroy");

  }
}
class Overridding4 extends Overridding3
{
 public void print()
  {
    System.out.println("macha fucks");

  }
}
class Overridding
{
 public static void main(String args[])
 {
  Overridding1 a=new Overridding1();
  Overridding2 b=new Overridding2();
  Overridding3 c=new Overridding3();
  Overridding4 d=new Overridding4();
 int choice;
 System.out.println("MENU");
 System.out.println("Press 1 for no args");
 System.out.println("2 for one arg,int");
 System.out.println("3 for two args");
 System.out.println("4 for double two args");
 Scanner sc=new Scanner(System.in);
 choice=sc.nextInt();

  switch(choice)
 {
  case 1:
  
   a.print();
  break;
  case 2:
   b.print();
  break;
  case 3:
   c.print();
  break;
  case 4:
   d.print();
  break;
}
  
}
}