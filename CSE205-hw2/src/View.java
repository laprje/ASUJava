//**************************************************************************************************
// CLASS: View
// * GROUP YY
// * AUTHOR 1: Lansing Jenkins, ljenki14, ljenki14@asu.edu
// * AUTHOR 2: Charles Cipolla, ccipolla, ccipolla@asu.edu
// * AUTHOR 3: Gregory Ingraham, gingrah1, gingrah1@asu.edu
// DESCRIPTION
// Implements the GUI for a calculator.
//**************************************************************************************************
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Implements the GUI for a calculator.
 */
public class View extends JFrame implements ActionListener {

    public static final int FRAME_WIDTH  = 500;
    public static final int FRAME_HEIGHT = 200;

    private JTextField mText;

    /**
     * Default ctor. Does nothing.
     */
    public View() {
        // Declare and create a JPanel named panelFunctButton. Set the layout manager to GridLayout
        // with 2 rows and 2 columns. Call addButton() to add buttons labeled "x^y", "log 10",
        // "log e", and "sqrt".
        JPanel panelFunctButton = new JPanel();
        panelFunctButton.setLayout(new GridLayout(2,2));
        addButton(panelFunctButton, "x^y");
        addButton(panelFunctButton, "log 10");
        addButton(panelFunctButton, "log e");
        addButton(panelFunctButton, "sqrt");
        // Declare and create a JPanel named panelSysButton. Use the default FlowLayout layout
        // manager. Call addButton() to add buttons labeled "Clear", "About", and "Exit".
        JPanel panelSysButton = new JPanel();
        addButton(panelSysButton, "Clear");
        addButton(panelSysButton, "About");
        addButton(panelSysButton, "Exit");

        // Declare and create a JPanel named panelFunctSys. Use the BorderLayout layout manager.
        // Add panelFunctButton to the CENTER region. Add panelSysButton to the SOUTH region.
        JPanel panelFunctSys = new JPanel();
        panelFunctSys.setLayout(new BorderLayout());
        panelFunctSys.add(panelFunctButton, BorderLayout.CENTER);
        panelFunctSys.add(panelSysButton, BorderLayout.SOUTH);
        // Declare and create a JPanel named panelKeypad. Use the GridLayout layout manager with
        // 4 rows and 4 columns. Call addButton() to add the buttons labeled "7", "8", "9", and so
        // on.
        JPanel panelKeypad = new JPanel();
        panelKeypad.setLayout(new GridLayout(4,4));
        addButton(panelKeypad, "7");
        addButton(panelKeypad, "8");
        addButton(panelKeypad, "9");
        addButton(panelKeypad, "/");
        addButton(panelKeypad, "4");
        addButton(panelKeypad, "5");
        addButton(panelKeypad, "6");
        addButton(panelKeypad, "*");
        addButton(panelKeypad, "1");
        addButton(panelKeypad, "2");
        addButton(panelKeypad, "3");
        addButton(panelKeypad, "-");
        addButton(panelKeypad, "0");
        addButton(panelKeypad, ".");
        addButton(panelKeypad, "+/-");
        addButton(panelKeypad, "+");
        // Declare and create a new JPanel named panelBottom. Use the horizontal BoxLayout layout
        // manager. Add panelKeypad. Add a 10-pixel wide rigid area (using Box.createRigidArea()).
        // Add panelFunctSys.
        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new BoxLayout(panelBottom, BoxLayout.LINE_AXIS));
        panelBottom.add(panelKeypad);
        Box.createRigidArea(new Dimension(10, 0));
        panelBottom.add(panelFunctSys);

        // Declare and create a JPanel named panelTextField. Use the default FlowLayout layout
        // manager. Create the mText JTextField making it 30 columns wide. Add mText to the
        // panelTextField panel.
       JPanel panelTextField = new JPanel();
       JTextField mText = new JTextField(30);
       panelTextField.add(mText);

        // Declare and create a JPanel named panelLabel. Use the default FlowLayout layout manager.
        // Declare and create a JLabel named label displaying "Kalkutron-9000" or whatever you
        // want to display. Add label to panelLabel.
        JPanel panelLabel = new JPanel();
        panelLabel.setLayout(new FlowLayout());
        JLabel label = new JLabel("hehehehehe");
        panelLabel.add(label);

        // Declare and create a JPanel named panelMain. Use the vertical BoxLayout layout manager.
        // Add some vertical glue to panelMain (using Box.createVerticalGlue()). Add panelLabel.
        // Add some more vertical glue. Add panelTextField. Add panelBottom. Add some more vertical
        // glue.
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain,BoxLayout.PAGE_AXIS));
        Box.createVerticalGlue();
        panelMain.add(panelLabel);
        Box.createVerticalGlue();
        panelMain.add(panelTextField);
        panelMain.add(panelBottom);
        Box.createVerticalGlue();


        // Set the title bar string of this JFrame.
        setTitle("Kalkutron-9000");

        // Set the width and height of this JFrame.
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Configure this JFrame so the frame will be closed and the application were terminate when
        // the X button on the title bar is closed.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add panelMain to this JFrame.
        add(panelMain);

        // Make this JFrame visible.
        setVisible(true);
    }

    /**
     * Declare and create a JButton object displaying pText. Make this JFrame the action listener
     * for button events. Add the button to pPanel.
     */
    private void addButton(JPanel pPanel, String pText) {
        JButton button = new JButton(pText);
        button.addActionListener(this);
        pPanel.add(button);
    }

    /**
     * Implementation of the actionPerformed() method of the ActionListener interface.
     */
    @Override
    public void actionPerformed(ActionEvent pEvent) {
        // If the source of the event is a JButton, calling pEvent.getActionCommand() will return
        // the text displayed on the button face. For example, when the Exit button is clicked,
        // pEvent.getActionCommand() would return "Exit".

        // Write code that determines if the Exit button is the source of the event and if so,
        // exit the application by calling System.exit().
        if (pEvent.getActionCommand() == "Exit") {
            System.exit(0);
        }

        // Write code that determines if the About button is the source of the event and if so,
        // display the about dialog using JOptionPane.showMessageDialog().
        if (pEvent.getActionCommand() == "About") {
            JOptionPane.showMessageDialog(rootPane, "This is a message. This was a program written for CSE-205 at ASU.");
        }

    }

}
