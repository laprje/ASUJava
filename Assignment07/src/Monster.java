// CSE 110     : CSE-110 / online
// Assignment  : Assignment 07
// Author      : Lansing Jenkins ljenki14
// Description : Monster class for the assignment 7 submission

public class Monster {
    String name;
    int healthScore;
    Weapon weapon;

    public Monster(String name, int healthScore, Weapon weapon){
        this.name = name;
        this.healthScore = healthScore;
        this.weapon = weapon;
    }

    public String getName() {
        return(this.name);
    }

    public int getHealthScore(){
        return this.healthScore;
    }

    public String getWeaponName(){
        return this.weapon.name;
    }

    public int attack(Monster enemy) {
        int dmg = this.weapon.getMaxDamage();
        enemy.healthScore -= dmg;
        return enemy.healthScore;
    }
}

