import java.util.*;

public class buyAndSellStock {

          public static int buyAndSellStoc(int[] prices) {
                    int buyPrice = Integer.MAX_VALUE;
                    int maxProfit = 0; 
                    for (int i = 0; i < prices.length; i++) {
                              if (buyPrice < prices[i]) { //that is not a time to buy stock  //profit,profit=selling price-buying price,prices[i]==selling price
                                      int  profit = prices[i]-buyPrice ;//today's profit
                                      maxProfit = Math.max(maxProfit, profit);
                            } else {
                                      buyPrice = prices[i]; //that is a time to buy stock
                              }
                      
                                        
                                        
                    }
                    return maxProfit;
          }

          public static void main(String[] args) {
                    int[] prices = { 7, 1 ,5,3,6,4};
                   System.out.println(buyAndSellStoc(prices));
          }
          
}
