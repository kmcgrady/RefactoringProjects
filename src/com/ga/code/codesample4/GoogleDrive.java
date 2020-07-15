package com.ga.code.codesample4;

import java.util.HashMap;
import java.util.Map;

public class GoogleDrive implements CloudProvider {
    private Map<String, String> files;

    public GoogleDrive() {
        this.files = new HashMap<String, String>();
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

    }

    @Override
    public void listServers() {

    }
}
