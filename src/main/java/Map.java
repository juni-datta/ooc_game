import java.util.ArrayList;
import java.util.List;

class Map{
    List<List<Room>> rooms;

    public Map(){
        rooms = new ArrayList<List<Room>>();
    }
    public Map(List<List<Room>> rooms){
        this.rooms = rooms;
    }

    public Room addRoom(int x, int y, Room room){
        if (rooms.get(x).get(y) != null){
            rooms.get(x).set(y, room);
            return room;
        }
        else{
            return null;
        }

    }

    public void removeRoom(int x, int y){
        rooms.get(x).set(y, null);
    }
}