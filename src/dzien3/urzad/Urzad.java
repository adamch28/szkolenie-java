package dzien3.urzad;

public class Urzad {
    public static void main(String[] args) {
        Urzednik urzednik = new Urzednik("Stefan","Kogucik",123456789);
        PetentUrzad petentUrzad = new PetentUrzad("Jan","Kowalski",78945613);
        System.out.println(urzednik);
        System.out.println(petentUrzad);

        Urzednik urzednik1 = new Urzednik("Marek", "Nowak",569874123,"7:00","15:00");
        System.out.println(urzednik1);
    }
}
