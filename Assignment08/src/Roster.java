// CSE 110     : CSE110 Online
// Assignment  : Assignment 8
// Author      : Lansing Jenkins // ljenki14
// Description : Roster class for assignment 8

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;

public class Roster {
    ArrayList<Player> rosterList;

    public Roster() {
        this.rosterList = new ArrayList<Player>();
    }

    public Roster(String fileName){
        String line, inputName;
        double inputAtk, inputBlk;
        this.rosterList = new ArrayList<Player>();
        try {
            FileReader fr = new FileReader(fileName);
            Scanner in = new Scanner(fr);
            while(in.hasNextLine()) {
                inputName = in.next();
                inputAtk = in.nextDouble();
                inputBlk = in.nextDouble();
                Player newPlayer = new Player(inputName, inputAtk, inputBlk);
                rosterList.add(newPlayer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addPlayer(String name, double attack, double block) {
        Player p = new Player(name, attack, block);
        this.rosterList.add(p);
    }

    public int countPlayers() {
        return rosterList.size();
    }

    public Player getPlayerByName(String name) {
        for(int i=0; i<rosterList.size(); i++) {
            if(rosterList.get(i).name.equals(name)){
                return rosterList.get(i);
            }
        }
        return null;
    }

    public void printTopAttackers() {
        double topAttack = 0.0;
        double secondAttack = 0.0;
        int topIdx = 0;
        int secondIdx = 0;
        for(int i=0; i<rosterList.size(); i++) {
            if(rosterList.get(i).attackStat > topAttack){
                topAttack = rosterList.get(i).attackStat;
                topIdx = i;
            }
        }
        for(int i=0; i<rosterList.size(); i++) {
            if(rosterList.get(i).attackStat > secondAttack && rosterList.get(i).attackStat != topAttack){
                secondAttack = rosterList.get(i).attackStat;
                secondIdx = i;
            }
        }
        rosterList.get(topIdx).printPlayerInfo();
        rosterList.get(secondIdx).printPlayerInfo();
    }

    public void printTopBlockers() {
        double topBlk = 0.0;
        double secondBlk = 0.0;
        int topIdx = 0;
        int secondIdx = 0;
        for(int i=0; i<rosterList.size(); i++) {
            if(rosterList.get(i).blockStat > topBlk){
                topBlk = rosterList.get(i).attackStat;
                topIdx = i;
            }
        }
        for(int i=0; i<rosterList.size(); i++) {
            if(rosterList.get(i).blockStat > secondBlk && rosterList.get(i).attackStat != topBlk){
                secondBlk = rosterList.get(i).attackStat;
                secondIdx = i;
            }
        }
        rosterList.get(topIdx).printPlayerInfo();
        rosterList.get(secondIdx).printPlayerInfo();
    }

    public void printAllPlayers() {
        for(int i=0; i<rosterList.size(); i++) {
            rosterList.get(i).printPlayerInfo();
        }
    }
}
