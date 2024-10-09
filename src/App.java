public class App {
    public static void main(String[] args) {
        EBooks eBooks = new EBooks("EB001", "Java Programmierung für Anfänger", "Ein umfassender Leitfaden für Java-Neulinge", "Max Mustermann", 2024, true, 500, "1. Auflage", "Bestseller in der Kategorie Programmierung", "Informatik");
        Filme film = new Filme("F001", "Inception", "Ein Meisterdieb, der die Fähigkeit besitzt, in die Träume anderer einzudringen", "Christopher Nolan", 2010, true, "ChriStopher Nolan", 148, true, true, "Oscar-prämierter Science-Fiction-Thriller", "16.07.2010", "Science-Fiction, Action, Thriller");
        Mediumbibliothek mediumbibliothek = new Mediumbibliothek();
        mediumbibliothek.mediumHinzufuegen(eBooks);
        mediumbibliothek.mediumHinzufuegen(film);
        mediumbibliothek.anzeigen();
    }
}