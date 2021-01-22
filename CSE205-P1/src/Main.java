/*********************************************************************************************************
 * CLASS: Main (Main.java)
 *
 * DESCRIPTION
 * A description of the contents of this file.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring A 2021
 *  Project Number: 1
 *
 * GROUP INFORMATION
 * AUTHOR 1: Charles Cipolla, ccipolla, ccipolla@asu.edu
 * AUTHOR 2: Lansing Jenkins, ljenki14, ljenki14@asu.edu
 * AUTHOR 3: Gregory Ingraham, gingrah1, gingrah1@asu.edu ********************************************************************************************************/

import java.net.URL;
import java.util.*;
import java.io.*;



public class Main {
    final int RUNS_UP = 1, RUNS_DN = -1;
    public static void main(String[] pArgs) {
        new Main().run();
    }

    /**
     * Used to run a combination of our other methods.
     */
    private void run() {
        ArrayList<Integer> list = new ArrayList<>();
        list = readInputFile("p1-in.txt");



        ArrayList<Integer> listRunsUpCount = new ArrayList<>();
        ArrayList<Integer> listRunsDnCount = new ArrayList<>();
        listRunsUpCount = findRuns(list, RUNS_UP);
        listRunsDnCount = findRuns(list, RUNS_DN);

        ArrayList<Integer> listRunsCount = new ArrayList<>();
        listRunsCount = mergeLists(listRunsUpCount, listRunsDnCount);

        writeOutputFile("p1-runs.txt", listRunsCount);

    }

    /**
     * Searches through the ArrayList passed as a parameter for runs, up or down depending on the pDir param.
     */
    public ArrayList<Integer> findRuns(ArrayList<Integer> pList, int pDir) {
        ArrayList<Integer> listRunsCount = arrayListCreate(pList.size(),0);
        int k = 0;
        int i = 0;
        while(i<pList.size()-1){
            if (pDir > 0 && pList.get(i) <= pList.get(i+1)) {
                k++;
            } else if(pDir < 0 && pList.get(i) >= pList.get(i+1)){
                k++;
            } else if (k != 0){
                listRunsCount.set(k,listRunsCount.get(k)+1);
                k = 0;
            }
            i++;
        }
        if(k != 0){
            listRunsCount.set(k,listRunsCount.get(k)+1);
        }
        return listRunsCount;
    }


    /**
     * Returns ArrayList of Integers which is the sum of elements of listRunsUpCount and listRunsDownCount.
     */
    private  ArrayList<Integer> mergeLists(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount) {
        ArrayList<Integer> listRunsCount = arrayListCreate(pListRunsUpCount.size(), 0);

        for(int i = 0; i<pListRunsUpCount.size(); i++) {
            listRunsCount.set(i, pListRunsUpCount.get(i) + pListRunsDnCount.get(i));
        }
        return listRunsCount;
    }

    /**
     * Creates new ArrayList.
     */
    public ArrayList<Integer> arrayListCreate(int size, int initValue){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<size; i++){
            list.add(initValue);
        }
        return list;
    }

    /**
     * Writes the results from our computations to an output file.
     */
    public void writeOutputFile(String pFilename, ArrayList<Integer> pListRuns){
        try {
            FileWriter out = new FileWriter(pFilename);
            Integer sum = 0;
            for (int i = 0; i < pListRuns.size(); i++) {
                sum += pListRuns.get(i);
            }
            out.write("runs_total: " + sum );
            for(int k=1; k<pListRuns.size(); k++){
                out.write("\nruns_" + k + ": " + pListRuns.get(k));
                out.flush();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Oops, could not open " + pFilename + " for writing. The program is ending.");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Oops, could not open " + pFilename + " for writing. The program is ending.");
            e.printStackTrace();
        }
        finally {
            System.out.print("File " + pFilename + " successfully written.");
        }
    }

    /**
     * Reads the input file, scans it, and puts each integer into the ArrayList 'list'.
     */
    public ArrayList<Integer> readInputFile(String pFilename){
        ArrayList<Integer> list = new ArrayList<>();
//        File f = new File(pFilename);
        try {
            URL path = Main.class.getResource("p1-in.txt");
            File f = new File(path.getFile());
            Scanner scan = new Scanner(f);
            while (scan.hasNext()) {
                list.add(scan.nextInt());
            }
            scan.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Oops, could not open " + pFilename + " for reading. The program is ending.");
            e.printStackTrace();
            System.exit(-100);
        }
        finally {
        }
        return list;
    }
}