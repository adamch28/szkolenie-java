package dzien3;

import dzien3.ksiegowosc.Faktura;

import java.util.*;

public class Kolekcje {
    public static void main(String[] args) {
        List<Faktura> list = new ArrayList<>();
        list.add(new Faktura(23,"a"));
        list.add(new Faktura(11,"b"));
        list.add(new Faktura(15,"c"));
        list.add(new Faktura(45,"d"));

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.add("napis1");
        set.add("napis4");
        set.add("napis3");
        System.out.println(set);
        set.add("napis4");
        System.out.println(set);

        set.remove("napis1");
        System.out.println(set);
        System.out.println(set.size());

        Map<Integer, String> map = new HashMap<>();
        map.put(0,"0");
        map.put(1,"1");
        System.out.println(map);
        map.put(0,"zerozero");
        System.out.println(map);
        map.putIfAbsent(1,"jedenjeden");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.size());

        System.out.println("---------------------");
        for (Faktura fak: list){
            System.out.println(fak.getCena());
        }
    }
}
