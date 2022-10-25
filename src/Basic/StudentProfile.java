package Basic;
import java.util.Scanner;

public class StudentProfile {
	private String firstName;
	private String lastName;
	private int expectedYearToGraduate;
	private double GPA;
	
	public StudentProfile() {
		firstName = "";
		lastName = "";
		expectedYearToGraduate = 0;
		GPA = 0.0;
	}
	
	public StudentProfile(String fName, String lName, int year, double point) {
		firstName = new String(fName);
		lastName = new String(lName);
		expectedYearToGraduate = year;
		GPA = point;
	}
	
	public void createProfile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input student's first name: ");
		firstName = sc.nextLine();
		System.out.println("Input student's last name: ");
		lastName = sc.nextLine();
		System.out.println("Input expected year to graduate: ");
		expectedYearToGraduate = sc.nextInt();
		System.out.println("Input student's GPA: ");
		GPA = sc.nextDouble();
//		sc.close();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void addYear(int number) {
		expectedYearToGraduate += number;
	}
	
	public String toString() {
		String result = "";
		result += "Student profile: \n";
		result += "First name: "+ firstName+"\n";
		result += "Last name: "+ lastName+"\n";
		result += "GPA: "+GPA + "\n";
		result += "Expected year to graduate: "+expectedYearToGraduate +"\n";
		return result;
	}
	
	public String printEYTG() {
		String result = "";
		result += "Student's full name: "+firstName+" "+lastName+"\n";
		result += "Expected year to graduate: "+expectedYearToGraduate+"\n";
		return result;
	}
}
