package Gun37._01_Soru;

public class ToyotaPrius extends Vehicle implements IElectric,IGas {
    public ToyotaPrius(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Ömür boyu kullan";
    }

    @Override
    public String changeOil()
    {
        return "bir depo ile 300 km gider";
    }

    @Override
    public String drive()
    {
        return "ilk üç kilometre elektrik ile gider";
    }

}
