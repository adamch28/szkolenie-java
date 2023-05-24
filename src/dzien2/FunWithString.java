package dzien2;

public class FunWithString {
    public static void main(String[] args) {
        String text = "Ala ma kota";
        System.out.println(text);
        System.out.println(text.substring(1,3));
        System.out.println(text.toUpperCase());
        System.out.println(text.charAt(0));
        System.out.println(text.concat(" i psa"));
        System.out.println(text.equalsIgnoreCase("ALA MA KOTA"));
        System.out.println(text.endsWith("psa"));
        System.out.println(text.indexOf("m"));
        System.out.println(text.indexOf("o"));
        System.out.println(text.substring(text.indexOf("m")+1,text.indexOf("o")));

        String[] split = text.split(" ");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
    }
}
