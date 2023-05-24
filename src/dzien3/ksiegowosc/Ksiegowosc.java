package dzien3.ksiegowosc;

public class Ksiegowosc {
    public static void main(String[] args) {
        Paragon paragon = new Paragon(12.5,"paragon");
        Faktura faktura = new Faktura(20, "faktura");
        paragon.drukujDokument();
        paragon.policz();
        faktura.drukujDokument();
        faktura.policz();
    }
}
