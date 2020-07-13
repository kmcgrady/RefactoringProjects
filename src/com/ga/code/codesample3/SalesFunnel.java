package com.ga.code.codesample3;

import java.util.List;

public class SalesFunnel {
    public static enum InterestedStateType {
        NEW_CUSTOMER,       // New Customer in System
        RENEW_CUSTOMER,     // Customer with Contract
        WIN_CUSTOMER        // Customer in System who did not go with Contract
    }

    private String stateName;
    private String stateMetadata;

    public SalesFunnel() {
        this.stateName = "Awareness";
    }

    public String getStateName() {
        return stateName;
    }

    public String getStateMetadata() {
        return stateMetadata;
    }

    public void moveToInterest(InterestedStateType interestType) {
        if (!this.stateName.equals("Awareness") && !this.stateName.equals("Action")) {
            // Invalid movement to this stage
            return;
        }

        this.stateName = "Interest";
        this.stateMetadata = interestType.name();
    }

    public void moveToDecision(List<String> competitors) {
        if (this.stateName.equals("Awareness")) {
            // Invalid movement to this stage
            return;
        }

        this.stateName = "Decision";
        this.stateMetadata = String.join("," , competitors);
    }

    public void moveToAction(int numYearsInContract, boolean didChooseUs) {
        this.stateName = "Action";
        this.stateMetadata = numYearsInContract + ";" + didChooseUs;
    }
}