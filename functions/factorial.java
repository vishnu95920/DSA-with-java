public class factorial{
    public static  int factorial(int n)
{
    int f=1;
    for(int i=1;i<=n;i++)
    {
        f=f*i;
       
    }

    return f;
   
}
    public static int bino(int n, int r)
    {
      int fact_n=factorial(n);
      int fact_r=factorial(r);
      int fact_nmr=factorial(n-r);
      int binom=fact_n/(fact_r * fact_nmr);
      return binom;
    }
    public static void main(String[] args)
    {
      System.out.println("factorial is  "+factorial(5));
      System.out.println("binomial coff of 5 and 2  is ="+bino(5,2));
    }
}