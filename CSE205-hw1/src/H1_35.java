/**
 * CLASS: H1_35 (H1_35.java)
 * GROUP YY
 * AUTHOR 1: Lansing Jenkins, ljenki14, ljenki14@asu.edu
 * AUTHOR 2: Charles Cipolla, ccipolla, ccipolla@asu.edu
 * AUTHOR 3: Gregory Ingraham, gingrah, gingrah@asu.edu
 */


import java.util.ArrayList;

public class H1_35 {
    public H1_35(){}
    public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue){
        ArrayList<Integer> list = new ArrayList<Integer>(pLen);
        for(int i=0; i<pLen; i++){
            list.add(pInitValue);
        }
        return list;
    }
}