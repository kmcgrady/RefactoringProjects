package com.ga.code.codesample3.states;

import com.ga.code.codesample3.SalesFunnel;

import java.util.List;

public interface SalesFunnelState {
    public void aware(SalesFunnel funnel);
    public void interested(SalesFunnel funnel);
    public void deciding(SalesFunnel funnel);
    public void acted(SalesFunnel funnel);
    public String getName();
}
