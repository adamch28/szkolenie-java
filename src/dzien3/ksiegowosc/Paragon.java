package dzien3.ksiegowosc;

public class Paragon extends DokumentKsiegowy{
    public Paragon(double cena, String typDokumentu) {
        super(cena, typDokumentu);
    }

    @Override
    public void policz() {
        System.out.println("Do zapłaty jest: " +getCena());
    }


}
