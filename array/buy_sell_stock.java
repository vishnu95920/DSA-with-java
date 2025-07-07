public class buy_sell_stock {
    public static int buysell_stock(int prices[],int n)
    {
        int bp=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<n;i++)
        {
            if(bp<prices[i])//profit 
            {
             int profit=prices[i]-bp;// today's profit
             maxprofit=Math.max(maxprofit, profit);// global profit
             
            }
            else {
                bp=prices[i];//buy price
            }
        }
        return maxprofit;

    }
    public static void main(String[] args)
    {
        int prices[]={7,1,5,3,6,4};
        int n=prices.length;
        System.out.print(buysell_stock(prices,n));
    }
}

//  public class buy_sell_stock {
//     public static int buysell_stock(int[] prices, int n) {
//         if (n < 2) return 0; // Edge case: need at least 2 prices to make a profit
        
//         int bp = Integer.MAX_VALUE; // Minimum buy price
//         int maxprofit = 0; // Maximum profit
        
//         for (int i = 0; i < n; i++) {
//             // Update the minimum buy price seen so far
//             bp = Math.min(bp, prices[i]);
//             // Calculate potential profit if selling at current price
//             maxprofit = Math.max(maxprofit, prices[i] - bp);
//         }
//         return maxprofit;
//     }

//     public static void main(String[] args) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         int n = prices.length;
//         System.out.println(buysell_stock(prices, n)); // Use println for clearer output
//     }
// }
