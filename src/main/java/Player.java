public class Player {
    private static int HP;

    public static int getHP() {
        return HP;
    }

    public static void setHP(int HP) {
        Player.HP = HP;
    }

    public static int getDamage() {
        return damage;
    }

    public static void setDamage(int damage) {
        Player.damage = damage;
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Player.score = score;
    }

    private static int damage;
    private static int score;

    public Player(int HP, int damage, int score){
        this.HP = HP;
        this.damage = damage;
        this.score = score;
    }


}
