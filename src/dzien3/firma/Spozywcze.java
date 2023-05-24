package dzien3.firma;

public class Spozywcze extends Produkt{
    public Spozywcze(String nazwa) {
        super(-999, nazwa);
    }

    @Override
    public void testowanie() {
        System.out.println("Zjem cos i sprawdze czy dobre.");
    }


}
