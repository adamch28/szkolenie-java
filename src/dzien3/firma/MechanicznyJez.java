package dzien3.firma;

public class MechanicznyJez extends Zabawka{
    public MechanicznyJez(int numerProduktu, String nazwaProduktu) {
        super(numerProduktu, nazwaProduktu);
    }

    @Override
    public void testowanie() {
        System.out.println("Czy jez ma duzo kolcow.");
    }
}
