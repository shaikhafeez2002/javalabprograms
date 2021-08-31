import java.util.*;
public class Test {
public static void main (String args[])
{
   
   int i=0;
   int digit[] = new int[100];
   Scanner sc= new Scanner(System.in);
   do
   { 
      System.out.println((i+1)+"number=");
      int n = sc.nextInt();
      if(Isthereanelement(digit,n)==false)
{
  digit[i]=n;
  i++;
}
else if(Isthereanelement(digit,n)==true)
{ 
  System.out.println("numbers entered are same");
}
}
while(i<5);
}
public static boolean Isthereanelement(int digit[],int n)
{
  for(int i=0;i<digit.length;i++)
{
if(digit[i]==n)
{
return true;
}
}
return false;
}
}
