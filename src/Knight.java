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

    public void block(Dragon dragon) {
        dragon.setDamage(0);
        defence = 0;
        System.out.println("You stopped attack");
    }

    public void heal() {
        if (hitPoints >= 2000) {
            System.out.println("You tried to drink a potion, but you already have full hp, and you skipped a turn");
        } else {
            hitPoints += 220;
            System.out.println("You drank magic potion. Your hp: " + hitPoints);
        }
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
