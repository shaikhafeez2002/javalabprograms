import java.util.*;
class Parent
 {
  public void p1()
  {
   System.out.println(" This is parent class");
  }
 }
class Child extends Parent
 {
  public void c1()
  {
   System.out.println("This is child calss");
  }
 }
class Inheritance
 { 
  public static void main(String args[])
  {
   Child c=new Child();
   c.c1();
   c.p1();
  }
 }