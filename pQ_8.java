public class pQ_8 {
  public static void main(String[] args) {
    int n=4;
    for(int row=1;row<=n;row++)
    {
      for(int col=1;col<=6;col++)
      {
        if(col==1 || col==6)
        {
          System.out.print("* ");
        }
        else if(row==1 || row==n)
        {
          System.out.print("* ");
        }
        else
        {
          System.out.print("  ");
        }

      }
      System.out.println();
    }

// * * * * * * 
// *         * 
// *         * 
// * * * * * * 


  }
}
