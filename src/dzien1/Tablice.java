package dzien1;

public class Tablice {
    public static void main(String[] args) {
        String text1 = "tekst pierwszy";
        String text2 = "tekst drugi";
        String text3 = "tekst trzeci";

        String[] array1 = new String[]{text1,text2,text3, "tekst czwarty"};
        System.out.println(array1); //nie wydrukuje zawartosci
        System.out.println(array1[1]);

        System.out.println(array1[3]);
        array1[3] = "to jest tekst";
        System.out.println(array1[3]);

        Object[] objects = new Object[]{1, "napis", array1}; //tablica roznych obiektow

        System.out.println(args[0]); //argumenty z zewnatrz aplikacji, pojawi sie blad jesli ich nie mamy

        String[] array2;
        array2 = new String[5];
        int[] array3 = new int[5];
        double[] array4 = new double[5];

        System.out.println(array2[1]);
        System.out.println(array3[2]);
        System.out.println(array4[3]);

        String[][][] array6 = new String[][][]{{{"text1"}},{{"text2", "text3"}}};
        System.out.println(array6[0][0][0]);
    }
}
