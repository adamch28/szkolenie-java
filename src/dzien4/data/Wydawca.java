package dzien4.data;

import java.util.Objects;

public class Wydawca {
    private final String nazwaWydawcy;
    private final int rokPowstaniaWydawnictwa;
    private final boolean wydajeTylkoGryPlanszowe;

    public Wydawca(String nazwaWydawcy, int rokPowstaniaWydawnictwa, boolean wydajeTylkoGryPlanszowe) {
        this.nazwaWydawcy = nazwaWydawcy;
        this.rokPowstaniaWydawnictwa = rokPowstaniaWydawnictwa;
        this.wydajeTylkoGryPlanszowe = wydajeTylkoGryPlanszowe;
    }

    public String getNazwaWydawcy() {
        return nazwaWydawcy;
    }

    public int getRokPowstaniaWydawnictwa() {
        return rokPowstaniaWydawnictwa;
    }

    public boolean isWydajeTylkoGryPlanszowe() {
        return wydajeTylkoGryPlanszowe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wydawca wydawca = (Wydawca) o;
        return rokPowstaniaWydawnictwa == wydawca.rokPowstaniaWydawnictwa && wydajeTylkoGryPlanszowe == wydawca.wydajeTylkoGryPlanszowe && Objects.equals(nazwaWydawcy, wydawca.nazwaWydawcy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaWydawcy, rokPowstaniaWydawnictwa, wydajeTylkoGryPlanszowe);
    }

    @Override
    public String toString() {
        return "Wydawca{" +
                "nazwaWydawcy='" + nazwaWydawcy + '\'' +
                ", rokPowstaniaWydawnictwa=" + rokPowstaniaWydawnictwa +
                ", wydajeTylkoGryPlanszowe=" + wydajeTylkoGryPlanszowe +
                '}';
    }
}