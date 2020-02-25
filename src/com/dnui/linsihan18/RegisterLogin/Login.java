package com.dnui.linsihan18.RegisterLogin;

import com.dnui.linsihan18.InAndOut.OutPut;
import com.dnui.linsihan18.PurchaseSystem.PurchaseSystem;
import com.dnui.linsihan18.InAndOut.Scan_Date;
import com.dnui.linsihan18.Electronic.God;

import java.io.*;

public class Login {
    public static void login(God[][] gods){
        OutPut.show("请输入您的账号：");
        String user = Scan_Date.scan();
        OutPut.show("请输入您的密码：");
        String password = Scan_Date.scan();
        try {
            File file = new File("src\\user.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String value = bufferedReader.readLine();
            while (value != null){
                String[] users = value.split("-");
                if (users[0].equals(user) ){
                    if (users[1].equals(password)){
                        OutPut.show("登录成功！正在进入采购系统...");
                        PurchaseSystem.PurSystem(gods);
                    }
                }
                value = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutPut.show("用户名或密码错误！！请重新选择！");
        Start.start(gods);
    }
}
