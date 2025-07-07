public class count7 {
    public static int count(int matrix[][],int n, int m)
    {int count =0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<m;j++)
            {
              if (matrix[i][j]==7)
              {
                count ++;

              }

            }
        }
        return count; 
    
    
    }
    public static void main(String[] args) {
        int matrix[][]={
            {4,7,8},
            {8,8,7}
        };
        int n=matrix[0].length;
        int m=matrix.length;
        count(matrix, n, m);
    }
}
