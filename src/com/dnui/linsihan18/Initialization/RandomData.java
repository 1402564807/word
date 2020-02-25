package com.dnui.linsihan18.Initialization;

import com.dnui.linsihan18.Electronic.*;
import com.dnui.linsihan18.RandomNumber.RandomDouble;
import com.dnui.linsihan18.RandomNumber.RandomInt;

public class RandomData {

    public static void InItData(God[][] god){
        RandomCamera(god[0]);
        RandomComputer(god[1]);
        RandomPhone(god[2]);
        RandomSound(god[3]);
    }

    private static void RandomCamera(God[] gg){
        String[] Format = {"小画幅","中画幅","全画幅"};
        String[] Origin = {"日本","韩国","中国","美国","英国"};
        String[] ProductModels = {"佳能","尼康","索尼"};
        String[] Pixels = {"800w","1200w","1800w","2400w","4200w","8000w"};
        for (int i = 0; i < gg.length; i++){
            String format = Format[RandomInt.RunInt(Format.length)];
            String Name = ProductModels[RandomInt.RunInt(ProductModels.length)];
            String pixels = Pixels[RandomInt.RunInt(Pixels.length)];
            String origin = Origin[RandomInt.RunInt(Origin.length)];
            double Prices = RandomDouble.RunDouble(10000);
            gg[i] = new Camera(Name,Prices,origin,format,pixels);
        }
    }

    private static void RandomComputer(God[] gg){
        String[] Cpus = { "i3-7100", "i3-7100f", "i5-7400", "i5-7400f", "i7-7900", "i7-7900f" };
        String[] Rams = { "4GB", "8GB", "16GB" };
        String[] Hard_Disks = { "512GB", "1TB", "2TB" };
        String[] Colours = { "黄色", "白色", "红色", "黑色", "蓝色", "绿色", "透明" };
        String[] Origin = {"日本","韩国","中国","美国","英国"};
        String[] ProductModels = {"雷神","外星人","神舟","惠普","机械师","联想","戴尔"};
        for (int i = 0; i < gg.length; i++) {
            String cpus = Cpus[RandomInt.RunInt(Cpus.length)];
            String rams = Rams[RandomInt.RunInt(Rams.length)];
            String hard_disks = Hard_Disks[RandomInt.RunInt(Hard_Disks.length)];
            String colour = Colours[RandomInt.RunInt(Colours.length)];
            String origin = Origin[RandomInt.RunInt(Origin.length)];
            String Product_Models = ProductModels[RandomInt.RunInt(ProductModels.length)];
            double Price = RandomDouble.RunDouble(9999);
            gg[i] = new Computer(Product_Models,Price,origin,cpus,rams,hard_disks,colour);
        }
    }

    private static void RandomPhone(God[] gg){
        String[] Origin = {"日本","韩国","中国","美国","英国"};
        String[] ProductModels = {"小米","苹果","华为","OPPO","VIVO","魅族","锤子","红米","黑鲨","红魔"};
        String[] ScreenSize = { "4英寸", "4.7英寸", "5.2英寸", "5.9英寸", "6.7英寸"};
        String[] MemorySize = { "1GB", "2GB", "4GB", "6GB", "8GB", "10GB", "12GB"};
        String[] PhoneColour = { "黄色", "白色", "红色", "黑色", "蓝色", "绿色", "透明" };
        for (int i = 0; i < gg.length; i++) {
        String colour = PhoneColour[RandomInt.RunInt(PhoneColour.length)];
        String origin = Origin[RandomInt.RunInt(Origin.length)];
        String Product_Models = ProductModels[RandomInt.RunInt(ProductModels.length)];
        String Screen_Size = ScreenSize[RandomInt.RunInt(ScreenSize.length)];
        String Memory_Size = MemorySize[RandomInt.RunInt(MemorySize.length)];
        double Price = RandomDouble.RunDouble(9999);
        gg[i] = new Phone(Product_Models,Price,origin,Screen_Size,Memory_Size,colour);
    }
}

    private static void RandomSound(God[] gg){
        String[] Origin = {"日本","韩国","中国","美国","英国"};
        String[] ProductModels = {"哈曼卡顿","苹果","华为","Bose","JBL","小米"};
        String[] HornSize = {"0.5英寸","1.0英寸","1.5英寸","2.0英寸","2.5英寸"};
        String[] Power = {"2W","3W","4W","5W","6W","7W"};
        for (int i = 0; i < gg.length; i++) {
            String origin = Origin[RandomInt.RunInt(Origin.length)];
            String Product_Models = ProductModels[RandomInt.RunInt(ProductModels.length)];
            String Horn_Size = HornSize[RandomInt.RunInt(HornSize.length)];
            String power = Power[RandomInt.RunInt(Power.length)];
            double Price = RandomDouble.RunDouble(3000);
            gg[i] = new Sound(Product_Models,Price,origin,Horn_Size,power);
        }
    }
}
