package examples;
import examples.lectia2.Person;
import examples.lectia2.Automobil;

public class Application {
    public static void main(String ... args) {

        Person vasile = new Person("Vasile", 20, "M");

        String val = vasile.getName();

        System.out.println(val);

        int varsta = vasile.getVarsta();

        System.out.println(varsta);

        boolean isMajor = vasile.isMajor();

        boolean nameContains = vasile.nameContainsText("sil");

        System.out.println("is major: " + isMajor);
        System.out.println("Name contains sil: " + nameContains);

        Automobil automobil = new Automobil("AUDI");
        automobil.setAnulProducerii(2019);

        vasile.setAutomobil(automobil);

        String marca = vasile.getMarca();
        System.out.println("Marca de automoil este: " + marca);

        int anulProducerii = vasile.getAnulProducerii();

        System.out.println("Anul producerii: " + anulProducerii);

    }
}


