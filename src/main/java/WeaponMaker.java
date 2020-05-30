public class WeaponMaker {
    public Weapon createWeapon(String weaponName){
        if (weaponName == 'fist'){
            return new Weapon("fist", 1, "punch");
        }
        if (weaponName == 'shotgun'){
            return new Weapon("shotgun", 3, "shoot";
        }

        return null;
    }
}
