package Basic;
import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			// array of 2 students
			StudentProfile[] arrStudents = new StudentProfile[2];
			
			System.out.println("================================================");
			System.out.println("Create student's profile (just 2): \n");
			//Create profile
			for(int i = 0; i<arrStudents.length; i++) {
				arrStudents[i] = new StudentProfile();
				arrStudents[i].createProfile();
			}
			
			System.out.println("================================================");
			System.out.println("List students: \n");
			//Print 
			for(int i = 0; i<arrStudents.length; i++) {
				System.out.println(arrStudents[i].toString());
				System.out.print("\n");
			}
			
			//Increase expected year to graduate
			System.out.println("================================================");
			Scanner sc = new Scanner(System.in);	
			
			while(true) {
				System.out.println("Increase student's expected year to graduate (type 0 to exit or 1 to continue): ");
				int condition = Integer.parseInt(sc.nextLine());
				if(condition == 0) break;
				if(condition == 1) {
				System.out.println("Input student name to increase expected year to graduate: ");
				String name = sc.nextLine();
				System.out.println("Input number of expected year to increase: ");
				int number = Integer.parseInt(sc.nextLine());
				for(int i =0; i<arrStudents.length; i++) {
					if(name.compareToIgnoreCase(arrStudents[i].getFirstName()) == 0) {
						arrStudents[i].addYear(number);
						break;
					}
					if(i == (arrStudents.length-1) ) {
						System.out.println("Student not found!");
					}
				}
				}
				else {
					System.out.println("Please type 1 to input infomation!");
				}
			}
			
			// Print expected year to graduate
			System.out.println("================================================");
			System.out.println("Expected year to graduate of both students: \n");
			for(int i = 0; i<arrStudents.length; i++) {
				System.out.println(arrStudents[i].printEYTG());
				System.out.print("\n");
			}

	}

}
