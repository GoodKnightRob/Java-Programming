public class newFile{
  public static void main (String [] args){
    int k=0;
    for (int i=1; i<=5; i++)
    {
      { for (int h=5; h >=i; h--)
        System.out.print(" ");
        for (int j=1; j<=i+k; j++)
        System.out.print(j);
        for (int w=2; w>=i; w--)
        System.out.print(" ");
      }
      k++;
      System.out.println();}
  }}
