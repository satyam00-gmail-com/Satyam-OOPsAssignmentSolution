package oopsAssignmentSolution;


public class HrDepartment extends SuperDepartment {
	
	public HrDepartment() {
	System.out.println("Welcome to HrDepartment");
	}
	
	public String departmentName() {
	return "Hr Department"; 
	}
	
	public String getTodaysWork() {
	return "Fill today’s worksheet and mark your attendance";
	}

	public String getWorkDeadline() {
	return "Complete by EOD";
	}
	
	public String doActivity() {
	return "team Lunch";
	}
	
	public String isTodayAHoliday() {
	return super.isTodayAHoliday();
	}	

}
