public class Filme extends Medium {
    private String regisseur;
    private int spielzeit;
    private boolean uhd;
    private boolean hd;
    private String kommentar;
    private String erscheinungsdatum;
    private String genre;

    public Filme(String id, String titel, String beschreibung, String autor, int erscheinungsjahr, boolean verfuegbarkeit,
                 String regisseur, int spielzeit, boolean uhd, boolean hd, String kommentar, String erscheinungsdatum, String genre) {
        super(id, titel, beschreibung, autor, erscheinungsjahr, verfuegbarkeit);
        this.regisseur = regisseur;
        this.spielzeit = spielzeit;
        this.uhd = uhd;
        this.hd = hd;
        this.kommentar = kommentar;
        this.erscheinungsdatum = erscheinungsdatum;
        this.genre = genre;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    public int getSpielzeit() {
        return spielzeit;
    }

    public void setSpielzeit(int spielzeit) {
        this.spielzeit = spielzeit;
    }

    public boolean isUhd() {
        return uhd;
    }

    public void setUhd(boolean uhd) {
        this.uhd = uhd;
    }

    public boolean isHd() {
        return hd;
    }

    public void setHd(boolean hd) {
        this.hd = hd;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public String getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(String erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Regisseur: " + getRegisseur());
        System.out.println("Spielzeit: " + getSpielzeit() + " Minuten");
    }


}