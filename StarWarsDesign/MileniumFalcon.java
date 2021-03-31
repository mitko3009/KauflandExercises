package KauflandExampleContest.StarWarsDesign;

public class MileniumFalcon extends BattleShip{

    private int dodge;

    public MileniumFalcon(long id, String name, String color, int attackDamage, int life, int shield, int capacity, int dodge) {
        super(id, name, color, attackDamage, life, shield, capacity);
        this.dodge = dodge;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    @Override
    protected void attack(BattleShip battleShip, int damage) {
        super.attack(battleShip, damage * 2);
    }

    @Override
    protected void getAtacked(int damage) {
        super.getAtacked(damage + 200);
    }
}
