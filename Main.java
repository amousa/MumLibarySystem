package MumLibarySystem; 

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
 
/*
 * ButtonDemo.java requires the following files:
 *   images/right.gif
 *   images/middle.gif
 *   images/left.gif
 */
class Main extends JPanel implements ActionListener {
    protected JButton b1, b2, b3, b4;
 
    public Main() {
 
        b1 = new JButton("Add book");
        b1.setActionCommand("add_book");
 
        b2 = new JButton("Burrow book");
        b2.setActionCommand("burrow_book");
 
        b3 = new JButton("Resarve book");
        b3.setActionCommand("resarve_book");
 
     	b4 = new JButton("List books");
        b4.setActionCommand("list_book");
 

        //Listen for actions on buttons 1 and 3.
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
 
 
        //Add Components to this container, using the default FlowLayout.
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
 
    public void actionPerformed(ActionEvent e) 
    {
        if ("add_book".equals(e.getActionCommand())) 
	{
	}
	else if ("burrow_book".equals(e.getActionCommand())) 
	{
	}
        else if ("resarve_book".equals(e.getActionCommand())) 
	{
	}
        else if ("list_book".equals(e.getActionCommand())) 
	{
	}
    }
 
 
    private static void createAndShowGUI() {
 
        //Create and set up the window.
        JFrame frame = new JFrame("Libary System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        Main newContentPane = new Main();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
