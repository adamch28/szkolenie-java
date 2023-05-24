package ZadanieFaktury;

public class Petent {

    private String imie;
    private String nazwisko;
    private String nazwaFirmy;
    private String nip;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String pobierzDane(){
        return imie+", "+nazwisko+", "+nazwaFirmy+", "+nip;
    }
}
