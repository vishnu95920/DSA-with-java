public class numbertriangle {

    public static void pattern3(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
   public static void floydtriangle(int row)
   {
    
   }


    public static void main(String[] args)
    {
        pattern3(5);

    }
}
