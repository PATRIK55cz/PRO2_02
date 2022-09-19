package Models;

public class PizzaMenuItems {
    private int cena;
    private String nazev;
    private String popis;



    public PizzaMenuItems(int cena, String nazev, String popis) {
        this.cena = cena;
        this.nazev = nazev;
        this.popis = popis;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }



}
