public class Wolf implements Enemy{

    @Override
    public void information() {
        System.out.println("This is wolf. It has 150 health points and 20 damage");
    }

    @Override
    public void start() {
        System.out.println("Wolf noticed the hero!");
    }

    @Override
    public void attack() {
        System.out.println("Wolf attacks");
    }
}
