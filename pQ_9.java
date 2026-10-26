public class pQ_9 {
  public static void main(String[] args) {
    int n=5;
    for(int r=1;r<=n;r++)
    {
      for(int c=1;c<=r;c++)
      {
       if(r==1 || r==2 ||r==n)
       {
        System.out.print("* ");
       }
       else if(c==1 || c==r)
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

// * 
// * * 
// *   * 
// *     * 
// * * * * * 

  }
}
