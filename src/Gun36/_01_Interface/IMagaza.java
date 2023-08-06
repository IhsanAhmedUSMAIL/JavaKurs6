package Gun36._01_Interface;

public interface IMagaza { // public veya default olması lazım.
                          // çağıramayacağın şey olamaz
    void BilgileriAl();
    void krediSkorunuKontrolEt();
    void krediSecenekleriniGoster();
    void BelgeleriImzalat();
    void krediyiKullandir();
    void krediSkorunuGoster();

    void oncekiAlisverisiniKontrolEt();
    // sonradan mimar metod eklerse bile class dosyalarında
    // uyarı geliyor ve implement olan metodların
    // içini yazılımcı dolduruyor.
}
