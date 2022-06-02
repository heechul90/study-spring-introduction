package study.spring.introduction.design;

import study.spring.introduction.design.adapter.*;
import study.spring.introduction.design.singleton.AClazz;
import study.spring.introduction.design.singleton.BClazz;
import study.spring.introduction.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        //singleton
        /*AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));*/


        //adapter
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

    }

    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
