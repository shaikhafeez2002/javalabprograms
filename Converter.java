import java.util.*;
interface convert
{
  abstract void converter();
}
class Dollartoinr implements convert
{ 
  convert a=new convert();
  public void converter()
  {
   System.out.println("Enter the value of dollar");
   Scanner b=new Scanner(System.in);
   c=b.nextInt();
   double d=c*0.014;
   System.out.println("Ruppee value is ");
   System.out.println(d);
  }
}
 
class Converter
{ 
  public static void main(String args[]);
  { 
   Dollartoinr e=new Dollartoinr();
   e.converter();
  }
}    