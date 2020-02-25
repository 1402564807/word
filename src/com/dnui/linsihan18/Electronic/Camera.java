package com.dnui.linsihan18.Electronic;

public class Camera extends God{
    private String Format;
    private String Pixel;

    public Camera (){}

    public Camera(String ProductModel,double CommodityPrice,String CommodityOrigin,String Format,String Pixel){
        super("相机",ProductModel,CommodityPrice,CommodityOrigin);
        this.Format = Format;
        this.Pixel = Pixel;
    }
    public Double getCommodityPrice(){
        return super.getCommodityPrice();
    }
    public String getInformation(){
        return super.getInformation() + "-" + Format + "-" + Pixel + "-" + super.getCommodityPrice() + "元";
    }
    public String getString(){
        return super.getString() + "\n画幅大小:"+Format + "\n像素大小:"+Pixel;
    }
}
