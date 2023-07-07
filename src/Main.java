public class Main {
    public static void main(String[] args) {
        Kurs kurs1 = new Kurs("Java", 12);
        Kurs kurs2 = new Kurs("Betriebssysteme", 17);

        Teilnehmer tn1 = new Teilnehmer(1, "Gans");
        Teilnehmer tn2 = new Teilnehmer(2, "Duck");

        //Dozent doz0 = new Dozent();
        Dozent doz1 = new Dozent("DIL", "Dillinger");
        Dozent doz2 = new Dozent("KAS", "Kast");

        // Achtung, diese Zeilen sind durch Copy+Paste entstanden!!
        ausgabeKurs(kurs1);
        ausgabeKurs(kurs2);

    }

    private static void ausgabeKurs(Kurs kurs) {
        System.out.println(kurs.getFach() + ": " + kurs.getAnzahlTeilnehmer());
    }
}
