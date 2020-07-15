package com.ga.code.codesample3.states;

import com.ga.code.codesample3.SalesFunnel;

public class DecisionState implements SalesFunnelState {
    public final static String NAME = "Decision";

    public String getName() {
        return NAME;
    }

    public void aware(SalesFunnel funnel) {
        // Don't do anything (user should already be aware)
    }

    public void interested(SalesFunnel funnel) {
        // Don't do anything (user should have acted or be deciding now)
    }

    public void deciding(SalesFunnel funnel) {
        funnel.changeState(new DecisionState());
    }

    public void acted(SalesFunnel funnel) {
        funnel.changeState(new ActionState());
    }
}