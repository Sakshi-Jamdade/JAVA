class Solution 
{
    public static int maximumProfit(int prices[])
    {
        // code here
        if(prices == null || prices.length < 2)
        {
            return 0;
        }
        
        int maxProfit=0;
        
        for(int i=1; i< prices.length ;i++)
        {
            if(prices[i] > prices[i-1])
            {
                maxProfit +=prices[i] - prices[i-1];
            }
        }
    return maxProfit;
        
    }
    
}
