package com.personalcapital.challenge.util;

import com.personalcapital.challenge.constant.PortfolioConstants;
import java.util.List;

public class PortfolioUtils {

    /**
     * This method is used for calculating median investment amount for each year
     * @param investmentAmtList
     * @return
     */
    public static double calcMedianInvstAmt(List<Double> investmentAmtList){
        //take the median amount based on the number of values
        if(investmentAmtList.size()%2 ==0){
            return (investmentAmtList.get(investmentAmtList.size()/2) + investmentAmtList.get(investmentAmtList.size()/2 -1))/2;
        } else{
            return investmentAmtList.get(investmentAmtList.size()/2);
        }
    }

    /**
     * This method is used for calculating best case for last year
     * 10% Best Case :  90th Percentile value among the 10,000 simulations
     * @param investmentAmtList
     * @return
     */
    public static double calcBestCaseInvstAmt(List<Double> investmentAmtList){
        int bestCaseIndex = (int) (investmentAmtList.size() * PortfolioConstants.BEST_CASE_FACTOR);
        return investmentAmtList.get(bestCaseIndex-1);
    }

    /**
     * This method is used for calculating worst case for last year
     * 10% Worst Case:  10th Percentile value among the 10,000 simulations
     * @param investmentAmtList
     * @return
     */
    public static double calcWorstCaseInvstAmt(List<Double> investmentAmtList){
        int worstCaseIndex = (int) (investmentAmtList.size() * PortfolioConstants.WORST_CASE_FACTOR);
        return investmentAmtList.get(worstCaseIndex-1);
    }

    /**
     * This method is used to calculste the mean
     * @param meanValue
     * @param medianInvestmentAmt
     * @return
     */
    public static double calculateMeanValue(double meanValue, double medianInvestmentAmt){
        return meanValue * medianInvestmentAmt/100;
    }



}
