public class pQ_11 {
  public static void main(String[] args) {
    
    int n=4;
    for(int r=1;r<=n;r++)
    {
      for(int c=1;c<=n-r;c++)
      {
        System.out.print("  ");
      }
      for(int c=1;c<=2*r-1;c++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }


    for(int r=1;r<=n;r++)
    {
if(r==1)
{
continue;
}
else
      { 
       for(int c=1;c<=r-1;c++)
      {
        System.out.print("  ");
      }
      for(int c=1;c<=2*n-2*r+1;c++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }

   
    }

//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
//   * * * * * 
//     * * * 
//       * 



  }
}
