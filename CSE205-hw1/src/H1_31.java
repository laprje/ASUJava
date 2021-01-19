/**
 * CLASS: H1_31 (H1_31.java)
 * GROUP YY
 * AUTHOR 1: Lansing Jenkins, ljenki14, ljenki14@asu.edu
 * AUTHOR 2: Charles Cipolla, ccipolla, ccipolla@asu.edu
 * AUTHOR 3: Gregory Ingraham, gingrah, gingrah@asu.edu
 */
 // Import any required classes so your code will build
import java.util.ArrayList;
public class H1_31 { // Remember that class name and filename have to be the same. Case matters.
    public H1_31() { // Provide a default constructor even if it is empty.
    } // Some exercises may require other ctors.
    // This is the method you are asked to write for Ex. 3.1. Name it exactly as requested.
    public ArrayList<Integer> arrayListInit() {
        // 1. Declare and instantiate an ArrayList<Integer> object named list.
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 2. Write single for/while loops or a pair of for/while loops to fill list with the specified values.
        for(int i=0; i<6; i++){
            list.add(i);
        }
        for(int i=0; i<6; i++){
            list.add(i);
        }

        // 3. Return list.
        return list;
    }
}