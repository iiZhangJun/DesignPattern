package com.abfac;

public class HPCPU extends AbstractCPU{
    HPCPU() {
        this.name = "惠普";
    }
    @Override
    public void produceCPU() {
        System.out.println(this.name + "品牌的CPU");
    }
}
