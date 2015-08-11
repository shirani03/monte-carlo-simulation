package com.personalcapital.challenge.model;

public class Portfolio {
	
	private double initialAmount;
	private PortfolioType portfolioType;
	private double median;
	private double bestCase;
	private double worstCase;

	private Portfolio(double initialAmount, String portfolioType){
        this.initialAmount = initialAmount;
		PortfolioType pType = PortfolioType.getPortfolioTypeByName(portfolioType);
		this.portfolioType = pType;
	}
	
	public double getInitialAmount() {
		return initialAmount;
	}

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public PortfolioType getPortfolioType() {
		return portfolioType;
	}
	
	public void setPortfolioType(PortfolioType portfolioType) {
		this.portfolioType = portfolioType;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}

	public double getBestCase() {
		return bestCase;
	}

	public void setBestCase(double bestCase) {
		this.bestCase = bestCase;
	}

	public double getWorstCase() {
		return worstCase;
	}

	public void setWorstCase(double worstCase) {
		this.worstCase = worstCase;
	}

   // factory method for creating an object of Portfolio
	public static Portfolio getPortfolio(double initialAmount, String portfolioType){
		if(initialAmount <= 0 || portfolioType == null || portfolioType.isEmpty()){
			return null;
		}
		try{
			return new Portfolio(initialAmount, portfolioType);
		}
		catch (IllegalArgumentException iaE){
			System.out.println("Portfolio cannot be created with initialAmount: " + initialAmount + " and portfolio type: " + portfolioType);
		}
		return null;
	}

	
}
