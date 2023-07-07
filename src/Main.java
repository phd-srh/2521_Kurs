public class Main {
    public static void main(String[] args) {
        Kurs kurs1 = new Kurs("Java", 12);
        Kurs kurs2 = new Kurs("Betriebssysteme", 17);
        System.out.println(kurs1);// zeigt Speicheradresse (Referenz)

        Teilnehmer tn1 = new Teilnehmer(1, "Gans");
        Teilnehmer tn2 = new Teilnehmer(2, "Duck");

        //Dozent doz0 = new Dozent();
        Dozent doz1 = new Dozent("DIL", "Dillinger");
        Dozent doz2 = new Dozent("KAS", "Kast");

        // Achtung, diese Zeilen sind durch Copy+Paste entstanden!!
        ausgabeKurs(kurs1);
        ausgabeKurs(kurs2);
        ausgabeKurs(kurs1);

        int x = 5;
        System.out.println(x);

        String s1 = new String("Hallo"); // original für s1 = "Hallo"
        String s2 = new String("Welt");
        tausche(s1, s2);
        System.out.println("main: " + s1 + " " + s2);

        // Performance Messung
        performanceMessung();
    }

    private static void performanceMessung() {
        double[] einDoubleArray = new double[20_000];
        for (int i = 0; i < einDoubleArray.length; i++) {
            einDoubleArray[i] = Math.random();
        }
        // ------------------------------------------------------------
        long zeit = System.nanoTime();
        // Ausgabe des Arrays in hübscher Form (pretty print)
        String ausgabe = "[";
        for (int i = 0; i < einDoubleArray.length; i++) {
            if (i > 0) ausgabe += ", ";
            ausgabe += einDoubleArray[i];
        }
        ausgabe += "]";
        zeit = System.nanoTime() - zeit;
        // ------------------------------------------------------------
//        System.out.println(ausgabe);
        System.out.println( (zeit / 1_000_000.0) + "ms");

        // Nochmal mit "mutable" Strings
        zeit = System.nanoTime();
        StringBuffer output = new StringBuffer("[");
        for (int i = 0; i < einDoubleArray.length; i++) {
            if (i > 0) output.append(", ");
            output.append(einDoubleArray[i]);
        }
        output.append("]");
        zeit = System.nanoTime() - zeit;
//        System.out.println( output );
        System.out.println( (zeit / 1_000_000.0) + "ms");

        // geht es noch schneller mit thread-unsafe Strings?
        zeit = System.nanoTime();
        StringBuilder deguchi = new StringBuilder("[");
        for (int i = 0; i < einDoubleArray.length; i++) {
            if (i > 0) deguchi.append(", ");
            deguchi.append(einDoubleArray[i]);
        }
        deguchi.append("]");
        zeit = System.nanoTime() - zeit;
//        System.out.println( output );
        System.out.println( (zeit / 1_000_000.0) + "ms");
    }

    // Call-By-Reference, wir können das Objekt manipulieren
    private static void tausche(String a, String b) {
        // Hier werden nur die Referenzen verschoben
        System.out.println("VORHER: a: " + a + ", b: " + b);
        String temp = a;
        a = b;
        b = temp;
        System.out.println("NACHHER: a: " + a + ", b: " + b);
        // ein anderer Versuch (KLAPPT AUCH NICHT)
        a = "Welt"; // in Wirklichkeit steht hier a = new String("Welt");
        b = "Hallo";
        // es muss das Objekt selbst verändert werden!
        b += " Leute";  // auch hier steht b += new String(" Leute")
                        // -> b = new String("Hallo Leute");
        System.out.println("Konkat: " + b);
    }

    // Übergabe der Parameter ist Call-by-Value oder Call-by-Reference ??
    // -> Call-by-Reference (Kurs ist kein primitiver Datentyp)
    // -> Folge: wir können den Kurs ändern!!
    private static void ausgabeKurs(Kurs kurs) {
        System.out.println(kurs.getFach() + ": " + kurs.getAnzahlTeilnehmer());
        kurs.setAnzahlTeilnehmer(-5);
    }
}
