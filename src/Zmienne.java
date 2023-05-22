public class Zmienne {
    public static void main(String[] args) {
        System.out.println("jakiś tekst z klasy Zmienne\n");
        String text1 = "\tTo jest zmienna zawierająca tekst";
        System.out.println(text1);
        System.out.println("\\n");
        System.out.println("\"cudzusłów\"");
        System.out.println("------------------------------");
        System.out.println();

        int a = 130;
        byte b1 = 127; //byte zajmuje malo miejsca w pamieci stad maksymalny rozmiar to 127
        byte b2 = -128; //minimalna wartosc byte
        b1 = (byte) (b1 +1); //rzutowanie

        System.out.println(b1); //przekroczony zakres zmiennej, bedzie liczona od swojej minimalnej wartosci
        System.out.println(b1+1);

        short s1 = 32767; //maksymalny short
        short s2 = -32768;

        int i1 = Integer.MAX_VALUE; //2147483647
        System.out.println(i1);
        int i2 = -2147483648;

        long l1 =Long.MAX_VALUE; //9223372036854775807
        System.out.println(l1);

        long l2 = 92233720368L; //dla longów dodajemy duza literke L na koncu

        boolean bool1 = true;
        boolean bool2 = false;

        char ch = 'a';
        System.out.println(ch);
        char ch2 = (char) (ch +5);
        System.out.println(ch2);

        float f1 = 0.1F; //typ float konczy sie litera F
        double d1 = 0.1; //bardziej dokladny, nie potrzebuje liczby na koncu
        //double przy prostych operacjach arytmetycznych moze gubic swoja dokladnadnosc, wiec lepiej stosowac dedykowane metody

        int zmienna1 = 4;
        int zmienna2 = 5;
        int suma = zmienna1 + zmienna2;
        int roznica = zmienna1 -3;
        int iloczyn = 2 * zmienna2;
        int iloraz = zmienna2/4;
        double iloraz2 = zmienna2/4; //zmiennna2/4 zrobi int a potem zmieni na double
        double iloraz3 = zmienna2/4.0;

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
        System.out.println(iloraz2);
        System.out.println(iloraz3);

        int resztaZDzielenia = zmienna2%zmienna1;
        System.out.println(resztaZDzielenia);
        System.out.println("------------------------------");

        boolean t =true;
        boolean f =false;

        System.out.println(t);
        System.out.println(f);
        // && and, || or , ! not

        System.out.println(!t);
        System.out.println(t&&true);
        System.out.println(t&&false);
        System.out.println(f&&false);

        System.out.println(t||f);
        System.out.println(f||t);
        System.out.println(f||f);


    }
}
