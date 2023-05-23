package dzien1;

import java.util.Scanner;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("wpisales "+a);

        if(a>5){
            System.out.println(a + " jest wieksze niz 5");
        }

        boolean warunek = a>5;
        if(warunek){
            System.out.println(a + " jest wieksze niz 5");
        }

        if(a>5 && a<15){
            System.out.println(a + " jest wieksze niz 5 ale mniejsze niz 15");
        }

        if(a % 2 == 0){
            System.out.println("Liczba jest parzysta");
        }else {
            System.out.println("Liczba jest nieparzysta");
        }

        if(a % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        }else if(a % 5 == 0){
            System.out.println("Liczba jest podzielna przez 5");
        }else {
            System.out.println("Liczba nie jest podzielna przez 3 ani 5");
        }

        switch (a){ //klasyczny switch case
            case 1:
                System.out.println("Liczba jest rowna 1");
                break;
            case 2:
                System.out.println("Liczba jest rowna 2");
                break;
            case 3:
                System.out.println("Liczba jest rowna 3");
                break;
            default:
                System.out.println("Liczba nie jest rowna 1,2 lub 3");
                break;
        }

        switch (a){ //nowy switch case
            case 1 ->
                System.out.println("Liczba jest rowna 1");
            case 2 ->
                System.out.println("Liczba jest rowna 2");
            case 3 ->
                System.out.println("Liczba jest rowna 3");
            default ->
                System.out.println("Liczba nie jest rowna 1,2 lub 3");
        }
    }
}
