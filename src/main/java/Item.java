public class Item extends RoomContent  {
    String name;
    int HP;

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getDamage() {
        return damage;
    }

    int damage;

    public ItemMaker(String name, int HP, int damage){
        this.name = name;
        this.HP = HP;
        this.damage = damage;
    }
}
