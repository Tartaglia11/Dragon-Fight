public class Knight {

    private int currentHitPoints;
    private int hitPoints;
    private int damage;
    private int defence;

    public Knight() {
        currentHitPoints = 2000;
        damage = 170;
        defence = 80;
        hitPoints = currentHitPoints;
    }

    public Knight(int currentHitPoints, int damage, int defence) {
        this.currentHitPoints = currentHitPoints;
        this.damage = damage;
        this.defence = defence;
        hitPoints = currentHitPoints;
    }

    public void attack(Dragon dragon) {
        dragon.setHitPoints(dragon.getHitPoints() - (damage - dragon.getDefence()));
        System.out.printf("%d damage! Now the dragon have a %d hp%n", damage - dragon.getDefence(), dragon.getHitPoints());
    }

    public void block(Dragon dragon) {
        dragon.setDamage(0);
        defence = 0;
        System.out.println("You stopped attack");
    }

    public void heal() {
        if (currentHitPoints >= hitPoints || currentHitPoints + 220 > hitPoints) {
            System.out.println("You tried to drink a potion, but you already have enough hp, and you skipped a turn");
        } else {
            currentHitPoints += 220;
            System.out.println("You drank magic potion. Your hp: " + currentHitPoints);
        }
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
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
