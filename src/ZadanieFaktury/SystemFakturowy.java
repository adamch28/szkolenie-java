package ZadanieFaktury;

public class SystemFakturowy {
    public static void main(String[] args) {
        Petent platnik = new Petent();
        platnik.setImie("Jan");
        platnik.setNazwisko("Kowalski");
        platnik.setNazwaFirmy("IT Firma");
        platnik.setNip("5263572357");

        Petent wystawca = new Petent();
        wystawca.setImie("Marek");
        wystawca.setNazwisko("Nowak");
        wystawca.setNazwaFirmy("IT Firma 2");
        wystawca.setNip("21232132323");

        Faktura faktura1 = new Faktura();
        faktura1.setPlatnik(platnik);
        faktura1.setWystawca(wystawca);
        faktura1.setKwota(65.99);
        faktura1.setProdukt("Mysz Logitech M185");

        Faktura faktura2 = new Faktura();
        faktura2.setPlatnik(platnik);
        faktura2.setWystawca(wystawca);
        faktura2.setKwota(76.99);
        faktura2.setProdukt("Klawiatura Dell KB216");

        faktura1.drukuj();
        faktura2.drukuj();
    }
}
