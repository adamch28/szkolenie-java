package dzien3.urzad;

public class PetentUrzad extends Osoba {

    private String sprawa;


    public PetentUrzad(String imie, String nazwisko, long pesel) {
        super(imie, nazwisko, pesel); //linijka z slowem super zawsze na poczatku
        this.sprawa = sprawa;
    }
}
