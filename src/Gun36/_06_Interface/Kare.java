package Gun36._06_Interface;

import Gun36._05_Interface.IGosterir;

public class Kare extends Dikdortgen {
    //Kare extend ile Dikdortgen den miras aldı

    public int alan (int kenar) {
        return  super.alan(kenar, kenar);
    }

    public int cevre(int kenar) {
        return super.cevre(kenar, kenar);
    }

}
