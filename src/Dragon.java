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
}
