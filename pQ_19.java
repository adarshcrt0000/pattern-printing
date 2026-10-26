public class pQ_19 {
public static void main(String[] args) {
  int n=4;
  int i=1;
for(int r=1;r<=n;r++)
{

for(int c=1;c<=n-r;c++)
{
  System.out.print("  ");
}
for(int c=1;c<=2*r-1;c++)
{
  System.out.print(i+" ");
}
i++;
System.out.println();

}

//       1 
//     2 2 2 
//   3 3 3 3 3 
// 4 4 4 4 4 4 4 


  }
}