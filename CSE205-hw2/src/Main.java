//**************************************************************************************************
// CLASS: Main
// * GROUP YY
// * AUTHOR 1: Lansing Jenkins, ljenki14, ljenki14@asu.edu
// * AUTHOR 2: Charles Cipolla, ccipolla, ccipolla@asu.edu
// * AUTHOR 3: Gregory Ingraham, gingrah1, gingrah1@asu.edu
// Main simply instantiates a View object so the GUI will be displayed when the program runs.
//**************************************************************************************************
import javax.swing.JFrame;

public class Main {

    public static void main(String[] pArgs) {
        new Main().run();
    }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        View view = new View();
    }

}
