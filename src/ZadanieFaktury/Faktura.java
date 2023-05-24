package ZadanieFaktury;

public class Faktura {

    Petent platnik;
    Petent wystawca;
    double kwota;
    String produkt;

    public void setPlatnik(Petent platnik) {
        this.platnik = platnik;
    }

    public void setWystawca(Petent wystawca) {
        this.wystawca = wystawca;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public void drukuj(){
        System.out.println(platnik.pobierzDane()+", "+wystawca.pobierzDane()+", "+kwota+", "+produkt);
    }
}
