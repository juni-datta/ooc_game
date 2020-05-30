class Map{
    List<List<Room>> rooms;

    public Map(){
        return new Room();
    }
    public Map(List<List<Room>> rooms){
        this.rooms = rooms
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

    public Room removeRoom(int x, int y){
        rooms.get(x).set(y, null);
    }
}