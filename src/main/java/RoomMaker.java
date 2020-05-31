import java.util.List;

public class RoomMaker {

    public Room createRoom(){
        return new Room();
    }

    public Room createRoom(List<RoomContent> roomObjects){
        return new Room(roomObjects);
    }
}
