import java.math.BigDecimal;

public class ZadaniaZmienne {
    public static void main(String[] args) {
        long predkoscSwiatlaMS =  299792458L; // m/s
        long predkoscSwiatlaKmS = predkoscSwiatlaMS/1000L;
        long predkoscSwiatlaKmH = predkoscSwiatlaKmS*3600;

        System.out.println(predkoscSwiatlaMS);
        System.out.println(predkoscSwiatlaKmS);
        System.out.println(predkoscSwiatlaKmH);


        int odlPromieniKm = 150000000;
        long ileSekund =  odlPromieniKm/predkoscSwiatlaKmS;
        long ileMinut = (odlPromieniKm/predkoscSwiatlaKmS)/60;

        System.out.println(ileMinut);
        System.out.println(ileSekund);

    }
}
