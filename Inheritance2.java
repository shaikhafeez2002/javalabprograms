import java.util.*;
abstract class Parent
 {
    abstract void p1();
}
class Child extends Parent
 {
  public void p1()
  {
   System.out.println("This is parent class using abstract classes");
  }
 }
class Inheritance2	
 { 
  public static void main(String args[])
  {
   Child c=new Child();
   c.p1();
  }
 }