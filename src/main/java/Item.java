public class Item implements RoomContent  {
    String name;
    int HP;

    public Item(String name, int HP, int damage){
        this.name = name;
        this.HP = HP;
        this.damage = damage;
    }

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


}
