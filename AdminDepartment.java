package oopsAssignmentSolution;


public class AdminDepartment extends SuperDepartment {
	
	public AdminDepartment() {
	System.out.println("Welcome to AdminDepartment");
	}
	
	public String departmentName() {
	return "Admin Department"; 
	}
	
	public String getTodaysWork() {
	return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
	return "Complete by EOD";
	}
	
	public String isTodayAHoliday() {
	return super.isTodayAHoliday();
	}
	
}
