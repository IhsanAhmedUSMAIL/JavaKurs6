package Gun37._01_Soru;

public class DiselBus extends Vehicle implements IDiesel{
    public DiselBus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDiesel()
    {
        return "Bir depo ile 1000 Km gider";
    }

    @Override
    public String drive()
    {
        return "En fazla 90 Km/h hız yapıyor";
    }

}
