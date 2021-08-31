import java.util.*;
import java.io.*;
class Filesplitter
{
    public static void main(String  args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter n ");
   int count=0;
   int n=sc.nextInt();
   try
{  
   File f = new File("file.txt");
   Scanner sc2 =new Scanner(f);
   while(sc2.hasNextline()){
         sc2.nextline();
         count++;
  }
System.out.println(count);
}
catch(FileNotFoundException e)
{
   System.out.println("file not found");
}
}
}
