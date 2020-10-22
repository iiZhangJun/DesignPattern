package com.abfac;

public class SXFactory implements AbstractFactory{
    @Override
    public void produceCPU() {
        new SXCPU().produceCPU();
    }

    @Override
    public void produceMemory() {
        new SXMemory().produceMemory();
    }

    @Override
    public void produceDisk() {
        new SXDisk().produceDisk();
    }
}
