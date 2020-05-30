public class MonsterMaker {

    public Monster createMonster(String monsterName){
        if (monsterName == "Pikachu"){
            return new Monster("Pikachu", 3, false)
        }
        if (monsterName == "Godzilla"){
            return new Monster("Godzilla", 8, true)
        }
        return null;
    }

}
