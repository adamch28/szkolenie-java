package dzien3.wyjatki;

import java.util.Scanner;

public class Wyjatki2 {
    public static void main(String[] args) {

        int nextInt = 0;
        try(Scanner scanner2 = new Scanner(System.in)){//try with reosources, zamyka zasob po opuszczeniu bloku try catch
            nextInt = scanner2.nextInt();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(nextInt);
    }
}
