public class Main {
    public static void main(String[] args) {
        Kurs kurs1 = new Kurs("Java", 12);
        Kurs kurs2 = new Kurs("Betriebssysteme", 17);

        Teilnehmer tn1 = new Teilnehmer(1, "Gans");
        Teilnehmer tn2 = new Teilnehmer(2, "Duck");

        //Dozent doz0 = new Dozent();
        Dozent doz1 = new Dozent("DIL", "Dillinger");
        Dozent doz2 = new Dozent("KAS", "Kast");

        System.out.println(kurs1.getFach() + ": " + kurs1.getAnzahlTeilnehmer());
        System.out.println(kurs2.getFach() + ": " + kurs2.getAnzahlTeilnehmer());
    }
}
