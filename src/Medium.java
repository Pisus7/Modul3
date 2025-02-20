public class Medium {
    private String id;
    public String titel;
    private String beschreibung;
    private String autor;
    private int erscheinungsjahr;
    private boolean verfuegbarkeit;

    public Medium(String id, String titel, String beschreibung, String autor, int erscheinungsjahr, boolean verfuegbarkeit) {
        this.id = id;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.autor = autor;
        this.erscheinungsjahr = erscheinungsjahr;
        this.verfuegbarkeit = verfuegbarkeit;
    }

    public String getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getAutor() {
        return autor;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public boolean isVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setVerfuegbarkeit(boolean verfuegbarkeit) {
        this.verfuegbarkeit = verfuegbarkeit;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public void anzeigen() {
        System.out.println("ID: " + getId());
        System.out.println("Titel: " + getTitel());
        System.out.println("Beschreibung: " + getBeschreibung());
        System.out.println("Autor: " + getAutor());
        System.out.println("Erscheinungsjahr: " + getErscheinungsjahr());
        System.out.println("Verfügbarkeit: " + isVerfuegbarkeit());
    }
}