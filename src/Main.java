public class Main {
    public static void main(String[] args) {
        Kurs kurs1 = new Kurs("Java", 12);
        Kurs kurs2 = new Kurs("Betriebssysteme", 17);

        System.out.println(kurs1.getFach() + ": " + kurs1.getAnzahlTeilnehmer());
        System.out.println(kurs2.getFach() + ": " + kurs2.getAnzahlTeilnehmer());
    }
}
