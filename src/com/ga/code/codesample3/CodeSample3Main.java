package com.ga.code.codesample3;

import com.ga.code.codesample3.states.InterestState;

import java.util.ArrayList;
import java.util.List;

public class CodeSample3Main {
    public static void main(String[] args) {
        SalesFunnel salesFunnel = new SalesFunnel();

        salesFunnel.moveToInterest();
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
