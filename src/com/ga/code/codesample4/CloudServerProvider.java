package com.ga.code.codesample4;

public interface CloudServerProvider {
    public void createServer(String name, String region);
    public void listServers();
}
