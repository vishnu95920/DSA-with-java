public class zero_one_triangle {
    public static void triangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0){
                    System.err.print('0');
                }
                else{
                    System.out.print('1');                }
            }
            System.err.println();
        }
    }

    public static void main(String[] args)
    {
      triangle(5);
    }
}