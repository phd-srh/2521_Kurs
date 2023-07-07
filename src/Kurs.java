public class Kurs {
    private String fach;
    private int anzahlTeilnehmer;

    public Kurs(String fach, int anzahlTeilnehmer) {
        this.fach = fach;
        this.anzahlTeilnehmer = anzahlTeilnehmer;
    }

    public String getFach() {
        return fach;
    }
    public int getAnzahlTeilnehmer() {
        return anzahlTeilnehmer;
    }
    public void setAnzahlTeilnehmer(int anzahlTeilnehmer) {
        this.anzahlTeilnehmer = anzahlTeilnehmer;
    }
}
