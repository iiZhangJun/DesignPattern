package com.abfac;

public class HPFactory implements AbstractFactory{

    @Override
    public void produceCPU() {
        new HPCPU().produceCPU();
    }

    @Override
    public void produceMemory() {
        new HPMemory().produceMemory();
    }

    @Override
    public void produceDisk() {
        new HPDisk().produceDisk();
    }
}
