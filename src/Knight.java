import java.util.Random;

public class Knight {

    private int hitPoints;
    private int damage;
    private int defence;

    public Knight() {
        hitPoints = 2000;
        damage = 170;
        defence = 80;
    }

    public Knight(int hitPoints, int damage, int defence) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.defence = defence;
    }

    public void attack(Dragon dragon) {
        dragon.setHitPoints(dragon.getHitPoints() - (damage - dragon.getDefence()));
        System.out.printf("%d damage! Now the dragon have a %d hp%n", damage - dragon.getDefence(), dragon.getHitPoints());
    }

    public void tryToBlock(Dragon dragon) {
        Random random = new Random();
        int chanceToBlock = random.nextInt(1, 11);
        if (chanceToBlock > 7) {
            System.out.println("The dragon crushed your block!");
        } else {
            defence += dragon.getDefence();
        }
    }

    public void heal() {
        hitPoints += 220;
        System.out.println("You drank magic water. Your hp: " + hitPoints);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
