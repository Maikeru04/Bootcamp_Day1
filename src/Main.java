public static void main(String[] args) {
    int age = 21;
    System.out.println("Alter: " + age);

    double size = 1.81;
    System.out.println("Größe: " + size);

    char firstLetter = 'M';
    System.out.println("Anfangsbuchstabe: " + firstLetter);

    // Kombinierte Ausgabe

    String Name = "Michael Rimbach";
    System.out.println("Name: " + Name);

    System.out.println("Mein Name ist " + Name + ", ich bin " + age + " Jahre alt und " + size + " Meter groß.");

    // Boolean-Bedingung

    boolean isAdult;
    int testAge = 17;

    if(testAge >= 18) {
        isAdult = true;
    } else {
        isAdult = false;
    }

    if(isAdult) {
        System.out.println("Der Kunde is Volljährig");
    } else  {
        System.out.println("Der Kunde ist nicht Volljährig");
    }

    // Rechnen mit Zahlen

    int Zahl1 = 1800;
    int Zahl2 = 900;

    int temp = Zahl1 + Zahl2;
    System.out.println("Addiert: " + temp);
    temp = Zahl1 - Zahl2;
    System.out.println("Subtrakt: " + temp);
    temp = Zahl1 * Zahl2;
    System.out.println("Multiplizieren: " + temp);
    temp = Zahl1 / Zahl2;
    System.out.println("Division: " + temp);

    // String-Methoden nutzen

    String testString = "Das ist ein cooler String";

    System.out.println("Länge: " + testString.length() + ", erster Buchstabe: " + testString.charAt(0));
    System.out.println(testString.toUpperCase());

    // Vergleichsprüfung

    if(Zahl1 == Zahl2) {
        System.out.println("gleich");
    } else  {
        System.out.println("unleich");
    }

    // Logische UND-Verknüpfung

    boolean vergUND = false;

    if(Zahl2 > 0 && Zahl2 < 100) {
        vergUND = true;
        System.out.println(vergUND);
    } else   {
        vergUND = false;
        System.out.println(vergUND);
    }

    // Kombinierte Operation

    int tempOper = Zahl1 % Zahl2;

    if(tempOper == 0 && Zahl1 > 0) {
        System.out.println("Kein Rest vorhanden, die Ausgangszahl war Positiv!");
    } else  {
        System.out.println("Rest: " + tempOper);
    }

    // Preisberechnung mit Bedingung

    var price = 100.1;
    var discount = true;

    if(discount == true) {
        price = price * 0.9;
        if(price % 2 == 0) {
            int intprice = (int) price;
            System.out.println("Der int Preis inklusive 10% Rabatt ist: " + intprice + "€");
        } else
            System.out.println("Der double Preis inklusive 10% Rabatt ist: " + price + "€");
    } else   {
        System.out.println(price + "€");
    }

    // Mehrfachbedingungen

    int mehrInt = 10;

    if(mehrInt % 2 == 0 || mehrInt > 50) {
        System.out.println("Die Zahl ist entweder gerade oder größer als 50");
    }
}