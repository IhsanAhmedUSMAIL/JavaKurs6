package Gun37._01_Soru;

import java.util.ArrayList;

public class fabricaMain {
    public static void main(String[] args) {

        TeslaCar tesla = new TeslaCar(350,"model 5");
        ToyotaPrius pirus = new ToyotaPrius(1200, "Sedan");
        DiselBus bus = new DiselBus(7000, "IVECO");

        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(pirus);
        arabalar.add(bus);

        for (Vehicle v: arabalar)
        {
            System.out.println("----------------");
            System.out.println(v.getClass().getSimpleName()); // classın adı
            System.out.println("----------------");
            System.out.println(v.getModel());
            System.out.println(v.getEngine());

            if (v instanceof TeslaCar)
            {
                System.out.println(((TeslaCar) v).drive());
                System.out.println(((TeslaCar) v).changeBattery());
            }
            else
                if (v instanceof ToyotaPrius) {
                    System.out.println(((ToyotaPrius) v).drive());
                    System.out.println(((ToyotaPrius) v).changeBattery());
                    System.out.println(((ToyotaPrius) v).changeOil());

                }
                else {
                    System.out.println(((DiselBus) v).drive());
                    System.out.println(((DiselBus) v).changeDiesel());
                }
        }

    }
}
