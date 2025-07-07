public class quest3 {
    public static int maxprofit(int price[],int n)
    {
        int maxprof=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<=n-1;i++)
        {
            if(buyprice<price[i])
            {
                int profit=price[i]-buyprice;
                maxprof=Math.max(maxprof, profit);

            }
            else{
                buyprice=price[i];
                
                
            }
           
            

        }
     return maxprof;   
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        int Prices[]={7,6,4,3,1};
        int n=Prices.length;
        System.out.println("profit is"+" "+ maxprofit(Prices, n));
        
    }
}
