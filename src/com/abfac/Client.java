package com.abfac;

public class Client {
    public static void main(String[] args) {
        AbstractFactory hp = new HPFactory();
        hp.produceCPU();
        hp.produceMemory();
        hp.produceMemory();

        AbstractFactory  lx = new LXFactory();
        lx.produceCPU();
        lx.produceMemory();
        lx.produceDisk();

        AbstractFactory sx = new SXFactory();
        sx.produceCPU();
        sx.produceMemory();
        sx.produceDisk();

    }
}
