package robot_homework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.GridLayout;

public class Robot_gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Robot_gui window = new Robot_gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Robot_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 619, 189);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Create a new robot");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		frame.getContentPane().add(btnNewButton);
		
		JEditorPane editorPane = new JEditorPane();
		frame.getContentPane().add(editorPane);
		
		JButton btnChangeRobotSpeed = new JButton("Change Robot speed");
		frame.getContentPane().add(btnChangeRobotSpeed);
		
		JButton btnNewButton_1 = new JButton("Change Robot orientation");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JEditorPane editorPane_1 = new JEditorPane();
		frame.getContentPane().add(editorPane_1);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check distances between two robots");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JEditorPane editorPane_2 = new JEditorPane();
		frame.getContentPane().add(editorPane_2);
		frame.getContentPane().add(btnNewButton_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		frame.getContentPane().add(editorPane_3);
	}

}
