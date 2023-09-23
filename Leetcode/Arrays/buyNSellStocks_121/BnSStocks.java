    package Leetcode.Arrays.buyNSellStocks_121;

import java.util.Arrays;

public class BnSStocks {
    public static void main(String[] args) {
        int[] prices={983,341,957,541,470,660,118,742,334,822,165};
        System.out.println("Array -> "+Arrays.toString(prices));
        System.out.println("max profit -> "+maxProfit(prices));
    
    }
    
    private static int maxProfit(int[] prices){

        int maxDiff=0;
        int n = prices.length;
        int i=1, j=0;
        while(i<n){
            if(prices[i]>prices[j]){
                if(prices[i]-prices[j]> maxDiff)
                    maxDiff=prices[i]-prices[j];
            }
            if(prices[i]<prices[j])
                j=i;
            i++;
        }
        return maxDiff;


    }

    // private static int maxProfit(int[] prices){
    //     int n =prices.length;
    //     int maxDiff=0;
    //     for(int i=0; i<n-1; i++){
    //         for(int j = i+1; j<n; j++){
    //             if(prices[j]-prices[i]> maxDiff)
    //                 maxDiff=prices[j]-prices[i];
    //         }
    //     }
    //     return maxDiff;
    // }
}
