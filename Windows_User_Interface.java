import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;

public class Windows_User_Interface implements ActionListener {

	static String[] type1 = { "files in a specified directory", "files in a specified directory and all subdirectories",
			"file properties for a specified program", "directories and consumed space" };

	static String[] type2 = { "environment variables", "contents of a specified environment variable" };

	static String[] type3 = { "momentary running processes", "continuous running processes (output: 1 min)", "PID of a specified process" };
	
	static String[] type4 = { "momentary open files", "PID of the process that has a specified file open", "properties of a specified open file",
			"files that a specified process has open" };
	
	static String[] type5 = { "access times for a specified file", "10 newest files in a specified directory",
			"files changed before, after, or at a specified date" };
	
	static String[] type6 = { "momentary open sockets", "continuous flowing IP traffic (output: 1 min)" };

	static String[] type7 = { "continuous file accesses for a specified process (output: 1 min)",
			"continuous system-calls for a specified process PID (output: 1 min)", 
			"continuous system-calls for a specified process name (output: 1 min)" };


	//strings to set the components of the combo boxes



	/**
	 * Create the application.
	 */

	public static JFrame frame = new JFrame("Android System Forensics");

	public static JTextField textField = new JTextField();
	public static JTextArea textArea = new JTextArea();
	public static JTextArea textArea_1 = new JTextArea();
	public static JTextArea textArea_2 = new JTextArea();
	
	public static JButton btnNewButton = new JButton("EXECUTE");
	public static JButton btnNewButton_1 = new JButton("EXPORT");

	public static JComboBox combo1 = new JComboBox(new String[] { "File and Directory Properties", "Environment Variables", "Running Processes", "Open Files",
			"File Access Statistics", "Ongoing Connections", "System-Calls" });
	// Allows user to specify general command type
	public static JComboBox combo2 = new JComboBox();
	// Allows user to specify command
	public static JComboBox combo3 = new JComboBox();

	public Windows_User_Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Consolas", Font.PLAIN, 15));
		textArea.setForeground(new Color(0, 51, 0));
		textArea.setBackground(new Color(204, 255, 204));
		textArea.setLineWrap(true);
		textArea.setEditable(false);
	
		combo2.setBounds(290, 170, 590, 50);
		combo2.setFont(new Font("Consolas", Font.PLAIN, 15));
		combo2.setToolTipText("Choose command.");
		combo2.setForeground(new Color(0, 51, 0));
		combo2.setBackground(new Color(204, 204, 204));
		combo2.addActionListener(this);
		
		combo1.setBounds(20, 170, 260, 50);
		combo1.setModel(new DefaultComboBoxModel(new String[] { "File and Directory Properties", "Environment Variables", "Running Processes", "Open Files",
				"File Access Statistics", "Ongoing Connections", "System-Calls" }));
		combo1.setFont(new Font("Consolas", Font.PLAIN, 15));
		combo1.setToolTipText("Choose general command type.");
		combo1.setForeground(new Color(0, 51, 0));
		combo1.setBackground(new Color(204, 204, 204));
		combo1.addActionListener(this);
		
		combo3.setModel(new DefaultComboBoxModel(new String[] { "Text (.txt)", "Comma-Separated Values (.csv)" }));
		combo3.setFont(new Font("Consolas", Font.PLAIN, 15));
		combo3.setToolTipText("Choose file type to export output.");
		combo3.setBackground(new Color(204, 204, 204));
		combo3.setForeground(new Color(0, 51, 0));
		combo3.setBounds(1000, 550, 260, 50);
		
		textField.setBounds(1000, 275, 260, 50);
		textField.setFont(new Font("Consolas", Font.PLAIN, 15));
		textField.setForeground(new Color(0, 51, 0));
		textField.setBackground(new Color(204, 255, 204));
		textField.setToolTipText("Insert specified arguments.");
		textField.setColumns(10);
		textField.addActionListener(this);
		
		textArea_1.setBounds(1000, 170, 260, 50);
		textArea_1.setFont(new Font("Consolas", Font.PLAIN, 15));
		textArea_1.setForeground(new Color(0, 51, 0));
		textArea_1.setBackground(new Color(204, 255, 204));
		textArea_1.setLineWrap(true);
		textArea_1.setEditable(false);
		
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setFont(new Font("Consolas", Font.PLAIN, 15));
		textArea_2.setForeground(new Color(0, 51, 0));
		textArea_2.setBackground(new Color(204, 255, 204));
		textArea_2.setLineWrap(true);
		textArea_2.setEditable(false);
		
		btnNewButton.setBounds(1055, 350, 150, 50);
		btnNewButton.setToolTipText("Press to execute command.");
		btnNewButton.setBackground(new Color(204, 204, 204));
		btnNewButton.setFont(new Font("OCR-A BT", Font.BOLD, 25));
		btnNewButton.setForeground(new Color(0, 51, 0));
		btnNewButton.addActionListener(this);
		
		btnNewButton_1.setBackground(new Color(204, 204, 204));
		btnNewButton_1.setForeground(new Color(0, 51, 0));
		btnNewButton_1.setFont(new Font("OCR-A BT", Font.BOLD, 25));
		//btnNewButton_1.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent arg0) { } });
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(1055, 625, 150, 50);
		btnNewButton_1.setToolTipText("Press to execute command.");
		
		JLabel lblChooseOutputFile = new JLabel("CHOOSE OUTPUT FILE TYPE");
		lblChooseOutputFile.setForeground(Color.WHITE);
		lblChooseOutputFile.setFont(new Font("OCR-A BT", Font.PLAIN, 12));
		lblChooseOutputFile.setBounds(1000, 525, 250, 14);
		
		JLabel lblChoose = new JLabel("CHOOSE COMMAND TYPE ");
		lblChoose.setBounds(20, 145, 250, 14);
		lblChoose.setFont(new Font("OCR-A BT", Font.PLAIN, 12));
		lblChoose.setForeground(Color.WHITE);
		
		JLabel lblChooseCommand = new JLabel("CHOOSE COMMAND");
		lblChooseCommand.setBounds(290, 145, 250, 14);
		lblChooseCommand.setFont(new Font("OCR-A BT", Font.PLAIN, 12));
		lblChooseCommand.setForeground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("ENTER COMMAND ARGUMENT");
		lblNewLabel.setBounds(1000, 250, 250, 14);
		lblNewLabel.setFont(new Font("OCR-A BT", Font.PLAIN, 12));
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblResults = new JLabel("RESULTS");
		lblResults.setBounds(20, 250, 250, 14);
		lblResults.setFont(new Font("OCR-A BT", Font.PLAIN, 12));
		lblResults.setForeground(Color.WHITE);

		JLabel lblNewLabel_1 = new JLabel("ANDROID SYSTEM FORENSICS");
		lblNewLabel_1.setBounds(350, 40, 680, 50);
		lblNewLabel_1.setFont(new Font("OCR-A BT", Font.PLAIN, 40));
		lblNewLabel_1.setForeground(new Color(102, 204, 102));
		
		JLabel lblInterpretation = new JLabel("INTERPRETATION");
		lblInterpretation.setForeground(Color.WHITE);
		lblInterpretation.setFont(new Font("OCR-A BT", Font.PLAIN, 12));
		lblInterpretation.setBounds(480, 250, 250, 14);
		
		JLabel lblRequiredArgumentType = new JLabel("REQUIRED ARGUMENT TYPE");
		lblRequiredArgumentType.setForeground(Color.WHITE);
		lblRequiredArgumentType.setFont(new Font("OCR-A BT", Font.PLAIN, 12));
		lblRequiredArgumentType.setBounds(1000, 145, 250, 14);
		
		JScrollPane scrollPane = new JScrollPane (textArea);
		scrollPane.setBounds(20, 275, 400, 400);
		scrollPane.setForeground(new Color(0, 51, 102));
		scrollPane.setBackground(new Color(153, 153, 204));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	   
		JScrollPane scrollPane_1 = new JScrollPane (textArea_2);
		scrollPane_1.setBounds(480, 275, 400, 400);
		scrollPane_1.setForeground(new Color(0, 51, 102));
		scrollPane_1.setBackground(new Color(153, 153, 204));
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(Color.GRAY);
		//frame.setBounds(0, 5, 1360, 700);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(combo2);
		frame.getContentPane().add(combo1);
		frame.getContentPane().add(combo3);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(textArea_1);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(lblChoose);
		frame.getContentPane().add(lblChooseCommand);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblResults);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblRequiredArgumentType);
		frame.getContentPane().add(lblInterpretation);
		frame.getContentPane().add(lblChooseOutputFile);
		frame.getContentPane().add(scrollPane);
		frame.getContentPane().add(scrollPane_1);
		
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		
		System.setOut(printStream);
		System.setErr(printStream);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == combo1) {
			
			ComboBox_Events.first_combobox();
			
		}

		/*
		 * The following code finds out which item was selected in the
		 * combo2 comboBox and sets the textArea_1 to display
		 * text guiding the user to enter input in the correct format. Whatever
		 * is in the square brackets[] is what must be entered, if specified.
		 */

		if (e.getSource() == combo2) {
			
			ComboBox_Events.second_combobox();
			
		}

		/*
		 * The following code takes the values of what was meant to be converted
		 * from combo1, combo2 and textField and invokes the necessary methods
		 * accordingly. Finally, it displays the output in
		 * the form of a "String" in the textArea. However, all this happens
		 * only when the button is pressed (btnNewButton).
		 */

		if (e.getSource() == btnNewButton) {

			Button_Events.first_button();

			}
			
			if(e.getSource() == btnNewButton_1) {
				
				Button_Events.second_button();
				
			}
			
		}
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windows_User_Interface window = new Windows_User_Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
