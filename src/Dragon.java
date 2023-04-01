public class Dragon {
    private int hitPoints;
    private int damage;
    private int defence;


    public Dragon() {
        hitPoints = 2500;
        damage = 200;
        defence = 65;
    }

    public Dragon(int hitPoints, int damage, int defence) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.defence = defence;
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

    public void attack(Knight knight) {
        knight.setCurrentHitPoints(knight.getCurrentHitPoints() - (damage - knight.getDefence()));
        System.out.println("The dragon attacked you! (-" + (damage - knight.getDefence()) + ")");
    }

    public void releaseFireBall(Knight knight) {
        knight.setCurrentHitPoints(knight.getCurrentHitPoints() - 350); //Fireball damage
        System.out.println("The dragon sent you a fire ball (-350)! Your hp: " + knight.getCurrentHitPoints());
    }
}
