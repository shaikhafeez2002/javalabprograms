import java.util.*;
class Prime{
    public static void main(String args[]){
              int i,j;
              System.out.println("enter the value of n:");
              Scanner sc=new Scanner(System.in);
              int n =sc.nextInt();
              for(j=2;j<=n;j++)
              {
                 int count=0;
                 for(i=1;i<=j;i++){
                      if(j%i==0){ 
                            count++;
                        }
                  }
           
             if(count==2)
            {
               System.out.println(j+" ");
             }
        }
}
}