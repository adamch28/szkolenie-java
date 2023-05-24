package dzien3.firma;

public abstract class Zabawka extends  Produkt{
    public Zabawka(int numerProduktu, String nazwa) {
        super(numerProduktu, nazwa);
    }

    public abstract void testowanie();

    public void bawicSie(){
        System.out.println("Bawie sie: "+getNazwa());
    }
}
