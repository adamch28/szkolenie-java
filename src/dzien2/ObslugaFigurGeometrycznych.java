package dzien2;

import model.Kolo;
import model.Kwadrat;
import model.Prostokat;

public class ObslugaFigurGeometrycznych {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat();
        prostokat.setA(4);
        prostokat.setB(5);
        System.out.println(prostokat.getA());
        System.out.println(prostokat.getB());

        System.out.println(prostokat.obliczObwod());

        Kolo kolo = new Kolo(5);
        kolo.obliczObwod();

        Kwadrat kwadrat = new Kwadrat();
        Kwadrat kwadrat2 = new Kwadrat(5);

        System.gc(); //garbage collector - usuwanie obiektow

        Kwadrat kw3 = new Kwadrat();
        Kwadrat kw4 = new Kwadrat();

        if(kw3==kw4){
            System.out.println("Te same kwadraty");
        }

        if(kw3.equals(kw4)){
            System.out.println("Takie same kwadraty");
        }
    }
}
