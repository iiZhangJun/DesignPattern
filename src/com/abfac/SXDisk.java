package com.abfac;

public class SXDisk extends AbstractDisk{
    SXDisk() {
        this.name = "三星";
    }
    @Override
    public void produceDisk() {
        System.out.println(this.name + "品牌的Disk");
    }
}
