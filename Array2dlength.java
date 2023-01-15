public class Array2dlength 
{
    public static void main(String[] args) {
        int[][] a={{10,20},{30,40,50}};
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<a[i].length;k++)
            {
                System.out.println(a[i][k]);
            }
        }
    }
    
}
