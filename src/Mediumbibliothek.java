import java.util.ArrayList;

public class Mediumbibliothek {
    ArrayList<Medium> arrayList = new ArrayList();

    public void mediumHinzufuegen(Medium m) {
        arrayList.add(m);
    }

    public void anzeigen() {
        for (Medium m : arrayList) {
            m.anzeigen();
            System.out.println(" ");
        }
    }

    public void titelAnzeigen() {
        for (Medium m : arrayList) {
            m.getTitel();
        }
    }
}