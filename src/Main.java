import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where will you go? (Forest/Veld/Swamp) Only first letter (F/V/S)");
        String choise = scanner.nextLine();
        Enemy newEnemy = EnemyFactory.createEnemy(choise.toUpperCase());
        newEnemy.information();
        newEnemy.start();
        newEnemy.attack();
    }
}
