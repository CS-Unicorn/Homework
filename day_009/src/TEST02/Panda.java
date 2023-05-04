package TEST02;

public class Panda extends Animal {
    public Panda() {
    }

    public Panda(String colour, int numofLegs) {
        super(colour, numofLegs);
    }

    @Override
    public void eat() {
        System.out.println("大熊猫吃竹子");
    }

    public void climbTree() {
        System.out.println("大熊猫爬树");
    }
}