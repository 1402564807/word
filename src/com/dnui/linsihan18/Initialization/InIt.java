package com.dnui.linsihan18.Initialization;

import com.dnui.linsihan18.Electronic.*;
import com.dnui.linsihan18.RegisterLogin.Start;

public class InIt {

    public God[][] god = new God[4][];
    public InIt(){
        god[0] = new Camera[6];
        god[1] = new Computer[5];
        god[2] = new Phone[5];
        god[3] = new Sound[4];

        RandomData.InItData(god);
        Start.start(god);
    }

}
