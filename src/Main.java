import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        initializeGame();
    }

    public static void initializeGame() {
        Dragon dragon = new Dragon(2500, 200, 65);
        Knight knight = new Knight(2000, 170, 80);

        while (dragon.getHitPoints() > 0 && knight.getCurrentHitPoints() > 0){
            Random random = new Random();

            System.out.printf("Your hp: %d%n", knight.getCurrentHitPoints());
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
                case 2 -> knight.block(dragon);
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


            dragon.setDamage(200); //return damage and defence after 'block' method
            knight.setDefence(80);

            System.out.println("""
                
                
                -------------------------------------------------------------------
                
                """);
        }

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