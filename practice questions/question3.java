import java.util.*;
public class question3 {
    public static int stocks(int prices[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++)
        {
            if(buyPrice< prices[i])
            {
               int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
            else
            {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int length = sc.nextInt();
        int prices[] = new int[length];
       // int prices[] = {7,1,5,3,6,4};
       for(int i = 0; i<length; i++)
       {
            prices[i] = sc.nextInt();
       }
        System.out.println(stocks(prices));
    }
}
