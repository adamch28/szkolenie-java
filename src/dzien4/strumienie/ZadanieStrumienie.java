package dzien4.strumienie;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ZadanieStrumienie {
    public static void main(String[] args) {
        var random  = new Random();
        int randomNumber = random.nextInt(99)+1;

        var scanner = new Scanner(System.in);
        System.out.println("Program losuje liczbe z zakresu 1 do 100");
        System.out.println("Twoim zadaniemjest zgadnac wylosowana liczbe.");
        System.out.println("Podaj liczbe.");

        int liczbaProb =0;
        int number = 0;
        while(true) {
            try {
                number = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.err.println("Nastepnym razem wprowadz poprawne dane");
                break;
            }
            liczbaProb++;
            if(number < randomNumber){
                System.out.println("Podana liczba jest mniejsza od wylosowanej. Podaj wieksza liczbe.");
            }else if (number > randomNumber) {
                System.out.println("Podana liczba jest wieksza od wylosowanej. Podaj mniejsza liczbe.");
            }else {
                System.out.println("Gratulacje. Trafiles w "+liczbaProb+" probach");
                break;
            }
        }


    }
}
