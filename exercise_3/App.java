public class App {
    public static void main(String[] args) {

        Weapon Sword = new Weapon();

        Sword.name = "Elizer's Sword";
        Sword.damage = 10;
        Sword.rarity = "common";
        Sword.AddDamage(5);


        System.out.print(Sword.showNameandRarity());

        Character Archer = new Character();
        
        Archer.name = "Elizer";
        Archer.attack();
    }
}
