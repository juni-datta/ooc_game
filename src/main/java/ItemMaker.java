public class ItemMaker {

    public Item createItem(String itemName){
        if (itemName == "gatorade"){
            return new Item("gatorade", 1, 0);
        }
        if (itemName == "mushroom"){
            return new Item("mushroom", -2, 0);
        }
        return null;
    }

}
