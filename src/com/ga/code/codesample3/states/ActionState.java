package com.ga.code.codesample3.states;

import com.ga.code.codesample3.SalesFunnel;

public class ActionState implements SalesFunnelState {
    public final static String NAME = "Action";

    public String getName() {
        return NAME;
    }


    public void aware(SalesFunnel funnel) {
        // Don't do anything (user should already be aware)
    }

    public void interested(SalesFunnel funnel) {
        funnel.changeState(new InterestState());
    }

    public void deciding(SalesFunnel funnel) {
        funnel.changeState(new DecisionState());
    }

    public void acted(SalesFunnel funnel) {
        funnel.changeState(new ActionState());
    }
}
