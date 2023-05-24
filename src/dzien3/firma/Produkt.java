package dzien3.firma;

import javax.print.DocFlavor;

public abstract class Produkt {
    private int numerProduktu;

    private String nazwa;

    public Produkt(int numerProduktu, String nazwaProduktu) {
        this.numerProduktu = numerProduktu;
        this.nazwa = nazwaProduktu;
    }

    public int getNumerProduktu() {
        return numerProduktu;
    }

    public void setNumerProduktu(int numerProduktu) {
        this.numerProduktu = numerProduktu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwaProduktu) {
        this.nazwa= nazwaProduktu;
    }

    public final void pakowanie(){
        System.out.println("Pakuje: "+nazwa);
    }

    public abstract void testowanie();
}
