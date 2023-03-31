import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Knight knight = new Knight();
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