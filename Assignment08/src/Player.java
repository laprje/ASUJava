// CSE 110     : CSE110 Online
// Assignment  : Assignment 8
// Author      : Lansing Jenkins // ljenki14
// Description : Player class for assignment 8



public class Player {
    String name;
    double attackStat, blockStat;

    public Player(String name, double attackStat, double blockStat) {
        this.name = name;
        this.attackStat = attackStat;
        this.blockStat = blockStat;
    }

    public String getName() {
        return this.name;
    }

    public double getAttackStat() {
        return this.attackStat;
    }

    public double getBlockStat() {
        return this.blockStat;
    }

    public void setAttackStat(double newStat) {
        this.attackStat = newStat;
    }

    public void setBlockStat(double newStat) {
        this.blockStat = newStat;
    }

    public void printPlayerInfo() {
        System.out.println(this.name + " (attack: " + attackStat + ", block: " + blockStat);
    }
}
