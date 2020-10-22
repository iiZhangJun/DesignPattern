package com.abfac;

public class LXDisk extends AbstractDisk{
    LXDisk() {
        this.name = "联想";
    }
    @Override
    public void produceDisk() {
        System.out.println(this.name + "品牌的Disk");
    }
}
