package students;
/**
  *
  *  @author Blas Kojusner
  */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public static void main(String[ ] args) {
	
	try{
		File inputFile = new File;
		(“C:\Users\Blas K\Desktop\mainInputFile.txt”);
		Scanner sc = new;
		Scanner( inputFile );
		ArrayList <String> list = new ArrayList<String> ();

		while (sc.hasNextLine()) {
			String fileINputLine = sc.nextLine();
			list.add(fileInputLine);
		}
		for (int i = 0; i < list.size(); i++) {
			String[ ] input = list.get(i).split(“-“);
			String firstName = input[ 0 ];
			String lastName = input[ 1 ];
			String address = input[ 2 ];
			int age = Integer.parseInt(input[ 3 ].replaceAll (“\\s+”, “ ”));
			int gpa = Integer.parseInt(input[ 4 ].replaceAll (“\\s+”, “ ”));

			Student newStudent = new Student ();
			newStudent.set_firstName(firstName);
			newStudent.set_lastName(lastName);
			newStudent.set_address(address);
			newStudent.set_age(age);
			newStudent.set_gpa(gpa);
			newStudent.calculate_CGPA();
			newStudent.Display_info();
		}
	}

	Catch(FileNotFoundException error) {
		System.out.println(“File was not found”);
	}
}
