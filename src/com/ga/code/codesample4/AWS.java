package com.ga.code.codesample4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AWS implements CloudProvider {
    private Map<String, String> files;
    private Map<String, List<String>> servers;

    public AWS() {
        this.files = new HashMap<String, String>();
        this.servers = new HashMap<String, List<String>>();
    }

    @Override
    public void storeFile(String name, String data) {
        this.files.put(name, data);
    }

    @Override
    public String getFile(String name) {
        return this.files.get(name);
    }

    @Override
    public void createServer(String name, String region) {
        if (this.servers.get(region) == null) {
            this.servers.put(region, new ArrayList<String>());
        }

        this.servers.get(region).add(name);
    }

    @Override
    public void listServers() {
        System.out.println("AWS Servers");
        System.out.println("-----------\n");
        for (String region : this.servers.keySet()) {
            System.out.println(region);
            System.out.println("-".repeat(region.length()));
            for (String serverName : this.servers.get(region)) {
                System.out.println(serverName);
            }

            System.out.println();
        }
    }

    @Override
    public String getCDNAddress() {
        return "https://cdn.aws.com";
    }
}
