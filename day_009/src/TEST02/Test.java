package TEST02;

public class Test {
    public static void main(String[] args) {
        Bear bear = new Bear("白色", 4);
        Panda panda = new Panda("黑色", 4);

        bear.eat();
        bear.catchFish();

        panda.eat();
        panda.climbTree();
    }
}
