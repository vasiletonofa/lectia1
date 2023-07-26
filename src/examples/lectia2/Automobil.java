package examples.lectia2;

public class Automobil {

    private String marca = "BMW";


    private boolean flag = marca.contains("B");

    private Boolean isTrue = true; // Wrapper class

    private String flagg = isTrue.toString(); // "true"

    private Integer i = 2;

    short n = i.shortValue();

    private Long l = 2L;

    private byte b = 33; // primitive
    private short v = 324;
    private int anulProducerii;
    private int km = 33333333;
    private long VIN = 3333333333333333333L;

    private float f = 22222222222222222222222222222222222222.0F;
    private double d = 222222222222222222222222222222222222222222222222222222.0;

    char a = 'a';

    String b = "asada";


    public Automobil(String marca) {
        setMarca(marca);
    }

    public void afisareMarca() {
        System.out.println(marca);
    }

    private void setMarca(String marca) {   // public >  package private > private
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnulProducerii() {
        return anulProducerii;
    }

    public void setAnulProducerii(int anulProducerii) {
        this.anulProducerii = anulProducerii;
    }
}
