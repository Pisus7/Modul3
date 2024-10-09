public class EBooks extends Medium {
    private int seitenanzahl;
    private String auflage;
    private String kommentar;
    private String genre;

    public EBooks(String id, String titel, String beschreibung, String autor, int erscheinungsjahr, boolean verfuegbarkeit, int seitenanzahl, String auflage, String kommentar, String genre) {
        super(id, titel, beschreibung, autor, erscheinungsjahr, verfuegbarkeit);
        this.seitenanzahl = seitenanzahl;
        this.auflage = auflage;
        this.kommentar = kommentar;
        this.genre = genre;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    public String getAuflage() {
        return auflage;
    }

    public void setAuflage(String auflage) {
        this.auflage = auflage;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void anzeigen() {
        super.anzeigen();
        System.out.println("Seitenanzahl" + seitenanzahl);
        System.out.println("auflage" + auflage);
        System.out.println("kommentar" + kommentar);
        System.out.println("genre" + genre);
    }
}