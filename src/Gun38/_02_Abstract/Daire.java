package Gun38._02_Abstract;

public class Daire extends Sekil{
    private double yaricap;

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }
    @Override
    double alan() {

        return  Math.PI*yaricap*yaricap;
    }

    @Override
    double cevre() {

        return 2*Math.PI*yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }


}
