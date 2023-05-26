package dzien2;

public class Metody {
    private static int ostatniWynik;
    public static void main(String[] args) {
        System.out.println("To jest tekst");
        wypiszNazweKlasy();
        int wynik = mnozonyPrzezDwa(10);
        System.out.println(mnozonyPrzezDwa(0));
        System.out.println("wynik = "+wynik);
        int podwojneMnozenie = mnozonyPrzezDwa(mnozonyPrzezDwa(2));
        System.out.println(podwojneMnozenie);
        System.out.println("ostatni wynik ="+ostatniWynik);

        System.out.println(mnozenie(5,6)); //ctr+p  - podgladanie parametrow
        System.out.println(mnozenie()); //metoda przeładowana
        System.out.println("--------------------------------");
        System.out.println(dodawanie());
        System.out.println(dodawanie(1,2,5,6));
        System.out.println(dodawanie(7,6));
    }

    public static void wypiszNazweKlasy(){
        System.out.println("Metody");
    }

    public static int mnozonyPrzezDwa(int liczba){
        int wynik;
        if (liczba == 0) {
            wynik = 0;
        }else {
            wynik = liczba*2;
        }
        ostatniWynik = wynik;
        return wynik;
    }

    public static int mnozenie(int a, int b){
        return a*b;
    }
    // overload - przeładowanie metody
        public static int mnozenie(){
        return 0;
    }

    public static int dodawanie(int... ints){
        int wynik = 0;
        for(int x: ints){
            wynik = wynik +x;
        }
        return wynik;
    }
}
