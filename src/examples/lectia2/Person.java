package examples.lectia2;

import examples.lectia2.Automobil;

public class Person {
    public String name;
    int age;
    String gender;
    Automobil automobil;

    public Person(String nume, int varsta,  String sex) {
        name = nume;
        age = varsta;
        gender = sex;
    }

    public void aniversareZiDeNastere() {
        // comentariu care nu se executa
        age = age + 1;
    }

    public void afisareVarsta() {
        System.out.println("Varsta lui " + name + " este: " +  age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cumparaAutomobil() {
        Automobil automobil = new Automobil("BMW");
        automobil.afisareMarca();
    }

    public String getName() {
        return name;
    }

    public int getVarsta() {
        return age;
    }

    public boolean isMajor() {
        return age >= 18;
    }

    public boolean isMinor() {
        return age < 18;
    }

    public boolean nameContainsText(String text) {
        return name.contains(text);
    }

    public void setAutomobil(Automobil automobil) {
        this.automobil = automobil;
    }

    public String getMarca() {
        return automobil.getMarca();
    }

    public int getAnulProducerii() {
        return automobil.getAnulProducerii();
    }
}