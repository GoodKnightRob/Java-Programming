public class Diamond{
  public static void main (String [] args){int i =0, j, k, n;
 n=7;//7 characters high changes needed
 for (k=1; k<= (n+1)/2; k++){
   for (i=0; i<n-k;i++){
     System.out.print(" ");
   }
   for (j=0;j<k;j++){
     System.out.print("* ");
   }
   System.out.println("");
 }
 for (k=((n +1)/2); k<n; k++){
   for (i=1; i<k; i++){
     System.out.print(" ");
   }
   for (j=0;j<n-k;j++){
     System.out.print(" *");
   }
   System.out.println("");
 }
  }}