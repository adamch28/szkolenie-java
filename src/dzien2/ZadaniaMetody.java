package dzien2;

import java.util.Scanner;

public class ZadaniaMetody {
    public static void main(String[] args) {
        drukujWartosci();
    }

    private static void drukujWartosci(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int wartosciOd = a;
        int wartosciDo = b;
        if(a > b){
            wartosciOd = b;
            wartosciDo = a;
        }

        for (int i = wartosciOd+1; i < wartosciDo; i++) {
            System.out.println(i);
        }
    }
}
