package dzien4.lotto;

import java.util.List;
import java.util.Random;

public class Numbers {

    public List<Integer> generate(){
        int size = 1;
        List<Integer> randomNumber = null;
        while (size!=6){
            randomNumber = new Random()
                    .ints(6, 1, 49)
                    .distinct()
                    .boxed()
                    .toList();
            size = randomNumber.size();
        }

        return randomNumber;
    }
}
