import java.lang.*;
class p8{
	public static void main(String [] args){
		if (args.length != 6)
            System.out.println("Error: Please provide exactly six arguments.");
        int employeeId = Integer.parseInt(args[0]);
        String employeeName = args[1];
        int managerId = Integer.parseInt(args[2]);
        int departmentNumber = Integer.parseInt(args[3]);
        double salary = Double.parseDouble(args[4]);
        String job = args[5];
		EmployeeRecord employee = new EmployeeRecord(employeeId, employeeName, managerId, departmentNumber, salary, job);
		employee.display();
	}
}
class EmployeeRecord{
	int employeeId,managerId,departmentNumber;
    String employeeName;
    double salary;
    String job;
	EmployeeRecord(int employeeId, String employeeName, int managerId, int departmentNumber, double salary, String job) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.managerId = managerId;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.job = job;
    }
	 void display(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Manager ID: "+managerId);
        System.out.println("Department Number: "+departmentNumber);
        System.out.println("Salary: "+salary);
        System.out.print("Job: "+job);
    }
}
