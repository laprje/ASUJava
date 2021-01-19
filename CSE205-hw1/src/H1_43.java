/**
 * CLASS: H1_43 (H1_43.java)
 * GROUP YY
 * AUTHOR 1: Lansing Jenkins, ljenki14, ljenki14@asu.edu
 * AUTHOR 2: Charles Cipolla, ccipolla, ccipolla@asu.edu
 * AUTHOR 3: Gregory Ingraham, gingrah, gingrah@asu.edu
 */

import java.io.*;
import java.util.*;

public class H1_43 {
    public H1_43(){}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the full path of the file you would like to copy.");
        String filePath = in.next();
        File file = new File(filePath);

        try {
            FileInputStream stream = null;
            InputStreamReader streamReader = null;
            BufferedReader bufferedReader = null;
            FileWriter fileWriter = null;
            Formatter formatter = null;
            try {
                int count = 0;
                stream = new FileInputStream(file);
                streamReader = new InputStreamReader(stream);
                bufferedReader = new BufferedReader(streamReader);
                String line;
                fileWriter = new FileWriter(file.getName()+".txt");
                while ((line = bufferedReader.readLine()) != null) {
                    count ++;
                    formatter = new Formatter();
                    fileWriter.write("[" + formatter.format("%03d", count) + "]" + "  " + line + String.format("%n"));
                }
            } finally {

                if (stream != null) {
                    stream.close();
                }
                if (streamReader != null) {
                    streamReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (formatter != null) {
                    formatter.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(filePath);
    }
}
