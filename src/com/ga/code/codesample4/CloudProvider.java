package com.ga.code.codesample4;

public interface CloudProvider {
    public void storeFile(String name, String data);
    public String getFile(String name);
    public void createServer(String name, String region);
    public void listServers();
    public String getCDNAddress();

}
