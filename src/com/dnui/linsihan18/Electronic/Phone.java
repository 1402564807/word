package com.dnui.linsihan18.Electronic;

public class Phone extends God{
    private String ScreenSize;
    private String MemorySize;
    private String PhoneColour;

    public Phone(){}
    public Phone(String ProductModel,double CommodityPrice,String CommodityOrigin,String ScreenSize,String MemorySize,String PhoneColour){
        super("手机",ProductModel,CommodityPrice,CommodityOrigin);
        this.ScreenSize = ScreenSize;
        this.MemorySize = MemorySize;
        this.PhoneColour = PhoneColour;
    }
    public Double getCommodityPrice(){
        return super.getCommodityPrice();
    }
    public String getInformation(){
        return super.getInformation() + "-" + ScreenSize + "-" + PhoneColour + "-" + super.getCommodityPrice() + "元";
    }
    public String getString(){
        return super.getString() + "\n屏幕大小:"+ScreenSize + "\n内存大小:"+MemorySize+"\n手机颜色:"+PhoneColour;
    }
}
