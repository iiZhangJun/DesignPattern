package com.abfac;

public class HPMemory extends AbstractMemory{
    HPMemory() {
        this.name = "惠普";
    }

    @Override
    public void produceMemory() {
        System.out.println(this.name + "品牌的Memory");
    }
}
