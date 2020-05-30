public class Monster implements RoomContent {
    private String name;
    private int damage;
    private int points;    //aggressive monsters will attack player on sight

    public int getDamage() {
        return damage;
    }

    public String getName(){
        return name;
    }

    public int getPoints(){
        return points;
    }

    public Monster(String name, int damage, int points){
        this.name = name;
        this.damage = damage;
        this.points = points;
    }
}
