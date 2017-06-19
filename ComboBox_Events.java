
public class ComboBox_Events {

	public static void fillCombo2(String[] type) {
		/*
		 * If the user selects this item, then we change combo2
		 * accordingly so that the types of conversions may be
		 * valid in each sense. But first, we remove any previous items
		 * the combo box may have held.
		 */
		Windows_User_Interface.combo2.removeAllItems();

		// now add back relevant values
		for (int i = 0; i < type.length; i++) {
			Windows_User_Interface.combo2.addItem(type[i]);
		}
	}
	
	public static void first_combobox() {
		
		if (Windows_User_Interface.combo1.getSelectedItem().equals("File and Directory Properties")) 
			fillCombo2(Windows_User_Interface.type1);
		
		if (Windows_User_Interface.combo1.getSelectedItem().equals("Environment Variables")) 
			fillCombo2(Windows_User_Interface.type2);

		if (Windows_User_Interface.combo1.getSelectedItem().equals("Running Processes")) 
			fillCombo2(Windows_User_Interface.type3);
		
		if (Windows_User_Interface.combo1.getSelectedItem().equals("Open Files")) 
			fillCombo2(Windows_User_Interface.type4);
		
		if (Windows_User_Interface.combo1.getSelectedItem().equals("File Access Statistics")) 
			fillCombo2(Windows_User_Interface.type5);
		
		if (Windows_User_Interface.combo1.getSelectedItem().equals("Ongoing Connections")) 
			fillCombo2(Windows_User_Interface.type6);
		
		if (Windows_User_Interface.combo1.getSelectedItem().equals("System-Calls")) 
			fillCombo2(Windows_User_Interface.type7);
		
	}
	
	public static void second_combobox() {
		
		if (Windows_User_Interface.combo2.getSelectedItem() == "files in a specified directory") {
			Windows_User_Interface.textArea_1.setText("Enter argument: full path to directory");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "files in a specified directory and all subdirectories") {
			Windows_User_Interface.textArea_1.setText("Enter argument: full path to directory");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "file properties for a specified program") {
			Windows_User_Interface.textArea_1.setText("Enter argument: full path to program");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "directories and consumed space") {
			Windows_User_Interface.textArea_1.setText("Enter argument: no argument necessary");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "environment variables") {
			Windows_User_Interface.textArea_1.setText("Enter argument: no argument necessary");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "contents of a specified environment variable") {
			Windows_User_Interface.textArea_1.setText("Enter argument: name of environment variable");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "momentary running processes") {
			Windows_User_Interface.textArea_1.setText("Enter argument: no argument necessary");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "continuous running processes (output: 1 min)") {
			Windows_User_Interface.textArea_1.setText("Enter argument: no argument necessary");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "PID of a specified process") {
			Windows_User_Interface.textArea_1.setText("Enter argument: name of process");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "momentary open files") {
			Windows_User_Interface.textArea_1.setText("Enter argument: no argument necessary");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "PID of the process that has a specified file open") {
			Windows_User_Interface.textArea_1.setText("Enter argument: full path to file");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "properties of a specified open file") {
			Windows_User_Interface.textArea_1.setText("Enter argument: full path to file");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "files that a specified process has open") {
			Windows_User_Interface.textArea_1.setText("Enter argument: PID of process");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "access times for a specified file") {
			Windows_User_Interface.textArea_1.setText("Enter argument: full path to file");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "10 newest files in a specified directory") {
			Windows_User_Interface.textArea_1.setText("Enter argument: full path to directory");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "files changed before, after, or at a specified date") {
			Windows_User_Interface.textArea_1.setText("Enter argument: x, +x, or -x, where x (exactly x days ago), +x (more than x days ago), -x (less than x days ago)");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "momentary open sockets") {
			Windows_User_Interface.textArea_1.setText("Enter argument: no argument necessary");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "continuous flowing IP traffic (output: 1 min)") {
			Windows_User_Interface.textArea_1.setText("Enter argument: no argument necessary");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "continuous file accesses for a specified process (output: 1 min)") {
			Windows_User_Interface.textArea_1.setText("Enter argument: PID of process");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "continuous system-calls for a specified process PID (output: 1 min)") {
			Windows_User_Interface.textArea_1.setText("Enter argument: PID of process");
		} else if (Windows_User_Interface.combo2.getSelectedItem() == "continuous system-calls for a specified process name (output: 1 min)") {
			Windows_User_Interface.textArea_1.setText("Enter argument: name of process");
		}  
		
	}
	
}
