public class Goblin implements Enemy{

    @Override
    public void information() {
        System.out.println("This is goblin. It has 100 health points and 10 damage");
    }

    @Override
    public void start() {
        System.out.println("Goblin noticed the hero!");
    }

    @Override
    public void attack() {
        System.out.println("Goblin attacks");
    }
}
