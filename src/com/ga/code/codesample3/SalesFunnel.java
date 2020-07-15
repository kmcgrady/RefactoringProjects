package com.ga.code.codesample3;

import com.ga.code.codesample3.states.AwarenessState;
import com.ga.code.codesample3.states.InterestState;
import com.ga.code.codesample3.states.SalesFunnelState;

import java.util.List;

public class SalesFunnel {
    private SalesFunnelState state;

    public SalesFunnel() {
        this.state = new AwarenessState();
    }

    public SalesFunnelState getState() {
        return this.state;
    }


    public void setState(SalesFunnelState state) {
        this.state = state;
    }

    public String getStateName() {
        return this.state.getName();
    }

    public void changeState(SalesFunnelState state) {
        SalesFunnelState previousState = this.state;
        this.setState(state);
    }

    public void moveToAware() {
        this.getState().aware(this);
    }

    public void moveToInterest() { this.getState().interested(this); }

    public void moveToDecision() {
        this.getState().deciding(this);
    }

    public void moveToAction() {
        this.getState().acted(this);
    }
}