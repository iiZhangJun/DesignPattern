package com.abfac;

public class LXMemory extends AbstractMemory{
    LXMemory() {
        this.name = "联想";
    }
    @Override
    public void produceMemory() {
        System.out.println(this.name + "品牌的Memory");
    }
}
