package com.ga.code.codesample6;

public class Software {
    private String name;
    private Version version;

    public Software(String name, Version version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public Version getVersion() {
        return version;
    }

    public void upgrade(Version version) {
        if (this.version.compareTo(version) <= 0) {
            throw new RuntimeException("Invalid upgrade");
        }

        this.version = version;
    }
}
