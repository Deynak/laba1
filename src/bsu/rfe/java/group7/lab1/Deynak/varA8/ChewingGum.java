package bsu.rfe.java.group7.lab1.Deynak.varA8;

public class ChewingGum extends Food {

    private String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public ChewingGum(String flavour) {
        super("Жевательная резинка");
        this.flavour = flavour;
    }

    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1

            if (!(arg0 instanceof ChewingGum)) return false; // Шаг 2
            return flavour.equals(((ChewingGum) arg0).flavour); // Шаг 3
        } else
            return false;
    }

    @Override
    public void consume() {
        System.out.println(this.toString() + " съедена");
    }

    @Override
    public String toString() {
        return " Жевательная резинка со вкусом: " + flavour;
    }
}
