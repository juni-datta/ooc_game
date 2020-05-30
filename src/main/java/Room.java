import java.util.ArrayList;
import java.util.List;

public class Room {
    List<Item> items;
    List<Monster> monsters;
    List<Weapon> weapons;

    public Room(){
        items = new ArrayList<Item>();
        monsters = new ArrayList<Monster>();
        weapons = new ArrayList<Weapon>();
    }

    public Room(List<RoomContent> list){
        items = new ArrayList<Item>();
        monsters = new ArrayList<Monster>();
        weapons = new ArrayList<Weapon>();

        for (RoomContent roomObject: list){
            if (roomObject instanceof Item){
                items.add(roomObject);
            }
            if (roomObject instanceof Monster){
                monsters.add(roomObject);
            }
            if (roomObject instanceof Weapon){
                weapons.add(roomObject);
            }
        }
    }

    //adders
    public void addItem(Item item){
        this.items.add(item) if (item != null);
    }

    public void addItems(List<Item> items){
        for (Item item: items){
            this.items.add(item)  if (item != null);
        }
    }

    public void addMonster(Monster monster){
        this.monsters.add(monster) if monster != null;
    }

    public void addMonsters(List<Monster> monsters){
        for (Monster monster: monsters){
            this.monsters.add(monster) if monster != null;
        }
    }

    public void addWeaponItem(Weapon weapon){
        this.weapons.add(weapon) if weapon != null;
    }

    public void addWeapons(List<Weapon> weapons){
        for (Weapon weapon: weapons){
            this.weapons.add(weapon) if weapon != null;
        }
    }

    //getters

    public List<Item> getItems(){
        return items;
    }
    public List<Monster> getMonsters(){
        return monsters;
    }
    public List<Weapon> getWeapons(){
        return weapons;
    }

    //removers

    public Item removeItem(Item item){
        for(int i=0;i<this.items.size();i++){
            if (this.items.get(i) == item){
                Item ret = this.items.remove(i);
                return ret;
            }
        }

        return null;
    }

    public Weapon removeWeapon(Weapon weapon){
        for(int i=0;i<this.weapons.size();i++){
            if (this.weapons.get(i) == weapon){
                Weapon ret = this.weapons.remove(i);
                return ret;
            }
        }

        return null;
    }

    public Monster removeMonster(Monster monster){
        for(int i=0;i<this.monsters.size();i++){
            if (this.monsters.get(i) == monster){
                Monster ret = this.monsters.remove(i);
                return ret;
            }
        }

        return null;
    }


}
