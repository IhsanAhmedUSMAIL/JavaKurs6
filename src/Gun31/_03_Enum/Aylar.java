package Gun31._03_Enum;

public enum Aylar {
    Tanimsiz(0,0,""),
    OCAK(1, 31, "OCAK"),
    SUBAT(2, 28, "ŞUBAT"),
    MART(3, 31, "MART"),
    NISAN(4, 30, "NİSAN"),
    MAYIS(2, 31, "MAYIS"),
    HAZIRAN(6, 30, "HAZİRAN"),
    TEMMUZ(7, 31, "TEMMUZ"),
    AGUSTOS(8, 31, "AĞUSTOS"),
    EYLUL(9, 30, "EYLÜL"),
    EKIM(10, 31, "EKİM"),
    KASIM(11, 30, "KASIM"),
    ARALIK(12, 31, "ARALIK");

    final  int ayNo;
    final int gunMiktar;
    final  String ayAd;

    Aylar (int ayNo, int gunMiktar, String ayAd) {
        this.ayNo=ayNo;
        this.gunMiktar=gunMiktar;
        this.ayAd=ayAd;
    }
}
