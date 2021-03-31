package KauflandExampleContest.StarWarsDesign;

public class Outrider extends BattleShip{

    private int plasmaDefence;


    public Outrider(long id, String name, String color, int attackDamage, int life, int shield, int capacity, int plasmaDefence) {
        super(id, name, color, attackDamage, life + 100, shield, capacity);
        this.plasmaDefence = plasmaDefence;
    }

    public int getPlasmaDefence() {
        return plasmaDefence;
    }

    public void setPlasmaDefence(int plasmaDefence) {
        this.plasmaDefence = plasmaDefence;
    }

    @Override
    protected void getAtacked(int damage) {
        super.getAtacked(damage - 50);
    }
}
