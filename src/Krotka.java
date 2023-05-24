public class Krotka <L ,R> {

    private final L lewy;

    private final R prawy;

    public Krotka(L lewy, R prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public L getLewy() {
        return lewy;
    }

    public R getPrawy() {
        return prawy;
    }
}
