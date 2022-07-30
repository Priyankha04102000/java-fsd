package javafsd;

public class Constructor
{
	int EmployeeId;
	 String EmployeeName;
	 String department;
	 float salary;
		
	 public Constructor() {
	  EmployeeId=1;
	  EmployeeName="Rajesh";
	  department=" Sales ";
	  salary=25000;
	 }
		
	 public Constructor(int EmployeeId,String EmployeeName,String department,float salary) 
	 {
	  this.EmployeeId=EmployeeId;
	  this.EmployeeName=EmployeeName;
	  this.department=department;
	  this.salary=salary;
	 }
		
	 public void display() 
	 {
	  System.out.println("Id of the Employee: "+EmployeeId);
	  System.out.println("Name of the Employee: "+EmployeeName);
	  System.out.println("Department : "+department);
	  System.out.println("Salary : "+salary);
	  System.out.println();
	  
	 }
		
	 public static void main(String[] args) 
	 {
	  
	  Constructor e= new Constructor();
	  Constructor e1= new Constructor( 24, "Pranitha", "Takshik", 650000); 

	  e.display();
	  e1.display();
	  
	   
		
	 }

}
