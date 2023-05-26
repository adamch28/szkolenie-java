package dzien4.strumienie;

import com.sun.source.tree.LiteralTree;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Strumienie2 {
    public static void main(String[] args) {
        IntStream iterate = IntStream.iterate(0, i -> i + 1);
        List<Integer> list = iterate.limit(100).boxed().toList();
        System.out.println(list);

        List<Integer> range = IntStream.range(1,1000).boxed().toList();
        System.out.println(range);

        List<Integer> randomNumber = new Random()
                .ints(10, 0, 50)
                .boxed()
                .toList();

        System.out.println(randomNumber);
    }
}
