import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Knight knight = new Knight();
    }

    public static void initializeGame(Dragon dragon, Knight knight) {
        System.out.print("""
                Enter to select an action:
                1 - attack
                2 - try to block
                3 - heal (+220)""");

        int action = getNeedNumber(1, 4);

        switch (action) {
            case 1 -> knight.attack(dragon);
            case 2 -> knight.tryToBlock(dragon);
            case 3 -> knight.heal();
            default -> System.out.println("Critical error! Something went wrong!");
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