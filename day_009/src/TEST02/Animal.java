package TEST02;

public abstract class Animal {
    private String colour;
    private int numofLegs;

    public Animal() {
    }

    public Animal(String colour, int numofLegs) {
        this.colour = colour;
        this.numofLegs = numofLegs;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumofLegs() {
        return numofLegs;
    }

    public void setNumofLegs(int numofLegs) {
        this.numofLegs = numofLegs;
    }

    public abstract void eat();
}