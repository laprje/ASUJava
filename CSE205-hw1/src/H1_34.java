/**
 * CLASS: H1_34 (H1_34.java)
 * GROUP YY
 * AUTHOR 1: Lansing Jenkins, ljenki14, ljenki14@asu.edu
 * AUTHOR 2: Charles Cipolla, ccipolla, ccipolla@asu.edu
 * AUTHOR 3: Gregory Ingraham, gingrah, gingrah@asu.edu
 */

import java.util.ArrayList;

public class H1_34 {
    public H1_34() {}
    public Integer arrayListSum(ArrayList<Integer> pList){
        if(pList.isEmpty()){
            return 0;
        } else if (pList.equals(null)){
            return 0;
        } else {
            int sum = 0;
            for(int i=0; i<pList.size(); i++){
                sum+=pList.get(i);
            }
            return sum;
        }
    }
}
