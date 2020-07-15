package com.ga.code.codesample4;

public interface CloudStorageProvider {
    public void storeFile(String name, String data);
    public String getFile(String name);
}
