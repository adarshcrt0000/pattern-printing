public class pQ_18 {
  public static void main(String[] args) {
    int n=4;

    for(int r=1;r<=n;r++)
    {
      for(int c=1;c<=n-r;c++)
      {
        System.out.print("  ");

      }
      for(int c=1;c<=r;c++)
      {
        System.out.print(c+" ");
      }
    int cr=r;
    int decr=r-1;
    for(int c=1;c<=r-1;c++)
      {
        System.out.print(decr+" ");
        decr--;
      }
      System.out.println();

    }

//       1 
//     1 2 1 
//   1 2 3 2 1 
// 1 2 3 4 3 2 1 


  }
}
