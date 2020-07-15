package com.ga.code.codesample6;

public class CodeSample6Main {
    public static void main(String[] args) {
        Software software = new Software("America Online", new Version(7, 0, 1));

        try {
            software.upgrade(new Version(7, 0, 0));
            System.out.println("Software Upgraded");
        } catch (RuntimeException exception) {
            System.out.println("Unable to Upgrade Software");
        }
    }
}
