package students;
/**
  *
  *  @author Blas Kojusner
  */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Student {

	private String firstName;
	private String lastName;
	private String address;
	private int age;
	private int gpa;
	private char CGPA;

student () {
	firstName = “Blas”;
	lastName = “Kojusner”;
	address = “Pembroke Pines Florida”;
	age = 18;
	gpa = 90;
	CGPA = ‘A’;
}

void set_firstName (String firstNameOne) {
	firstName = firstNameOne;
}
String get_firstName () {
	return firstName;
}

void set_lastName (String lastNameOne) {
	lastName = lastNameOne;
}
String get_lastName () {
	return lastName;
}

void set_address (String addressOne) {
	address = addressOne;
}
String get_address () {
	return address;
}

void set_age (int ageOne) {
	age = ageOne;
}
int get_age () {
	return age;
}

void set_gpa (int gpaOne) {
	gpa = gpaOne;
}
int get_gpa () {
	return gpa;
}

char calculate_CGPA () {
	if (85 =< gpa && gpa <= 100) {
		CGPA = ‘A’;
		return CGPA;
	}
	else if (60 =< gpa && gpa <= 84) {
		CGPA = ‘B’;
		return CGPA;
	}
	else {
		CGPA = ‘C’;
		return CGPA;
	}
}

void Display_info () {
	System.out.println (“The student’s name is “ + firstName + “ ” + lastName);
System.out.println (“The address is “ + address);
System.out.println (“The age is “ + age);
System.out.println (“The GPA is “ + gpa);
System.out.println (“The CGPA is “ + CGPA);
System.out.println ();
}
