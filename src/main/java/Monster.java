public class Monster extends RoomContent {
    private String name;
    private int damage;
    private boolean agressive;    //aggressive monsters will attack player on sight

    public int getDamage() {
        return damage;
    }

    public String getName(){
        return name;
    }

    public boolean isAgressive{
        return aggressive;
    }

    public Monster(String name, int damage, boolean aggressive){
        this.name = name;
        this.damage = damage;
        this.aggressive = aggressive;
    }
}
