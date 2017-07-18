package com.jlava.model;

public class MapKey {
    private String key;
    
    public MapKey(String key) {
        this.key = key;
    }
    
    public void set(String key) {
        this.key = key;
    }
    
    public String toString() {
        return this.key;
    }
}