package com.ga.code.codesample3;

import java.util.ArrayList;
import java.util.List;

public class CodeSample3Main {
    public static void main(String[] args) {
        SalesFunnel salesFunnel = new SalesFunnel();

        salesFunnel.moveToInterest(SalesFunnel.InterestedStateType.NEW_CUSTOMER);
        List<String> competitors = new ArrayList<String>();
        competitors.add("Google");
        competitors.add("Amazon");
        competitors.add("Facebook");
        salesFunnel.moveToDecision(competitors);

        salesFunnel.moveToAction(2, true);

        // Time to Renew
        salesFunnel.moveToInterest(SalesFunnel.InterestedStateType.RENEW_CUSTOMER);

        // The decided without telling us they are going with someone else :-(
        salesFunnel.moveToAction(1, false);

        // Let's win that customer back.
        salesFunnel.moveToInterest(SalesFunnel.InterestedStateType.WIN_CUSTOMER);

        // They are considering the same competitors
        salesFunnel.moveToDecision(competitors);
    }
}
