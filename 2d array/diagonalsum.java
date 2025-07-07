public class diagonalsum {
    public static void diagonal_sum(int matrix[][])
     { int digsum=0;
        for(int i=0;i<=matrix.length-1;i++)
        {
             for(int j=0;j<matrix[0].length;j++)
             {
                 //primary diagonal
                 if(i==j)
                 {
                     digsum+=matrix[i][j];
                 }
                //secon diag
                 if(i+j==matrix.length-1)
                 {
                     digsum+=matrix[i][j];
                }

             }
             System.out.println(digsum);
         }
    int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal (i == j)
            sum += matrix[i][i];
            // Add secondary diagonal (i + j == n - 1), avoid double-counting
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        System.out.println(sum);



    
    }
     public static void main(String[] args) {
        int matrix[] []={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
       
        diagonal_sum(matrix);
    }
}
