package com.abfac;

public class SXCPU extends AbstractCPU{

    SXCPU() {
        this.name = "三星";
    }

    @Override
    public void produceCPU() {
        System.out.println(this.name + "品牌的CPU");
    }
}
