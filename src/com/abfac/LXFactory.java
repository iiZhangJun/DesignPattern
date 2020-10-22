package com.abfac;

public class LXFactory implements AbstractFactory{
    @Override
    public void produceCPU() {
        new LXCPU().produceCPU();
    }

    @Override
    public void produceMemory() {
        new LXMemory().produceMemory();
    }

    @Override
    public void produceDisk() {
        new LXDisk().produceDisk();
    }
}
