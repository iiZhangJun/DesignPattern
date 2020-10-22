package com.abfac;

public class HPDisk extends AbstractDisk{

    HPDisk() {
        this.name = "惠普";
    }
    @Override
    public void produceDisk() {
        System.out.println(this.name + "品牌的Disk");
    }
}
