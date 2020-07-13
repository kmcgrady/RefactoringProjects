package com.ga.code.codesample6;

public class Software {
    private String name;
    private int majorVersion;
    private int minorVersion;
    private int buildNumber;

    public Software(String name, int majorVersion, int minorVersion, int buildNumber) {
        this.name = name;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.buildNumber = buildNumber;
    }

    public String getName() {
        return name;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public void upgrade(int majorVersion, int minorVersion, int buildNumber) {
        if (majorVersion < this.majorVersion || minorVersion < this.minorVersion || buildNumber < this.buildNumber) {
            throw new RuntimeException("Invalid upgrade");
        }

        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.buildNumber = buildNumber;
    }
}
