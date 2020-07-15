package com.ga.code.codesample3;

import java.util.ArrayList;
import java.util.List;

public class CodeSample3Main {
    public static void main(String[] args) {
        SalesFunnel salesFunnel = new SalesFunnel();

        salesFunnel.moveToInterest();
        List<String> competitors = new ArrayList<String>();
        competitors.add("Google");
        competitors.add("Amazon");
        competitors.add("Facebook");
        salesFunnel.moveToDecision();

        salesFunnel.moveToAction();

        // Time to Renew
        salesFunnel.moveToInterest();

        // The decided without telling us they are going with someone else :-(
        salesFunnel.moveToAction();

        // Let's win that customer back.
        salesFunnel.moveToInterest();

        // They are considering the same competitors
        salesFunnel.moveToDecision();
    }
}
