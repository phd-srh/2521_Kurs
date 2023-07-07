public class Teilnehmer {
    private int teilnehmernummer;
    private String name;
    private boolean eingeschrieben;

    // Standard Konstrukter (Anzahl Parameter = Anzahl Attribute)
    public Teilnehmer(int teilnehmernummer, String name) {
        this.teilnehmernummer = teilnehmernummer;
        this.name = name;
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
