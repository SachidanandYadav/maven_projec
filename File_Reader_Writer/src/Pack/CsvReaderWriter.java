package Pack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReaderWriter {

	public static void main(String[] args) throws IOException {
		String path = "/home/v2stech/Documents/Tranning/Core Java/file hadling/demo.csv";
		writercsv(path);
	}


public static void writercsv(String path) {
	Scanner sc = new Scanner(System.in);
	List<User> list = new ArrayList<User>();
	
	User user = new User();
	System.out.println("Enter the User Id :");
	int id = sc.nextInt();
	user.setId(id);
	
	System.out.println("Enter the User first name :");
	String f_name = sc.next();
	user.setFirst_name(f_name);

	System.out.println("Enter the User last name :");
	String l_name = sc.next();
	user.setLast_name(l_name);
	
	list.add(user);

	FileWriter file = null;
	
	try {
		file = new FileWriter(path);
		file.append("ID ,First Name,Last Name\n");
		
		for(User u : list) {
			file.append(String.valueOf(u.getId()));
			file.append(",");
			file.append(u.getFirst_name());
			file.append(",");
			file.append(u.getLast_name());
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	try {
		file.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
}
