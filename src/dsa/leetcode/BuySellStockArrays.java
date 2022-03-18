package dsa.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuySellStockArrays {
    public static void main(String[] args) {
        //int[] arr = {7,1,5,3,6,4};
        //int[] arr = {2, 4, 1};
        int[] arr = {1,2,3,4,5};
        System.out.println(computeProfitBuySellSameDayWithLimit(arr));
    }

    public static int computeProfitBuySellDiffDays(int[] prices) {
        int buy = prices[0];
        int sell = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price < buy) {
                buy = price;
                sell = price;
            } else if (price > sell) {
                sell = price;
            }
            maxProfit = Math.max(maxProfit, sell - buy);
        }
        return maxProfit;
    }

    public static int computeProfitBuySellSameDays(int[] prices) {
        int buy = prices[0];
        int sell = prices[0];
        int maxProfit = 0;
//        List<Integer> maxProfit = new ArrayList();

        for (int p : prices) {
            if (p < buy) {
                buy = p;
                sell = p;
            } else if (p > sell) {
                sell = p;
                maxProfit += (sell - buy);
                buy = p;
            }
        }
        //Collections.sort(maxProfit,Collections.reverseOrder());
        return maxProfit; //.get(0)+maxProfit.get(1);
    }

    public static int computeProfitBuySellSameDayWithLimit(int[] prices) {
       /* int buy = prices[0];
        int sell = prices[0];
        List<Integer> maxProfit = new ArrayList();*/
        int fb=Integer.MIN_VALUE;
        int sb=Integer.MIN_VALUE;
        int fs = 0, ss = 0;


        for (int p : prices) {

            fb = Math.max(fb, -p);
            fs = Math.max(fs, fb + p);
            sb = Math.max(sb, fs - p);
            ss = Math.max(ss, sb + p);


           /* if (p < buy) {
                buy = p;
                sell = p;
            } else if (p > sell) {
                sell = p;
                maxProfit.add(sell - buy);
                //buy = p;
            }*/
        }
        /*Collections.sort(maxProfit,Collections.reverseOrder());

        return maxProfit.get(0)+maxProfit.get(1);*/
        return ss;
    }
}
