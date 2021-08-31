import java.util.*;
class Electbill
  {
   int consumerno;
   int currreading;
   String Ebconn;
   double bill;
   void input_data()
   {
    Scanner sc=new Scanner(System.in);
    consumerno=sc.nextInt();
    currreading=sc.nextInt();
    Ebconn=sc.next();
   }
   double calulate_bill()
   {
     int choice;
     if(Ebconn=="domestic")
     {
      choice=1;
     }
     else
     {
      choice=2;
     }
     switch(choice)
     {
      case 1:
      if(currreading<100)
      {
       bill=currreading*1;
      }
      
      else if(currreading>100 && currreading<200)
      {
       bill=100*1+(currreading-100)*2.5;
      }
      else if(currreading>200 && currreading<500)
      {
       bill=100*1+100*2.5+(currreading-200)*4;
      }
      else
      {
       bill=100*1+100*2.5+300*4+(currreading-500)*6;
      }
      break;
      case 2:
      if(currreading<100)
      {
       bill=currreading*2;
      }
      
      else if(currreading>100 && currreading<200)
      {
       bill=100*2+(currreading-100)*4.5;
      }
      else if(currreading>200 && currreading<500)
      {
       bill=100*2+100*4.5+(currreading-200)*6;
      }
      else
      {
       bill=100*2+100*4.5+300*6+(currreading-500)*7;
      }
      break;
    }
    return bill;
   }
   void display()
   { 
    System.out.println("Customer no "+consumerno);
    System.out.println("Currreading "+currreading);
    System.out.println("Ebconn "+Ebconn);
    System.out.println("bill "+bill);
   }
  }

class Electbillgen
{ 
  public static void main(String args[])
  {
    Electbill b=new Electbill();

    b.input_data();
    b.calulate_bill();
    b.display();
}
}

