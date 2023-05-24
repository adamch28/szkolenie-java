package dzien3.wyjatki;

public class Pesel {
    private  long pesel;

    public Pesel(long pesel) throws PeselException {
        if (pesel >1000000000) {
            this.pesel = pesel;
        }else {
            throw new PeselException();
        }

    }

    public long getPesel() {
        return pesel;
    }
}
