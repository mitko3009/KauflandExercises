package KauflandExampleContest.StarWarsDesign;

public class EbonHawk extends BattleShip{

    public EbonHawk(long id, String name, String color, int attackDamage, int life, int shield, int capacity) {
        super(id, name, color, attackDamage, life, shield, capacity);
    }

    private void heal(int life){
        super.setLife(super.getLife() + life);
    }
}
