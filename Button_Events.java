import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Button_Events {

	public static void no_arg(String command) {

			Windows_User_Interface.textArea.setText(null);

			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);

			builder.redirectErrorStream(true);

			Process p;
			try {
				p = builder.start();
				BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));

				String line;

				while (true) {

					line = r.readLine();
					if (line == null) { break; }

					System.out.println(line);

				}
			} catch (IOException x) {
				
				x.printStackTrace();
			}
			Windows_User_Interface.textField.setText(null);

		
	}
	
	public static void with_arg(String command) {

			Windows_User_Interface.textArea.setText(null);

			String s = Windows_User_Interface.textField.getText();
			
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command, s);

			builder.redirectErrorStream(true);

			Process p;
			try {
				p = builder.start();
				BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));

				String line;

				while (true) {

					line = r.readLine();
					if (line == null) { break; }

					System.out.println(line);

				}
			} catch (IOException x) {
				
				x.printStackTrace();
			}
			
			Windows_User_Interface.textField.setText(null);

		
	}
	
	public static void first_button() {
		
		if (Windows_User_Interface.combo2.getSelectedItem().equals("files in a specified directory")) {
			
			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && listlong", with arg

			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && listlong");

		}

		else if (Windows_User_Interface.combo2.getSelectedItem().equals("files in a specified directory and all subdirectories")) {
			
			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && numfiles", with arg

			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && numfiles");

		} else if (Windows_User_Interface.combo2.getSelectedItem().equals("file properties for a specified program")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && progprops", with arg
		
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && progprops");

		} else if (Windows_User_Interface.combo2.getSelectedItem().equals("directories and consumed space")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && dirinfo", no arg
			
			no_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && dirinfo");

		} else if (Windows_User_Interface.combo2.getSelectedItem().equals("environment variables")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && printvars", no arg
			
			no_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && printvars");
			
		}
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("contents of a specified environment variable")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && varcontent", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && varcontent");
			
		}
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("momentary running processes")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && listproc", no arg

			no_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && listproc");

		} else if (Windows_User_Interface.combo2.getSelectedItem().equals("continuous running processes (output: 1 min)")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && toprunning", no arg
			
			no_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && toprunning");
			
		}

		else if (Windows_User_Interface.combo2.getSelectedItem().equals("PID of a specified process")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && processpid", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && processpid");
			
		}

		else if (Windows_User_Interface.combo2.getSelectedItem().equals("momentary open files")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && openfiles", no arg
			
			no_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && openfiles");

		}
		
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("PID of the process that has a specified file open")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && lsoffile", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && lsoffile");
			
		}
		
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("properties of a specified open file")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && findopenfile", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && findopenfile");
			
		}
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("files that a specified process has open")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && lsofpath", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && lsofpath");
			
		}
		
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("access times for a specified file")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && filestat", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && filestat");
			
		}
		
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("10 newest files in a specified directory")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && newestfiles", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && newestfiles");
			
		}
		
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("files changed before, after, or at a specified date")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && findmodified", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && findmodified");
			
		}
		
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("momentary open sockets")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && netstat", no arg
			
			no_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && netstat");
			
		}
		
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("continuous flowing IP traffic (output: 1 min)")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && tcpdump", no arg

			no_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && tcpdump");
			
		}
		
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("continuous file access and location tracking for a specified process (output: 1 min)")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && stracelocations", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && stracelocations");
			
		}
		
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("continuous system-call tracking for a specified process PID (output: 1 min)")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && stracepid", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && stracepid");

		}
		else if (Windows_User_Interface.combo2.getSelectedItem().equals("continuous system-call tracking for a specified process name (output: 1 min)")) {

			//"cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && straceprocess", with arg
			
			with_arg("cd \"C:\\Users\\UserPC\\Android System Forensics\\Scripts\" && straceprocess");
			
	}
	
}
	
	public static void second_button() {
		
		if(Windows_User_Interface.combo3.getSelectedItem() == "Comma-Separated Values (.csv)") {
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\Users\\UserPC\\Android System Forensics\" && tocsv");
			try {
				builder.start();
			} catch (IOException x) {
				
				x.printStackTrace();
			}
		}
		if(Windows_User_Interface.combo3.getSelectedItem() == "Text (.txt)") {
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\Users\\UserPC\\Android System Forensics\" && copy");
			try {
				builder.start();
			} catch (IOException x) {
				
				x.printStackTrace();
			}
		}
		
	}
	
}
