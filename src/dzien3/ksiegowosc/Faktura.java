package dzien3.ksiegowosc;

import dzien3.interfejsy.Drukowalna;

import java.util.Comparator;

public class Faktura extends DokumentKsiegowy implements Drukowalna, Comparable<Faktura> {
    public Faktura(double cena, String typDokumentu) {
        super(cena, typDokumentu);
    }

    @Override
    public void policz() {
        System.out.println("Do zaplaty jest:" +getCena()*2);
    }

    @Override
    public void drukuj() {
        System.out.println(getCena());
    }

    @Override
    public String toString() {
        return "Faktura{"+getCena()+"}";
    }

    @Override
    public int compareTo(Faktura o) {
        int result = 0;
        if (getCena() >o.getCena()) {
            result = 1;
        } else if (getCena() < o.getCena()) {
            result = -1;
        }

        return result;
    }
}
