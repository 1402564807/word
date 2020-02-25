package com.dnui.linsihan18.Electronic;

public class God {
    private String ProductName;
    private String ProductModel;
    private double CommodityPrice;
    private String CommodityOrigin;

    public God(){}

    public God(String ProductName,String ProductModel,double CommodityPrice,String CommodityOrigin){
        this.CommodityOrigin = CommodityOrigin;
        this.CommodityPrice = CommodityPrice;
        this.ProductName = ProductName;
        this.ProductModel = ProductModel;
    }
    public String getName(){
        return "商品名称:"+this.ProductName;
    }
    public Double getCommodityPrice(){
        return this.CommodityPrice;
    }
    public String getInformation(){
        return this.ProductModel;
    }
    public String getString() {
        return "商品名称:"+ProductName+"\n商品型号:"+ProductModel+"\n商品产地:"+CommodityOrigin+"\n商品单价:"+CommodityPrice;
    }

}
