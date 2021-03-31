package KauflandExampleContest.StarWarsDesign;

public abstract class BattleShip {
    private long id;
    private String name;
    private String color;
    private int attackDamage;
    private int life;
    private int shield;
    private int capacity;

    public BattleShip(long id, String name, String color, int attackDamage,int life, int shield, int capacity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.attackDamage = attackDamage;
        this.life = life;
        this.shield = shield;
        this.capacity = capacity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    protected void attack(BattleShip battleShip, int damage){
        battleShip.getAtacked(damage);
    }

    protected boolean isDestroyed(){
        return this.life > 0;
    }

    protected void getAtacked(int damage){
        if (this.getShield() > 0){
            this.setShield(this.getShield() - damage);
            if (this.getShield() < 0){
                this.setLife(this.getLife() - Math.abs(this.getShield()));
                this.setShield(0);

                if (this.getLife() < 0){
                    this.setLife(0);
                }
            }
        } else {
            this.setLife(this.getLife() - damage);
            if (this.getLife() < 0){
                this.setLife(0);
            }
        }
    }




}
