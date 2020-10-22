package com.abfac;

public class SXMemory extends AbstractMemory{
    SXMemory() {
        this.name = "三星";
    }
    @Override
    public void produceMemory() {
        System.out.println(this.name + "品牌的Memory");
    }
}
