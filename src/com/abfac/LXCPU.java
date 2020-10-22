package com.abfac;

public class LXCPU extends AbstractCPU{
    public LXCPU() {
        this.name = "联想";
    }
    @Override
    public void produceCPU() {
        System.out.println(this.name + "品牌的CPU");
    }
}
