import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Knight knight = new Knight();

        while (dragon.getHitPoints() > 0 || knight.getHitPoints() > 0) {
            initializeGame(dragon, knight);
        }
    }

    public static void initializeGame(Dragon dragon, Knight knight) {
        Random random = new Random();

        System.out.printf("Your hp: %d%n", knight.getHitPoints());
        System.out.printf("Dragon's hp: %d%n", dragon.getHitPoints());

        System.out.println();

        System.out.print("""
                Enter to select an action:
                1 - attack
                2 - try to block
                3 - heal (+220)
                \t:""");

        int action = getNeedNumber(1, 4);

        switch (action) {
            case 1 -> knight.attack(dragon);
            case 2 -> knight.tryToBlock(dragon);
            case 3 -> knight.heal();
            default -> System.out.println("Critical error! Something went wrong!");
        }

        try {
            Thread.sleep(1400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } // A little pause to don't get confused

        int dragonAttackType = random.nextInt(1, 5);
        if (dragonAttackType == 1) {
            dragon.releaseFireBall(knight);
        } else {
            dragon.attack(knight);
        }

        System.out.println("""
                
                
                -------------------------------------------------------------------
                
                """);
    }

    public static int getNeedNumber(int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            number = sc.nextInt();
        } while (number < minValue || number >= maxValue);

        return number;
    }

}