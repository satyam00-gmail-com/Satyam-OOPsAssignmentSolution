package oopsAssignmentSolution;


public class Driver {
	public static void main(String[] args) {
		//Admin Department functionalities
        AdminDepartment adminDepObj = new AdminDepartment();
        System.out.println(adminDepObj.getTodaysWork());
        System.out.println(adminDepObj.getWorkDeadline());
        System.out.println(adminDepObj.isTodayAHoliday());        
		//HR Department functionalities
        System.out.println();
        HrDepartment hrDepObj = new HrDepartment();
        System.out.println(hrDepObj.doActivity());
        System.out.println(hrDepObj.getTodaysWork());
        System.out.println(hrDepObj.getWorkDeadline());
        System.out.println(hrDepObj.isTodayAHoliday());
		//Tech Department functionalities
        System.out.println();
        System.out.println();
        TechDepartment techDepObj = new TechDepartment();
        System.out.println(techDepObj.getTodaysWork());
        System.out.println(techDepObj.getWorkDeadline());
        System.out.println(techDepObj.getTechStackInformation());
        System.out.println(techDepObj.isTodayAHoliday());
	}
}
