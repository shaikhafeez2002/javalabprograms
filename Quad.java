import java.util.*;
class Quad{
    public static void main(String args[]){
     int a,b,c,d,f=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Ënter the values of a,b,c");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     d=((b*b)-(4*a*c)); 
     if(d==0)
     {
      System.out.println("roots are real and equal");
      f=1;
     }  
     else if(d>0)
     {
      System.out.println("roots are real and distint");
      f=1;
     }
     else
     {
      System.out.println("roots are imaginary and complex");
     }
     if(f==1)
     {
      float r1,r2;
      r1=(float)((-1*b)+Math.sqrt(d))/(2*a);
      r2=(float)((-1*b)-Math.sqrt(d))/(2*a);
      System.out.println("roots are "+r1+","+r2);
     }
    }
   } 
     
    