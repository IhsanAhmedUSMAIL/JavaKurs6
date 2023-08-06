package Gun38._03_Abstract;

public abstract class Salad extends Food { // Food class ından miras (extends) alır
    public abstract String madeIn();
    public String taste() //String yerine void (override) yapsaydın return yapmana gerek yok
    {

        return "sour";
    }
}
