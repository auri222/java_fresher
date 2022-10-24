package Basic;
import java.util.*;
import java.math.BigDecimal;
public class HelloWorldV2 {

	public static BigDecimal monthlySalary(BigDecimal hourlySalary, int monthlyWorkHours){
		return hourlySalary.multiply(BigDecimal.valueOf(monthlyWorkHours));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal total = BigDecimal.ZERO;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input hourly salary: ");
		double dsalary = sc.nextDouble();
		BigDecimal bDSalary = BigDecimal.valueOf(dsalary);
		
		System.out.println("Input monthly work hours: ");
		int hours = sc.nextInt();
		
		total = monthlySalary(bDSalary, hours);
		
		System.out.println("Hourly salary: "+ bDSalary);
		System.out.println("Monthly work hours: "+hours);
		System.out.println("Monthly salary: "+total);

	}

}
