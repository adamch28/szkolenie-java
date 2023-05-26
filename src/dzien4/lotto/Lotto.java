package dzien4.lotto;

import org.apache.commons.collections4.CollectionUtils;
import java.util.List;

public class Lotto {
    public static void main(String[] args) {

        long drawsNumber= 0;
        var numbers = new Numbers();
        List<Integer> firstDraw = numbers.generate();
        List<Integer> draw;

        while (true){
            draw = numbers.generate();
            drawsNumber++;
            if(CollectionUtils.isEqualCollection(firstDraw,draw))
                break;
        }

        System.out.println("Wylosowane liczby udało się trafić po "+drawsNumber+" losowaniach.");
        System.out.println("Koszt kuponów wyniósł: "+ drawsNumber*3 + " złotych.");
        if (drawsNumber*3>7000000){
            System.out.println("Nie opłaciło się.");
        }else {
            System.out.println("Opłaciło się.");
        }
    }
}
