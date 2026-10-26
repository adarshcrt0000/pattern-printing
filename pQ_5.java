public class pQ_5 {
  public static void main(String[] args) {

    // method 1
//     int n=5;
// for(int row=1;row<=n;row++)
// {
//   for(int col=1;col<=(n-row+1);col++)
//   {
//     System.out.print("* ");
//   }
//   System.out.println();
// }

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 



// method 2



    int n=5;
for(int row=1;row<=n;row++)
{
  for(int col=n;col>=row;col--)
  {
    System.out.print("* ");
  }
  System.out.println();
}


// * * * * * 
// * * * * 
// * * * 
// * * 
// * 


  }
}
