public class EnemyFactory {
    public static Enemy createEnemy(String enemyType){
        if(enemyType.equalsIgnoreCase("V")){
            return new Goblin();
        }
        else if(enemyType.equalsIgnoreCase("F")){
            return new Wolf();
        }
        else if(enemyType.equalsIgnoreCase("S")){
            return new Ogre();
        }
        else{
            throw new IllegalArgumentException("Invalid place type");
        }
    }
}
