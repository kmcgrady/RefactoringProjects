package com.ga.code.codesample4;


public class CodeSample4Main {
    public static void main(String[] args) {
        CloudProvider[] providers = { new AWS(), new GoogleDrive() };

        // Create Servers on each provider
        for (CloudProvider provider : providers) {
            provider.createServer("Web Server #1", "Virginia");
            provider.createServer("Web Server #2", "Virginia");
            provider.createServer("Web Server", "Portland");
            provider.createServer("Web Server", "Montreal");
            provider.createServer("Web Server", "Dublin");
            provider.createServer("Web Server", "Frankfort");
            provider.createServer("Web Server", "Singapore");
            provider.createServer("Web Server", "Sydney");
            provider.createServer("Web Server #2", "Sydney");
        }

        // Show all servers created
        for (CloudProvider provider : providers) {
            provider.listServers();
        }
    }
}
