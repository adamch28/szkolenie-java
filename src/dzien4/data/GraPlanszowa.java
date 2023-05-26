package dzien4.data;

import java.util.Objects;

public class GraPlanszowa {
    private final String nazwa;
    private final double ocena;
    private final double cena;
    private final int minimalnaLiczbaGraczy;
    private final int maksymalnaLiczbaGraczy;
    private final Wydawca wydawca;

    public GraPlanszowa(String nazwa, double ocena, double cena, int minimalnaLiczbaGraczy, int maksymalnaLiczbaGraczy, Wydawca wydawca) {
        this.nazwa = nazwa;
        this.ocena = ocena;
        this.cena = cena;
        this.minimalnaLiczbaGraczy = minimalnaLiczbaGraczy;
        this.maksymalnaLiczbaGraczy = maksymalnaLiczbaGraczy;
        this.wydawca = wydawca;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getOcena() {
        return ocena;
    }

    public double getCena() {
        return cena;
    }

    public int getMinimalnaLiczbaGraczy() {
        return minimalnaLiczbaGraczy;
    }

    public int getMaksymalnaLiczbaGraczy() {
        return maksymalnaLiczbaGraczy;
    }

    public Wydawca getWydawca() {
        return wydawca;
    }

    @Override
    public String toString() {
        return "GraPlanszowa{" +
                "nazwa='" + nazwa + '\'' +
                ", ocena=" + ocena +
                ", cena=" + cena +
                ", minimalnaLiczbaGraczy=" + minimalnaLiczbaGraczy +
                ", maksymalnaLiczbaGraczy=" + maksymalnaLiczbaGraczy +
                ", wydawca=" + wydawca +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraPlanszowa that = (GraPlanszowa) o;
        return Double.compare(that.ocena, ocena) == 0 && Double.compare(that.cena, cena) == 0 && minimalnaLiczbaGraczy == that.minimalnaLiczbaGraczy && maksymalnaLiczbaGraczy == that.maksymalnaLiczbaGraczy && Objects.equals(nazwa, that.nazwa) && Objects.equals(wydawca, that.wydawca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, ocena, cena, minimalnaLiczbaGraczy, maksymalnaLiczbaGraczy, wydawca);
    }
}