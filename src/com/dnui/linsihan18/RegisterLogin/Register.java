package com.dnui.linsihan18.RegisterLogin;

import com.dnui.linsihan18.InAndOut.OutPut;
import com.dnui.linsihan18.InAndOut.Scan_Date;
import com.dnui.linsihan18.Electronic.God;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Register {
    public static void register(God[][] gods){
        OutPut.show("请输入您的账号：");
        String user = Scan_Date.scan();
        OutPut.show("请输入您的密码：");
        String password1 = Scan_Date.scan();
        OutPut.show("请再一次输入您的密码：");
        String password2 = Scan_Date.scan();
        if(password1.equals(password2)){
            try {
                File file = new File("src\\user.txt");
                FileWriter fileWriter = new FileWriter(file,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                String value = user + "-" + password1 ;
                bufferedWriter.newLine();
                bufferedWriter.write(value);
                bufferedWriter.flush();
                bufferedWriter.close();
                OutPut.show("注册成功啦！赶快去登陆吧！！");
                Login.login(gods);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {
            OutPut.show("两次密码不一致！手抖了？？？重新来！");
            Register.register(gods);
        }
    }
}
