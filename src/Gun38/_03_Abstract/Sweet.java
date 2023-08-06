package Gun38._03_Abstract;

public abstract class Sweet extends Food { // Food class ından miras (extends) alır

    public String taste() //String yerine void (override) yapsaydın return yapmana gerek yok
    {
        return "good, sugar, sweet";
    }
}
