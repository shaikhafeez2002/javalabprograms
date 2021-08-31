import java.util.*;
public class Matrixa{
  public static void main(String args[]){
         int n;
         Scanner sc =new Scanner(System.in);
         n = sc.nextInt();
         int [][] m1 = new int[n][n];
         
         int [][] m2 = new int[n][n];
         
         int [][] mat = new int[n][n];
         for(int i=0;i<n;i++)
        {
              for(int j=0;j<n;j++){
                  m1[i][j]=sc.nextInt();
         }
       }
       
                 for(int i=0;i<n;i++)
        {
              for(int j=0;j<n;j++){
                  m2[i][j]=sc.nextInt();
         }
}
          for(int i=0;i<n;i++)
        {
              for(int j=0;j<n;j++){
for(int k=0;k<n;k++){
                  mat[i][j]=mat[i][j]+m1[i][k]*m2[k][j];
         }
}

}
System.out.println("product");
         for(int i=0;i<n;i++)
        {
              for(int j=0;j<n;j++){
                  System.out.println(mat[i][j]+" ");
         }
}
            
}
}        