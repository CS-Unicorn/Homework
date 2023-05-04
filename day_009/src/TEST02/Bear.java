package TEST02;

public class Bear extends Animal {

    public Bear() {
    }

    public Bear(String colour, int numofLegs) {
        super(colour, numofLegs);
    }

    @Override
    public void eat() {
        System.out.println("北极熊吃蜂蜜");
    }

    public void catchFish() {
        System.out.println("北极熊抓鱼");
    }
}