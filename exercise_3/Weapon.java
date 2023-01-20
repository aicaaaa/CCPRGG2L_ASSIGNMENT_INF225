public class Weapon {
    String name;
    int damage;
    String rarity;    


    public void AddDamage(int additionalDamage){
        int newDamage = this.damage + additionalDamage;

        System.out.println("Damage increased from " + damage + " to " + newDamage);

        this.damage = newDamage;
    }

    public String showNameandRarity(){
        return this.name + " " + this.rarity;
    }
}
