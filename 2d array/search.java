public class search {
    public static boolean search_key(int matrix[] [],int key)
    {
      int row=0;
      int col=matrix[0].length-1;
      while (row<matrix.length && col>=0) 
      {
        if(key==matrix[row][col])
        {
            System.out.print("key found at index "+row+","+col);
            return true;
        }
        else if(key<matrix[row][col])
        {
            col--;

        }
        else {
           row++;
        }
      

        
      }
      System.out.println("key not found !");
      return false;
     
    }
    public static void main(String[] args) {
        int matrix[][]={
          {10,20,30,40},
          {15,25,35,45},
          {27,29,37,49},
          {32,33,39,50}    
        
        };
        int key=33;
        search_key(matrix, key);

    }
}
