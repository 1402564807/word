package com.dnui.linsihan18.PurchaseSystem;

import com.dnui.linsihan18.InAndOut.OutPut;
import com.dnui.linsihan18.InAndOut.Scan_Date;
import com.dnui.linsihan18.Electronic.God;

public class PurchaseSystem {

    public static void PurSystem(God[][] gods){
        String s = "欢迎进入选购系统！\n";
        for (int i = 0; i < gods.length; i++) {
            s += i + 1 + "." + gods[i][0].getName() + "\n";
        }
        s += "请输入您要选购的商品序号：";
        OutPut.show(s);
        switch (Scan_Date.scan()){
            case "1" : PlanBuy(gods[0],gods);break;
            case "2" : PlanBuy(gods[1],gods);break;
            case "3" : PlanBuy(gods[2],gods);break;
            case "4" : PlanBuy(gods[3],gods);break;
            default: OutPut.show("请输入正确序号！！再来一遍吧！");PurSystem(gods);break;
        }
    }

    private static void PlanBuy(God[] gods,God[][] gods1){
        String s = "";
        for (int i = 0; i < gods.length; i++) {
            s += i + 1 + "." + gods[i].getInformation() + "\n";
        }
        s += "请输入您要选购的商品序号：";
        OutPut.show(s);
        Buy(gods[Integer.parseInt(Scan_Date.scan()) - 1],gods1);
    }

    private static void Buy(God gods,God[][] gods1){
        String ss,s = "您选择的商品信息如下:\n" + gods.getString() + "\n是否购买此商品呢？(Y/N)";
        OutPut.show(s);
        ss = Scan_Date.scan();
        if (ss.equalsIgnoreCase("Y")){
            OutPut.show("请输入您要购买的数量：");
            BuyNumber(gods,gods1);
        }else if (ss.equalsIgnoreCase("N")){
            OutPut.show("购买已取消！正在返回商品列表...");
            PurSystem(gods1);
        }else {
            OutPut.show("输入信息有误！请重新选择！");
            Buy(gods,gods1);
        }
    }

    private static void BuyNumber(God god,God[][] gods){
        int value = Integer.parseInt(Scan_Date.scan());
        String s = "商品总价为：" + god.getCommodityPrice() * value + "\n是否购买此商品呢？(Y/N)";
        OutPut.show(s);
        s = Scan_Date.scan();
        if (s.equalsIgnoreCase("Y")){
            OutPut.show("购买成功！是否继续购买？(Y/N)");
            s = Scan_Date.scan();
            if (s.equalsIgnoreCase("Y")){
                OutPut.show("正在返回商品列表...");
                PurSystem(gods);
            }else {
                OutPut.show("正在退出选购系统，谢谢惠顾！");
                System.exit(0);
            }
        }else if (s.equalsIgnoreCase("N")){
            OutPut.show("购买已取消！正在返回商品列表...");
            PurSystem(gods);
        }else {
            OutPut.show("输入信息有误！请重新选择！");
            Buy(god,gods);
        }
    }
}
