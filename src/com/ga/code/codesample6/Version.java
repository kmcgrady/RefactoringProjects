package com.ga.code.codesample6;

public class Version implements Comparable<Version> {
    private int majorVersion;
    private int minorVersion;
    private int buildNumber;

    public Version(int majorVersion, int minorVersion, int buildNumber) {
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.buildNumber = buildNumber;
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

    public String toString() {
        return majorVersion + "." + minorVersion + "." + buildNumber;
    }

    @Override
    public int compareTo(Version o) {
        if (o.getMajorVersion() < majorVersion ||
                o.getMinorVersion() < minorVersion ||
                o.getBuildNumber() < buildNumber) {
            return -1;
        }

        if (o.getMajorVersion() == majorVersion &&
                o.getMinorVersion() == minorVersion &&
                o.getBuildNumber() == buildNumber) {
            return 0;
        }

        return 1;
    }
}
