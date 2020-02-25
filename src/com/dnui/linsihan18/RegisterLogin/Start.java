package com.dnui.linsihan18.RegisterLogin;

import com.dnui.linsihan18.InAndOut.OutPut;
import com.dnui.linsihan18.InAndOut.Scan_Date;
import com.dnui.linsihan18.Electronic.God;

public class Start {
    public static void start(God[][] gods){
        OutPut.show("1.已有账号，我要登录！！\n2.还没账号，我要注册！！");
        switch (Scan_Date.scan()) {
            case "1":Login.login(gods);break;
            case "2":Register.register(gods);break;
            default:OutPut.show("请输入正确的序号！！"); start(gods);
        }
    }
}
