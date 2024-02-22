public class Ogre implements Enemy{

    @Override
    public void information() {
        System.out.println("This is Goblin. It has 300 health points and 50 damage");
    }

    @Override
    public void start() {
        System.out.println("Ogre noticed the hero!");
    }

    @Override
    public void attack() {
        System.out.println("Ogre attacks");
    }
}
