package com.dnui.linsihan18.Electronic;

public class Computer extends God{
    private String Cpu;
    private String Ram;
    private String Hard_Disk;
    private String Colour;
    public Computer(){};
    public Computer(String ProductModel,double CommodityPrice,String CommodityOrigin,String Cpu,String Ram,String Hard_Disk, String Colour) {
        super("电脑",ProductModel,CommodityPrice,CommodityOrigin);
        this.Cpu = Cpu;
        this.Ram = Ram;
        this.Hard_Disk = Hard_Disk;
        this.Colour = Colour;
    }
    public Double getCommodityPrice(){
        return super.getCommodityPrice();
    }
    public String getInformation(){
        return super.getInformation() + "-" + Cpu + "-" + Colour + "-" + super.getCommodityPrice() + "元";
    }
    public String getString(){
        return super.getString()+"\n处理器型号:"+Cpu+"\n电脑内存:"+Ram+"\n电脑硬盘:"+Hard_Disk+"\n电脑颜色:"+Colour;
    }
}
