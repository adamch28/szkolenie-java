package dzien3.ksiegowosc;

public abstract class DokumentKsiegowy {
    private double cena;
    private String typDokumentu;

    public DokumentKsiegowy(double cena, String typDokumentu) {
        this.cena = cena;
        this.typDokumentu = typDokumentu;
    }

    public final void drukujDokument(){
        System.out.println("Cena: "+cena+", typ dokumentu: "+typDokumentu);
    }
    public abstract void policz();

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getTypDokumentu() {
        return typDokumentu;
    }

    public void setTypDokumentu(String typDokumentu) {
        this.typDokumentu = typDokumentu;
    }
}
