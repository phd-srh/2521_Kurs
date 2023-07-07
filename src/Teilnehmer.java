public class Teilnehmer {
    private int teilnehmernummer;
    private String name;
    private boolean eingeschrieben;

    // Standard Konstruktor (Anzahl Parameter = Anzahl Attribute)
    public Teilnehmer(int teilnehmernummer, String name, boolean eingeschrieben) {
        this.teilnehmernummer = teilnehmernummer;
        this.name = name;
        this.eingeschrieben = eingeschrieben;
    }

    // Faulenzer Konstruktor (Einige Parameter können weggelassen werden,
    // weil wir dafür schon Standardwerte haben)
    public Teilnehmer(int teilnehmernummer, String name) {
        this(teilnehmernummer, name, false);
    }

    public Teilnehmer(String name) {
        this( (int)(Math.random() * 1000)+1, name, false);
    }

    public int getTeilnehmernummer() {
        return this.teilnehmernummer;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEingeschrieben() {
        return this.eingeschrieben;
    }

    public void setName(String name) {
        this.name = name;
    }
}
