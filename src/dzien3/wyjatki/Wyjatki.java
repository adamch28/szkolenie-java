package dzien3.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {
    public static void main(String[] args) throws PeselException {
        String[] array = new String[]{"tekst"};
        try {
            System.out.println(array[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Indeks poza tablica");
        }

        System.out.println("Program dziala dalej");

        Scanner scanner = new Scanner(System.in);
        //scanner.close();
        int nextInt = 0;
        try {
            nextInt = scanner.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Nastepnym razem wprowadz poprawne dane");
        }catch (IllegalStateException e){
            System.err.println("Skaner zepsuty");
        }catch (Exception e){
            System.err.println("Zupelnie nie wiem co sie dzieje, ale tak nie powinno byc");
        }finally { //blok finally wykona sie zawsze
            scanner.close();
        }
        System.out.println(nextInt);

        try{
            Pesel pesel = new Pesel(1234567890L);
        }catch (PeselException e){
            System.err.println("Ten pesel nie jest poprawny");
        }



    }
}
