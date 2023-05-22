import java.util.Random;

public class Petle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        for (int i = 1; i <= 10; i = i+2) {
            System.out.println(i);
        }

        System.out.println("----------dziwna petla for-------------");
        int k=0;
        for (; k <= 10;) {
            k++;
            System.out.println(k);
        }

        System.out.println("---------odwrotna petla for-----------" );
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int[] ints = new int[]{5,2,7,4,2,0,8};
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Indeks: "+i+" -> "+ints[i]);
        }

        for (int x :ints) {
            System.out.println(x);
        }

        System.out.println("----------------------------");
//        boolean by2 = true;
//        while (by2){
//
//        }

        int r = 0;
        Random random = new Random();
        while (true){
            r = random.nextInt();
            System.out.println(r);
            if(r<1000000) break;
        }

        do {
            System.out.println("Przynajmniej raz!");
        }while (r> 1000000);
    }
}
