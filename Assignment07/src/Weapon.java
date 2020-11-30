// CSE 110     : CSE-110 / online
// Assignment  : Assignment 07
// Author      : Lansing Jenkins ljenki14
// Description : Weapon class for the assignment 7 submission

public class Weapon {
    String name;
    int maxDamage;

    public Weapon() {
        this.name = "Pointy Stick";
        this.maxDamage = 1;
    }

    public Weapon(String name, int maxDamage) {
        this.name = name;
        this.maxDamage = maxDamage;
    }

    public String getName() {
        return(this.name);
    }
    public void setName(String newName) {
        this.name=newName;
    }

    public int getMaxDamage() {
        return(this.maxDamage);
    }
    public void setMaxDamage(int newDamage) {
        this.maxDamage=newDamage;
    }
}
