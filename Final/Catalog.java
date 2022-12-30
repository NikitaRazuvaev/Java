package Final;

public class Catalog {
    private String name;
    private String ram;
    private String hdd;
    private String os;
    private String coins;

    Catalog (String n, String s, String m, String sys, String sym){
        this.name = n;
        this.ram =  s;
        this.hdd = m;
        this.os = sys;
        this.coins = sym;
    }
    @Override
    public String toString(){
        return String.format("%s | %d | %d | %s | %d \n", name,ram,hdd,os,coins);
    }

    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hdd;
    }

    
    public String getOperatingSystem() {
        return os;
    }
    public String getCoins() {
        return coins;
    }
    }

