package com.personalcapital.challenge.main;

import com.personalcapital.challenge.client.ExternalClient;
import com.personalcapital.challenge.model.Portfolio;
import com.personalcapital.challenge.service.PortfolioService;

/**
 * Main class which gives an output for Aggressive and Conservative Portfolio scenarios
 */
public class MainClass {

    public static void main(String[] args){

        PortfolioService portfolioService = new PortfolioService();
        ExternalClient client = new ExternalClient();

        //create an aggressive portfolio and analyse it
        Portfolio aggressivePortfolio = client.createAndAnalysePortfolio(100000, "Aggressive");
        portfolioService.printAnalysedPortfolio(aggressivePortfolio);

        //create a conservative portfolio and analyse it
        Portfolio conservativePortfolio = client.createAndAnalysePortfolio(100000, "Conservative");
        portfolioService.printAnalysedPortfolio(conservativePortfolio);
    }


}
