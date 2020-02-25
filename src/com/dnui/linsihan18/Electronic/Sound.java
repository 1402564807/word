package com.dnui.linsihan18.Electronic;

public class Sound extends God{
    private String HornSize;
    private String Power;


    public Sound (){}

    public Sound(String ProductModel,double CommodityPrice,String CommodityOrigin,String HornSize,String Power){
        super("音响",ProductModel,CommodityPrice,CommodityOrigin);
        this.HornSize = HornSize;
        this.Power = Power;
    }
    public Double getCommodityPrice(){
        return super.getCommodityPrice();
    }
    public String getInformation(){
        return super.getInformation() + "-" + HornSize + "-" + Power + "-" + super.getCommodityPrice() + "元";
    }
    public String getString(){
        return super.getString() + "\n喇叭大小:"+HornSize + "\n功率:"+Power;
    }
}
