package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class p2Kedi extends P1Hayvan {
    public p2Kedi (String ad, String cinsi) {
        this.ad = ad; // public //super.ad=ad; yapabilirsin bu da P1Hayvan dan geldiğini gösterir.
        this.cinsi = cinsi; // protected // super.cinsi=cinsi; yapabilirsin bu da P1Hayvan dan geldiğini gösterir.
        // miras aldığın şeyi babamdan (super) ve benim(this) demek aynı şey.
        // default tan farklı olarak extend edildiğinde diğer paketlerden de erişilebilir.

    }
}
