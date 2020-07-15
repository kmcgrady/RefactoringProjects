package com.ga.code.codesample3;

import com.ga.code.codesample3.states.SalesFunnelState;

import java.util.List;

public class SalesFunnel {
    private String stateName;

    public SalesFunnel() {
        this.stateName = "Awareness";
    }

    public String getStateName() {
        return stateName;
    }

    public void changeState(SalesFunnelState nextState) {

    }

    public void moveToInterest() {
        if (!this.stateName.equals("Awareness") && !this.stateName.equals("Action")) {
            // Invalid movement to this stage
            return;
        }

        this.stateName = "Interest";
    }

    public void moveToDecision() {
        if (this.stateName.equals("Awareness")) {
            // Invalid movement to this stage
            return;
        }

        this.stateName = "Decision";
    }

    public void moveToAction() {
        this.stateName = "Action";
    }
}