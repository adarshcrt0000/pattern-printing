public class pQ_20 {
  public static void main(String[] args) 
  {
    int n=4;
   
    for(int r=1;r<=n;r++)
    {
       char ch='A';
       for(int c=1;c<=n-r;c++)
       {
        System.out.print("  ");
       }
       for(int c=1;c<=r;c++)
       {
        System.out.print(ch+++" ");
       }

          char cch=(char)(r+'A'-2);
          

          for(int c=1;c<=r-1;c++)
          {
            System.out.print(cch+" ");
            cch--;
          }



       System.out.println();
    
    }

//       A 
//     A B A 
//   A B C B A 
// A B C D C B A 


  }
}
