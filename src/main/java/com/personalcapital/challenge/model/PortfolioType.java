package com.personalcapital.challenge.model;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Enum for storing PortfolioTypes and related information
 */
public enum PortfolioType {
	
	Aggressive(9.4324, 15.675, 20),
	Conservative(6.189, 6.3438, 20);
	//other portfolioTypes could be Highest Safety, Moderate, Highest Growth

	private double mean;
	private double standardDeviation;
	private int durationInYears;
	
	private static Map<String, PortfolioType> portfolioLookup = new HashMap<String, PortfolioType>();

	//static block to put all portfolioType into HashMap to retrieve from it via the portfolioType name
    static {
        for (PortfolioType pType : EnumSet.allOf(PortfolioType.class)) {
        	portfolioLookup.put(pType.name(), pType);
        }
    }
    
	private PortfolioType(double mean, double standardDeviation, int durationInYears){
		this.mean = mean;
		this.standardDeviation = standardDeviation;
		this.durationInYears = durationInYears;	
	}
	
	/**
	 * This method is used to get the PortfolioType from portfolioType name
	 * @param portfolioName
	 * @return
	 */
    public  static PortfolioType getPortfolioTypeByName(String portfolioName) {
		if(!portfolioLookup.containsKey(portfolioName)){
			throw new IllegalArgumentException(portfolioName + " is not a valid Portfolio Type");
		}
        return portfolioLookup.get(portfolioName);
    }
    
	public double getMean() {
		return mean;
	}

	public double getStandardDeviation() {
		return standardDeviation;
	}

	public int getDuration() {
		return durationInYears;
	}
	
}
