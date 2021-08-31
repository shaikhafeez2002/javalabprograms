import java.util.*;
abstract class Shape
{
 double a,b;
 abstract void printArea();
}
class Rectangle extends Shape
{
 void printArea()
 {
 Scanner sc=new Scanner(System.in);
 a=sc.nextDouble();
 b=sc.nextDouble();
 double area=a*b;
 System.out.println("area is"+area);
 }
}
class Triangle extends Shape
{
 void printArea()
 {
 Scanner sc=new Scanner(System.in);
 a=sc.nextDouble();
 b=sc.nextDouble();
 double area=0.5*a*b;
 System.out.println("area is"+area);
 }
}
class Shapes
{
public static void main(String args[])
{
Shape obj;
obj=new Rectangle();
obj.printArea();
obj=new Triangle();
obj.printArea();
}
}
