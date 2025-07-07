public class spiralmatrix{
    
    public static void printspiral(int matrix [][])
    {
        int startcol=0;
        int startrow=0;
        int endcol=matrix.length-1;
        int endrow=matrix[0].length-1;
        while(startcol<=endcol&&startrow<=endrow)
        {
            //top using columns
            for(int j=startcol;j<=endcol;j++)
            {
                if(startcol==endcol)
                 {
                     break;
                 }
                System.out.print(matrix[startrow][j]+" ");
            }

            //right using row indeces
            for(int i=startrow+1;i<=endrow;i++)
             {  if(startrow==endrow)
                {
                    break;
                }
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom using col indeces
            for(int j=endcol-1;j>=startcol;j--)
            {
                System.out.print(matrix[endrow][j] +" ");
            }
            //left using row indeces
            if(startcol==endcol)
            {
                break;
            }
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                System.out.print(matrix[startcol][i] +" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }   
        
    }
    public static void main(String[] args) {
        int matrix[] []={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printspiral(matrix);

    }
}